$.ajaxSetup({
	async:false
});

function add(price) {
	var goodsNum = parseInt($("#goodsNum").val());
	$("#goodsNum").val(goodsNum+1);
	$("#money").html((goodsNum+1)*price);
}
function less(price) {
	var goodsNum = parseInt($("#goodsNum").val());
	if (goodsNum<=1){
		$("#goodsNum").val(1);
		$("#money").html(price);
	}else {
		$("#goodsNum").val(goodsNum-1);
		$("#money").html((goodsNum-1)*price);
	}
}
function addCart() {
	var goodsId = $("#goodsId").val();
	var goodsNum = $("#goodsNum").val();
	var homePath = "http://localhost:8080/tiantianshengxian/";
	alert("发送请求...");

	//$("#add_cart").attr("src",homePath+"cartController/addCart/"+goodsId+"/"+goodsNum);

	$.ajax({
		type:"post",
		url:homePath+"cartController/addCart",
		data:{"goodsId":goodsId,"goodsNum":goodsNum},
		async:false,
		dataType:"json",
		success:function (data) {
			alert("成功："+data.code);
			//添加购物车成功
			if(data.code==0) {
				alert("添加购物车成功!");
			}
		},
		error:function (data) {
			alert("失败："+data.code);
			//添加购物车成功
			if(data.code==0) {
				alert("添加购物车成功!");
			}
		}
	});
}