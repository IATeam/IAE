<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<s:url value='/js/jquery/jquery-1.11.1.min.js' encode='false' includeParams='none'/>"></script>
<script src="<s:url value='/js/jquery/jquery-ui.min.js' encode='false' includeParams='none'/>"></script>
<link href="<s:url value='/styles/skeleton.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css" media="all"/>
<link href="<s:url value='/styles/login.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css" media="all"/>
<script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<script src="<s:url value='/js/login.js' encode='false' includeParams='none'/>"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<img src="<s:url value='/resources/images/logo.png'/>"/>
	</header>
	<div class="container">
	
		<section id="secLogin">
			<s:form action="login">
				<div id="divLogin">
					<s:textfield placeholder='enter your USERNAME' id="username" label="Username" key="username" onkeydown="return unameEntered(event)"/>
					<s:password placeholder='enter your PASSWORD' id="password" label="Password" key="password"/>
				</div>
				<input type="button" value="Reset" onclick="resetPressed()">
			</s:form>
			 
		</section>
	</div>
	
	
	
	
	
	<script>
		$('#password').hide();
	</script>
</body>
</html>