<!DOCTYPE html>
<html>
	<head>
		<title>Grails Runtime Exception</title>
		<meta name="layout" content="main">
	</head>
	<body>
		<table>
			<tr>
				<th>Name</th>
				<th>Id</th>
				<th>Encrypted password</th>
			</tr>
			<g:each in="${details}">
    			<tr>
    				<td>${it.username }</td>
    				<td>${it.id }</td>
    				<td>${it.password }</td>
    			</tr>
			</g:each>
		</table>
	</body>
</html>
