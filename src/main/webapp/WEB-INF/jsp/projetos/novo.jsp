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
			<input type="file" name="imagem" class="upload-file"/>
		</div>
		
		<div>
			<input type="submit" value="Cadastrar">
		</div>
		
		<div>
			<button class="btn-ajax">Ajax</button>
		</div>
	</form>
	<br/>
	<a href="lista">Listar</a>
	
	<style>
    /* Image Designing Propoerties */
    .thumb {
        height: 75px;
        border: 1px solid #000;
        margin: 10px 5px 0 0;
    }
</style>




<input type='file' />
</br><img id="myImg" src="#" alt="your image" height=200 width=100>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<script type="text/javascript">
    /* The uploader form */
    $(function () {
        $(":file").change(function () {
            if (this.files && this.files[0]) {
                var reader = new FileReader();

                reader.onload = imageIsLoaded;
                reader.readAsDataURL(this.files[0]);
                debugger
            }
        });
    });

    function imageIsLoaded(e) {
        $('#myImg').attr('src', e.target.result);
        $('#yourImage').attr('src', e.target.result);
    };

</script>
	
	<script>
		var contadorDeProdutos = 0
	
		$('#addProduto').click(function(){
			contadorDeProdutos++
			$('#containerProdutos').append('<br/><select name="produtosPorProjeto['+contadorDeProdutos+'].produto.id"><c:forEach items="${produtos}" var="produto"><option value="${produto.id}">${produto.nome}</option></c:forEach></select>').append('')
		})
		
		var projeto = {

				nome: '',
				descricao: '',
				produtos: [],
				imagem: []
			}
		
		
		var imagem
		$('.upload-file').change(function(){
			
			var reader = new FileReader()
		  
			reader.onload = function() {
		
	       		var arrayBuffer = this.result,
				array = new Uint8Array(arrayBuffer),
				binaryString = String.fromCharCode.apply(null, array);
				
				var img = binaryString
				console.log(img) 

				projeto.imagem = img
			}
			
			reader.readAsArrayBuffer(this.files[0])
		})
		
		$('.btn-ajax').click(function(){
				/*
				$('.produto').each(function(index, item){
					var produto = {id: $(item).find('.produto-id').text(),
									fornecido: $(item).find('.produto-fornecido').attr('value')}
					produtos.push(produto)
					console.log(produto)
				})				
				*/

				projeto.nome = 'proj'
				projeto.descricao = 'desc'

				var projetoString = JSON.stringify(projeto)
				debugger
				$.ajax({
					type: 'POST',
					url: '/ongs/projetos/teste',
					contentType: 'application/json',
					data: projetoString
				})
			})
	</script>

</body>
</html>