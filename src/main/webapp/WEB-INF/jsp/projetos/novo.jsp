<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" crossorigin="anonymous" />

</head>
<body>

	<h1>Novo projeto</h1>
	
	<form method="post" action="save">
		<div>
			<label>Nome</label>
			<input type="text" name="nome" />
		</div>
		<div>
			<label>Decrição</label>
			<input type="text" name="descricao" />
		</div>
		<div>
			<label>Ong</label>
			<select name="ong.id">
				<c:forEach items="${ongs}" var="ong">
					<option value="${ong.id}" >${ong.nome}</option>
				</c:forEach>
			</select>
		</div>
		<div id="containerProdutos">
			<label>Produtos</label>
			<select name="produtosPorProjeto[0].produto.id">
				<c:forEach items="${produtos}" var="produto">
					<option value="${produto.id}">${produto.nome}</option>
				</c:forEach>
			</select>
		</div>
		
		<a href="#" id="addProduto" class="btn btn-light">+</a>
		
		<div>
			<input type="submit" value="Cadastrar">
		</div>
	</form>
	<br/>
	<a href="lista">Listar</a>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<script>
		var contadorDeProdutos = 0
	
		$('#addProduto').click(function(){
			contadorDeProdutos++
			$('#containerProdutos').append('<br/><select name="produtosPorProjeto['+contadorDeProdutos+'].produto.id"><c:forEach items="${produtos}" var="produto"><option value="${produto.id}">${produto.nome}</option></c:forEach></select>').append('')
		})
	</script>

</body>
</html>