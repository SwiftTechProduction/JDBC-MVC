/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MahasiswaCtl;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mahasiswa;

/**
 *
 * @author Lukas
 */
@WebServlet(name = "ViewController", urlPatterns = {"/ViewController"})
public class ViewController extends HttpServlet 
{
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/insert.jsp";
    private static String LIST_MAHASISWA = "/listMahasiswa.jsp";
    private MahasiswaCtl dao;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public ViewController() 
    {
        super();
        dao = new MahasiswaCtl();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        String forward ="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete"))
        {
            String nim = request.getParameter("nim");
            dao.deleteMahasiswa(nim);
            forward = LIST_MAHASISWA;
            request.setAttribute("mahasiswa", dao.getAllMahasiswa());    
        } 
        else if (action.equalsIgnoreCase("edit"))
        {
            forward = INSERT_OR_EDIT;
         
            String nim = request.getParameter("nim");
            Mahasiswa mahasiswa = dao.getMahasiswaByNim("nim");
            request.setAttribute("mahasiswa", mahasiswa);
        } 
        else if (action.equalsIgnoreCase("listMahasiswa"))
        {
            forward = LIST_MAHASISWA;
            request.setAttribute("mahasiswa", dao.getAllMahasiswa());
        } 
        else 
        {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim(request.getParameter("nim"));
        mahasiswa.setNama(request.getParameter("nama"));
        mahasiswa.setFakultas(request.getParameter("fakultas"));
        mahasiswa.setJurusan(request.getParameter("jurusan"));
//        try {
//            Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("dob"));
//            user.setDob(dob);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        //user.setEmail(request.getParameter("email"));
        String nim = request.getParameter("nim");
        if(nim == null || nim.isEmpty())
        {
            dao.insertMahasiswa(nim);
        }
        else
        {
            mahasiswa.setNim(nim);
            dao.updateMahasiswa(mahasiswa);
        }
        RequestDispatcher view = request.getRequestDispatcher(LIST_MAHASISWA);
        request.setAttribute("mahasiswa", dao.getAllMahasiswa());
        view.forward(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error oc curs
     */
    
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
