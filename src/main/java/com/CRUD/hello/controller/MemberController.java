package com.CRUD.hello.controller;

import com.CRUD.hello.domain.Member;
import com.CRUD.hello.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mt")
@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService; // @RequriedArgsConstructor 에 의해 final 생성자 자동 생성

    @PostMapping("/save")
    public String saveMember(@RequestBody Member member){
        System.out.println(member.getId());
        return memberService.save(member);
    }
}
