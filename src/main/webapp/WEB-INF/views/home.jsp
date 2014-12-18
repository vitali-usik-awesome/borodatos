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
			<div class="main_banner">
				<a href="#">
					<img src="http://localhost:8080/borodatos/resources/pic/main_banner.jpg" alt="rp_banner" />
				</a>
			</div>
			<!-- popular_wrapper -->
			<div class="popular_wrapper">
				<ul class="thumbs_big_wrapper">
					<c:if test="${!empty listPopular}">
						<c:forEach items="${listPopular}" var="pop" begin="0" end="1">
							<li>
								<a href="${pageContext.request.contextPath}/${pop.section}/${pop.link}">
									<img src="${pop.titleImg}" />
									<div class="thumb_item">
										<h3>${pop.title}</h3>
										<h4>${pop.views}</h4>
									</div>
								</a>
							</li>
						</c:forEach>
					</c:if>
				</ul>
				<ul class="thumbs_small_wrapper">
					<c:if test="${!empty listPopular}">
						<c:forEach items="${listPopular}" var="pop" begin="2" end="4">
							<li>
								<a href="${pageContext.request.contextPath}/${pop.section}/${pop.link}">
									<img src="${pop.titleImg}" />
									<div class="thumb_item">
										<h3>${pop.title}</h3>
										<h4>${pop.views}</h4>
									</div>
								</a>
							</li>
						</c:forEach>
					</c:if>
				</ul>					
			</div>
			<!-- /popular_wrapper -->
			<!-- content_section_wrapper -->
			<div class="content_section_wrapper">
				<div class="section_header comics_header">
					<div class="section_head_name">
						<p><a>Комиксы</a></p>
					</div>
				</div>
				<div class="section_wrapper">
					<c:if test="${!empty listComics}">
						<c:forEach items="${listComics}" var="comics" begin="0" end="0">
							<div class="column">
								<div class="item">
									<a href="${pageContext.request.contextPath}/${comics.section}/${comics.link}">
										<img src="${comics.titleImgV}" />
										<div class="thumb_item">
											<h3>${comics.title}</h3>
											<h4>${comics.views}</h4>
										</div>
									</a>
								</div>
							</div>
						</c:forEach>
					</c:if>						
					<div class="column">
						<c:if test="${!empty listComics}">
							<c:forEach items="${listComics}" var="comics" begin="1" end="2">	
								<div class="two_line item">
									<a href="${pageContext.request.contextPath}/${comics.section}/${comics.link}">
										<img src="${comics.titleImgS}" />
										<div class="thumb_item">
											<h3>${comics.title}</h3>
											<h4>${comics.views}</h4>
										</div>
									</a>
								</div>
							</c:forEach>
						</c:if>		
					</div>
					<c:if test="${!empty listComics}">
						<c:forEach items="${listComics}" var="comics" begin="3" end="4">
							<div class="column">
								<div class="item">
									<a href="${pageContext.request.contextPath}/${comics.section}/${comics.link}">
										<img src="${comics.titleImgV}" />
										<div class="thumb_item">
											<h3>${comics.title}</h3>
											<h4>${comics.views}</h4>
										</div>
									</a>
								</div>
							</div>
						</c:forEach>
					</c:if>	
				</div>
			</div>
			<!-- /content_section_wrapper -->
			<!-- content_section_wrapper -->
			<div class="content_section_wrapper">
				<div class="section_header news_header">
					<div class="section_head_name">
						<p><a>Новости</a></p>
					</div>
				</div>
				<c:if test="${!empty listNews}">
					<div class="section_wrapper">				
						<c:forEach items="${listNews}" var="news" begin="0" end="2">
							<div class="news_column">
								<div class="news_item">
									<div class="news_img">
										<img src="${news.titleImg}" />
									</div>
									<div class="news_content">
										<h5>${news.title}</h5>
										<p>${news.content}</p>
									</div>
								</div>
							</div>
						</c:forEach>				
					</div>
					<div class="section_wrapper">				
						<c:forEach items="${listNews}" var="news" begin="3" end="5">
							<div class="news_column">
								<div class="news_item">
									<div class="news_img">
										<img src="${news.titleImg}" />
									</div>
									<div class="news_content">
										<h5>${news.title}</h5>
										<p>${news.content}</p>
									</div>
								</div>
							</div>
						</c:forEach>				
					</div>
					<div class="section_wrapper">				
						<c:forEach items="${listNews}" var="news" begin="6" end="8">
							<div class="news_column">
								<div class="news_item">
									<div class="news_img">
										<img src="${news.titleImg}" />
									</div>
									<div class="news_content">
										<h5>${news.title}</h5>
										<p>${news.content}</p>
									</div>
								</div>
							</div>
						</c:forEach>				
					</div>
				</c:if>				
			</div>
			<!-- /content_section_wrapper -->
			<!-- content_section_wrapper -->
			<div class="content_section_wrapper">
				<div class="section_header afisha_header">
					<div class="section_head_name">
						<p><a>Афиша</a></p>
					</div>
				</div>
				<c:if test="${!empty listAfisha}">	
				<div class="section_wrapper">
					<c:forEach items="${listAfisha}" var="afisha" begin="0" end="5">	
						<div class="afisha_item">
							<a href="${afisha.link}">
								<img src="${afisha.titleImg}" alt="${afisha.title}" title="${afisha.title}">
							</a>
						</div>
					</c:forEach>	
				</div>
				</c:if>
			</div>
			<!-- content_section_wrapper -->
		</div>	
		<!-- /content -->
		<!-- footer -->
		<%@ include file="jspf/footer.jspf" %>	
		<!-- /footer -->
	</div>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	<div class="admin_quick_panel">
		<ul>
			<li>				
				<a href="<c:url value="/j_spring_security_logout"/>">Выйти</a>
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
	</div>
	</c:if>
</body>
</html>