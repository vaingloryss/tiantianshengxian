<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>天天生鲜-登录</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/main.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login.js"></script>
</head>
<body>
<div class="login_top clearfix">
    <a href="${pageContext.request.contextPath}/jsp/index.jsp" class="login_logo">
        <img src="${pageContext.request.contextPath}/images/logo02.png">
    </a>
</div>

<div class="login_form_bg">
    <div class="login_form_wrap clearfix">
        <div class="login_banner fl"></div>
        <div class="slogan fl">日夜兼程 · 急速送达</div>
        <div class="login_form fr">
            <div class="login_title clearfix">
                <h1>用户登录</h1>
                <a href="${pageContext.request.contextPath}/pageController/toRegister">立即注册</a>
            </div>
            <div class="form_input">
                <form id="login_form" action="${pageContext.request.contextPath}/logRegController/login" method="post">
                    <input type="text" name="username" class="name_input" placeholder="请输入用户名">
                    <%--<div class="user_error">输入错误</div>--%>
                    <input type="password" name="password" class="pass_input" placeholder="请输入密码">
                    <%--<div class="pwd_error">输入错误</div>--%>
                    <div style="position: absolute;left: 0;top: 120px;">
                        <input id="validateCode" name="validateCode" style="background: #fdfdfd;height: 30px;width: 100px;vertical-align: middle;float: left">
                        <img  id="pagecode" class="flushValidateCode" style="float: left;cursor: pointer;" src="${pageContext.request.contextPath}/logRegController/validateCode">
                        <a class="flushValidateCode" href="#" style="float: left;margin: 6px">看不清？</a>
                    </div>
                    <div class="more_input clearfix">
                        <input type="checkbox" name="">
                        <label>记住用户名</label>
                        <a href="#">忘记密码</a>
                    </div>
                    <div id="login_error" class="login_error">用户名或密码错误</div>
                    <input type="submit" name="" value="登录" class="input_submit">
                </form>
            </div>
        </div>
    </div>
</div>

<div class="footer no-mp">
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