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
          <li><a href="bookadd?libraryId=${libraryId}">Add Book</a></li>
          <li><a href="/displayall">Delete Book</a></li>
          
        </ul>
      </li>
     
      </ul>
    
  </div>
</nav>

<div align="center">
<br>
<br>
		<h1>Add Books</h1>
		<br>
		<br>
		<br>
		<form:form>
			<table border="2" width=70% cellpadding="5">
				<tr>
					<th>Id</th>
					<th>Book Name</th>
					<th>Update</th>

				</tr>

				<c:forEach var="book" items="${booklist}">

					<tr align="center">
						<td>${book.bookId}</td>
						<td>${book.bookName}</td>


						<td><a href="editbook/${book.bookId}">Update</a></td>



					</tr>
				</c:forEach>
			</table>
		</form:form>
		
	</div>
</body>
</html>