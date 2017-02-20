<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<f:form commandName="user" method="POST" action="updateordelete">
		<table>
			<tr>
				<td>User ID<f:hidden path="userId" value="${user.userId}" /></td>
			</tr>
			<tr>
				<td>User Name<f:input path="userName" value="${user.userName}" /></td>
			</tr>
			<tr>
				<td>User Password<f:input path="password"
						value="${user.password}" /></td>
			</tr>
			<tr>
				<td>User Mobile<f:input path="mobile" value="${user.mobile}" /></td>
			</tr>
			<tr>
				<td>User Email<f:input path="email" value="${user.email}" /></td>
			</tr>
			<tr>
				<td>User Type<f:input path="userType" value="${user.userType}" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="update" value="update" /></td>
				<td><input type="submit" name="delete" value="delete" /></td>
			</tr>
		</table>
	</f:form>
</body>
</html>