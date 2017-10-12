<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

	<div class="container">
		<div class="conteudo">
		
	<div class="jumbotron">	
  		
	<form action="/empresas/login" method="post">
		<div class="form-group">
		
		<label for="email">Email</label><br/><br/>
		<input type="email" class="form-control" id="email" placeholder="Digite seu Email" name="email" />
		
		</div>
		
		<div class="form-group">
		
		<label for="senha">Senha</label><br/><br/>
		<input type="password" class="form-control" id="senha" placeholder="Digite sua senha" name="senha" />
		</div>
		<button type="submit" class="btn btn-primary">Logar</button>

			
	</form>
	<br/><br/>
	<h5>É novo aqui? Faça seu <a href="/empresas/cadastro">cadastro</a> :)</h5>

		</div>
	</div>


	</div>
</tags:template>
