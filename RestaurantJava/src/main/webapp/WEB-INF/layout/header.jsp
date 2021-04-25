<%-- 
    Document   : header
    Created on : Apr 7, 2021, 1:05:26 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-sm" style="background-color: #4e402d">
    <ul class="navbar-nav">
        <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/" />" style="color: wheat">Trang Chủ</a>
        </li>
        <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/" />" style="color: wheat">Nhân Viên</a>
        </li>
        <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/services" />" style="color: wheat">Dịch Vụ</a>
        </li>
         <li class="nav-item active">
            <a class="nav-link" href="#" style="color: wheat">Phản Hồi Của Khách Hàng</a>
        </li>
           <li class="nav-item active">
            <a class="nav-link" href="<c:url value="/statsRe" />" style="color: wheat">Thống Kê</a>
        </li>
       
    </ul>
</nav>

