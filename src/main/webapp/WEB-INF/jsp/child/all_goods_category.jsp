<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<ul class="subnav fl">
    <c:forEach var="category" items="${categoryList}">
        <li><a href="${category.model}" class="${category.popClass}">${category.name}</a></li>
    </c:forEach>
</ul>