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
		alert(3);
		$(".search-btn").attr("src","res/imgs/search-active.png")
	})
	
});