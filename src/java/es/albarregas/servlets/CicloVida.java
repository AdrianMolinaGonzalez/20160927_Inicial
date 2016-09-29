/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adrián
 */
@WebServlet(name = "CicloVida", urlPatterns = {"/ciclo"})
public class CicloVida extends HttpServlet {

   
    
public void init(ServletConfig config){
  
   
    
}
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();   
         out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Par&aacute;metros</title>");             
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Par&aacute;metros</h1>");
            java.util.Enumeration<String> parametros = request.getParameterNames();
            while(parametros.hasMoreElements())
            {
                String elemento=parametros.nextElement();
                String valor= request.getParameter(elemento);
                out.println(elemento + " - " + valor + "<br/>");
            }
          
            out.println("</body>");
            out.println("</html>");
    }

 public void destroy()
 {
      System.out.println("destroy()");
 }

}
