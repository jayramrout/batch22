<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Enter Details</title>
</head>

<body>

	<%
		String fname = (String)session.getAttribute("fname");
		String lname = (String)session.getAttribute("lname");
		out.print("Hi , "+fname +" , " + lname  +"Welcome back to the Home Page . You are new User");

	%>

</body>
</html>
