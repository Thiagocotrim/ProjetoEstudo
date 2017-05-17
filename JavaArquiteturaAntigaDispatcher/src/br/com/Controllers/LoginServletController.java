package br.com.Controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.Model.Usuario;

@WebServlet("/loginServlet")
public class LoginServletController extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = req.getParameter("userName");
		if(user.equals("leandro")){
			req.setAttribute("nome", "Leandro Santos Santana");//n�o � poss�vel passar um objeto inteiro, porque trabalha com o protocolo HTTP, que s� passa String
		}else{
			req.setAttribute("nome", "Fulano de Tal");//n�o � poss�vel passar um objeto inteiro, porque trabalha com o protocolo HTTP, que s� passa String
		}
		RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
		rd.forward(req, resp);
				
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = req.getParameter("userName");
		String botao = req.getParameter("submit");
			 
		req.setAttribute("nome", user);//n�o � poss�vel passar um objeto inteiro, porque trabalha com o protocolo HTTP, que s� passa String
		if(botao.equals("login")){
			System.out.println("botao:"+botao);
			RequestDispatcher rd = req.getRequestDispatcher("logado.jsp");
			req.setAttribute("nome", user);
			rd.forward(req, resp);
		}else {
			System.out.println("botao:"+botao);
			HttpSession sessao = req.getSession();
			sessao.setAttribute("username", user);//n�o � poss�vel adicionar um objeto como atributo na sess�o
			
			resp.sendRedirect("/JavaArquiteturaAntigaDispatcher/criarUsuario.jsp");//se colocar a Barra(/) no in�cio o caminho da URL deve ser absoluto
//			� aconselhado a usar o sendRedirect em vez do RequestDispatcher 
//			porque ele muda a URL para a p�gina JSP, assim o usu�rio pode salvar a p�gina
			
		}
		
		
	}
	
}
