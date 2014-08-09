<!-- 
	Created By Quang Nhan
	Creaed On: 9/8/14
	Last Updated On: 9/8/14
	Description: A jsp page that displays a linked enquiry selected from enquiry page.
  -->
  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Linked Enquiry</title>
<link href="<s:url value='/styles/form.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css"
	      media="all"/>
<link href="<s:url value='/styles/skeleton.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css"
	      media="all"/>
<s:head/>

</head>
<body>
<h1>display linked enquiry</h1>
<div class="container">

<%@include file="includes/formStatus.jsp" %>
<%@include file="includes/summary.jsp" %>
<%@include file="includes/personalDetails.jsp" %>
<%@include file="includes/address.jsp" %>
<%@include file="includes/referral.jsp" %>
<%@include file="includes/employment.jsp" %>
<%@include file="includes/disability.jsp" %>
<%@include file="includes/issues.jsp" %>
<%@include file="includes/linkedEnquiries.jsp" %>

</div>
</body>
</html>