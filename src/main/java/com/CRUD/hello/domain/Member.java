package com.CRUD.hello.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_idx")
    private Long idx;
    @Column(name = "member_id")
    private String id;
    @Column(name = "member_pw")
    private String pw;
    @Column(name = "member_name")
    private String name;
}
