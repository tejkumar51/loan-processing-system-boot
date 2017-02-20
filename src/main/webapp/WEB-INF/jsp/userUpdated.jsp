<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<f:form commandName="user">
		<table>
			<tr>
				<td>User Updated</td>
				<td>User Name<f:input path="userName" value="${user.userName}"
						readonly="true" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>