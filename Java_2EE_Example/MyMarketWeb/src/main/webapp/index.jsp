<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Market Web</title>
<link href='https://fonts.googleapis.com/css?family=Actor'
	rel='stylesheet'>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link href='https://fonts.googleapis.com/css?family=Abhaya Libre'
	rel='stylesheet'>
<link href='https://fonts.googleapis.com/css?family=Abril Fatface'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.6.3/css/all.css"
	integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/master.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<style type="text/css">
body {
	background: #f4fcff;
	font-family: 'Abhaya Libre';
	font-size: 22px;
	color: #000;
	padding-bottom: 80px;
}

.navbar .navbar-brand {
	color: #f4fcff !important;
	font-size: 30px;
	font-family: 'Abril Fatface';
	font-size: 22px;
}

.navbar button {
	background: #f4fcff;
	color: #007bff;
	font-weight: bold;
}

.navbar button:hover {
	color: #FFF !important;
	background-color: #007bff !important;
	border: 1px solid #FFF !important;
}

.media img {
	width: 80px;
	height: 60px;
}

.media-body h5 {
	font-weight: bold;
	font-size: 18px;
}

.media-body p {
	font-size: 18px;
}

.media .media-body:hover {
	background-color: #c8d6e5 !important;
	color: #007bff !important;
}

.mybtn {
	color: #FFF !important;
	display: none;
	margin-left: 10px;
}

.h2 {
	margin-top: 20px;
	text-decoration: underline;
	font-size: 20px;
	font-weight: bold;
	color: #ea420c;
}

.containers {
	border: 1px dashed #e84118;
	background-color: #c8d6e5;
	border-radius: 5px;
	padding: 16px;
	margin: 16px 0;
	margin-top: 30px;
}

.containers::after {
	content: "";
	clear: both;
	display: table;
}

.containers .avatar {
	float: left;
	margin-right: 20px;
	border-radius: 50%;
}

.containers span {
	font-size: 20px;
	margin-right: 15px;
	font-weight: bold;
	font-size: 16px;
}

.containers p {
	margin-top: -6px;
	margin-bottom: 5px;
	font-size: 16px;
}

@media ( max-width : 500px) {
	.containers {
		text-align: center;
	}
	.containers .avatar {
		margin: auto;
		float: none;
		display: block;
	}
}

#MyListaffiche {
	font-size: 20px;
	background: #c8d6e5;
	padding-top: 12px;
	text-align: center;
	border-radius: 10px;
	cursor: copy;
}

#carouselExampleSlidesOnly {
	margin-right: -15px;
	margin-left: -15px;
}

#carouselExampleSlidesOnly img {
	height: 430px;
}
</style>

