
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO DE PRODUCTOS</h1>
        <form action="ProcesoServlet" method="Post">
            <label> Producto</label>
            <input type="text" name="producto" value="">
            <br><br>
            <label>Categoria </label>
             <select name="categoria">
                <option value="seleccione una:"> </option>
                <option value="proteinicos"> Proteinicos</option>
                <option value="alimenticios"> Alimenticios</option>
                <option value="lacteos"> Lacteos</option>
                 <option value="confiteria"> Confiteria</option>
                
            </select>
            <br><br>
            <label> Existencia </label>
            <input type="date" name="existencia" value="">
            <br><br>
            <label> precio </label>
            <input type="text" name="precio" value="">
            <br><br>

            <input type="submit"  value=" Enviar" > 
            
        </form>
    </body>
</html>
