<%@page import="es.cfc.models.Producto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.bd-navbar { padding: .75rem 0; background-color: #7952b3; }
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
					<li class="nav-item col-6 col-md-auto">
						<i class="bi bi-shop" style="font-size: 32px; color: white;"></i></li>
					<li class="nav-item col-6 col-md-auto">
						<a class="nav-link active" aria-current="page" href="index.html">Home</a>
					</li>
					<li class="nav-item col-6 col-md-auto">
						<a class="nav-link" href="miServlet?op=1">Productos</a>
					</li>
					<li class="nav-item col-6 col-md-auto">
						<a class="nav-link" href="formBuscar.html">Buscar producto</a>
					</li>
				</ul>
			</div>
		</nav>
	</header>

	<h2>Listado de productos</h2>

	<%-- comentario 1 línea en java --%>
	<%-- comentario multilínea en java 
		<% scriplet; codigo java %>
		<%= scriplet de expresión; el resultado lo muestra en la página %>
		<%! scriplet de declaración; declarar una propiedad o método %>
		<%@ scriplet de directivas %>
	--%>

	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Descripción</th>
				<th scope="col">Precio</th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Producto> lista = (List<Producto>) request.getAttribute("todos");
				for (Producto producto : lista) {
			%>
			<tr>
				<th scope="row"><%= producto.getId() %></th>
				<td><%= producto.getDescripcion() %></td>
				<td><%= producto.getPrecio() %></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>

	<p><% out.println(lista); %></p>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>