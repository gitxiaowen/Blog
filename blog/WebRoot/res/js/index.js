/**
 * 代码描述：主界面的跳转
 * 
 * 创建时间：2015年12月23日09:07:19
 * 
 * 创建人：熊小文
 */
$(document).ready(function() {
	$(".overlay").css('display','none');
	$(".login-reg").click(function() {
		$('.overlay').css('display','block');
		$('.overlay-login').css('z-index','999');
		$('.overlay-mailsent').css('z-index','1');
		console.log("显示登录注册界面");
	});
	$(".close").click(function(){
		$(".overlay").css('display','none');
	});
	$(".login").click(function(){
		$(".overlay").css('display','block');
		$('.overlay-mailsent').css('z-index','999');
		$('.overlay-login').css('z-index','1');
	});
	$("input").focus(function(){
		$(".search-btn").attr("src","res/imgs/search-active.png");
		$(".search").css("border-color","#02b875");
    	$(".search").css("-webkit-box-shadow","inset 0px 0px 1px #02b875");
    	$(".search input").css("background","rgba(0,239,115,0.1");
	});
	$("input").blur(function(){
		$(".search-btn").attr("src","res/imgs/search-default.png");
		$(".search").css("border-color","rgba(0,0,0,0.2)");
		$(".search").css("-webkit-box-shadow","0px 0px 0px #000000");
		$(".search input").css("background","rgb(255, 255, 255)");
	});
	
});