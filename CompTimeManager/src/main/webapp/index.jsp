<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE hmtl>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test</title>
</head>
<body>
    <h1>Hor�rios: </h1>

    <table>
    	<thead>
    		<tr>
    			<th>Entrada</th>
    			<th>Almo�o</th>
				<th></th>
    			<th>Sa�da</th>
    		</tr>
    	</thead>
    	<tbody>
    	    <c:forEach items="${workdays}" var="workday">
	    	    <tr>
		            <td>${workday.getStart()}</td>
		            <td>${workday.getStartLunch()}</td>
		            <td>${workday.getEndLunch()}</td>
		            <td>${workday.getEnd()}</td>
		         </tr>
	        </c:forEach>
    	</tbody>

    </table>

</body>
</html>