<%@page import="com.amstech.bikerent.dto.CustomerDTO"%>
<%@page import="com.amstech.bikerent.dto.BikedetailsDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
CustomerDTO c = new CustomerDTO();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Search Button Card</title>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
	font-family: Arial, sans-serif;
	background-color: #60D7FF;
}

.card {
	background-color: #fff;
	border-radius: 20px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
	padding: 20px;
	max-width: 380px;
	height: 500px;
	text-align: center;
}

.card h2 {
	margin-bottom: 5px;
	font-size: 20px;
	color: #333;
}

.form-group {
	margin-bottom: 10px;
	text-align: left;
}

.form-group label {
	display: block;
	margin-bottom: 3px;
	font-size: 14px;
	color: #555;
}

.form-group input {
	width: calc(80% - 10px);
	padding: 9px;
	border: 1px solid #ddd;
	border-radius: 5px;
	font-size: 16px;
	margin: 0 auto;
}

.form-group button {
	width: 100px;
	padding: 5px;
	border: none;
	background-color: #007BFF;
	color: #fff;
	border-radius: 7px;
	cursor: pointer;
	font-size: 14px;
}

.form-group button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<form action="customers" method="service">
		<input type="hidden" name="task" value="customerdetails" >
		<div class="container" style="background-color: #f7f7f7">
			<div class="card" style="width: 500px;">
				<h2>Customer Details</h2>
				<div class="form-group">
					<label for="firstName">First Name</label> <input type="text"
						id="firstName" name="firstName" required>
				</div>
				<div class="form-group">
					<label for="lastName">Last Name</label> <input type="text"
						id="lastName" name="lastName" required>
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input type="email" id="email"
						name="email" required>
				</div>
				<div class="form-group">
					<label for="mobilenumber">MobileNumber</label> <input
						type="mobilenumber" id="mobilenumber" name="mobilenumber" required>
				</div>
				<div class="form-group">
					<label for="address">Address</label> <input type="address"
						id="address" name="address" required>
				</div>
				<div class="form-group">
					<label for="licencenumber">Licence Number</label> <input
						type="licencenumber" id="licencenumber" name="licencenumber"
						required>
				</div>
				<div class="form-group">

					<select name="cityid" placeholder="City">
						<option value="0">Select City</option>
						<option value="1">Indore</option>
						<option value="2">Bhopal</option>

					</select>
				</div>
				
				<div class="form-group">
				<button type="reset" 
						class="btn btn-primary" style="margin-left:10px;">
						Reset
					</button>
					<button type="submit" value="customerdetails"
						class="btn btn-primary" style="margin-bottom: 10px; margin-left:10px;">
						Register
					</button>
					
				</div>
			</div>
		</div>
	</form>
</body>
</html>