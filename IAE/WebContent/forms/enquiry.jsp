<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Enquiry Form</title>
<s:head/>
<link href="<s:url value='/styles/form.css' encode='false' includeParams='none'/>" rel="stylesheet" type="text/css"
	      media="all"/>
</head>
<body>
	<div id="#caseForm">
		<div class="imageContainer"><span class="headerText">Enquiry Form</span></div>
		<fieldset id="caseInfo">
			<label for="creationDate">Creation Date:</label>
			<label id="creationDate">10/04/2014</label>
        	<br>
			<label for="lastUpdatedOn">Last Updated On:</label>
			<label id="lastUpdatedOn">15/05/2014</label>
			<br>
			<label for="createdBy">Created By:</label>
			<label id="createdBy">Michael Hall</label>
			<br>
			<label for="lastUpdatedBy">Last Updated By:</label>
			<label id="lastUpdatedBy">Michael Hall</label>
			<br>
			<button id="flag">Flag</button>
			<br>
			<select id="statusChoice"><option>Status</option></select>
			<br>
			<label for="caseNumber">Case#:</label>
			<label id="lastUpdatedBy">010</label>
		</fieldset>
		Personal Details
		<fieldset>
			<select id="personTitleProtege"><option>Title</option></select>
			<br>
			<input id="firstNameProtege" placeholder="First Name">
			<br>
			<input id="otherNameProtege" placeholder="Other Name">
			<br>
			<input id="lastNameProtege" placeholder="Last Name">
			<br>
			<select id="genderProtege"><option>Gender</option></select>
			<br>
			<input id="identificationProtege" placeholder="Identification">
			<br>
			<label for="birthDateProtege">Birth Date:</label>
			<input type="date" id="birthDateProtege">
			<br>
			<select id="culturalBackgroundProtege"><option>Cultural Background</option></select>
			<br>
			<input id="emailProtege" placeholder="Email">
			<br>
			<input id="mobilePhoneProtege" placeholder="Mobile Phone">
		</fieldset>
		Address
		<fieldset>
			<select id="accommodationType"><option>Accommodation Type</option></select>
			<br>
			<textarea id="accommodationComment" placeholder="Comment"></textarea>
			<br>
			<input id="address" placeholder="Address">
			<br>
			<input id="city" placeholder="City">
			<br>
			<input id="State" placeholder="State">
		</fieldset>
		Referral
		<fieldset>
			<input id="inquisitor" placeholder="Inquisitor:">
			<input id="referedBy" placeholder="Refered by:">
			<input id="referedTo" placeholder="Refered To:">
		</fieldset>
		Employment
		<fieldset>
			<input id="profession" placeholder="Profession:">
			<input id="workPhone" placeholder="Work Phone:">
			<input id="description" placeholder="Description:">
			<input id="comments" placeholder="Comments:">
		</fieldset>
		Disability
		<fieldset>
			<br>
			<select id="disabilityChoice1"><option>Disability</option></select>
			<input id="disabilityDescription1" placeholder="Disability Description:">
			<br>
			<select id="disabilityChoice2"><option>Disability</option></select>
			<input id="disabilityDescription2" placeholder="Disability Description:">
			<br>
			<button id="newDisability">New Disability</button>
		</fieldset>
	</div>		
</body>
</html>