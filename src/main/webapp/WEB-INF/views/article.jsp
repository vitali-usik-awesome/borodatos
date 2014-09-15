<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>borodatos</title>
</head>
<body>
	<p>Hello World! from article.jsp!</p>

	<h3>Articles</h3>
	<c:if test="${!empty listArticle}">
		<table class="data">
			<tr>
				<th>title</th>
				<th>content</th>
				<th>date</th>
				<th>author</th>
			</tr>
			<c:forEach items="${listArticle}" var="article">
				<tr>
					<td>${article.title}</td>
					<td>${article.content}</td>
					<td>${article.date}</td>
					<td>${article.author}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>