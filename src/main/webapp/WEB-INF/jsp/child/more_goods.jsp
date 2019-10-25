<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- ${pageInfo}--%>
<ul class="goods_type_list clearfix">
    <c:forEach items="${pageInfo.list}" var="goodsAndPicture">
        <li>
            <a href="${pageContext.request.contextPath}/goodsController/showDetail/${goodsAndPicture.goods.id}"><img src="${pageContext.request.contextPath}/${goodsAndPicture.picture.pathName}"></a>
            <h4><a href="/tiantianshengxian/jsp/detail.jsp">${goodsAndPicture.goods.name}</a></h4>
            <div class="operate">
                <span class="prize">￥${goodsAndPicture.goods.price}</span>
                <span class="unit">${goodsAndPicture.goods.price}/${goodsAndPicture.goods.unit}</span>
                <a href="#" class="add_goods" title="加入购物车"></a>
            </div>
        </li>
    </c:forEach>

</ul>

<%--页码--%>
<div class="pagenation" id="pagenation">
    <a href="#" onclick="pageTurning(${pageInfo.pageNum-1})">&lt;上一页</a>
    <c:if test="${pageInfo.pages<10}">
        <c:forEach var="pn" items="${pageInfo.navigatepageNums}">
            <a href="#" id="page${pn}" onclick="pageTurning(${pn})">${pn}</a>
        </c:forEach>
    </c:if>
    <a href="#" onclick="pageTurning(${pageInfo.pageNum+1})">下一页&gt;</a>
</div>
