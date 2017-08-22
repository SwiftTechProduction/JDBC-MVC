<%-- 
    Document   : insert
    Created on : Oct 31, 2016, 3:07:59 AM
    Author     : Lukas
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
        <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>
        <title>Tugas Pemrograman Lanjut 672014094</title>
    </head>
    <body>
        <script>
            
        </script>

        <form method="POST" action='ViewController' name="frmAddUser">
            NIM : <input type="text" name="nim"
                value="<c:out value="${mahasiswa.nim}" />" /> <br /> 
            Nama : <input
                type="text" name="nama"
                value="<c:out value="${mahasiswa.nama}" />" /> <br /> 
            Fakultas : <input
                type="text" name="fakultas"
                value="<c:out value="${mahasiswa.fakultas}" />" /> <br /> 
            
            Jurusan : <input type="text" name="jurusan"
                value="<c:out value="${mahasiswa.jurusan}" />" /> <br /> 
            <input type="submit" value="Submit" />
        </form>
    </body>
</html>
