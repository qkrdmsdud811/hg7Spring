package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.dto.MemberDto;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	HttpSession session; 
	//파일의 위치
		@RequestMapping("/member1")
		public String member1() {
			//주소
			return "/member/member1";
		}//member1
		//파일의 위치
		@RequestMapping("/login")
		public String login() {
			//주소
			return "/member/login";
		}//login
		
		//회우 너가입창을 보여줌
				@RequestMapping("/memberForm")
				public String memberForm() {
					//주소
					return "/member/memberForm";
				}//memberForm
				
				//회원가입 후 전송버튼으 눌렀을 때 이동
				@RequestMapping("/doMemberForm")
				public String doMemberForm(MemberDto mdto,HttpServletRequest request,Model model) {
					
//					String id=request.getParameter("id");
//					String pw=request.getParameter("pw");
//					String name=request.getParameter("name");
//					String gender=request.getParameter("gender");
					
//					System.out.println(id);
//					System.out.println(pw);
//					System.out.println(name);
//					System.out.println(gender);
					
//					System.out.println(id+pw+name+gender);
					
					//MemberDto member=new MemberDto(id,pw,name,gender);
					
					//model에 정보넣기
					model.addAttribute("member", mdto);//"id"는 변수
					
					
					//주소
					return "/member/doMemberForm";
					
				}//doMemberForm
				
				@RequestMapping("/doLogin")
				public String doLogin(@RequestParam( String id, String pw,Model model) {
					//default는 아무런 값이 없을 때 사용
					model.addAttribute("id: "+ id);
					model.addAttribute("pw: "+ pw);
					
					//만약에 db에 aaa 1111이 있다면 
					if(id.equals("aaa")&&pw("1111")) {
						//session설정하기
						session.setAttribute("sessionId", id);
					}
					//주소
					return "/member/doLogin";
				}
				//@RequestMapping("/doLogin")
				//public String doLogin(@RequestParam(defaultValue = "aaa") String id, String pw,Model model) {
						//default는 아무런 값이 없을 때 사용
				//model.addAttribute("id", id);
				//model.addAttribute("pw", pw);
				//주소
				//return "/member/doLogin";
				//}

				//public String doLogin(MemberDto mdto,Model model) {
					//model.addAttribute("member", mdto);
					//model.addAttribute("member", mdto.getId());	변수를 개별로 보낸다
					//model.addAttribute("member", mdto.getPw());	변수를 개별로 보낸다
					//주소
					//return "/member/doLogin";
					//}
				@RequestMapping("/mForm")
				public String mform(MemberDto mdto,String[] hobbys, Model model) {
				model.addAttribute("member",mdto);
				return "/member/mForm";
				}
				@RequestMapping("/doMForm")
				public String doMForm(MemberDto mdto,String[] hobbys ,Model model) {
					// 확인해보기
					//System.out.println("이름"+mdto.getName());
					String hobby = "";
					for(int i = 0 ; i < hobbys.length ; i ++) {
						if(i==0) hobby+=hobbys[i];
						else hobby+=","+hobbys[i];
					}
					System.out.println(hobby);
					mdto.setHobby(hobby); // mdto 객체에 취미 저장
					
					model.addAttribute("mdto", mdto);
					return "member/doMForm";
				}
				@RequestMapping("/updateMForm")
				public String updateMForm(MemberDto mdto,
						Model model) {
					
					model.addAttribute("member", mdto);
					
					return "member/updateMForm";
				}//updateMForm








				
}
				

