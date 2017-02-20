<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<f:form commandName="user" method="POST">
		<table>
			<tr>
				<td><f:select path="userName" items="${userNameList}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Find User" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>