<%-- 
    Document   : base
    Created on : Apr 7, 2021, 1:07:08 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles"
          uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <tiles:insertAttribute name="title" />
        </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        <div class="container ">
            <!-- header -->
            <tiles:insertAttribute name="header" />

           <!-- content -->
           
            <tiles:insertAttribute name="content" />

            <!-- footer -->
            <tiles:insertAttribute name="footer" />
        </div>
    </body>
</html>
