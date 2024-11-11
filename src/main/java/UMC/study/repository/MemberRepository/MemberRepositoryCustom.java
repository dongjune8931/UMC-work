package UMC.study.repository.MemberRepository;

import UMC.study.domain.Member;

public interface MemberRepositoryCustom {
    Member findActiveMemberById(Long memberId);

}
