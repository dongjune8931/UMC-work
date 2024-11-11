package UMC.study.repository.MissionRepository;

import UMC.study.domain.Mission;
import UMC.study.domain.QMission;
import UMC.study.domain.QRegion;
import UMC.study.domain.QStore;
import UMC.study.domain.mapping.QMemberMission;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import static UMC.study.domain.enums.MissionStatus.CHALLENGING;
import static UMC.study.domain.enums.MissionStatus.COMPLETE;

@Repository
@RequiredArgsConstructor
public class MissionRepositoryImpl implements MissionRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Mission> findChallengingOrCompleteMissions() {
        QMission mission = QMission.mission;
        QMemberMission memberMission = QMemberMission.memberMission;
        QStore store = QStore.store;

        return jpaQueryFactory
                .select(mission)
                .from(mission)
                .join(memberMission).on(mission.id.eq(memberMission.mission.id))
                .join(store).on(mission.store.id.eq(store.id))
                .where(memberMission.status.in(CHALLENGING, COMPLETE))
                .orderBy(memberMission.createdAt.desc())
                .limit(15)
                .fetch();
    }

    @Override
    public List<Mission> findMissionsByRegionAndDeadline(String regionName, int limit, int offset) {
        QMission mission = QMission.mission;
        QStore store = QStore.store;
        QRegion region = QRegion.region;

        return jpaQueryFactory
                .select(mission)
                .from(mission)
                .join(mission.store, store)
                .join(store.region, region)
                .where(
                        region.name.eq(regionName),
                        mission.deadline.goe(LocalDate.now()) // 현재 날짜 이후 미션만 가져옴
                )
                .orderBy(mission.deadline.asc())
                .offset(offset)
                .limit(limit)
                .fetch();
    }
}