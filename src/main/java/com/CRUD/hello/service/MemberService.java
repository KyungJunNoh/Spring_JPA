package com.CRUD.hello.service;

import com.CRUD.hello.domain.Member;
import com.CRUD.hello.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    //save
    public String save(Member member) {
        return memberRepository.save(member);
    }
}
