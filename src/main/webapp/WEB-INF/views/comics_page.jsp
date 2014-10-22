<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
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
			<h3>Comics</h3>			
			<table>
				<tr>
					<th>id</th>
					<th>title</th>
					<th>brief</th>
					<th>content</th>
					<th>author</th>
					<th>date</th>
					<th>link</th>
					<th>views</th>
					<th>action</th>
					<th>action2</th>
					<th>action3</th>
				</tr>
				<tr>
					<td>${comics.id}</td>
					<td>${comics.title}</td>
					<td>${comics.brief}</td>
					<td>${comics.content}</td>
					<td>${comics.author}</td>
					<td>${comics.date}</td>
					<td>${comics.link}</td>
					<td>${comics.views}</td>
					<sec:authorize access="hasRole('ROLE_ADMIN')">
					<td><a href="${pageContext.request.contextPath}/admin/edit/${comics.link}">edit</a></td>
					<td><a href="${pageContext.request.contextPath}/admin/add">add</a></td>
					<td><a href="${pageContext.request.contextPath}/admin/delete/${comics.id}">delete</a></td>
					</sec:authorize>
				</tr>					
			</table>		
		</div>
		<!-- /content -->
		<!-- footer -->
		<%@ include file="jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>