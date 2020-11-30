package java.com.biblioteca.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/biblioteca")

public class MainServlet extends HttpServlet{

	@Override 
	protected void service(HttpServletRequest req, HttpServletResponse res ) throws IOException {
		PrintWriter out = res.getWriter();
		out.println("ola, TADS!");
		System.out.print("servlet funcionando!");
	}
	
}
