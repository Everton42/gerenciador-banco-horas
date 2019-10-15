<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entry?action=Index" var="linkHome" />
<c:url value="/entry?action=Timesheet" var="linkTimesheet" />

<nav class="navbar navbar-dark bg-dark navbar-expand-sm h-15">
  <a class="navbar-brand" href="${linkHome}">
    <img src="assets/images/avatar.png" width="30" height="30" alt="logo">
    	${user.getLogin() }
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-list-2" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbar-list-2">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="${linkHome} ">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="${linkTimesheet}">Apontamentos</a>
      </li>
    </ul>
  </div>
</nav>