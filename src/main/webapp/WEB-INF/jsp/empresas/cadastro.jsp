
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-empresa.jsp"/>

	
  		<div class="container">  		
				<div class="conteudo">
					
	<h2 text-align="center">Cadastre sua empresa</h2>
	<br/>
	<br/>
	
	<form action="cadastro" method="post">
		
	<div class="form-group">
		
			<label for="email">Email</label><br/><br/>
			<input type="email" class="form-control" id="email" placeholder="Digite seu Email" name="email" />
			
	</div>
	

	<div class="form-group">
		<label for="nome">Nome</label><br/><br/>
		<input type="text" class="form-control" id="nome" placeholder="Digite seu Nome" name="nome" />	
			
	</div>
	
	
	<div class="form-group">
		<label for="cnpj" >CNPJ</label><br/><br/>
		<input type="text" class="form-control" id="cnpj" placeholder="Digite o CNPJ" name="cnpj" />		
	</div>
	
	<div class="form-group">
		<label for="busca">Link de Busca</label><br/><br/>
		<input type="url" class="form-control" id="busca" placeholder="Ex: https://minhaempresa.com/produtos/busca=" name="busca" /><br/><br/>
			
	</div>
	
		<span class="glyphicon glyphicon-thumbs-up">
		Precisamos saber o link de busca do site da sua empresa para <br/> 
			redirecionar o cliente quando ele for comprar algum produto seu
		</span><br/></br>
		
		<button type="submit" class="btn btn-primary">Pronto</button>
		
	
	</form>
		</div>
		</div>
</tags:template>