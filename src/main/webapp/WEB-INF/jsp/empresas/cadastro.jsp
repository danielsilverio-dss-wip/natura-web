<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastre sua empresa</h1>
	
	private String email;
	
	private String nome;
	
	private String cnpj;
	
	private String linkBusca;
	
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
</body>
</html>