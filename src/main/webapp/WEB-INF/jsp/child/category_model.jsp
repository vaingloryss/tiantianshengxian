<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--查询数据库中的所有商品，按照时间顺序排序，选出前四个--%>

<div class="list_model">
    <div class="list_title clearfix">
        <%--goodsAndCategoryModel--%>
        <h3 class="fl" id="model01">${goodsAndCategoryModel.categoryModelAndPicture.categoryModel.modelTitle}</h3>
        <div class="subtitle fl">
            <span>|</span>
            <a href="#">${goodsAndCategoryModel.childCategoryList[0]}</a>
            <a href="#">${goodsAndCategoryModel.childCategoryList[1]}</a>
            <a href="#">${goodsAndCategoryModel.childCategoryList[2]}</a>
        </div>
        <a href="${pageContext.request.contextPath}/pageController/toList" class="goods_more fr" id="fruit_more">查看更多 ></a>
    </div>

    <div class="goods_con clearfix">
        <div class="goods_banner fl"><img src="${pageContext.request.contextPath}/${goodsAndCategoryModel.categoryModelAndPicture.picture.pathName}"></div>
        <ul class="goods_list fl">
            <c:forEach var="goodsAndPicture" items="${goodsAndCategoryModel.goodsAndPictureList}">
                <li>
                    <h4><a href="#">${goodsAndPicture.goods.name}</a></h4>
                    <a href="${pageContext.request.contextPath}/pageController/goodsDetail"><img src="${pageContext.request.contextPath}/${goodsAndPicture.picture.pathName}"></a>
                    <div class="prize">¥ ${goodsAndPicture.goods.price}</div>
                </li>
            </c:forEach>
        </ul>
    </div>
</div>
