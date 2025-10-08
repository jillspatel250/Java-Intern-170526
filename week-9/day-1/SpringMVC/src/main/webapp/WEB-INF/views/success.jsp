<%@ page import="java.time.LocalDateTime" %>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<body>
<div style="text-center">
<h2>${Header}</h2>
<h3>${Desc}</h3>
</div>
<h1 style="color : green">${msg}</h1>
<h2>Success Page</h2>
<h1>Welcome , ${user.userName}</h1>
<h1>Your email address is , ${user.email}</h1>
<h1>Your password is , ${user.userPassword} and try to secure the password</h1>

</body>
</html>
