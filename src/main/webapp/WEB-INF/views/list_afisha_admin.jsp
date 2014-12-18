<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<div class="admin_page">
			<h3>Hello, Admin, motherfucker!</h3>
				<ul>
					<li>
						<sec:authorize access="isAuthenticated()">
							<a href="<c:url value="/j_spring_security_logout"/>">Выйти</a>
						</sec:authorize>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/admin/addArticle">Добавить статью</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/admin/showAllNews">Посмотреть новости</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/admin/addNews">Добавить новость</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/admin/showAllAfisha">Посмотреть афиши</a>
					</li>
					<li>
						<a href="${pageContext.request.contextPath}/admin/addAfisha">Добавить афишу</a>
					</li>
				</ul>
				<h3>Список афиш</h3>
				<c:if test="${!empty listAfisha}">
					<table>
						<tr>
							<th>Img</th>
							<th>Заголовок/Ссылка</th>							
							<th>Автор</th>
							<th>Статус</th>
							<th>Действия</th>
						</tr>
						<c:forEach items="${listAfisha}" var="afisha">
						<tr>
							<td><img src="${afisha.titleImg}" /></td>
							<td>
								<h4>${afisha.title}</h4>
								<p>${afisha.link}</p>
							</td>
							<td class="news_author">${afisha.author}</td>
							<td class="news_status">${afisha.status}</td>
							<td><a href="${pageContext.request.contextPath}/admin/editAfisha/${afisha.id}">Редактировать</a></td>
						</tr>
						</c:forEach>
					</table>
				</c:if>				
			</div>
		</div>	
		<!-- /content -->
		<!-- footer -->
		<%@ include file="jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
</body>
</html>