
package com.emergente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesoServlet", urlPatterns = {"/ProcesoServlet"})
public class ProcesoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String producto=request.getParameter("producto");
        String categoria=request.getParameter("categoria");
        String existencia=request.getParameter("existencia");
        String precio=request.getParameter("precio");
        
       Producto proc = new Producto();
        
       proc.setProducto(producto);
       proc.setCategoria(categoria);
       proc.setExistencia(existencia);
       proc.setPrecio(precio);
        

        request.setAttribute("producto",proc);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
        
        
        
    }

  

}
