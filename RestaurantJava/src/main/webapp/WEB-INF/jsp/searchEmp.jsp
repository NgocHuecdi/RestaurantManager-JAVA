<%-- 
    Document   : searchEmp
    Created on : Apr 19, 2021, 12:13:33 PM
    Author     : HP
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<head>
     <link href="<c:url value="/css/employee.css"/>"
              rel="stylesheet" />
</head>

<h1 class="text-center text-success">LIST EMPOYEE</h1>  

 <div class="form-group">
    <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Employee's Name"> 
    <input type="button" class="btn btn-success" onclick="loadEmp()" value="Search" />
    </div>
<table border="1" class = "table table-striped table-responsive-md">
			
				<tr>
					<th>
						ID
					</th>
					<th>
                                                Name
					</th>
                                        <th>
                                                Mail
					</th>
                                        <th>
                                                Address
					</th>
                                        <th>
                                                Birth
					</th>
                                   
					
				</tr>
			
			<tbody id = "empId">
                         
			</tbody>
        </table>
  <script src="<c:url value="/js/main.js" />"></script>