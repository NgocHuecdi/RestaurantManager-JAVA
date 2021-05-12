<%-- 
    Document   : billParty
    Created on : May 10, 2021, 1:14:55 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1 class="text-center text-danger">Đặt tiệc</h1>
<c:url value="/billParty/add" var="action" />
<form:form method="POST" 
           action="${action}" 
           modelAttribute="billParty">
    
      <div class="form-group">
        <label for="">Tên Nhân Viên</label>   
            <form:select path="employee" cssClass="form-control">
            <c:forEach items="${employees}" var="emp">
                <option value="${emp[0]}">${emp[2]}</option>
            </c:forEach>
        </form:select>
    </div>

  <div class="form-group">
        <label for="">Tên Khách Hàng</label>   
            <form:select path="customer" cssClass="form-control">
            <c:forEach items="${customer}" var="cus">
                <option value="${cus[0]}">${cus[2]}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label for="service">Dịch vụ</label>
        <form:select path="services" cssClass="form-control">
            <c:forEach items="${services}" var="ser">
                <option value="${ser.serviceId}">${ser.name}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label for="event">Sự kiện</label>
        <form:select path="event" cssClass="form-control">
            <c:forEach items="${event}" var="ev">
                <option value="${ev.eventId}">${ev.name}</option>
            </c:forEach>
        </form:select>
    </div>
     <div class="form-group">
        <label for="hall">Sảnh</label>
        <form:select path="hall" cssClass="form-control">
            <c:forEach items="${hall}" var="ha">
                <option value="${ha.hallId}">${ha.name}</option>
            </c:forEach>
        </form:select>
    </div>
    <div class="form-group">
        <label for="">Ngày Trả</label>
        <form:input cssClass="form-control" path="datePay"  />
    </div>
    <div class="form-group">
        <label for="">Đơn Đặt</label>
        <form:input cssClass="form-control" path="bookDetail.id"  />
    </div>
    <div class="form-group">
        <form:hidden path="billId" />
        <input type="submit" value="Gửi thông tin" 
               class="btn btn-danger" />
        
    </div>
</form:form>

<script src="<c:url value="/js/main.js" />"></script>
