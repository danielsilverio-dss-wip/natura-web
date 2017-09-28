<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
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
</body>
</html>