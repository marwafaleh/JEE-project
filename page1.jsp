<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>




<body>
<h1>Ajouter un PFE</h1>
<a href="ajouter.jsp">Ajouter PFE</a>
<Br><Br>
<table border="1">
<tr><th>Titre</th><th>Enseignant</th><th>Etudiant</th><th>Type</th><th></th></tr>
<c:forEach items="${Pfes}" var ="pf">
<tr>



<td>${pf.titrePFe}</td>
<td>${pf.en.nomEn}</td>
<td>${pf.et.nomEt}</td>
<td>${pf.cat.specialiteCat}</td>
<td> <a href='Delete?id=${pf.idPfe}'> supprimer</a> </td>




</tr>





</c:forEach>
</table>
</body>
</html>