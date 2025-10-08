<%@ page import="java.util.List" %>

<html>
<body>
<h2>Home Page</h2>
<h2>Called by home controller</h2>
<h2>url /Home</h2>
        <%
          String name=(String) request.getAttribute("name");
          int id=(int)request.getAttribute("id");
          List<String> frds=(List<String>)request.getAttribute("friends_name");
        %>
        <h1>
        Name is <%=name%> &
        Id is <%= id %>
        </h1>

        <%
          for(String s:frds){
          %>
        <h1> <%= s %> </h1>
        <%
          }
        %>
</body>
</html>
