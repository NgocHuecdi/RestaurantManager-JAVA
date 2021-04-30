

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1 class="text-center text-success">ĐĂNG NHẬP</h1>

<c:if test="${param.error != null}">
    <div class="alert alert-danger">
        Something wrong!!!
    </div>
</c:if>

<c:if test="${param.accessDenied != null}">
    <div class="alert alert-danger">
       Access Denied!!! 
    </div>
</c:if>

<c:url value="/login" var="action" />
<form method="post" action="${action}">
    <div class="form-group">
        <label for="username">Tên đăng nhập</label>
        <input type="text" name="username" 
               id="username"
               class="form-control" />
    </div>
    <div class="form-group">
        <label for="password">Mật khẩu</label>
        <input type="password" name="password" 
               id="password"
               class="form-control" />
    </div>
    <div class="form-group">
        <input type="submit" value="Đăng nhập"
               class="btn btn-danger"/>
    </div>
</form>
