<%-- 
    Document   : addEmp
    Created on : Apr 2, 2021, 3:26:42 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1 class="text-center text-success">ADD EMPOYEE</h1>  

<form:form method="post" modelAttribute="addemp">
    <div class="form-group">  
        <label><spring:message code="addemp.empId" /></label>
        <form:input cssClass="form-control" path="empId" />
    </div>
    <div class="form-group">
        <label><spring:message code="addemp.name" /></label>
        <form:input cssClass="form-control" path="name" />
    </div>
    <div class="form-group">
        <label><spring:message code="addemp.birth" /></label>
        <form:input cssClass="form-control" path="birth" />
    </div>
    <div>
        <input type="submit" class="btn btn-danger" value="<spring:message code="addemp.submit" />" />
    </div>
</form:form>