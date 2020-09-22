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
    
      </ul>
    
  </div>
</nav>

<div align="center">
		<h2>Edit Book</h2>
		<hr />
		<br>
		<form:form method="post" modelAttribute="book"
			action="${book.bookId}/editbooksave">
			<table>
				<tr>
					<td>Book Id :</td>
					<td>${book.bookId}<form:hidden path="bookId" /></td>
				</tr>
				<tr>
					<td>Book Name :</td>
					<td><form:input path="bookName" /></td>
				</tr>



			</table>
			<br>
			<button id="bt" type="submit" onclick="editBookFunction()">Save</button>
		</form:form>
	</div>

	<script type="text/javascript">
	         function editBookFunction() {

			alert("Book Updated Sucessfully!");
		} 
 	 
		

		
		
	</script>
</body>
</html>