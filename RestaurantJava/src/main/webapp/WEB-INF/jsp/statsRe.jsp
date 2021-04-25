<%-- 
    Document   : statsRe
    Created on : Apr 24, 2021, 11:32:35 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center text-info">Thống Kê Doanh Thu</h1>

<form>
    <div class="form-group">
        <input placeholder="From date..." type="date" name="datePay" class="form-control" />
    </div>
    <div class="form-group">
        <input placeholder="To date..." type="date" name="datePay" class="form-control" />
    </div>
    <div class="form-group">
        <input type="submit" value="Tra cuu" />
    </div>
</form>

<table class="table">
    <tr>
        <th>Mã Hóa Đơn</th>
        <th>Khách Hàng</th>
        <th>Nhân Viên</th>
        <th>Dịch vụ</th>
        <th>Sự Kiện</th>
        <th>Ngày Thanh Toán</th>
        <th>Tổng Tiền</th>
    </tr>
     <c:forEach items="${dataStats}" var="stats">
    <tr>
        <td>${stats[0]}</td>
        <td>${stats[1]}</td>
        <td>${stats[2]}</td>
        <td>${stats[3]}</td>
        <td>${stats[4]}</td>
        <td>${stats[5]}</td>
        <td>${stats[6]}</td>
    </tr>
    </c:forEach>
   
</table>

