<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
			<header>
				<!-- hLogo -->
				<div class="hLogo">
					<a href="${pageContext.request.contextPath}" class="logo">
						<img src="${pageContext.request.contextPath}/resources/img/boro_logo_test.png" alt="logo" />
					</a>
					<div class="search">
						<input type="search" placeholder="Search" />
					</div>
					<div class="social clr">
						<ul>
							<li><a href="#">vk</a></li>
							<li><a href="#">fb</a></li>
							<li><a href="#">twi</a></li>
							<li><a href="#">ins</a></li>
						</ul>
					</div>
				</div>
				<!-- /hLogo -->
				<!-- nav -->
				<nav class="clearfix">  
    				<ul class="clearfix">  
     					<li><a href="${pageContext.request.contextPath}">home</a></li>
						<li><a href="#">comics</a></li>
						<li><a href="#">music</a></li>
						<li><a href="#">games</a></li>
						<li><a href="#">copyright</a></li>
						<li><a href="#">mission</a></li>
						<li><a href="#">contacts</a></li>  
   					 </ul>  
    				<a href="#" id="pull">Menu</a>  
				</nav>
				<!-- /nav -->
			</header>
			<!-- /header -->
			<!-- content -->
			<div class="content">
				<h3>Comics</h3>
				<form:form method="post" action="${pageContext.request.contextPath}/comics/save" commandName="comics">
					<table>
						<tr>
							<td><form:label path="id">id</form:label></td>
							<td><form:input path="id" /></td>
						</tr>
						<tr>
							<td><form:label path="id">title</form:label></td>
							<td><form:input path="title" /></td>
						</tr>
						<tr>
							<td><form:label path="id">brief</form:label></td>
							<td><form:input path="brief" /></td>
						</tr>
						<tr>
							<td><form:label path="id">content</form:label></td>
							<td><form:textarea rows="10" cols="150" path="content" /></td>
						</tr>
						<tr>
							<td><form:label path="id">author</form:label></td>
							<td><form:input path="author" /></td>
						</tr>
						<tr>
							<td><form:label path="id">date</form:label></td>
							<td><form:input path="date" /></td>
						</tr>
						<tr>
							<td><form:label path="id">link</form:label></td>
							<td><form:input path="link" /></td>
						</tr>
						<tr>
							<td><form:label path="id">views</form:label></td>
							<td><form:input path="views" /></td>
						</tr>
						<tr>
							<td colspan="2"><input class="submit_button" type="submit" value="Save" /></td>
						</tr>
					</table>
				</form:form>
				<c:if test="${!empty listImages}">
					<c:forEach items="${listImages}" var="images">
						<p>${images.imageDate} - ${images.imageLink} - ${images.link}</p>
					</c:forEach>
				</c:if>
			</div>
			<!-- /content -->
			<!-- footer -->
			<footer>
				<div class="footer_column">
					<ul>
						<li><a href="#">comics</a></li>
						<li><a href="#">music</a></li>
						<li><a href="#">games</a></li>
					</ul>
				</div>
				<div class="footer_column">
					<ul>
						<li><a href="#">comics</a></li>
						<li><a href="#">music</a></li>
						<li><a href="#">games</a></li>
					</ul>
				</div>
				<div class="footer_column">
					<ul>
						<li><a href="#">comics</a></li>
						<li><a href="#">music</a></li>
						<li><a href="#">games</a></li>
					</ul>
				</div>
				<div class="footer_column">
					<a href="#" class="">
						<img src="${pageContext.request.contextPath}/resources/img/borodatos_footer.png" alt="logo" />
					</a>
				</div>
				<div class="footer_column clr">
					<div class="f_social">
						<ul>
							<li><a href="#">vk</a></li>
							<li><a href="#">fb</a></li>
							<li><a href="#">twi</a></li>
							<li><a href="#">ins</a></li>
						</ul>
					</div>
					<div class="f_copyright">
						<p>(c) Borodatos<br /> All rights reserved</p>
					</div>
				</div>
			</footer>
			<!-- /footer -->
	</div>
</body>
</html>