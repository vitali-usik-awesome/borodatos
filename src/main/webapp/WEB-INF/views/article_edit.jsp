<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Date"%>
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
			<div class="comics_edit">
			<h3>Comics</h3>
			<form:form method="post" action="${pageContext.request.contextPath}/admin/article/save" commandName="article" class="edit">
				<table>
					<tr>
						<td><!-- id --></td>
						<td><form:input path="id" type="hidden" /></td>
					</tr>
					<tr>
						<td><form:label path="id">title</form:label></td>
						<td><form:input path="title" /></td>
					</tr>
					<tr>
						<td><form:label path="id">titleImg</form:label></td>
						<td><form:input path="titleImg" /></td>
					</tr>
					<tr>
						<td><form:label path="id">titleImgV</form:label></td>
						<td><form:input path="titleImgV" /></td>
					</tr>
					<tr>
						<td><form:label path="id">titleImgS</form:label></td>
						<td><form:input path="titleImgS" /></td>
					</tr>
					<tr>
						<td><form:label path="id">content</form:label></td>
						<td><form:input path="content" /></td>
					</tr>
					<tr>
						<td><form:label path="id">author</form:label></td>
						<td><form:input path="author" /></td>
					</tr>
					<tr>
						<td><form:label path="id">link</form:label></td>
						<td><form:input path="link" /></td>
					</tr>
					<tr>
						<td><form:label path="id">section</form:label></td>
						<td><form:input path="section" /></td>
					</tr>				
					<tr>
						<td><form:label path="id">priority</form:label></td>
						<td><form:input path="priority" /></td>
					</tr>				
					<tr>
						<td><form:label path="id">views</form:label></td>
						<td>
							<form:input path="views" disabled="true"/>
						</td>
					</tr>
					<tr>
						<td colspan="2"><input class="submit_button" type="submit" value="Save" /></td>
					</tr>
				</table>
			</form:form>
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