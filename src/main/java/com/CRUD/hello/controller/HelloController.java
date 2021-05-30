package com.CRUD.hello.controller;

import com.CRUD.hello.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class HelloController {
    @RequestMapping("/ngj") // localhost:8080/api/ngj 로 접속시 웹페이지에 Hello NGJ 출력
    public String getRequest(){
        return "Hello NGJ";
    }

    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
    public String getParameter(@RequestParam String id, @RequestParam String password){
        // 만약에 여기서 password라는 변수가 쓰인다면 매개변수는 다른 이름으로 password를 받아야함.
        // 그렇게 되면 매핑이 안되므로 @RequestParam(name = "password") pwd이렇게 해주면
        // 들어오는 인자는 password라는 이름으로 매핑될거야 라는 뜻.
        System.out.println("id : "+id);
        System.out.println("password : "+password);
        return id+password; //여기서 return 한 것들이 web에 띄워짐
    }

    @RequestMapping("/test")
    public HashMap<String, Object> test() {

        HashMap<String, Object> hashMap = new HashMap<String, Object>();

        hashMap.put("name", "john");
        hashMap.put("age", "32");
        hashMap.put("gender", "man");

        return hashMap;
    }






}
