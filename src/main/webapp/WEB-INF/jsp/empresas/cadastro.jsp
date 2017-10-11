
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-empresa.jsp"/>

		<div class="conteudo">
	<h1>Cadastre sua empresa</h1>
	
	<form action="cadastro" method="post">

		<div>
			<label>Email</label>
			<input type="text" name="email" >		
		</div>
		<div>
			<label>Nome</label>
			<input type="text" name="nome" >		
		</div>
		<div>
			<label>CNPJ</label>
			<input type="text" name="cnpj" >		
		</div>
		<div>
			<label>Link de Busca</label><br/>
			<span>
			Precisamos saber o link de busca do site da sua empresa para <br/> 
			redirecionar o cliente quando ele for comprar algum produto seu
			</span><br/>
			<input type="text" name="linkBusca" placeholder="Ex: https://minhaempresa.com/produtos/busca=" >		
		</div>
		
		<input type="submit" value="Pronto!" />
	</form>
</div>
</tags:template>