<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    	String m = request.getParameter("money");
    	String choice2 = request.getParameter("choice");
    	
    	System.out.println(choice2);
    	int money = Integer.parseInt(m);
    	switch (choice2) {
    	case "1":
    		money = money - 1000;
    		break;
    	case "2":
    		money = money + 1000;
    		break;
    	case "3":
    		money = money + 500;
    		break;
    	}
    %><%= money %>