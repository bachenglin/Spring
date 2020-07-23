<%
	String name = request.getParameter("myname");
	out.println("Hello from AJAX to: " + name.toUpperCase());
%>