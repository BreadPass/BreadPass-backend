package com.breadpass.domain.member.adaptor;


import com.breadpass.domain.member.entity.Member;
import com.breadpass.domain.member.repository.MemberRepository;
import com.breadpass.infrastructure.annotation.adaptor.Adaptor;
import com.breadpass.infrastructure.exception.object.domain.MemberHandler;
import com.breadpass.infrastructure.exception.payload.code.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@Adaptor
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberAdaptor {

    private final MemberRepository repository;

    public Member queryById(Long memberId) {
        return repository.findById(memberId).orElseThrow(
                () -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND)
        );
    }

    public Member queryByUsername(String username) {
        return repository.findByUsername(username).orElseThrow(
                () -> new MemberHandler(ErrorStatus.MEMBER_NOT_FOUND)
        );
    }
}
