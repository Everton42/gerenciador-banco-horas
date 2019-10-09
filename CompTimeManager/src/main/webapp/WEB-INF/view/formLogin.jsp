<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entry" var="rootServlet" />

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="webjars/bootstrap/4.1.3/css/bootstrap.min.css"
	rel="stylesheet" />
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<title>Login</title>
<style type="text/css">
html, body {
	height: 100%;
	font-family: 'Roboto', sans-serif;
}
</style>

</head>
<body>
	<div class="container-fluid h-100">
		<div class="row justify-content-center align-items-center h-75">
			<div class="col col-sm-6 col-md-6 col-lg-4 col-xl-3">

				<div class="d-flex justify-content-center">
					<img alt="relogio" src="assets/images/time.svg"
						class="w-25 h-25 img-fluid">
				</div>
				<form action="${rootServlet}" method="post">
					<h2 class="text-center">Apontamentos</h2>
					<div class="form-group">
						<input type="text" name="login" class="form-control"
							placeholder="Usuário" required autofocus>
					</div>
					<div class="form-group">
						<input type="password" name="password" placeholder="Senha"
							class="form-control" required>
					</div>
					<div class="form-group">
						<button class="btn btn-block btn-primary  btn-info" type="submit"
							name="action" value="Login">Entrar</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>