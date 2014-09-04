<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title><spring:message code="label.title" /></title>
</head>
<body>

<a href="<c:url value="/logout" />">
	<spring:message code="label.logout" />
</a>
  
<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="article">

	<table>
		<tr>
			<td><form:label path="title">
				<spring:message code="label.newsTitle" />
			</form:label></td>
			<td><form:input path="title" /></td>
		</tr>
		<tr>
			<td><form:label path="content">
				<spring:message code="label.content" />
			</form:label></td>
			<td><form:input path="content" /></td>
		</tr>
		<tr>
			<td><form:label path="date">
				<spring:message code="label.date" />
			</form:label></td>
			<td><form:input path="date" /></td>
		</tr>
		<tr>
			<td><form:label path="author">
				<spring:message code="label.author" />
			</form:label></td>
			<td><form:input path="author" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				value="<spring:message code="label.addnews"/>" /></td>
		</tr>
	</table>
</form:form>

<h3><spring:message code="label.news" /></h3>
<c:if test="${!empty articleList}">
	<table class="data">
		<tr>
			<th><spring:message code="label.title" /></th>
			<th><spring:message code="label.content" /></th>
			<th><spring:message code="label.author" /></th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${articleList}" var="article">
			<tr>
				<td>${article.title}, ${article.content}</td>
				<td>${article.date}</td>
				<td>${article.author}</td>
				<td><a href="delete/${article.id}"><spring:message code="label.delete" /></a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>