<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Library<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/register">Add Library</a></li>
          <li><a href="/view">View Library</a></li>
          <li><a href="/displayall">Delete Library</a></li>
          
        </ul>
      </li>
      </li>
      </ul>
    
  </div>
</nav>


<div align="center">
		
		<br> 
		<form action="/deletelib" >
			Select Library ID :&nbsp;
			 <select  name="libraryId" > 
				<c:forEach var="lib" items="${librarylist}">
					<option value="${lib.libraryId}">${lib.libraryId}</option>
				</c:forEach>
			</select> <br /> <br /> 
			<button type="submit" onclick="deleteFunction()">Submit</button> 
		</form>
	</div>
	<script type="text/javascript">
		function deleteFunction() {

			alert("Library Deleted Sucessfully!");

		}
	</script>
</body>
</html>