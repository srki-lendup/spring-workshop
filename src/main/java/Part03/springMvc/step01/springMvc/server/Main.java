package Part03.springMvc.step01.springMvc.server;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.IOException;

public class Main {

    private static final Integer PORT = 8080;

    public static void main( String[] args ) throws Exception {
        Server server = new Server(PORT);
        server.setHandler( getServletContextHandler( getContext() ) );
        server.start();
        server.join();

    }

    private static WebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("Part03.springMvc.step01.springMvc.config");
        return context;
    }

    private static ServletContextHandler getServletContextHandler( WebApplicationContext context) throws IOException {
        ServletContextHandler contextHandler = new ServletContextHandler();
        contextHandler.setErrorHandler(null);
        contextHandler.setContextPath("/");
        contextHandler.addServlet(new ServletHolder(new DispatcherServlet(context)), "/*");
        contextHandler.addEventListener(new ContextLoaderListener(context));
        return contextHandler;
    }

}
