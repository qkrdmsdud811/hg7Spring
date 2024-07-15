package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.BoardDto;
import com.java.service.BServiceImpl;
import com.java.service.BService;


@Controller
public class FController {
	//iv
	//BoardDto bdto=new BoardDto();
	//Autowired는 객체를 생성하지 않아도 사용할 수 있게 해줌 DI라고 함
	//스프링은 내가 객체를 선언하지 않아도 스프링이 해준다.
	@Autowired
	BoardDto bdto;
	
	
	//다형성
	//BServiceImpl bservice1 new BServiceImpl();
	//BServiceImpl2 bservice2 new BServiceImpl2();

	@Autowired
	BService bservice;
	//파일의 위치
	@RequestMapping("/index")
	public String index() {
		bdto.setBno(1);
		//System.out.println(bservice1.add());
		//System.out.println(bservice2.add());
		System.out.println(bservice.add());	//15
		//주소
		return "index";
	} //String index
	
	
	
	
}//FController
