$(document).ready(function(){
$(".my-mod").css("display","none");
$(".my-mod-overlay").css("display","none");
$(".my-btn").click(function(){
$(".my-mod").fadeIn();
	$(".my-mod").css("display","block");
	$(".my-mod-overlay").css("display","block");
})
$(".my-mod-overlay").click(function(){

	
	$(".my-mod").css("display","none");
	$(".my-mod-overlay").css("display","none");
})
$(".close").click(function(){

	
	$(".my-mod").css("display","none");
	
	$(".my-mod-overlay").css("display","none");
})
});