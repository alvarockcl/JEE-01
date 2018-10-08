package cl.fuentes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String saludo;
	
    public Demo01() {
        super();
    }
    
    public void init() throws ServletException {
        saludo = "Hola mundo Servlet";
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Responder en formato html
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>" + saludo + "</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	public void destroy() {
		// No hace nada
	}

}
