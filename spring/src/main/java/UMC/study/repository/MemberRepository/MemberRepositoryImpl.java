package UMC.study.repository.MemberRepository;

import UMC.study.domain.Member;
import UMC.study.domain.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static UMC.study.domain.enums.MemberStatus.ACTIVE;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public Member findActiveMemberById(Long memberId) {
        QMember member = QMember.member;

        return jpaQueryFactory
                .select(member)
                .from(member)
                .where(
                        member.status.eq(ACTIVE),
                        member.id.eq(memberId)
                )
                .fetchOne();
    }
}