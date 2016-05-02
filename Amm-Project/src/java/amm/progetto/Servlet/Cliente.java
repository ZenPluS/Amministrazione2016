/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Servlet;

import amm.progetto.Classi.FactoryOggetti;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zenpl
 */
@WebServlet(name = "Cliente", urlPatterns = {"/cliente.html"})
public class Cliente extends HttpServlet {

    Cliente(String username, String password, String nome, String cognome, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
   
        HttpSession session = request.getSession(false);
        
        if( session==null || 
            session.getAttribute("loggedIn") == null ||
            session.getAttribute("loggedIn").equals(false) || 
            session.getAttribute("loggedAsCustomer") == null ||  
            !session.getAttribute("loggedAsCustomer").equals(true) ){
            
                request.setAttribute("ErrMessage", "Login non effettuato");
        }
        else{
            request.setAttribute("OggettiList", FactoryOggetti.getOggettiList()); 
            session.getAttribute("Cliente");
            
            
            if(request.getParameter("idOggetto")!=null){
                
                Integer idOggetto = Integer.valueOf(request.getParameter("idOggetto"));
                
                request.setAttribute("id", idOggetto);
                request.setAttribute("Applicazione", FactoryOggetti.getInstance().getOggettotByID(idOggetto));
            }
            if(request.getParameter("ConfermaAcuisto") != null){
                request.setAttribute("ConfermaAcuistoCtrl", true);
                request.setAttribute("SiAcquisto", "Congratulazioni! Hai completato il tuo acquisto");
                request.setAttribute("NoAcquisto", "Ci dispiace, ma non hai abbastanza soldi per confermare il tuo acquisto");
            }
            else{
                request.setAttribute("ConfermaAcuistoCtrl", false);
                request.getAttribute("Applicazione");
            }
            request.getRequestDispatcher("cliente.jsp").forward(request, response);
            }
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
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
