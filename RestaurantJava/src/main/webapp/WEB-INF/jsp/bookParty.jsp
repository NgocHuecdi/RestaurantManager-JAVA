<%-- 
    Document   : bookParty
    Created on : Apr 27, 2021, 8:35:20 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1 class="text-center text-info">Đặt Tiệc Cưới</h1>

<c:url value="/bookParty/add" var = "action"/>
<form:form method="post"  action="${action}" modelAttribute="bookParty">
    <form:errors path="*" element="div" 
                 cssClass="alert alert-danger" />
    <div>
        <label>Thông tin liên hệ</label>
        <div class="form-group">
            <label>Họ và tên</label>
            <form:input cssClass="form-control" path="" />
        </div>
        <div class="form-group">
            <label>Số điện thoại</label>
            <form:input cssClass="form-control" path="" />
        </div>
        <div class="form-group">
            <label>Email</label>
            <form:input cssClass="form-control" path="" />
        </div>
        <div class="form-group">
            <label>Địa chỉ</label>
            <form:input cssClass="form-control" path="" />
        </div>
    </div>

    <div>
        <label>Thông tin tiệc</label>
        <div class="form-group">
            <label>Sự kiện</label>
            
        </div>
        <div class="form-group">
            <label>Dịch vụ</label>
            <form:select path="" cssClass="form-control">
                
            </form:select>
        </div>
        <div class="form-group">
            <label>Ngày tổ chức</label>
            <form:input cssClass="form-control" path="dateUse" />
        </div>
        <div class="form-group">
            <label>Số lượng khách</label>
            <form:input cssClass="form-control" path="" />
        </div>
                <div class="form-group">
            <label>Ghi chú</label>
            <form:input cssClass="form-control" path="" />
        </div>
    </div>



    <div>
        <form:hidden path="" />
        <input type="submit" class="btn btn-success" value="Gửi thông tin" />
    </div>
</form:form>