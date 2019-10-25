<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>天天生鲜-购物车</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
<div class="header_con">
    <div class="header">
        <div class="welcome fl">欢迎来到天天生鲜!</div>
        <div class="fr">
            <shiro:notAuthenticated>
                <div class="login_btn fl">
                    <a href="${pageContext.request.contextPath}/pageController/toLogin">登录</a>
                    <span>|</span>
                    <a href="${pageContext.request.contextPath}/pageController/toRegister">注册</a>
                </div>
            </shiro:notAuthenticated>
            <shiro:user>
                <div class="login_info fl">
                    欢迎您：<em><shiro:principal/></em>
                </div>
                <div class="user_link fl">
                    <span>|</span>
                    <a href="${pageContext.request.contextPath}/jsp/user_center_info.jsp">用户中心</a>
                    <span>|</span>
                    <a href="${pageContext.request.contextPath}/cartController/show">我的购物车</a>
                    <span>|</span>
                    <a href="${pageContext.request.contextPath}/jsp/user_center_order.jsp">我的订单</a>
                </div>
            </shiro:user>
        </div>
    </div>
</div>

<div class="search_bar clearfix">
    <a href="${pageContext.request.contextPath}/pageController/toIndex" class="logo fl"><img src="${pageContext.request.contextPath}/images/logo.png"></a>
    <div class="sub_page_name fl">|&nbsp;&nbsp;&nbsp;&nbsp;购物车</div>
    <div class="search_con fr">
        <input type="text" class="input_text fl" name="" placeholder="搜索商品">
        <input type="button" class="input_btn fr" name="" value="搜索">
    </div>
</div>

<div class="total_count">全部商品<em>${cartVoList.size()}</em>件</div>
<ul class="cart_list_th clearfix">
    <li class="col01">商品名称</li>
    <li class="col02">商品单位</li>
    <li class="col03">商品价格</li>
    <li class="col04">数量</li>
    <li class="col05">小计</li>
    <li class="col06">操作</li>
</ul>
<c:set var="total" value="${0}"/>
<c:forEach items="${cartVoList}" var="cartVo" >
    <ul class="cart_list_td clearfix">
        <li class="col01"><input type="checkbox" name="" checked></li>
        <li class="col02"><img src="${pageContext.request.contextPath}/${cartVo.goodsAndPicture.picture.pathName}"></li>
        <li class="col03">${cartVo.goodsAndPicture.goods.name}<br><em>${cartVo.goodsAndPicture.goods.price}元/${cartVo.goodsAndPicture.goods.unit}</em></li>
        <li class="col04">${cartVo.goodsAndPicture.goods.unit}</li>
        <li class="col05">${cartVo.goodsAndPicture.goods.price}元</li>
        <li class="col06">
            <div class="num_add">
                <a href="javascript:;" class="add fl">+</a>
                <input type="text" class="num_show fl" value="${cartVo.cart.goodsNum}">
                <a href="javascript:;" class="minus fl">-</a>
            </div>
        </li>
        <li class="col07">${cartVo.goodsAndPicture.goods.price*cartVo.cart.goodsNum}元</li>
        <li class="col08"><a href="javascript:;">删除</a></li>
    </ul>
    <c:set var="total" value="${total+cartVo.goodsAndPicture.goods.price*cartVo.cart.goodsNum}"/>
</c:forEach>

<ul class="settlements">
    <li class="col01"><input type="checkbox" name="" checked=""></li>
    <li class="col02">全选</li>
    <li class="col03">合计(不含运费)：<span>¥</span><em>${total}</em><br>共计<b>${cartVoList.size()}</b>件商品</li>
    <li class="col04"><a href="${pageContext.request.contextPath}/jsp/place_order.jsp">去结算</a></li>
</ul>

<div class="footer">
    <div class="foot_link">
        <a href="#">关于我们</a>
        <span>|</span>
        <a href="#">联系我们</a>
        <span>|</span>
        <a href="#">招聘人才</a>
        <span>|</span>
        <a href="#">友情链接</a>
    </div>
    <p>CopyRight © 2016 北京天天生鲜信息技术有限公司 All Rights Reserved</p>
    <p>电话：010-****888    京ICP备*******8号</p>
</div>

</body>
</html>
