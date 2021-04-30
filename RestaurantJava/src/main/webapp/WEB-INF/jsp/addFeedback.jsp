<%-- 
    Document   : addFeedback
    Created on : Apr 27, 2021, 6:11:02 PM
    Author     : OS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<h1 class="text-center text-success m-3">Thêm Bình Luận</h1>  

<c:url value="/addFeedback" var="action" />

<form:form method="post"  action="${action}" modelAttribute="addFeedback">
    <form:errors path="*" element="div" 
                 cssClass="alert alert-danger" />

    <div class="form-group">
        <label for="fb">Nội dung bình luận (<span class="text-danger">*</span>)</label>
        <textarea class="form-control" id="fb" rows="3" placeholder="Nhập nội dung..."></textarea>
    </div>
    <div class="form-group text-right">
        <form:hidden path="feedbackId" />
        <input type="submit" class="btn btn-success" value="Bình luận">
    </div>
</form:form>

