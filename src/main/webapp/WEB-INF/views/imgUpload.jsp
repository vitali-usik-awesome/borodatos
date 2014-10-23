<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
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
			<div class="img_upload">
			<sf:form method="POST" modelAttribute="person" action="${pageContext.request.contextPath}/imgUp" enctype="multipart/form-data">

				<table>
					<tr>
						<th><label for="image">Image (in JPEG format only):</label></th>
						<td><input name="image" type="file" />
					</tr>
					<tr>
						<th><!--  --></th>
						<td><input type="Submit" value="Submit" /></td>
					</tr>
				</table>

			</sf:form>	
			<div class="image_list">
				<c:if test="${!empty listImages}">
					<c:forEach items="${listImages}" var="images">		
						<table>
							<tr>
								<td><img src="${images.link}" /></td>
								<td>${images.imageDate} - <i>${images.link}</i></td>
							</tr>
						</table>
					</c:forEach>
				</c:if>
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