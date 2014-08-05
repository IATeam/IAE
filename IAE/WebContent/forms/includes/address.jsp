<h3 class="sixteen columns" style="float:none;">Address</h3>
<div class="fieldsetborder">
	<fieldset>
	
		<div class="row">
			<s:select cssClass="four columns" list="#{'1':'Accommodation (Attention)'}" id="accommodationType" name="" />
			
			<div class="textarea twelve columns">
				<s:label for="commentsAddress" value="Comments:" />
				<div><s:textarea id="commentsAddress" cssClass="oneLineTextArea"></s:textarea></div> 
			</div>
		</div>
		
		<div class="row">
			<div class="inputfield eight columns">
				<s:label for="address" value="Address:" />
				<div><s:textfield id="address" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns">
				<s:label for="city" value="City:" />
				<div><s:textfield id="city" name=""></s:textfield></div>
			</div>
			
			
			<div class="inputfield four columns">
				<s:label for="state" value="State:" />
				<div><s:textfield id="state" name=""></s:textfield></div>
			</div>
		</div>
		
		<div class="row">
			<div class="inputfield four columns">
				<s:label for="country" value="Country:" />
				<div><s:textfield id="country" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns">
				<s:label for="postcode" value="Post Code:" />
				<div><s:textfield id="postcode" name=""></s:textfield></div>
			</div>
			
			<div class="inputfield four columns">
				<s:label for="homephone" value="Home#:"/>
				<div><s:textfield id="homephone" name=""></s:textfield></div>
			</div>
		</div>
	</fieldset>
</div>