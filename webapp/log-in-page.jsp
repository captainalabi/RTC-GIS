<%-- 
    Document   : log-in-page
    Created on : Feb 18, 2023, 12:53:47 PM
    Author     : ALABI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="log-in-page.css">
<link rel="stylesheet" href="menu.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="menu.js"></script>
</head>
<body>

 <div class="topnav" id="myTopnav">
  <a href="index.html" class="active">Home</a>
  <a href="log-in-page.jsp" >Log-in</a>
  <a href="sign-up-page.jsp" >Sign-Up</a>
  <a href="#news">News</a>
  <a href="#contact">Contact</a>
  <a href="#about">About</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<center>
    <h2>Login</h2>

<form action="LoginServlet" method="post">
  <div class="imgcontainer">
    <img src="images/login avatar.png" alt="Avatar" class="avatar">
  </div>

    <p class="text-center" style="color: green">${successMessage}</p>

  <div class="container">
    <label for="uName"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uName" required>

    <label for="pWord"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pWord" required>

    <button type="submit">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</center>
</body>
</html>
