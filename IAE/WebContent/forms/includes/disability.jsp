

<!-- TODO LATER: add js function to click to select primary disability -->

<h3 class="sixteen columns" style="float:none;">Disability</h3>
<s:div cssClass="greybackground">
	
	<!-- <s:if test="" >
		<s:iterator value="">
			<s:div cssClass="fieldsetborder">
				<fieldset>
					
				</fieldset>
			</s:div>
		</s:iterator>
	</s:if> -->
	
	
	
	<article id="artDisability">
		<div class="divDisability row">
			<section class="sixteen columns curveBorder primary">
				<s:select cssClass="four columns" list="#{'1':'Disability (Attention)'}" id="accommodationType" name="" />
				<div class="textarea eleven columns">
					<s:label for="disabilityDescription" value="Disability Description:" /> 
					<s:textarea id="disabilityDescription" cssClass="oneLineTextArea"></s:textarea> 
				</div>
			</section>
		</div>
		
		<div class="divDisability row">
			<section class="sixteen columns curveBorder">
				<s:select cssClass="four columns" list="#{'1':'Disability (Attention)'}" id="accommodationType" name="" />
				<div class="textarea eleven columns">
					<s:label for="disabilityDescription" value="Disability Description:" /> 
					<s:textarea id="disabilityDescription" cssClass="oneLineTextArea"></s:textarea> 
				</div>
			</section>
		</div>
		
	</article>
	
	
	
	<div class="row">
		<div class="fourteen columns alpha"><p></p></div>
		<input type="button" id="btnNewDisability" value="New Disability" class="two columns" />
	</div>
	
	<script>
	$(function(){
		$("#btnNewDisability").click(function(){ 
			$(".divDisability").last().clone().appendTo("#artDisability");
		});
	});
	</script>
	
</s:div>
