<%-- 
    Document   : index
    Created on : 25-Oct-2016, 11:28:18
    Author     : Lukas
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tugas Pemrograman Lanjut 672014094</title>
    </head>
    <body>
        <jsp:forward page="/ViewController?action=listMahasiswa" />
    </body>
</html>
