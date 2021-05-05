<%-- 
    Document   : viewBook
    Created on : Apr 28, 2021, 9:06:54 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center text-danger">Đơn Đặt Tiệc</h1>
<table class="table">
    <tr>
        <th>Mã Tiệc</th>
        <th>Khách Hàng</th>
        <th>Số điện thoại</th>
        <th>Địa chỉ</th>
        <th>Dịch vụ</th>
        <th>Sự kiện</th>
        <th>Sảnh</th>
        <th>Ngày tổ chức</th>
        <th>Số lượng khách</th>
        <th>Ghi chú</th>
    </tr>

    <c:forEach items="${bookDetails}" var="stats">
    <tr>
        <td>${stats[0]}</td>
        <td>${stats[1]} </td>
        <td>${stats[2]}</td>
        <td>${stats[3]}</td>
        <td>${stats[4]}</td>
        <td>${stats[5]}</td>
        <td>${stats[6]}</td>
        <td>${stats[7]}</td>
        <td>${stats[8]}</td>
        <td>${stats[9]}</td>
    </tr>
    </c:forEach>
  
   
</table>

