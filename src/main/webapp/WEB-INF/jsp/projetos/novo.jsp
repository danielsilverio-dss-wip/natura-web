<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

<div class="container">

		<div class="conteudo">

	<h2>Novo projeto</h2>
	</br>
	
	
	<form method="post" action="save">
		<div class="form-group">
			<label>Nome</label></br></br>
			<input class="form-control" placeholder="Digite seu nome" type="text" name="nome" id="nome" />
		</div>
		
		<div class="form-group">
			<label>Decrição</label></br></br>
			<input class="form-control" type="text" name="descricao" id="descricao" placeholder="Digite uma descrição" />
		</div>
		
		<div class="form-group">
			<label>Ong</label>
			<select name="ong.id" id="ong">
				<c:forEach items="${ongs}" var="ong">
					<c:if test="${ong.id == 1}">
						<option value="${ong.id}" class="opt-ong" selected="selected">${ong.nome}</option>					
					</c:if>
					<c:if test="${ong.id >= 2}">
						<option value="${ong.id}" class="opt-ong">${ong.nome}</option>
					</c:if>
				</c:forEach>
			</select>
		</div>
		<div class="form-group" id="containerProdutos">
			<label>Produtos</label>
			 
			<div class="produto-wrap" id="produto-wrap-0">
				<select name="produtosPorProjeto[0].produto.id" class="select-produtos">
					<c:forEach items="${produtos}" var="produto">
						<option value="${produto.id}" class="opt-produtos" >${produto.nome}</option>
					</c:forEach>
				</select>
				<label>Quantidade necessária: </label>
				<input type="number" class="quantidade" />
			</div>
			 
		</div>
		
		<a href="#" id="addProduto" class="btn btn-light">+</a>
		
		<div>
			<input type="file" name="imagem" class="upload-file"/>
		</div>
		<!-- 
		<div>
			<input type="submit" value="Cadastrar">
		</div>
		 -->
	</form>
	</br>
	<div>
		<button class="btn btn-primary">Cadastrar</button>
	</div>
	<br/>
	<a href="lista">Listar</a>
	

<!-- 
<input type='file' />
</br><img id="myImg" src="#" alt="your image" height=200 width=100>
 -->	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<script type="text/javascript">
    /* The uploader form */
    
    /*
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
	*/
</script>
	
	<script>
	
		var contadorDeProdutos = 0
		
		$('#addProduto').click(function(){
			contadorDeProdutos++
			createProdutoSelect()					
		})

		$('#ong').change(function(){
			var selected = $(this).val()
			
			$('.opt-ong').each(function(index, item){
				$(item).removeAttr('selected')
			})
		
			$('.opt-ong[value='+ selected +']').attr('selected','true')
		})
		
		$('.select-produtos').change(function(){
			var selected = $(this).val()
						
			var options = $(this).find('option')

			$(options).each(function(index, item){
				console.log('manga')
			})						
		})
		
		var projeto = {
				nome: '',
				descricao: ''
			}
	
		var files = []
	
		$('.upload-file').change(function(event){
			files = event.target.files
		})
		
		$('.btn-ajax').click(function(){

			var form = new FormData();
            form.append("file", files[0]);

	        $.ajax({
		        dataType : 'json',
                   url : "/ongs/projetos/upload",
                   type : "POST",
                   enctype: 'multipart/form-data',
                   data : form,
                   processData: false, 
                   contentType:false
            });

	        projeto.nome = $('#nome').val()
			projeto.descricao = $('#descricao').val()
			//projeto.ongpar = $('#ong').val()
			projeto.produtosPorProjeto = []

	        $('.produto-wrap').each(function(index, item){

		        var produto = {
				        id: $(item).find('.select-produtos').val(),
				        quantidade:  $(item).find('.quantidade').val()
				    }

		        console.log(produto)
			    
	        	projeto.produtosPorProjeto.push(produto)
	        })

			var projetoString = JSON.stringify(projeto)
				
			$.ajax({
				type: 'POST',
				url: '/ongs/projetos/save',
				contentType: 'application/json',
				data: projetoString
			})
			
		})
		
		function createProdutoSelect(){

			
			var a = $('#containerProdutos').append('<div class="produto-wrap" id="produto-wrap-' + contadorDeProdutos + '">')
			
			var b = $('#produto-wrap-' + contadorDeProdutos ).append(
					'<select name="produtosPorProjeto['+contadorDeProdutos+'].produto.id" class="select-produtos"><c:forEach items="${produtos}" var="produto"><option value="${produto.id}" class="opt-produto">${produto.nome}</option></c:forEach></select>')
					.append('<label>Quantidade necessária: </label><input type="number" class="quantidade" />')
						
			$('.select-produtos').change(function(){
				var selected = $(this).val()
							
				var options = $(this).find('option')
	
				$(options).each(function(index, item){
					console.log('manga')
				})						
			})
		}
			
	</script>
	
	</div>
	</div>
	
</tags:template>