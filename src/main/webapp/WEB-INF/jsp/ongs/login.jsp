<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

		<div class="conteudo">


	<form action="/ongs/login" method="post">
		<div>
			<label>Email</label>
			<input type="text" name="email" />
		</div>
		<div>
			<label>Senha</label>
			<input type="password" name="senha" />
		</div>
		<input type="submit" value="Login" />	
	</form>

	<p>É novo aqui? Faça seu <a href="/ongs/cadastro">cadastro</a> :)</p>
	
	</div>
</tags:template>