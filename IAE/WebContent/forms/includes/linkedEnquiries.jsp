<!-- 
	Created By Quang
	Created On
	Last Updated On
	Description:
	
	Notes: the enquiry table has a field called parent enquiry
	when the user selects and add an enquiry, the query should
	check if that linked enquiry has a parent enquiry. If it does
	the system should search for all enquiries with the same 
	parent enquiry. It should add all enquiries with that same
	parent enquiry into the list as well (if it already is not).
 -->

<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<head>

</head>

<h3 class="sixteen columns" style="float:none;">Linked Enquiries</h3>
<s:div cssClass="greybackground">

	<s:url id="urlELinked" namespace="/enquiry" action="getLinkedEnquiry" />
		
	

	<!-- <s:if test="" >
		<s:iterator value="">
			<s:div cssClass="fieldsetborder">
				<fieldset>
					<div class="textarea two columns">
						<s:label value="E#" />
						<s:textarea cssClass="oneLineTextArea"></s:textarea>		 
					</div>
					
					<div class="textarea four columns">
						<s:label value="Date:" />
						<s:textarea cssClass="oneLineTextArea"></s:textarea>		 
					</div>
					
					<div class="textarea six columns">
						<s:label value="Enquiry Description:" />
						<s:textarea label="issuedescription" cssClass="oneLineTextArea"></s:textarea>		 
					</div>
				</fieldset>
			</s:div>
		</s:iterator>
	</s:if> -->
	
	<article id="artLinkedEnquiries" class="row">
	
		<sj:a id="aELinked" href="%{urlELinked}" targets="slidingPanel">
		<section class="secLinkedEnquiries sixteen columns curveBorder">
			<div class="textarea two columns">
				<s:label for="issuedescription" value="E#:" />
				<s:textarea id="" cssClass="oneLineTextArea" name="" /> 
			</div>
			<div class="textarea two columns">
				<s:label for="enquiryDate" value="Date:" />
				<s:textarea id="enquiryDate" cssClass="oneLineTextArea" name="" /> 
			</div>
			<div class="textarea eleven columns omega">
				<s:label for="enquiryDescription" value="Enquiry Description:" />
				<s:textarea id="enquiryDescription" cssClass="oneLineTextArea" name="" /> 
			</div>
		</section>
		</sj:a>
	</article>
	
	<div>
		<div class="row">
			<div class="twelve columns alpha"><p></p></div>
			<input type="button" id="btnOpen" value="View" class="two columns"/>
			<input type="button" id="btnAddEnquiry" value="Add Enquiry" class="two columns omega"/>
		</div>
	</div>
	
	
	
	<script>
	$(function(){
		$("#btnNewIssue").click(function(){ 
			$("#ulistIssues li").first().clone().appendTo("#ulistIssues");
		});
		
		$('body').click(function(){
			
			hideSlidingPanel();
		});
		
		$('#slidingPanel').click(function(event){
			event.stopPropagation();
		});
		
		$("#aELinked").click(function(){
			//$("#slidingPanel").show("slide", {diretion: "right"}, 10);
			//$("#slidingPanel").hide();
			//hideSlidingPanel();
			showSlidingPanel();
		});
	});
	</script>
</s:div>