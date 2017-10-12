<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

		<div class="conteudo">

	<h1>Meus projetos</h1>
	
	
	<table class="table table-striped">
    <thead>
		<tr>
			<th>Id</th>	
			<th>Projeto</th>	
			<th>Descrição</th>
		</tr>
		</thead>
		<c:forEach items="${projetos}" var="projeto">
			<tr>
				<td>${projeto.id}</td>	
				<td>${projeto.nome}</td>	
				<td>${projeto.descricao}</td>
			</tr>
			
		</c:forEach>
	</table>
	
	<a href="/ongs/projetos/novo">Novo</a>
	
</div>

</tags:template>