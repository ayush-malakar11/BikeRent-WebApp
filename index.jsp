<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Search: Bike</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
	integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
	integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
	crossorigin="anonymous"></script>
<style>
body {
	background-color: #ffffff;
}
</style>
</head>


<body>



	<div class="container-fluid mt-2 ">
		<div class="row">
			<div class="col-md-4">
				<div class="card text-center mt-3"
					style="height: 500px; background-color: #F5F6FB">

					<section class="jumbotron text-center">
						<div class="container mt-3">
							<img src="./assets/logo.jpg"
								style="height: 80px; margin-top: 10px;">
							<!-- <h1 class="display-4">Welcome to Bike Rental</h1>
                      <p class="lead">Get the list of best Bike On Rent</p> -->
						</div>
						  
					</section>
					<h4 style="color: #293555; font-size: 30px; margin-top: 100px;">
						<b>Two wheels, one love !</b>
					</h4>
					<form action="bike" method="service">
						<input type="hidden" name="task" value="search" />

						<h4 style="margin-top: 80px;">Search Your Bike</h4>

						<button type="search" class="btn btn-primary"
							style="width: 250px; height: 40px; border-radius: 10px; margine-left: 100px; margin-top: 15px;">Search</button>

					</form>
				</div>
			</div>

			<div class="col-md-8">
				<img src="./assets/frontposter.jpg"
					style="width: 800px; height: 540px;">
			</div>
		</div>

	</div>
</body>
</html>