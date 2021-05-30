package com.CRUD.hello.repository;

import com.CRUD.hello.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class MemberRepository {
    public String save(Member member){
        return member.getId();
    }
}
