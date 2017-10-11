
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-empresa.jsp"/>

		<div class="conteudo">

	<h1>Novo produto</h1>
	
	<form action="save" method="post">
		<div>
			<label>Nome</label>
			<input type="text" name="nome" />
		</div>	
		<div>
			<label>Categoria</label>
			<select name="categoria.nome">
				<c:forEach items="${categorias}" var="categoria">
					<option value="${categoria.id}">${categoria.nome}</option>			
				</c:forEach>
			</select>
		</div>	
	</form>
	
	<a href="/empresas/produtos/lista">Lista</a>

</div>
</tags:template>