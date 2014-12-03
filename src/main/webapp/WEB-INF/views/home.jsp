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
									<a href="${pageContext.request.contextPath}/comics/${pop.link}">
										<img src="${pop.brief}" />
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
			
			
			<div class="test_comics_wrapper">			
				<c:if test="${!empty listPopular}">
					<c:forEach items="${listPopular}" var="comics">
						<div class="test_comics_item">
							<h4><a href="${pageContext.request.contextPath}/comics/${comics.link}">${comics.title}</a></h4>
							${comics.brief}
							<p><b>Author:</b> ${comics.author}. <b>Date:</b> ${comics.date}. <b>Views:</b> ${comics.views}</p>
						</div>	
					</c:forEach>
				</c:if>
			</div>
			
			
			
			<div class="content_section_wrapper">
				<div class="section_header">
					<div class="section_head_name">
						<a href="#">Комиксы</a>
					</div>
				</div>
			</div>
			<div class="test_comics_wrapper">			
				<c:if test="${!empty listComics}">
					<c:forEach items="${listComics}" var="comics">
						<div class="test_comics_item">
							<h4><a href="${pageContext.request.contextPath}/comics/${comics.link}">${comics.title}</a></h4>
							${comics.brief}
							<p><b>Author:</b> ${comics.author}. <b>Date:</b> ${comics.date}. <b>Views:</b> ${comics.views}</p>
						</div>	
					</c:forEach>
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