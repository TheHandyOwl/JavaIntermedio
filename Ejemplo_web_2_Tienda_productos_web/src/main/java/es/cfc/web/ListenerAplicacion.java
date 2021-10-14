package es.cfc.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerAplicacion
 *
 */
@WebListener
public class ListenerAplicacion implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerAplicacion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // Acceder al contexto de la aplicación
    	ServletContext ctxApp = sce.getServletContext();
    	String mensaje = ctxApp.getInitParameter("sinIVA");
    	ctxApp.setAttribute("msgSinIVA", mensaje);
    	System.out.println("---------- Contexto de la aplicación creado ----------");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  {
    	System.out.println("---------- Contexto de la aplicación destruido ----------");
    }
	
}
