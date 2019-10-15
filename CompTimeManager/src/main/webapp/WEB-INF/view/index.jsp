<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="java.util.List, com.mycompany.comptimemanager.model.entity.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, user-scalable=no">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="assets/css/timesheet.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Home</title>
</head>
<body class="h-100">
	<c:import url="navbar.jsp" />
	<div class="container h-100 ">
		<div class="d-flex justify-content-center h-25 align-items-center ">
			<h1 class="display-4 text-center">CompTime Manager!</h1>
			<p class="font-weight-light">Bem-Vindo</p>
		</div>
		<div class="h-25 d-flex flex-column justify-content-center align-items-center">
			<p class="text-justify">Projeto desenvolvido para testar conhecimentos em aplicação
				servlet. CRUD de apontamento de horários. Não há persistência de
				dados.</p>
			<span><a rel="projeto no github" class="text-decoration-none"
				href="https://github.com/Everton42/gerenciador-banco-horas"
				target="blank">Projeto no GitHub</a></span>
		</div>
		<div class=" h-50 w-auto d-flex justify-content-center">
			<img alt="relogio" src="assets/images/home-img.png"
				class="img-fluid align-self-end">
		</div>
	</div>
	<script src="webjars/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"
		type="text/javascript"></script>
</body>
</html>