package cl.fuentes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Demo02() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      String title = "Usando GET";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " +
	         "transitional//en\">\n";
	         
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>Nombre</b>: "
	                  + request.getParameter("nombre") + "\n" +
	                  "  <li><b>Apellido</b>: "
	                  + request.getParameter("apellido") + "\n" +
	               "</ul>\n" +
	            "</body>"+
	         "</html>"
	      );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
