<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
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
			<div class="signin">
			<h2>Sign In</h2>
			<div style="color: red">${message}</div>	
			<form class="login-form" action="j_spring_security_check" method="post">
		 		<input id="j_username" name="j_username" size="20" maxlength="50" type="text" placeholder="Username" />
				
				<input id="j_password" name="j_password" size="20" maxlength="50" type="password" placeholder="Password" />
				
				<input type="submit" value="Login" class="sign_submit" />
			</form>
			</div>
		</div>
		<!-- /content -->
		<!-- footer -->
		<%@ include file="../jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>