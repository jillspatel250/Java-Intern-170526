<%@ page isELIgnored="false" %>

<html>
<body>
<h2>Success  Page</h2>

   <h1>Hello Enter name is ${student.name}</h1>
   <h1>Hello Enter id is ${student.id}</h1>
   <p>DOB: ${student.date}</p>
   <p>Gender: ${student.gender}</p>
   <p>Type: ${student.type}</p>
   <p>Courses: ${student.courses}</p>
   <p>Street : ${student.address.street}</p>
   <p>City : ${student.address.city}</p>



</body>
</html>
