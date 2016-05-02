/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Servlet;

import amm.progetto.Classi.FactoryUtenti;
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
@WebServlet(name = "Venditore", urlPatterns = {"/venditore.html"})
public class Venditore extends HttpServlet {
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
            session.getAttribute("loggedAsSeller") == null ||  
            !session.getAttribute("loggedAsSeller").equals(true)){
                //Se il login non è stato effettuato
                request.setAttribute("ErrMessage", "Login non effettuato");
        }
        else if(session.getAttribute("loggedIn").equals(true)){ 
                
                //Se login effettuato
                session.getAttribute("Venditore");
                if(request.getParameter("SubmitSeller") != null){
                    
                    String nome = request.getParameter("Name");
                    String id = Double.toString(Math.random()*1000);
                    String icona = request.getParameter("UrlImmagine");
                    String descrizione = request.getParameter("Descrizione");
                    String prezzo = request.getParameter("Prezzo");
                    
                    //Se tutti i campi sono stati riempiti
                    if(!"".equals(nome) && !"".equals(icona) && !"".equals(prezzo) && !"".equals(descrizione)){

                       request.setAttribute("Conferma", true);
                       request.setAttribute("Message", "Nuova App aggiunta");
                       request.setAttribute("icona", icona);
                       request.setAttribute("nome", nome);
                       request.setAttribute("prezzo", prezzo);
                       request.setAttribute("descrizione", descrizione);
                    }
                    //Se almeno un campo è vuoto
                    if("".equals(nome) || "".equals(icona) || "".equals(prezzo) || "".equals(descrizione)){
                        request.setAttribute("Conferma",  false);
                        request.setAttribute("ErrMessage", "Tutti i campi sono obbligatori");
                    }
                }
            }
        request.getRequestDispatcher("venditore.jsp").forward(request, response);
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
