<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

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

</body>
</html>