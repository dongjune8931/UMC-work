package UMC.study.service.MemberService;

import UMC.study.domain.Member;
import UMC.study.repository.MemberRepository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;


    public Member getActiveMemberById(Long memberId) {
        Member member = memberRepository.findActiveMemberById(memberId);

        if (member == null) {
            throw new IllegalArgumentException("ACTIVE 상태의 멤버가 존재하지 않습니다. ID: " + memberId);
        }

        return member;
    }
}