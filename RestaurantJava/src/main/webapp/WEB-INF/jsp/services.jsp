<%-- 
    Document   : servcies
    Created on : Apr 23, 2021, 2:30:26 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servcies Page</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="<c:url value="/css/employee.css"/>"
              rel="stylesheet" />
    </head>
    <body>

        <h1 style = "text-align: center">List of Servcies</h1>
              <br/>  
        <a href="<c:url value="/addService" />">Thêm dịch vụ mới</a> 
        <table border="1" class = "table table-striped table-responsive-md">
            <thead>
                <tr>
                    <th>
                        Mã Dịch Vụ
                    </th>
                    <th>
                        Tên Dịch Vụ
                    </th>
                    <th>
                        Giá
                    </th>

                </tr>
            </thead>
            <tbody>
                <c:forEach items="${services}" var = "ser">
                    <tr id="services{ser.serviceId}">
                        <td> ${ser.serviceId}</td>
                        <td>${ser.name}</td>
                        <td>${ser.unit_price}</td>
                      
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <script src="<c:url value="/js/main.js" />"></script>
    </body>
</html>
