package es.cfc.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.cfc.business.GestionProductos;
import es.cfc.models.Producto;

/**
 * Servlet implementation class ServletProductos
 */
@WebServlet("/miServlet")
public class ServletProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProductos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// 0. Recuperar parámetros del request
		String opcion = request.getParameter("op");
		
		GestionProductos gestion = new GestionProductos();
		RequestDispatcher rd;
		
		// 0-bis
		switch (opcion) {
		case "1":
			// Consultar todos los productos
			List<Producto> lista = gestion.verTodos();
			
			// 1. Elegir la página web
			rd = request.getRequestDispatcher("/mostrarTodos.jsp");
			
			// 2. Adjuntar la lista a la petición
			request.setAttribute("todos", lista);
			
			// 3. Redirigir
			rd.forward(request, response);
			break;

		case "2":
			// Buscar un producto
			int codigo = Integer.parseInt(request.getParameter("id"));
			Producto producto = gestion.buscarProducto(codigo);
			
			// 1. Elegir la página web
			rd = request.getRequestDispatcher("/mostrarProducto.jsp");
			
			// 2. Adjuntar la lista a la petición
			request.setAttribute("producto", producto);
			
			// 3. Redirigir
			rd.forward(request, response);
			break;

		default:
			break;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
