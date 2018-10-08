<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejemplo</title>
</head>
<body>
<h3>
	<jsp:scriptlet>
		String nombre = "Alvaro Fuentes";
	   	out.println("Mi nombre es : " + nombre);
	</jsp:scriptlet>
</h3>
<h4>
	<jsp:scriptlet>
		// Sintaxis de scriplet (formato XML)
		int rut = 123456789;
	   	out.println("Mi rut es : " + rut);
	</jsp:scriptlet>
</h4>
<p>
	<%
		// Otra forma de sintaxis de scriplet
		out.println("Estammos en la clase de JEE");
	%>
</p>

	<jsp:declaration>
		// Bloque de declaracion de variables
		int i = 0;
		int a, b, c;
	</jsp:declaration> 
	<%!
		int x, y, z;
	%>

	<jsp:expression>
		// Bloque de expresiones
	 (new java.util.Date()).toLocaleString()
	</jsp:expression>	
	 <p>La fecha de hoy es : <%= (new java.util.Date()).toLocaleString()%></p>
	 
	 <%-- Comentario --%>
	 
	<%! int edad = 28; %> 
	<% 
		out.println("Tu edad es : " + edad);
	%>
	<% if (edad >= 18) { %>
	   <p> Es mayor de edad</p>
	<% } else { %>
	   <p> Es menor de edad</p>
	<% } %>	 
	
	<%! int j; %> 
	<%
		for ( j = 1; j <= 10; j++){ %>
			<h4>El contador va en : <%= j %></h4>
    <%}%>
    
	 
</body>
</html>