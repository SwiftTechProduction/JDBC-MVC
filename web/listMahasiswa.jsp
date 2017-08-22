<%-- 
    Document   : listMahasiswa
    Created on : Oct 31, 2016, 2:49:52 AM
    Author     : Lukas
--%>

<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Tugas_crud_672014094
        </title>
    </head>
    
    <body>
        <table border=1>
            <thead>
                <tr>
                    <th>
                        NIM
                    </th>
                    <th>
                        Nama
                    </th>
                    <th>
                        Fakultas
                    </th>
                    <th>
                        Jurusan
                    </th>
                    
                    <th colspan=2>
                        Action
                    </th>
                </tr>
            </thead>
            
            <tbody>
            
                <c:forEach items="${mahasiswa}" var="mahasiswa">
                    <tr>
                        <td><c:out value="${mahasiswa.nim}" /></td>
                        <td><c:out value="${mahasiswa.nama}" /></td>
                        <td><c:out value="${mahasiswa.fakultas}" /></td>
                        <!--<td><fmt:formatDate pattern="yyyy-MMM-dd" value="${user.dob}" /></td>-->
                        <td><c:out value="${mahasiswa.jurusan}" /></td>

                        <td>
                            <a href="ViewController?action=edit&nim=<c:out value="${mahasiswa.nim}" />
                                Update
                            </a>
                        </td>
                    
                        <td>
                            <a href="ViewController?action=delete&nim=<c:out value="${mahasiswa.nim}" />
                                Delete
                            </a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
                                
        <p><a href="ViewController?action=insert">Insert Mahasiswa</a></p>
    </body>
</html>
