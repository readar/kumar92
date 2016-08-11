<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<br>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
 <a class="navbar-brand" href="#">RE@DAR NOVELS</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#"><b>Home</b></a></li>
      <li><a href="#"><b>about us</b></a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><b>Categories</b> <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Men</a></li>
          <li><a href="#">women</a></li>
          <li><a href="#">kids</a></li>
        </ul>
      </li>
        <li><a href="Product"><b>Product</b> </a></li>
        <li><a href="#"><b>Brand</b></a></li>
   <li><a href="#"><b>Accessories</b></a></li>

    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Admin"><span class="glyphicon glyphicon-user"></span><b></b></a></li>
      <li><a href="SignUp"><span class="glyphicon glyphicon-user"></span><b></b></a></li>
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> <b>Logout</b></a></li>
    </ul>
  </div>
</nav>

<body>
<table style="width:100%">

<div class="container">
  
 <tr> 
 <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Categories
    <span class="caret"></span></button>
    <ul class="dropdown-menu">
      <li><a href="#">Add</a></li>
      <li><a href="#">Delete</a></li>
      <li><a href="#">Update</a></li>
 <li><a href="#">View all</a></li>
    </ul>
  </div>
</div></td>

<div class="container">
  
  <td><div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Products
    <span class="caret"></span></button>
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
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Manage Supplier
    <span class="caret"></span></button>
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



	<form:form class="form-horizontal" action="productadd"
		commandName="product" method="post">
		<center>
			<table>
				<tr>

					<div class="form-group">
						<label class="control-label col-sm-2" path="name" for="name"><font
							color="white">Product-Name:</font></label>
						<div class="col-sm-5">
							<input type="text" class="form-control" id="name" path="name"
								placeholder="Enter your productname here" required />
						</div>

					</div>

				</tr>
				<div class="form-group">
					<label class="control-label col-sm-2" path="description"
						for="description"><font color="white">Product-Description:</font></label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="description"
							path="description"
							placeholder="Enter your Product Description here" required />
					</div>

				</div>
                  </tr>


				<tr>
					<td colspan="2"><input type="submit" value="Add Product"></td>

					<td colspan="2"><input type="reset" value="Reset"></td>

				</tr>

			</table>
		</center>
	</form:form>


</body>
</html>