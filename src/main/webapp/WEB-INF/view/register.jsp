<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  
  
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <p class="navbar-text">Library Management System</p>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Library<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/displayblock">Update Library</a></li>
           <li><a href="/displayblock">Delete Library</a></li>
        </ul>
      </li>
   
      </ul>
    
  </div>
</nav>


<br>
<br>

<div align="center">
		<h1>Library Registration</h1>
<br>
<br>
		<form:form id="myForm" action="/addlibrary" method="post"
			modelAttribute="library">  
        Library Name: <form:input id="card1" name="LibraryName" path="LibraryName"/><br>
        Library Address: <form:input id="card1" name="address" path="address"/>
        

<br>
<br>

			<input type="submit" value="Register" />
		</form:form>


	</div>

</body>
</html>