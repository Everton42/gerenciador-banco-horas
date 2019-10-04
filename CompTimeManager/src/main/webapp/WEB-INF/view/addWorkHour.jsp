
<form action="${linkEntryServlet}" method="post">
	<span>Data: </span><input type="text" name="date"  />
	<span>Inicio: </span><input type="text" name="start"  />
	<span>Fim: </span><input type="text" name="end"  />
	
	<input type="hidden" name="action" value="AddWorkHour">
	
	<input type="submit" />
</form>