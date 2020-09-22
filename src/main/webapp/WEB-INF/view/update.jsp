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

<br>
<br>

<div align="center">
		<br>
		<form:form method="post" modelAttribute="library"
			action="${library.libraryId}/updatesave">
			<table>
				<tr>
					<td>Library Id :</td>
					<td>${library.libraryId}<form:hidden path="libraryId" /></td>
				</tr>
				<tr>
					<td>Library Name :</td>
					<td><form:input path="libraryName" /></td>
				</tr>
				


			</table>
			<br>
			<button type="submit" onclick="editLibraryFunction()">Save</button>
		</form:form>
	</div>

	<script type="text/javascript">
		function editLibraryFunction() {
			alert("Library Updated Sucessfully!");
		}
	</script>

</body>
</html>