<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.bd-navbar { padding: .75rem 0; background-color: #5C7AEA; }
.bd-navbar .navbar-nav .nav-link.active { font-weight: 600; color: #fff; }
</style>
<title>Carlo's shop</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body>

	<header class="navbar navbar-expand-md navbar-dark bd-navbar">
		<nav class="container-xxl flex-wrap flex-md-nowrap"
			aria-label="Main navigation">
			<div class="collapse navbar-collapse" id="bdNavbar">
				<ul class="navbar-nav flex-row flex-wrap bd-navbar-nav pt-2 py-md-0">
					<li class="nav-item col-6 col-md-auto"><i class="bi bi-shop"
						style="font-size: 32px; color: white;"></i></li>
					<li class="nav-item col-6 col-md-auto"><a
						class="nav-link active" aria-current="page" href="index.html">Home</a>
					</li>
					<li class="nav-item col-6 col-md-auto"><a class="nav-link"
						href="miServlet?op=1">Productos</a></li>
					<li class="nav-item col-6 col-md-auto"><a class="nav-link"
						href="formBuscar.html">Buscar producto</a></li>
					<li class="nav-item col-6 col-md-auto"><a class="nav-link"
						href="formAlta.html">Alta nuevo producto</a></li>
					<li class="nav-item col-6 col-md-auto"><a class="nav-link"
						href="formEliminar.html">Eliminar producto</a></li>
					<li class="nav-item col-6 col-md-auto"><a class="nav-link"
						href="formModificar.html">Modificar producto</a></li>
				</ul>
			</div>
		</nav>
	</header>
	
	<!-- Añadimos la oferta del día, pero no se ve porque no ha pasado por el init del servlet -->
	<marquee behavior="alternate" style="border:solid">${applicationScope.msgOferta}</marquee>
	<!-- Pero sí podemos hacerlo de otra forma, con OTRO contexto -->
	<marquee behavior="alternate" style="border:solid">${applicationScope.msgSinIVA}</marquee>

	<h1>MI TIENDA DE PRODUCTOS</h1>

	<ul class="list-group col-2">
		<li class="list-group-item list-group-item-primary">Home</li>
		<li class="list-group-item"><a href="miServlet?op=1">Consultar
				todos los productos</a></li>
		<li class="list-group-item"><a href="formBuscar.html">Buscar
				producto</a></li>
		<li class="list-group-item"><a href="formAlta.html">Alta
				nuevo producto</a></li>
		<li class="list-group-item"><a href="formEliminar.html">Eliminar
				producto</a></li>
		<li class="list-group-item"><a href="formModificar.html">Modificar
				producto</a></li>
	</ul>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>