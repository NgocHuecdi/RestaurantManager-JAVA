<%-- 
    Document   : feedback
    Created on : Apr 24, 2021, 9:41:17 PM
    Author     : OS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1 class="text-center m-3">Phản Hồi Của Khách Hàng</h1>

<%--<c:url value="/feedback" var="action"/>--%>
<c:forEach items="${feedbacks}" var="fb">
<div class="media border p-3">
  <div class="media-body">
    <h4> <small><i>Posted on ${fb.date}</i></small></h4>
    <p>${fb.description}</p>
  </div>
</div>
</c:forEach>
