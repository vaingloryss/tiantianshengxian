$(function(){
	var homePath = "http://localhost:8080/tiantianshengxian/";
	$.ajaxSetup({
		async:false
	})

	//全部商品分类
	$("#category").load(homePath+"pageController/category");
	//新鲜水果
	$("#categoryFruit").load(homePath+"pageController/GoodsAndCategoryModel/1");
	//海鲜水产
	$("#categorySeafood").load(homePath+"pageController/GoodsAndCategoryModel/2");

})