</head>
<body>
	<div>
		<nav class="navbar navbar-light bg-primary">
			<a class="navbar-brand"><i class="fab fa-markdown"
				style="color: #e84118; background: #f4fcff; margin-left: 50px; padding: 5px; margin-right: 10px;"></i>
				My Market Online</a>
			<form class="form-inline" style="font-size: 16px;">
				<input class="form-control mr-sm-4" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</nav>
	</div>


	<div class="container"
		style="margin-top: 40px; border: 1px dashed #e84118;">
		<div class="row">
			<div class="col-lg-6"
				style="background: #ffffff; padding: 10px 25px; border-right: 1px dashed #e84118;">

				<h2 class="h2">Choisir des produits</h2>
				<ul class="list-unstyled">

					<li class="media"><img
						src="https://i.ebayimg.com/00/s/NjE5WDkwNQ==/z/jLwAAOSw5E5auX~P/$_86.JPG"
						class="mr-3" alt="...">
						<div class="media-body" style="padding: 5px 10px;">
							<h5 class="mt-0 mb-1">0- TV LGHD343 2019 40$</h5>
							<p>Smart TV Led</p>

						</div></li>

					<li class="media"><img
						src="https://i.ytimg.com/vi/EtYFTlRadK4/maxresdefault.jpg"
						class="mr-3" alt="...">
						<div class="media-body" style="padding: 5px 10px;">
							<h5 class="mt-0 mb-1">1- MacBook Pro 2018 60$</h5>
							<p>New MakPro</p>

						</div></li>

					<li class="media"><img
						src="https://images-na.ssl-images-amazon.com/images/I/81qoW6sq%2BcL._SY550_.jpg"
						class="mr-3" alt="...">
						<div class="media-body" style="padding: 5px 10px;">
							<h5 class="mt-0 mb-1">2- Samsung J3 2020 50$</h5>
							<p>Telephone Noir 1 ou 2</p>

						</div></li>
				</ul>

				<hr>

				<%
					//String fullname = (request.getParameter("fullname") != null) ? request.getParameter("fullname") : " .....................";
					//	String afficher = (request.getParameter("afficher") != null) ? request.getParameter("afficher") : " Votre list est ici ";
				%>


				<h2 class="h2">Facture des produits</h2>
				<ul class="list-unstyled">

					<li class="media" id="myrow">
						<div class="media-body" style="padding: 5px 10px;">
							<p id="MyListaffiche">
								<%
									out.println(request.getAttribute("afficher") + "<br>");
								%>
							</p>

						</div>
					</li>

				</ul>

			</div>
			<div class="col-lg-6">
				<div
					style="background: #c8d6e5; padding: 10px 25px; margin-left: -15px; margin-right: -15px;">

					<form method="GET" action="TestServlet" id="myForm"
						style="margin-top: 20px;">
						<div class="form-group row">
							<label for="inputText3" class="col-sm-2 col-form-label">Fullname:</label>
							<div class="col-sm-10">
								<input type="text" name="fullname" class="form-control"
									id="inputText3" placeholder="Enter Nom Complet">
							</div>
						</div>
						<div class="form-group row">
							<label for="inputAddres3" class="col-sm-2 col-form-label">Address:</label>
							<div class="col-sm-10">
								<input type="text" name="address" class="form-control"
									id="inputAddress3" placeholder="Enter Address">
							</div>
						</div>
						<fieldset class="form-group">
							<div class="row">
								<legend class="col-form-label col-sm-2 pt-0">Livration:</legend>
								<div class="col-sm-10">
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radioName"
											id="gridRadios1" value="domcile" checked> <label
											class="form-check-label" for="gridRadios1"> à
											domicile </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radioName"
											id="gridRadios2" value="express"> <label
											class="form-check-label" for="gridRadios2"> express </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radioName"
											id="gridRadios3" value="relay"> <label
											class="form-check-label" for="gridRadios3"> point
											relais </label>
									</div>
									<div class="form-check">
										<input class="form-check-input" type="radio" name="radioName"
											id="gridRadios4" value="takAway"> <label
											class="form-check-label" for="gridRadios4"> à retirer
										</label>
									</div>
								</div>
							</div>
						</fieldset>
						<div class="form-group row">
							<label for="inputText3" class="col-sm-2 col-form-label">Infos</label>
							<div class="col-sm-10">
								<input type="text" id="myVal" name="infoLivarison"
									class="form-control" id="inputText3"
									placeholder="Livration (Relay et Express)">
							</div>
						</div>
						<div class="mb-3">
							<label for="validationTextarea">Liste de produit </label>
							<textarea class="form-control" name="listeProduit"
								id="validationTextarea"
								placeholder="Produits: quantité, un produit par ligne" required></textarea>
						</div>
						<div class="form-group row">
							<div class="col-sm-10">
								<button type="submit" class="btn btn-primary btn-lg btn-block">Envoyer</button>
							</div>
						</div>
					</form>
				</div>

				<div id="carouselExampleSlidesOnly" class="carousel slide"
					data-ride="carousel">
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img
								src="https://img.phonandroid.com/2017/11/samsung-galaxy-a5-2018-galaxy-a7-2018-.jpg"
								class="d-block w-100" alt="image">
						</div>
						<div class="carousel-item">
							<img
								src="https://i.gadgets360cdn.com/large/thomson_43_inch_4k_UHD_hdr_1523541519572.jpg"
								class="d-block w-100" alt="image">
						</div>
						<div class="carousel-item">
							<img
								src="https://dexacom.co.id/img/a7b9c7548e92fc390418c468db5d8a2f.jpg"
								class="d-block w-100" alt="image">
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<script>
		$(document).ready(
				function() {
					$('#myForm input').on(
							'change',
							function() {
								var myVal = $('input[name=radioName]:checked',
										'#myForm').val();

								$("#myVal").val("Vous avez choisi : " + myVal);
								$("#myVal").css('color', '#007bff');
								$("#myVal").css("fontSize", 20);
							});

					$("#myrow").on("mouseenter", function() {
						$(".mybtn").show();
					}).on("mouseleave", function() {
						$(".mybtn").hide();
					});

					$('.carousel').carousel({
						interval : 2000
					});

				});
	</script>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"
		integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"
		integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
		crossorigin="anonymous"></script>
</body>
</html>