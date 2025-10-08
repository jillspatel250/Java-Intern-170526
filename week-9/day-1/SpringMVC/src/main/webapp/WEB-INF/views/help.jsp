<%@ page import="java.time.LocalDateTime" %>

<html>
<body>
<h2>Help Page</h2>

<%
    String name=(String) request.getAttribute("name");
    String company_name=(String) request.getAttribute("company_name");
    LocalDateTime time=(LocalDateTime)request.getAttribute("time");
%>
   <h1>Hello My name is <%= name%></h1>
   <h1>I am working in <%= company_name%></h1>
    <h1>Date and Time is  <%= time.toString() %></h1>

</body>
</html>
