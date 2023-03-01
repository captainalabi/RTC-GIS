<%-- 
    Document   : sign-up-page
    Created on : Feb 18, 2023, 12:54:34 PM
    Author     : ALABI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="menu.css">
        <link rel="stylesheet" href="sign-up-page.css">
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
        
        <form action="action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>
    
    <label for="name"><b>Full Name</b></label>
    <input type="text" placeholder="Enter Your Name" name="name" required>

    <label for="pin"><b>Pin</b></label>
    <input type="text" placeholder="Pin" name="pin" required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>

    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>

    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>
    </body>
</html>
