/**
 * 
 */

//controls the display of the homescreen elements


function radioChecked(radio){ 
	//database and report radio button pressed
	if(radio === "radio1" || radio === "radio3"){
		//alert("database pressed");
		$('#formDiv').hide();
		$('#secSuggestions').show();
		$('#secLists').show();
		showHeader();
	}else{//document radio button pressed
		$('#formDiv').show();
		$('#secSuggestions').hide();
		$('#secLists').hide();
		hideHeader();
	}
}

function hideHeader(){
	$('header').animate({opacity: '0'}, 1500);
	$('header').css({postion:'absolute'});
	$('#content').animate({top:'30px'}, 1000);
	
}

function showHeader(){
	$('#content').animate({top:'100px'}, 1000);
	$('header').css({postion:'relative'});
	$('header').animate({opacity: '1'}, 1500);
}

function animating(div){
	
}