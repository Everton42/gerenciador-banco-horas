<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page
	import="java.util.List, com.mycompany.comptimemanager.model.entity.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/entry" var="linkEntryServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
	<p>Usuario Logado: ${user.getLogin() }</p>

	<h3>Lista de Apontamentos:</h3>
<%-- 	<c:import url="addWorkHour.jsp" /> --%>
	<form action="${linkEntryServlet}" method="post">
		<span>Data: </span><input type="text" name="date"  />
		<span>Inicio: </span><input type="text" name="start"  />
		<span>Fim: </span><input type="text" name="end"  />
		
		<input type="hidden" name="action" value="AddWorkHour">
		
		<input type="submit" />
	</form>
	<div>
		<table>
			<thead>
				<tr>
					<th>Data</th>
					<th>Inicio</th>
					<th>Fim</th>
					<th>Editar</th>
					<th>Deletar</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="wk" items="${listWk}">
					<tr>
						<td><c:out value="${wk.getDate()}" /></td>
						<td><c:out value="${wk.getStart()}" /></td>
						<td><c:out value="${wk.getEnd()}" /></td>
						<td><a
							href="${linkEntryServlet}?action=UpdateWorkHour&id=${wk.getId()}">Editar</a></td>
						<td><a
							href="${linkEntryServlet}?action=RemoveWorkHour&id=${wk.getId()}">Deletar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>