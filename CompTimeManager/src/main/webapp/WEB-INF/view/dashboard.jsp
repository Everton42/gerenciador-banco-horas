<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="java.util.List, com.mycompany.comptimemanager.model.entity.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%!public static int contador = 0;%>
<c:url value="/entry" var="linkEntryServlet" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="assets/css/dashboard.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Dashboard</title>
</head>
<body>
	<p>Usuario Logado: ${user.getLogin() }</p>


	<div class="container">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-8">
						<h2>Apontamentos</h2>
					</div>
					<div class="col-sm-4">
						<a href="#" class="btn btn-info add-new" data-toggle="modal"
							data-target="#WorkHourModal" data-action="AddWorkHour"> <!-- <i class="material-icons">&#xe145;</i> -->
							Novo
						</a>
					</div>
				</div>
			</div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">Dia</th>
						<th scope="col">Inicio</th>
						<th scope="col">Fim</th>
						<th scope="col">Opcoes</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="wk" items="${listWk}">
						<tr>
							<td id="tdDate-${wk.getId()}"><c:out value="${wk.getDate()}" /></td>
							<td id="tdStart-${wk.getId()}"><c:out value="${wk.getStart()}" /></td>
							<td id="tdEnd-${wk.getId()}"><c:out value="${wk.getEnd()}" /></td>
							<td><a class="edit" title="Edit" data-toggle="modal"
								data-target="#WorkHourModal" data-action="UpdateWorkHour" data-id="${wk.getId()}" href="#"><i
									class="material-icons">&#xE254;</i></a> <a class="delete"
								title="Delete"
								href="${linkEntryServlet}?action=RemoveWorkHour&id=${wk.getId()}"><i
									class="material-icons">&#xE872;</i></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div class="modal fade" id="WorkHourModal" tabindex="-1" role="dialog"
		aria-labelledby="WorkHourModal" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title" id="myModalLabel"></h4>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form action="${linkEntryServlet}" method="post">
						<div class="form-group">
							<input id="modalDate" class="form-control" type="date" name="date"
								max="3000-12-31" min="1000-01-01">
						</div>
						<div class="form-group">
							<input id="modalStart" class="form-control" type="time" name="start" required>
						</div>
						<div class="form-group">
							<input id="modalEnd" class="form-control" type="time" name="end" required>
						</div>
						<div class="form-group float-right">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<button class="btn btn-default btn-info btn-salvar" type="submit"
								name="action" value="">Salvar</button>
						</div>
						<input value="" name="id" class="invisible"/>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="webjars/jquery/3.0.0/jquery.min.js" type="text/javascript"></script>
	<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script type="text/javascript" src="assets/js/dashboard.js"></script>
</body>
</html>