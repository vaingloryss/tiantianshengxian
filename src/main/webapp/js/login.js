$(function(){

	//设置全局同步提交ajax
	$.ajaxSetup({
		async:false
	});

	var homePath = "http://localhost:8080/tiantianshengxian/";
	var error_check_validateCode = false;

	//1.点击验证码 更新验证码
	$(".flushValidateCode").click(function(){
		$("#pagecode").attr("src",homePath+"/logRegController/validateCode?n="+Math.random());
	});

	//2.验证验证码
	function checkValidateCode(){
		var validateCode = $("#validateCode").val();
		$.post(homePath+"logRegController/checkValidateCode","validateCode="+validateCode,function(data){
			//验证通过
			if(data.code=="0"){
				error_check_validateCode = true;
			}
		});

		/*$.ajax({
			url:"http://localhost:8080/tiantianshengxian/logRegController/checkValidateCode",
			type:"post",
			dataType:json,
			data:"validateCode:"+validateCode,
			//async:false,
			success:function (data) {
				//验证通过
				alert(data);
				if(data=="0"){
					error_check_validateCode = true;
				}
			}
		});*/
	}

	$('#login_form').submit(function() {
		checkValidateCode();
		if(error_check_validateCode){
			var url = $("#login_form").attr("action");
			var data = $("#login_form").serialize();
			$.ajax({
				url:url,
				data:data,
				type:"post",
				dataType:"json",
				success:function (data) {
					if (data.code=="0"){
						alert("登录成功!一年后跳转登录页面，请耐心等待");
						location.href = homePath+"pageController/toIndex";
					}else {
						$('#login_error').html(data.msg);
						$('#login_error').show();
					}
				}
			});
			return false;
		}else {
			//验证码错误
            $('#login_error').html('验证码不正确');
            $('#login_error').show();
            //更新验证码
			$("#pagecode").attr("src",homePath+"/logRegController/validateCode?n="+Math.random());
			return false;
		}
	});
})