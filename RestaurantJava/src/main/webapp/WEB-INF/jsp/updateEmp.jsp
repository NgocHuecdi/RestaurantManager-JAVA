<%-- 
    Document   : updateEmp
    Created on : Apr 15, 2021, 4:18:32 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<h1 class="text-center text-success">U EMPOYEE</h1>  

<c:url value="/updateEmp/add" var="action" />
<form:form method="post"  action="${action}" modelAttribute="updateEmp">
   <form:errors path="*" element="div" 
                 cssClass="alert alert-danger" />
  
    <div class="form-group">
        <label><spring:message code="updateEmp.name" /></label>
        
    </div>
    <div class="form-group">
        <label><spring:message code="updateEmp.mail" /></label>
       
    </div>
    <div class="form-group">
        <label><spring:message code="updateEmp.address" /></label>
       
    </div>
    <div class="form-group">
        <label><spring:message code="updateEmp.birth" /></label>
        
    </div>
    
    
    <div>
        <form:hidden path="empId" />
        <input type="submit" class="btn btn-success" value="<spring:message code="updateEmp.submit" />" />
    </div>
</form:form>