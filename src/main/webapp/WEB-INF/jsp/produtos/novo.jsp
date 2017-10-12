
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-empresa.jsp"/>

<div class="container">

		<div class="conteudo">

	<h2>Novo produto</h2>
	</br>
	
	<form action="save" method="post">
		<div class="form-group">
			<label>Nome</label></br></br>
			<input class="form-control" type="text" name="nome" placeholder="Digite seu nome" />
		</div>	
		<div class="form-group">
			<label>Categoria</label></br></br>
			<select name="categoria.nome">
				<c:forEach items="${categorias}" var="categoria">
					<option value="${categoria.id}">${categoria.nome}</option>			
				</c:forEach>
			</select>
		</div>	
	</form>
	
	<a href="/empresas/produtos/lista">Lista</a>

</div>
</div>
</tags:template>