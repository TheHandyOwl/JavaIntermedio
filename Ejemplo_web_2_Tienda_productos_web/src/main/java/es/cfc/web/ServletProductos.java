package es.cfc.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import es.cfc.business.Carrito;
import es.cfc.business.GestionProductos;
import es.cfc.models.Producto;

/**
 * Servlet implementation class ServletProductos
 */
//@WebServlet("/miServlet") // Comentamos esta línea si es un proyecto antiguo
// El motivo es que estará dado de alta en WEB-INF/lib/web.xml
// Puede estar allí o aquí, pero no en los 2 sitios.
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
     * Sobreescribimos el método init del GenericServlet!!!
     * para acceder a las propiedades que hemos inicializado
     * en el servlet a 'capón'
     */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		// Recuperamos el parámetro inicial del servlet 'Oferta'
		String mensajeDeLaOferta = config.getInitParameter("Oferta");
		// No tenemos 'request' ni 'session' todavía, por lo que no podemos guardarla ahí
		
		// 1. Recuperar el contexto de la aplicación 
		ServletContext ctxApp = config.getServletContext();
		
		// 2. Guardamos el atributo de la oferta
		ctxApp.setAttribute("msgOferta", mensajeDeLaOferta);
		
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
		// Refactor: sacando cosas del switch. index.html hará de 'default'
		//RequestDispatcher rd;
		String pagina = "/index.html";
		
		// 0-bis
		switch (opcion) {
		case "1":
			// Consultar todos los productos
			List<Producto> lista = gestion.verTodos();
			
			// 1. Elegir la página web
			//rd = request.getRequestDispatcher("/mostrarTodos.jsp");
			pagina = "/mostrarTodos.jsp";
			
			// 2. Adjuntar la lista a la petición
			request.setAttribute("todos", lista);
			
			// 3. Redirigir
			//rd.forward(request, response);
			break;

		case "2":
			// Buscar un producto
			int codigo = Integer.parseInt(request.getParameter("id"));
			Producto producto = gestion.buscarProducto(codigo);
			
			// 1. Elegir la página web
			//rd = request.getRequestDispatcher("/mostrarProducto.jsp");
			pagina = "/mostrarProducto.jsp";
			
			// 2. Adjuntar la lista a la petición
			request.setAttribute("encontrado", producto);
			
			// 3. Redirigir
			//rd.forward(request, response);
			break;

		case "3":
			// Alta nuevo producto
			codigo = Integer.parseInt(request.getParameter("id"));
			String descripcion = request.getParameter("descripcion");
			double precio = Double.parseDouble(request.getParameter("precio"));
			
			Producto nuevo = new Producto(codigo, descripcion, precio);
			if (gestion.insertarProducto(nuevo)) {
				request.setAttribute("mensaje", "Producto insertado correctamente");
			} else {
				request.setAttribute("mensaje", "Producto no ha sido insertado");
			}
			
			pagina = "/mostrarMensaje.jsp";
			break;

		case "4":
			// Eliminar producto
			codigo = Integer.parseInt(request.getParameter("id"));
			
			if (gestion.eliminarProducto(codigo)) {
				request.setAttribute("mensaje",	"Producto eliminado correctamente");
			} else {
				request.setAttribute("mensaje",	"Producto no ha sido eliminado");
			}
			
			pagina = "/mostrarMensaje.jsp";
			break;

		case "5":
			// Modificar producto
			codigo = Integer.parseInt(request.getParameter("id"));
			precio = Double.parseDouble(request.getParameter("precio"));
			
			if (gestion.modificarProducto(codigo, precio)) {
				request.setAttribute("mensaje", "Producto modificado correctamente");
			} else {
				request.setAttribute("mensaje", "Producto no ha sido modificado");
			}
			
			pagina = "/mostrarMensaje.jsp";
			break;

		case "6":
			// Agregar producto a carrito
			codigo = Integer.parseInt(request.getParameter("id"));
			
			// Abrir o recuperar una sesión del usuario 
			HttpSession miSession = request.getSession();
			
			// Recuperar el objeto Carrito de su sesión
			Carrito miCarro = (Carrito) miSession.getAttribute("carrito");
			
			// Comprobar si no existe el carrito y lo creamos
			// Esto sólo se ejecutará la primera vez cuando se crea la sesión
			if (miCarro == null) {
				miCarro = new Carrito();
				miSession.setAttribute("carrito", miCarro);
			}
			
			// Buscar el producto y añadirlo al carrito
			miCarro.addProducto(gestion.buscarProducto(codigo));
			System.out.println("codigo" + codigo);
			System.out.println("gestion.buscarProducto(codigo)" + gestion.buscarProducto(codigo));
			System.out.println("miCarro en servlet: " + miCarro);
			for (Producto prod : miCarro.getContenido()) {
				System.out.println("prod1: " + prod);
			}
			
			// Redirigir a la página 'mostrarCarrito'.
			pagina = "/mostrarCarrito.jsp";
			break;
			
		case "7":
			// Sacar producto de carrito
			codigo = Integer.parseInt(request.getParameter("id"));
			
			// Tan sólo recuperar una sesión del usuario, pero sin crearla 
			miSession = request.getSession(false); // el false es para que no la cree
			//por defecto es true o vacío, y sí crearía la sesión.
			
			// Recuperar el objeto Carrito de su sesión
			miCarro = (Carrito) miSession.getAttribute("carrito");
			
			// Buscar el producto y añadirlo al carrito
			miCarro.sacarProducto(codigo);
			
			// Redirigir a la página 'mostrarCarrito'.
			pagina = "/mostrarCarrito.jsp";
			break;
		
		}
		
		// Refactor: sacando las cosas comunes del switch
		RequestDispatcher rd = request.getRequestDispatcher(pagina);
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
