<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Enquiry Form</title>
<link href="<s:url value='/styles/form.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css"
	      media="all"/>
<link href="<s:url value='/styles/skeleton.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css"
	      media="all"/>
<s:head/>

</head>
<body>
	<header class="imageContainer">
		<span class="headerText">Enquiry Form</span>
	</header>
	 <div class="form container">
		
		<fieldset id="formStatus">
			<s:div>
				<s:label for="createdDate" value="Created Date:" />
				<s:text id="createdDate" name="">10/04/2014</s:text>
	        	
				<s:label for="lastUpdatedOn" value="Last Updated On:" />
				<s:text id="lastUpdatedOn" name="">15/05/2014</s:text>
				<br>
				<s:label for="createdBy" value="Created By:" />
				<s:text id="createdBy" name="">Michael Hall</s:text>
				
				<s:label for="lastUpdatedBy" value="Last Updated By:" />
				<s:text id="lastUpdatedBy" name="">Michael Hall</s:text>
			</s:div>
			
			<s:div>
				<s:select cssClass="four columns" list="#{'1':'Flag (Attention)'}" id="issueType" name="" />
				<s:select cssClass="four columns" list="#{'1':'Flag (Attention)'}" id="issueType" name="" />
				<s:label for="enquiryID" value="Case#:" />
				<s:text id="enquiryID" name="">010</s:text>
			</s:div>
			
		</fieldset>
		<%@include file="includes/personalDetails.jsp" %>
		<%@include file="includes/address.jsp" %>
		<%@include file="includes/referral.jsp" %>
		<%@include file="includes/employment.jsp" %>
		<%@include file="includes/disability.jsp" %>
		<%@include file="includes/issues.jsp" %>
		<%@include file="includes/linkedEnquiries.jsp" %>
		<footer>
			<section>
				<input type="button" value="Cancel" />
				<input type="button" value="New Enquiry" />
			</section>
			
			<section>
				<input type="button" value="Create Case" />
				<s:submit type="submit" cssClass="button" value="Save" />
			</section>
		</footer>
	</div>		
</body>
</html>