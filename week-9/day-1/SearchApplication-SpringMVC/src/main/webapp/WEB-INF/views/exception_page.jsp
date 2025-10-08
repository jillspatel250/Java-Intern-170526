<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">

  <title>Error !!</title>

  <style>
    body {
      background: #f8f9fa;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      text-align: center;
      font-family: Arial, sans-serif;
    }
    .error-container {
      max-width: 600px;
      background: white;
      padding: 40px;
      border-radius: 10px;
      box-shadow: 0 4px 15px rgba(0,0,0,0.1);
    }
    h1 {
      font-size: 3rem;
      color: #dc3545;
    }
    p {
      color: #6c757d;
    }
    .btn-custom {
      margin: 10px;
    }
  </style>
</head>
<body>

  <div class="error-container">
    <h1>Oops! Sorry</h1>
    <h4>${msg}</h4>
    <p>Sorry, an error has occurred. Requested page not found!</p>
    <a href="/" class="btn btn-primary btn-custom">Take Me Home</a>
    <a href="mailto:support@example.com" class="btn btn-outline-secondary btn-custom">Contact Support</a>
  </div>

</body>
</html>