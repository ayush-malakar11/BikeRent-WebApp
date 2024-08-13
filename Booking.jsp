<%@page import="com.amstech.bikerent.dto.CustomerDTO"%>
<%@page import="com.amstech.bikerent.dto.BookingDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Booking Bike</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
<style>
body {
	background-color: #FFDBBA;
}
</style>
</head>
<body>
	<%
	CustomerDTO auth = (CustomerDTO) session.getAttribute("auth");
	if (auth != null) {
	%>



	<form action="booking" method="service">
		<input type="hidden" name="task" value="booknow" />
		<div class="mt-2">
			<div class="card mx-auto"
				style="max-width: 500px; max-height: 710px;">
				<div class="card-body">
					<h3 class="card-title text-center mb-1">Book Your Bike Today</h3>
					<p class="text-muted">Choose your bike, select a package, and
						enjoy your ride!</p>
					<form>
						<input type="hidden" id="customerid" name="customerid"
							value="<%=auth.getId()%>" required>
						<h2 style="color: #007BFF"><%=auth.getFirstname()%>
							<%=auth.getLastname()%>
						</h2>

						<div class="form-group">
							<label for="bikeType">Bike Type</label> <select
								class="form-control" id="bikename" name="bikeid"
								placeholder="BikeModel" required>
								<option value="0">Select bike</option>
								<option value="1">TVS Raider 125</option>
								<option value="2">Royal Enfield Hunter 350</option>
								<option value="3">Pulsar 150</option>
								<option value="4">Honda ShineSp 125</option>
								<option value="5">Honda-Activa-5g</option>
								<option value="6">TVS Jupiter</option>
								<option value="7">Bajaj Pulsar NS 160</option>
								<option value="8">Yamaha MT 15</option>
								<option value="9">Apache RR310</option>
							</select>
						</div>





						<div class="form-group">
							<label for="package">Select Package</label> <select
								class="form-control" id="package" required>
								<option>Daily Package - &#8377 499/Weekday</option>
								<option>Half Day Package- &#8377 399/Half Day</option>
								<option>Weekly - &#8377 2500/7 Days</option>
							</select>
						</div>
						<div class="form-group">
							<label for="paymentMethod">Payment Option</label> <select
								class="form-control" id="paymentMethod" required>
								<option>Partial Payment (Pay partial amount now and
									rest at the time of pickup)</option>
								<option>Pay Now (Pay full amount now)</option>
							</select>
						</div>
						<div class="form-group">
							<label for="pickupDate">Pick-up Date</label> <input type="date"
								class="form-control" id="pickupDate" name="registrationdate"
								required>
						</div>
						<div class="form-group">
							<label for="returnDate">Return Date</label> <input type="date"
								class="form-control" id="returnDate" required>
						</div>
						<div class="form-group">
							<label for="price">Price</label> <input type="price"
								class="form-control" id="price" name="price" required>
						</div>
						<button type="reset" class="btn btn-primary"
							style="width: 120px; margin-left: 20px;">Reset</button>
						<button type="submit" value="customerdetails"
							class="btn btn-primary" style="margin-left: 170px; width: 120px;">
							<a href="Payment.jsp" style="text-decoration: none; color:white;">Book</a>

						</button>
					</form>
				</div>
			</div>
		</div>
	</form>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<%
	}
	%>

	<img alt="" src="slider1.jpg">



</body>
</html>