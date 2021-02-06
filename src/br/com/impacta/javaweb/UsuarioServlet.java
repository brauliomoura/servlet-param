package br.com.impacta.javaweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/cadastro-usuario")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		
		//qualquer codigo de tratamento - ex: gravação em banco de dados
		
		StringBuilder resposta = new StringBuilder("<H1>Cadastro realizado com Sucesso!</H1><p>");
		resposta.append("<b>Nome:</b><p>");
		resposta.append(nome+"<p>");
		resposta.append("<b>Login:</b><p>");
		resposta.append(login);
		
		response.getWriter().append(resposta.toString());
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}	
	

}
