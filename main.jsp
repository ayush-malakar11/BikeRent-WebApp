<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bike Rental</title>
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
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
<!-- Custom CSS -->
<style>
body {
	background-color: #f8f9fa;
}

.bike-card {
	margin-bottom: 20px;
	box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
	transition: transform 0.3s ease;
}

.bike-card:hover {
	transform: translateY(-5px);
}

.bike-image {
	max-height: 200px;
	object-fit: cover;
}

.card-title {
	font-size: 1.5rem;
}

.card-text {
	font-size: 1.1rem;
}

.text {
	line-height: 12px;
}

/* Custom CSS styles */
/* Custom CSS styles */
.carousel-item {
	background-color: #f8f9fa;
}

.fs-5 {
	font-size: 20px;
}

.text-muted {
	font-size: 16px;
}

.testimonials {
	background-color: #f8f9fa;
}

.testimonials h2 {
	font-size: 2.5em;
	margin-bottom: 1em;
}

.testimonial {
	padding: 1.5em;
}

.testimonial img {
	width: 100px;
	height: 100px;
	object-fit: cover;
	margin-bottom: 1em;
	border: 5px solid #ddd;
}

.testimonial h5 {
	font-size: 1.25em;
	margin-bottom: 0.5em;
}

.testimonial p {
	font-size: 1em;
	font-style:  italic;
}
</style>
</head>
<body>


	<div>
		<!-- <img src="img\bikelogo.jpg" alt="logo" width="150px"> -->
	</div>
	<div id="carouselExampleDark" class="carousel carousel-dark slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active" data-bs-interval="10000">
				<img src="./assets/slider2.jpg" class="d-block w-100" alt="..."
					style="height: 500px;">
				<div class="carousel-caption d-none d-md-block">
					<h4 class="text-white">Rent Your Ride Today and Discover the
						Freedom of Speed.</h4>
				</div>
			</div>
			<div class="carousel-item" data-bs-interval="2000">
				<img src="./assets/slider1.jpg" class="d-block w-100" alt="..."
					style="height: 500px;">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
			<div class="carousel-item">
				<img src="./assets/slider5.jpg" class="d-block w-100" alt="..."
					style="height: 500px;">
				<div class="carousel-caption d-none d-md-block"></div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleDark" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleDark" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>


	<!-- Bike Cards -->
	<div class="container mt-4">
		<div class="row">
			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb1.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">Pulsar 150</h5>
						<div class="text">
							<h6>&#8377 700</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb2.jpg.jpg" class="card-img-top bike-image"
						alt="Road Bike">
					<div class="card-body">
						<h5 class="card-title">Honda ShineSp 125</h5>
						<div class="text">
							<h6>&#8377 800</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb3.jpg.jpg" class="card-img-top bike-image"
						alt="City Bike">
					<div class="card-body">
						<h5 class="card-title">Bajaj Pulsar 125</h5>
						<div class="text">
							<h6>&#8377 800</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/honda.jpeg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">Honda-Activa-5g</h5>
						<div class="text">
							<h6>&#8377 500</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb8.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">Royal Enfield Hunter 350</h5>
						<div class="text">
							<h6>&#8377 1500</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb6.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">TVS Raider 125</h5>
						<div class="text">
							<h6>&#8377 1200</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
							</p>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src=".\assets\imgb7.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">TVS Jupiter</h5>
						<div class="text">
							<h6>&#8377 500</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>

						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb5.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">Yamaha MT 15</h5>
						<div class="text">
							<h6>&#8377 1000</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>

						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card bike-card">
					<img src="./assets/imgb9.jpg.jpg" class="card-img-top bike-image"
						alt="Mountain Bike">
					<div class="card-body">
						<h5 class="card-title">Apache RR310</h5>
						<div class="text">
							<h6>&#8377 1200</h6>
							<p>
								<small>100 Km limit</small><br> <small> Extra:
									&#8377 4/Km</small>
							</p>
							<a href="Registration.jsp" class="btn btn-primary">Book Now</a>
						</div>
					</div>
				</div>
			</div>
		</div>

	</div>

	<!-- Testimonials Section -->
	<section class="testimonials py-5">
		<div class="container">
			<h2 class="text-center mb-4">What Peoples Say...</h2>
			<div id="testimonialCarousel" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="carousel-item active">
						<div class="testimonial text-center">
							<img src="./assets/IMG-20240531-WA0004.jpg" class="rounded-circle mb-3"
								alt="User 1">
							<h5>Pankaj Ojha</h5>
							<p class="text-muted">"Great service! The bike was in
								excellent condition and the booking process was seamless."</p>
						</div>
					</div>
					<div class="carousel-item">
						<div class="testimonial text-center">
							<img src="./assets/IMG-20240531-WA0005.jpg" class="rounded-circle mb-3"
								alt="User 2">
							<h5>Ravina Engle</h5>
							<p class="text-muted">"Great experience! The bikes were in
								excellent condition and the service was top-notch."</p>
						</div>
					</div>
					<div class="carousel-item">
						<div class="testimonial text-center">
							<img src="./assets/IMG-20240531-WA0007.jpg" class="rounded-circle mb-3"
								alt="User 3">
							<h5>Kirti Patidar</h5>
							<p class="text-muted">"Affordable prices and excellent
								customer service. Highly recommended for anyone looking to rent
								a bike!"</p>
						</div>
					</div>
				</div>
				<a class="carousel-control-prev" href="#testimonialCarousel"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#testimonialCarousel"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</section>
	<!-- Footer -->
	<footer class="bg-dark text-light text-center py-2 mt-3">
		<p>&copy; Developed and mentained by amstech intern.</p>
	</footer>

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	</div>

</body>
</html>