<!DOCTYPE html>
<html>
	<head>
		<title>Grails Runtime Exception</title>
		<meta name="layout" content="main">
		
	</head>
	<body>
		<h1>Home page</h1>
		<sec:ifAllGranted roles="ROLE_ADMIN">
			<g:link controller = "addUser">Add User</g:link>
			<g:link controller = "role">Edit Role</g:link>
			<g:link action="viewAllUser">View All User</g:link><br/>
		</sec:ifAllGranted>
		<sec:ifAllGranted roles="ROLE_USER">
			<g:render template="userDetail"/>
		</sec:ifAllGranted>
		<sec:ifAllGranted roles="ROLE_ANONYMOUS">
			You are not the authenticated User...
		</sec:ifAllGranted>
		<br/><br/>
		<g:link controller = "logout">Logout</g:link><br/>
	</body>
</html>