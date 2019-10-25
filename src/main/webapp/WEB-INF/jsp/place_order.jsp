<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>天天生鲜-提交订单</title>
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
    <a href="${pageContext.request.contextPath}/jsp/index.jsp" class="logo fl"><img src="${pageContext.request.contextPath}/images/logo.png"></a>
    <div class="sub_page_name fl">|&nbsp;&nbsp;&nbsp;&nbsp;提交订单</div>
    <div class="search_con fr">
        <input type="text" class="input_text fl" name="" placeholder="搜索商品">
        <input type="button" class="input_btn fr" name="" value="搜索">
    </div>
</div>

<h3 class="common_title">确认收货地址</h3>

<div class="common_list_con clearfix">
    <dl>
        <dt>寄送到：</dt>
        <dd><input type="radio" name="" checked="">北京市 海淀区 中关村软件园 （张山 收） 182****7528</dd>
    </dl>
    <a href="${pageContext.request.contextPath}/jsp/user_center_site.jsp" class="edit_site">编辑收货地址</a>

</div>

<h3 class="common_title">支付方式</h3>
<div class="common_list_con clearfix">
    <div class="pay_style_con clearfix">
        <input type="radio" name="pay_style" checked>
        <label class="cash">货到付款</label>
        <input type="radio" name="pay_style">
        <label class="weixin">微信支付</label>
        <input type="radio" name="pay_style">
        <label class="zhifubao"></label>
        <input type="radio" name="pay_style">
        <label class="bank">银行卡支付</label>
    </div>
</div>

<h3 class="common_title">商品列表</h3>

<div class="common_list_con clearfix">
    <ul class="goods_list_th clearfix">
        <li class="col01">商品名称</li>
        <li class="col02">商品单位</li>
        <li class="col03">商品价格</li>
        <li class="col04">数量</li>
        <li class="col05">小计</li>
    </ul>
    <ul class="goods_list_td clearfix">
        <li class="col01">1</li>
        <li class="col02"><img src="${pageContext.request.contextPath}/images/goods/goods012.jpg"></li>
        <li class="col03">奇异果</li>
        <li class="col04">500g</li>
        <li class="col05">25.80元</li>
        <li class="col06">1</li>
        <li class="col07">25.80元</li>
    </ul>
    <ul class="goods_list_td clearfix">
        <li class="col01">2</li>
        <li class="col02"><img src="${pageContext.request.contextPath}/images/goods/goods003.jpg"></li>
        <li class="col03">大兴大棚草莓</li>
        <li class="col04">500g</li>
        <li class="col05">16.80元</li>
        <li class="col06">1</li>
        <li class="col07">16.80元</li>
    </ul>
</div>

<h3 class="common_title">总金额结算</h3>

<div class="common_list_con clearfix">
    <div class="settle_con">
        <div class="total_goods_count">共<em>2</em>件商品，总金额<b>42.60元</b></div>
        <div class="transit">运费：<b>10元</b></div>
        <div class="total_pay">实付款：<b>52.60元</b></div>
    </div>
</div>

<div class="order_submit clearfix">
    <a href="javascript:;" id="order_btn">提交订单</a>
</div>

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

<div class="popup_con">
    <div class="popup">
        <p>订单提交成功！</p>
    </div>

    <div class="mask"></div>
</div>
<script type="text/javascript" src="js/jquery-1.12.2.js"></script>
<script type="text/javascript">
    $('#order_btn').click(function() {
        localStorage.setItem('order_finish',2);

        $('.popup_con').fadeIn('fast', function() {

            setTimeout(function(){
                $('.popup_con').fadeOut('fast',function(){
                    window.location.href = 'index.jsp';
                });
            },3000)

        });
    });
</script>
</body>
</html>