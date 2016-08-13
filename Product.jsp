<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Admin</title>
<meta name="viewport" content="width=device-width, initial scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
body {
	background-color: white;
}
</style>
</head>
<body>
	<table style="width: 100%">

		<div class="container">

			<tr>
				<td><div class="dropdown">
						<button class="btn btn-primary dropdown-toggle" type="button"
							data-toggle="dropdown">
							Manage Categories <span class="caret"></span>
						</button>
						<ul class="dropdown-menu">
							<li><a href="#">Add</a></li>
							<li><a href="#">Delete</a></li>
							<li><a href="#">Update</a></li>
							<li><a href="#">View all</a></li>
						</ul>
					</div>
		</div>
		</td>

		<div class="container">

			<td><div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						data-toggle="dropdown">
						Manage Products <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="Add">Add</a></li>
						<li><a href="#">Delete</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="#">View all</a></li>
					</ul>
				</div>
		</div>
		</td>

		<div class="container">

			<td><div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						data-toggle="dropdown">
						Manage Supplier <span class="caret"></span>
					</button>
					<ul class="dropdown-menu">
						<li><a href="#">Add</a></li>
						<li><a href="#">Delete</a></li>
						<li><a href="#">Update</a></li>
						<li><a href="#">View all</a></li>
					</ul>
				</div>
		</div>
		</td>
		</tr>
	</table>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>



	<s:form action="productadd" class="form-horizontal"
		commandName="product" method="post"  >
		<center>
			<table>
				<tr>
					<div class="control-group">
						<label class="control-label col-sm-2">
						<font color="black">Product-Name:</font></label>
						<div class="col-sm-5">
							<form:input path="name" id="name1" class="form-control" />
						</div>
					</div>
				</tr>
				<div class="control-group">
					<label class="control-label col-sm-2">
					<font color="black">Product-Description:</font></label>
					<div class="col-sm-5">
						<form:input path="description" id="name2" class="form-control" />
					</div>
				</div>
				</tr>
				<br>
				<br>
				<br>
					<td colspan="2"><input type="submit" value="Add Product"></td>

					<td colspan="2"><input type="reset" value="Reset"></td>

				</tr>

			</table>
		</center>
	</s:form>
	<br>
	<br>
	<br>
	<br>
	<br>
<%@include file="angularjs.jsp"%>





