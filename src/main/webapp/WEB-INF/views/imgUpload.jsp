<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div>
	<h2>New Person Form</h2>
	<sf:form method="POST" modelAttribute="person" action="${pageContext.request.contextPath}/imgUp" enctype="multipart/form-data">
		<fieldset>
			<table cellspacing="0">
				<tr>
					<th><label for="image">Image (in JPEG format only):</label></th>
					<td><input name="image" type="file" />
				</tr>
				<tr>
					<th><input type="Submit" value="Submit" /></th>
					<td></td>
				</tr>
			</table>
		</fieldset>
	</sf:form>

</div>