<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

		<div class="conteudo">

	<h1>Cadastre sua ONG</h1>
	
	<form action="cadastro" method="post">
		<p>(campos de cadastro)</p>
		
		<input type="submit" value="Pronto!" />
	</form>

	</div>
	</tags:template>