<html>

<head>
	<meta name='layout' content='register'/>
	<title><g:message code='spring.security.ui.register.title'/></title>
</head>

<body>

<g:form action='register' controller="addUser" name='registerForm' method="POST">

	<g:if test='${emailSent}'>
	<br/>
	<g:message code='spring.security.ui.register.sent'/>
	</g:if>
	<g:else>

	<br/>

	<table>
	<tbody>
<tr>
		<td>UserName</td><td> <g:textField name='username' /></td></tr>

		<tr><td>Email</td> <td><g:textField name='email'  /></td></tr>

		<tr><td>Password </td><td><g:passwordField name='password'/></td></tr>

		<tr><td>Password(again) </td><td><g:passwordField name='password2' /></td></tr>
                             
        <tr><td>Role</td><td><g:radio name="role" value="ROLE_ADMIN" />Admin<br/>
        <g:radio name="role" value="ROLE_USER" />User<br/>
        <g:radio name="role" value="ROLE_Annonymous"/>Anonymous</td>
</tr>
	</tbody>
	</table>

	<g:submitButton name ="Register" />

	</g:else>

</g:form>


</body>
</html>
