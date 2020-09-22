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
<body style="background-color: menu;">
	<div align="center">
		
		<br>

		<form:form method="post" modelAttribute="book"
			action="savebook?libraryId=${lib.libraryId}">

			<table>
				<tr>
					<td>Book Name :</td>
					<td><form:input path="bookName" id="name" placeholder="Enter Book Name" required="required" /></td>
				</tr>


			</table>
			<br>
			<button type="submit" onclick="mySaveFunction()">Save</button>


		</form:form>

	</div>

	<script type="text/javascript">
		function mySaveFunction() {
			var inputVal = document.getElementById("name").value;
			if (inputval.trim() != "") {
				alert("Book Added Sucessfully!");
			} else {

			}
		}
	</script>
</body>
</html>