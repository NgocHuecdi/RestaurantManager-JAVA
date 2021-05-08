

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-success p-3">ĐĂNG KÝ</h1>

<c:if test="${errMsg != null}">
    <div class="alert alert-danger">
        ${errMsg}
    </div>
</c:if>
<c:url value="/register" var="action" />
<form:form method="post"  action="${action}" modelAttribute="user">
    <div class="form-group">
        <lable for="username">Tên đăng nhập</lable>
        <form:input id="username" 
                    class="form-control"
                    path="username" />
    </div>
    <div class="form-group">
        <lable for="password">Mật khẩu</lable>
        <form:password id="password" 
                    class="form-control"
                    path="password" />
    </div>
    <div class="form-group">
        <lable for="confirm">Xác nhận mật khẩu</lable>
        <form:password id="confirm" 
                    class="form-control"
                    path="confirmPassword" />
    </div>
    <div class="form-group">
        <input type="submit" value="Đăng ký" class="btn btn-danger" />
    </div>
</form:form>