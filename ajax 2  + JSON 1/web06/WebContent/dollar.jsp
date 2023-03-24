<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    String d = request.getParameter("d");
    
    int won = Integer.parseInt(d);   
    int result = won * 1283;
    %><%= result %>