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
        <title>Home Page</title>
        <link href="<c:url value="/css/employeeCSS.css"/>" rel="stylesheet" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1 style = "text-align: center">List of Employees</h1>
    <table border="1" class = "table table-striped table-responsive-md">
			<thead>
				<tr>
					<th>
						ID
					</th>
					<th>
                                                Name
					</th>
                                        <th>
                                                Birth
					</th>
                                        <th>
                                            Actions
                                        </th>
                                     
					
				</tr>
			</thead>
			<tbody>
                            <c:forEach items="${employeies}" var = "emp">
                                <tr>
                                     <td> ${emp.empId}</td>
                                     <td>${emp.name}</td>
                                     <td>${emp.birth}</td>
					
					<td> <a th:href="" class="btn btn-primary">Update</a>
					    <a th:href="" class="btn btn-danger">Delete</a>
					</td>
                                 
				</tr>
                            </c:forEach>
			</tbody>
        </table> 
         <br/>  
        <a href="<c:url value="addemp/" />">Add New Employee</a>  
</body>
</html>





