<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
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
		<%@ include file="jspf/header.jspf" %>	
		<!-- /header -->
		<!-- content -->
		<div class="content">
			<div class="article_page">
			<div class="left_column">
				<h1>${comics.title}</h1>
				<img src="${comics.titleImg}" alt="image" />
				<p><b>Author:</b> ${comics.author}. <b>Date:</b> ${comics.date}. <b>Views:</b> ${comics.views}</p>
				${comics.content}
				<sec:authorize access="hasRole('ROLE_ADMIN')">
				<div class="admin_options">
					<p><b>Admin Options:</b>
						<a href="${pageContext.request.contextPath}/admin/edit/${comics.link}">edit</a>
						<a href="${pageContext.request.contextPath}/admin/add">add</a>
						<a href="${pageContext.request.contextPath}/admin/delete/${comics.id}">delete</a>
					</p>
				</div>
				</sec:authorize>
			</div>
			<div class="right_column">
				<!--  -->
			</div>
				
			</div>			
		</div>
		<!-- /content -->
		<!-- footer -->
		<%@ include file="jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>