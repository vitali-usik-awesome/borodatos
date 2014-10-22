<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>borodatos</title>
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
			<h1>Spring Security - Sign In</h1>
			<div style="color: red">${message}</div>	
			<form class="login-form" action="j_spring_security_check" method="post">
				<label for="j_username">Username: </label>
		 		<input id="j_username" name="j_username" size="20" maxlength="50" type="text" />

				<label for="j_password">Password: </label>
				<input id="j_password" name="j_password" size="20" maxlength="50" type="password" />
			
				<input type="submit" value="Login" />
			</form>
		</div>
		<!-- /content -->
		<!-- footer -->
		<%@ include file="../jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>