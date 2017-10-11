
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:300,400,700'
	rel='stylesheet' type='text/css'>
	
<link rel="stylesheet" href=" <c:url value="/resources/css/bootstrap.css"/>">
<!-- bootstrap core -->
<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
<!-- CSS reset -->
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<!-- Resource style -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="../resources/js/modernizr.js"></script>
<!-- Modernizar -->
<script src="<c:url value="/resources/js/bootstrap.js"/>"></script>

<title>Projeto Natura</title>




</head>
<body>
	<header class="cd-main-header"> <a href="/"
		class="cd-logo">Projeto Natura </a>

	<div class="cd-search is-hidden">
		<form action="#0">
			<input type="search" placeholder="Search...">
		</form>
	</div>
	<!-- cd-search --> <a href="#0" class="cd-nav-trigger">Menu<span></span></a>

	<nav class="cd-nav">
	<ul class="cd-top-nav">
		<li><a href="#0">Tour</a></li>
		<li><a href="#0">Support</a></li>
		<li class="has-children account"><a href="#0"> 
		<img src="/resources/img/cd-avatar.png" alt="avatar"/> Account
		</a>

			<ul>

				<li><a href="#0">My Account</a></li>
				<li><a href="#0">Edit Account</a></li>
				<li><a href="#0">Logout</a></li>
			</ul> 
			</li>
	</ul>
	</nav> </header>
	<!-- .cd-main-header -->

	<main class="cd-main-content"> 

	<div>
		<jsp:doBody />
	</div>
	 
	</main>
	<!-- .cd-main-content -->
	<script src="<c:url value="/resources/js/jquery-2.1.4.js"/>"></script>
	<script src="<c:url value="/resources/js/jquery.menu-aim.js"/>"></script>
	<script src="<c:url value="/resources/js/main.js"/>"></script>
	<!-- Resource jQuery -->
</body>
</html>