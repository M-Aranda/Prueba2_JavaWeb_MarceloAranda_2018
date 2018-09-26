package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marce
 */
@WebServlet(name="PruebaServlet", urlPatterns={"/prueba.do"})
public class PruebaServlet extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        
        /*
        Estas lineas son necesarias si se quiere mostrar codigo html en el servlet,
        lo cual debiese hacerse solo para propositos de debugeo y desarrollo
        
        try (PrintWriter out=response.getWriter()){
            out.println("<h1>Mensaje de prueba</h1>");
        } catch (Exception e) {
        }
        */
          
              
            
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
