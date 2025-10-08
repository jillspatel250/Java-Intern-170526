<%@ page import="java.time.LocalDateTime" %>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>
<h2>Help Page</h2>

   <h1>Hello My name is ${name}</h1>
   <h1>I am working in ${company_name}</h1>
    <h1>Date and Time is ${time}</h1>
   <c:forEach var="item" items="${marks}">
     <h1>${item}</h1>
   </c:forEach>

</body>
</html>
