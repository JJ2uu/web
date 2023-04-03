package com.multi.mvc03;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {

	@Autowired // 자동으로 BbsDAO에 있는 싱글톤 DAO 주소를 가져와서 dao에 넣어줌
	mySQL_memberDAO dao; //전역변수 선언(global)
	
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다.
	
	@RequestMapping("insert")
	public void insert(mySQL_memberVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("login")
	public String login(mySQL_memberVO bag, HttpSession session) {
		System.out.println("login요청됨");
		System.out.println(bag);
		int result = dao.login(bag);
		if (result == 1) {
			// 로그인 성공하면 세션을 잡자
			// 세션은 내장객체라 Spring한테 달라고 요청
			session.setAttribute("id", bag.getId());
			return "ok"; // 조건에 맞춰 views 아래에 있는 파일을 호출
		} else {
			return "redirect:member.jsp";
		}
	}
	
	@RequestMapping("diary_login")
	public String login2(mySQL_memberVO bag, HttpSession session) {
		System.out.println("login요청됨");
		System.out.println(bag);
		int result = dao.login(bag);
		if (result == 1) {
			// 로그인 성공하면 세션을 잡자
			// 세션은 내장객체라 Spring한테 달라고 요청
			session.setAttribute("id", bag.getId());
			return "diary_bbs.jsp"; // 조건에 맞춰 views 아래에 있는 파일을 호출
		} else {
			return "redirect:member.jsp";
		}
	}
	
	@RequestMapping("update")
	public void update(mySQL_memberVO bag) {
		System.out.println("update 요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(mySQL_memberVO bag) {
		System.out.println("delete 요청됨");
		System.out.println(bag);
		dao.delete(bag);
	}
	
	@RequestMapping("one")
	public void one(mySQL_memberVO bag, Model model) {
		System.out.println("검색 요청됨");
		System.out.println(bag);
		mySQL_memberVO bag2 = dao.one(bag);
		model.addAttribute("bag2", bag2);
	}
	
	@RequestMapping("member_list")
	public void member_list(Model model) {
		// Model은 컨트롤러의 list를 views/member_list.jsp까지만 전달할 수 있는 객체
		ArrayList<mySQL_memberVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}