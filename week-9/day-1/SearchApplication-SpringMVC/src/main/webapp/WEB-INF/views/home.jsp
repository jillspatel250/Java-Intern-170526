   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>My Search</title>
      <!-- Bootstrap CSS -->
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
<script src="<c:url value='/resources/js/script.js'/>"></script>
    </head>
    <body>
<img alt="my image" src="<c:url value='/resources/image/profile.png'/>"/>
      <div class="container">
        <div class="card mx-auto mt-5 bg-primary" style="width: 50%;">
          <div class="card-body py-5">
            <h3 class="text-center text-white" style="text-transform: uppercase;">My Search</h3>

            <!-- Search Form -->
            <form action="search" class="mt-3">
              <div class="form-group">
                <input type="text" name="querybox" placeholder="Enter your keyword" class="form-control">
              </div>

              <div class="container text-center mt-3">
                <button class="btn btn-outline-light">Search</button>
              </div>
            </form>

          </div>
        </div>
      </div>

      <!-- Bootstrap JS -->
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
    </html>