<%-- 
    Document   : registroDeAutos
    Created on : 26-09-2018, 8:43:52
    Author     : maranda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de autos</h1>
        
        
        <form action="registrarAuto.do" method="post">
            <input type="text" name="patente" placeholder="Patente: " required>
            <br>
            <input type="text" name="marca" placeholder="Marca : " required>
            <br>
            <input type="number" name="anio" placeholder="Año:  " required>
            <br>
            <input type="text" name="detalles" placeholder="Detalles: " required>
            <br>
            <input type="text" name="run" placeholder="Rut: " required>
            <br>
            <input type="text" name="nombre" placeholder="Nombre Completo: " required>
            <br>
            <input type="text" name="telefono" placeholder="Telefono: " required>
            <br>
            <input type="submit" value="Registrar">
        </form>
        
        
        
        <a href="index.jsp">Volver</a>
    </body>
</html>
