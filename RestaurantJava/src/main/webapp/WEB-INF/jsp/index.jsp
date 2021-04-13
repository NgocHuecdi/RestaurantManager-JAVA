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
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        
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
                                <tr id="employee${emp.empId}">
                                     <td> ${emp.empId}</td>
                                     <td>${emp.name}</td>
                                     <td>${emp.birth}</td>
					
					<td> <a href="javascript:;" class="btn btn-primary">Update</a>
                                            <a href="javascript:;" class="btn btn-danger" onclick="deleteEmployee(${emp.empId})">Delete</a>
					</td>
                                 
				</tr>
                            </c:forEach>
			</tbody>
        </table>
        <script src="<c:url value="/js/main.js" />"></script>
         <br/>  
        <a href="<c:url value="addemp/" />">Add New Employee</a>  
</body>
</html>





