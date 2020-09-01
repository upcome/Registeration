<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<form action="SignupServlet">

<div class="form-group">
<div class="row">
<label for="name" class="col-lg-2 col-md-2 col-sm-2">Full name</label>
<input type="text" placeholder="enter Full Name"  name="name" class="form-control col-lg-8 col-md-8 col-sm-8" id="name" >
</div>
<small id="name" class="form-text text-muted">A valid full name consists of two words, each word starts with a capital letter and contains only lowercase letters afterwards; each word should be at least two letters long; the two words should be separated by a single space.</small>
</div>


<div class="form-group">
<div class="row">
<label for="email" class="col-lg-2 col-md-2 col-sm-2">Email</label>
<input type="text" placeholder="enter Email"  name="email" class="form-control col-lg-8 col-md-8 col-sm-8" id="email">
</div>
<small id="namehelp" class="form-text text-muted">enter valid email</small>
</div>

<div class="form-group">
<div class="row">
<label for="password" class="col-lg-2 col-md-2 col-sm-2">Password</label>
<input type="text" placeholder="enter Password"  name="password" class="form-control col-lg-8 col-md-8 col-sm-8"  id="password">
</div>
<small id="passwordhelp" class="form-text text-muted">a valid password should contain one lowercase letter,atleast  one uppercase letter ,atleast one digit,atleast one special character and a minimum 6 letters to maximum 16 letters</small>
</div>

<div class="form-group">
<div class="row">
<label for="dob" class="col-lg-2 col-md-2 col-sm-2">Date of Birth</label>
<input type="text" placeholder="enter DOB"  name="dob" class="form-control col-lg-8 col-md-8 col-sm-8" id="dob">
</div>
<small id="dobhelp" class="form-text text-muted">a valid date should be in the format of dd/mm/yyyy</small>
</div>

<div class="form-group">
<div class="row">
<label  for="gender" class="col-lg-2 col-md-2 col-sm-2">Gender</label>
<input type="text" placeholder="enter gender"  name="gender" class="form-control col-lg-8 col-md-8 col-sm-8"  id="gender">
</div>
<small id="genderhelp" class="form-text text-muted">enter male or female</small>
</div>


<button type="submit" class="btn btn-primary">Register</button>
</form>

</body>
</html>