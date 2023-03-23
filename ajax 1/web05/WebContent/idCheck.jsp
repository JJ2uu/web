<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    	// 입력한 값 받아오기.
    	// 입력한 아이디가 있는지 확인
    	// 결과를 응답
    	String id = request.getParameter("id");
    	String[] list = {"root", "admin", "hong"};
    	
    	String result = "중복이 되지 않아, 사용 가능하다";
    	
    	for (String s : list) {
    		if (s.equals(id)) {
    			result = "중복된 아이디입니다.";
    			break;
    		}
    	}
    	// ajax는 공백을 인식하기 때문에 주의
    %><%= result %>