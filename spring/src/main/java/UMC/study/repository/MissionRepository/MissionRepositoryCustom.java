package UMC.study.repository.MissionRepository;

import UMC.study.domain.Mission;

import java.util.List;

public interface MissionRepositoryCustom {
    List<Mission> findChallengingOrCompleteMissions();

    List<Mission> findMissionsByRegionAndDeadline(String regionName, int limit, int offset);

}