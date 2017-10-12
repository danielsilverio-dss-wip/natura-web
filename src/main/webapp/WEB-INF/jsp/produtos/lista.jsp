
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="tags" tagdir="/WEB-INF/tags/"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

 <tags:template>
 
<jsp:include page= "../snippets/nav-empresa.jsp"/>

		<div class="conteudo">

	<h1>Lista de Produtos</h1>
	

	<table class="table table-striped">
    <thead>
		<tr>
			<th>Id</th>
			<th>Produto</th>
			<th>Fornecido</th>
		</tr>
		 </thead>
		<c:forEach items="${produtos}" var="produto">
			
			<tr class="produto">
				<td class="produto-id">${produto.id}</td>
				<td class="produto-nome">${produto.nome}</td>
				<td colspan="4"><input class="produto-fornecido" type="checkbox" value="${produto.fornecido}" /></td>
			</tr>
			
		</c:forEach>
	</table>
	
	
	<button id="teste">oi</button>
	
	<a href="/empresas/produtos/novo">Novo</a>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<script type="text/javascript">
		
		$(document).ready(function() {
			
			var produtos = []

			$('.produto-fornecido').each(function(){
				if($(this).val() === 'true'){
					$(this).attr('checked','checked')
				}
			})
			
			$('.produto-fornecido').click(function(){
				if($(this).val() === 'true'){
					$(this).val('false')
				}else{
					$(this).val('true')
				}
				console.log(this)
			})
			
			$('#teste').click(function(){
				
				$('.produto').each(function(index, item){
					var produto = {id: $(item).find('.produto-id').text(),
									fornecido: $(item).find('.produto-fornecido').attr('value')}
					produtos.push(produto)
					console.log(produto)
				})				
				
				$.ajax({
					type: 'POST',
					url: '/empresas/produtos/teste',
					contentType: 'application/json',
					data: JSON.stringify(produtos)
				})
			})
			
		})
		
	</script>

</div>
</tags:template>
