<%-- 
    Document   : index
    Created on : Mar 31, 2021, 7:20:24 AM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hue Testsfdhgj</h1>
        
        <ul>
            <c:forEach items="${employeies}" var = "emp">
                <li>${emp.empId} - ${emp.name} - ${emp.birth}</li>
            </c:forEach>
        </ul>
    </body>
</html>
