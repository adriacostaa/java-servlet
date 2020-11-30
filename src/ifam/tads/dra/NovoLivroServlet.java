package ifam.tads.dra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoLivroServlet
 */
@WebServlet("/novoLivro")
public class NovoLivroServlet extends HttpServlet {
	public static final long serialVersionUID = 1L;
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando novo livro!");
		PrintWriter out = response.getWriter();	
		String nomeLivro = request.getParameter("nome");
		
		out.println("<html><body>Livro: "+ nomeLivro +" cadastrado com sucesso!</body></html>");
		
		}

}
