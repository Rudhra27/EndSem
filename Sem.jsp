<%@ page import="java.time.LocalDate,java.time.LocalTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.*,java.io.*,javax.servlet.*,java.text.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Current Date and Time</title>
</head>
<body>
<h3> Hi, Rudhra!!!</h3>
<h1>Current Date and Time:</h1>
<% Date date=new Date();
LocalTime obTime=LocalTime.now();
out.print("Current Date and Time:"+date.toString());%>
<h2>Date and Time Format</h2>
<h4><%
SimpleDateFormat dt=new SimpleDateFormat("yyyy.MM.dd");
out.println(" Today's Date : "+dt.format(date));%></h4>
<h4>
<% 
out.print("\n Current Time : "+obTime);%></h4>
<h3></h3>
</body>
</html>