<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<title>Insert title here</title>
<style>
body {
	background-color: #BE9FBF;
}

.card {
	border: none;
	border-radius: 20px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.card-title {
	color: #007bff;
	font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
}

/* Animation */
.qr-code {
	animation: rotateQR 2s linear infinite;
}

@
keyframes rotateQR { 0% {
	transform: rotate(0deg);
}
100
%
{
transform
:
rotate(
360deg
);
 
}
}
</style>
</head>
<body>

	<div class="container mt-4">
		<div class="card mx-auto" style="max-width: 350px;">
			<div class="card-body">
				<h3 class="card-title text-center mb-4">Scan QR Code for
					Payment</h3>
				<!-- <div class="form-group">
                    <label for="mobileNumber">Pay With Mobile Number</label>
                    <input type="tel" class="form-control" id="mobileNumber" placeholder="7974211622" required>
                </div> -->
				<div class="text-center mb-3">
					 <img src="./assets/QR.jpg"
						alt="QR Code" class="img-fluid qr-code">
				</div>
				<button type="submit" class="btn btn-primary btn-block">Proceed to Payment</button>
			</div>
		</div>
	</div>

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

