<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Novo projeto</h1>
	
	<form method="post" action="save">
		<div>
			<label>Nome</label>
			<input type="text" placeholder="nome" name="nome" />
		</div>
		<div>
			<label>Decrição</label>
			<input type="text" placeholder="descricao" name="descricao" />
		</div>
		<div>
			<label>Ong</label>
			<select name="ong.id">
				<c:forEach items="${ongs}" var="ong">
					<option value="${ong.id}" >${ong.nome}</option>
				</c:forEach>
			</select>
		</div>
		
		<div>
			<label>Produtos</label>
			<select name="produtosPorProjeto.produto.id">
				<c:forEach items="${produtos}" var="produto">
					<option value="${produto.id}">${produto.nome}</option>
				</c:forEach>
			</select>
		</div>
		
		<div>
			<input type="submit" value="Cadastrar">
		</div>
	</form>
	<br/>
	<a href="lista">Listar</a>
	

</body>
</html>