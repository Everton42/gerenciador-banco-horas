<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/entry" var="rootServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="${rootServlet}" method="post">
	
		<span>Login: </span><input type="text" name="login"  />
		<span>Senha: </span><input type="password" name="password"  />
		
		<input type="hidden" name="action" value="Login">
	
		<input type="submit" />
	</form>

</body>
</html>