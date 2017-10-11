<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-ong.jsp"/>

		<div class="conteudo">

	<h1>Novo projeto</h1>
	
	<form method="post" action="save">
		<div>
			<label>Nome</label>
			<input type="text" name="nome" id="nome" />
		</div>
		<div>
			<label>Decrição</label>
			<input type="text" name="descricao" id="descricao" />
		</div>
		<div>
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
		<div id="containerProdutos">
			<label>Produtos</label>
			 
			<select name="produtosPorProjeto[0].produto.id" class="select-produtos">
				<c:forEach items="${produtos}" var="produto">
					<option value="${produto.id}" class="opt-produtos" >${produto.nome}</option>
				</c:forEach>
			</select>
			 
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
	<div>
		<button class="btn-ajax">Cadastrar</button>
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

	        $('.select-produtos').each(function(index, item){
	        	projeto.produtosPorProjeto.push($(item).val())
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
			
			$('#containerProdutos').append(
					'<br/><select name="produtosPorProjeto['+contadorDeProdutos+'].produto.id" class="select-produtos"><c:forEach items="${produtos}" var="produto"><option value="${produto.id}" class="opt-produto">${produto.nome}</option></c:forEach></select>')
					.append('')
						
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
	
</tags:template>