<h3 class="sixteen columns"  style="float:none;">Personal Details</h3>
<div class="fieldsetborder">
	<fieldset>
	
		<div class="row">
			<s:select cssClass="four columns" list="#{'1':'Title (Attention)'}" id="personTitleProtege" name="" />
	
			<div class='inputfield four columns'>
				<s:label for="firstNameProtege" value="First Name:" />
				<div><s:textfield id="firstNameProtege" name=""></s:textfield></div>
			</div>
			<div class="inputfield four columns">
				<s:label for="otherNameProtege" value="Other Name:" />
				<div><s:textfield id="otherNameProtege" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns omega">
				<s:label for="lastNameProtege" value="Last Name:" />
				<div><s:textfield id="lastNameProtege" name=""></s:textfield></div>
			</div>
		</div>
		
		<div class="row">
			<s:select cssClass="four columns" list="#{'1':'Gender (Attention)'}" id="genderProtege"></s:select>
			<!-- style="padding-right: 15px;" -->
			<div class="inputfield eight columns" >
				<s:label for="identificationProtege" value="Identification:" />
				<div><s:textfield id="identificationProtege" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns omega ">
				<s:label for="birthDateProtege" value="Birth Date:" />
				<div><input type="date" id="birthDateProtege"></div>
			</div>
		</div>
		
		<div class="row">
			<s:select cssClass="four columns" list="#{'1':'Cultural Background(Attention)'}" id="genderProtege"></s:select>
			
			<div class="textarea twelve columns omega">
				<s:label for="commentsProtege" value="Comments:" />
				<div><s:textarea id="commentsProtege" cssClass="oneLineTextArea"></s:textarea></div> 
			</div>
		</div>
		
		<div class="row">
			<div class="inputfield four columns">
				<s:label for="emailProtege" value="Email:" />
				<div><s:textfield id="emailProtege" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns omega">
				<s:label for="mobilePhoneProtege" value="Mobile#:" />
				<div><s:textfield id="mobilePhoneProtege" name="" ></s:textfield></div>
			</div>
		</div>
	</fieldset>
</div>