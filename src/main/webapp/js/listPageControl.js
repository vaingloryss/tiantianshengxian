$.ajaxSetup({
	async:false
});

var homePath = "http://localhost:8080/tiantianshengxian/";
var sort = "1";

$(function(){
	sortBy(1);
});

function pageTurning(pageNum) {
	$("#moreGoods").load(homePath+"pageController/showMore/1/"+sort+"/"+pageNum);
	$("#page"+pageNum).addClass("active");
}

function sortBy(sortBy) {
	sort=sortBy;
	$("#moreGoods").load(homePath+"pageController/showMore/1/"+sortBy+"/1");
	$("#page1").addClass("active");
	activeClass("#sortBy"+sortBy);
}
function activeClass(id) {
	$(".orderBy").each(function () {
		$(this).removeClass("active");
	})
	$(id).addClass("active");
}