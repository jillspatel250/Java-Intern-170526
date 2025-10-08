<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  </head>
  <body>

  <div class="container mt-5">
   <h1 class="text-center">${Header}</h1>
   <h3 class="text-center">${Desc}</h3>
  <h3>Registration Form</h3>
  <form action="processform" method="post">
    <div class="mb-3">
      <label for="email" class="form-label">Email address</label>
      <input type="email" class="form-control" id="email" name="email"
             placeholder="Enter Email Address here">
    </div>
    <div class="mb-3">
      <label for="userName" class="form-label">User Name</label>
      <input type="text" class="form-control" id="userName" name="userName"
             placeholder="Enter username here">
    </div>
    <div class="mb-3">
      <label for="userPassword" class="form-label">Password</label>
      <input type="password" class="form-control" id="userPassword" name="userPassword"
             placeholder="Enter password here">
    </div>
    <div class="container text-center">
      <button type="submit" class="btn btn-success">SignUp</button>
    </div>
  </form>

  </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
  </body>
</html>