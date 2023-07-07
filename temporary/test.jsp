<%@ page import="java.sql.Date" %>

 
    <% out.println(request.getAttribute("test")); %>
        <% out.println(request.getAttribute("test2")); %>
            <%out.println((Date)request.getAttribute("test3"));%>