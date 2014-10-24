<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>HTTP Error ${ errorCode }</title>
<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script>
	$(function() {
		var pull = $('#pull');
		menu = $('nav ul');
		menuHeight = menu.height();

		$(pull).on('click', function(e) {
			e.preventDefault();
			menu.slideToggle();
		});

		$(window).resize(function() {
			var w = $(window).width();
			if (w > 320 && menu.is(':hidden')) {
				menu.removeAttr('style');
			}
		});
	});
</script>
</head>
<body>
	<div class="wrapper">
		<!-- header -->
		<%@ include file="../jspf/header.jspf" %>	
		<!-- /header -->
		<!-- content -->
		<div class="content">
			<h1>HTTP Error ${ errorCode }</h1>
			<p>${ message }</p>
		</div>
		<!-- /content -->
		<!-- footer -->
		<%@ include file="../jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>