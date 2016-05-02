/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Servlet;

import amm.progetto.Classi.Cliente;
import amm.progetto.Classi.FactoryUtenti;
import amm.progetto.Classi.Utente;
import amm.progetto.Classi.Venditore;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "Login", urlPatterns = {"/login.html"})
public class Login extends HttpServlet {

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
   
        //CREAZIONE SESSIONE
        HttpSession session = request.getSession(true); 
        
        //Se non sono loggato:
        if(session==null || session.getAttribute("loggedIn") == null || session.getAttribute("loggedIn").equals(false)){
            if(request.getParameter("Submit") != null){
                
                String nickname = request.getParameter("Username");
                String password = request.getParameter("Password");

                ArrayList<Utente> userList = FactoryUtenti.getInstance().getUserList();

                for(Utente u : userList){
                    if(u.getNickname().equals(nickname) && u.getPassword().equals(password )){   
                        session.setAttribute("loggedAsUtente", true);
                        session.setAttribute("id", u.getId());
                        
                        if(u instanceof Venditore){
                            session.setAttribute("Venditore", u);
                            session.setAttribute("loggedAsVenditore", true);
                            request.getRequestDispatcher("venditore.jsp").forward(request, response);
                            
                        }
                        else if(u instanceof Cliente){
                                request.setAttribute("objectLighter", FactoryUtenti.getInstance().getOggettiList()); 
                                session.setAttribute("Cliente", u);
                                session.setAttribute("loggedAsCliente", true);
                                request.getRequestDispatcher("cliente.jsp").forward(request, response);  
                            }                    
                    }
                    if(!u.getNickname().equals(nickname) && !u.getPassword().equals(password)) 
                        request.setAttribute("ErrMessage", "Credenziali non valide");

                    if("".equals(nickname) && "".equals(password)) 
                        request.setAttribute("ErrMessage", "Campi credenziali non completi");
                }
            }
        }
        request.getRequestDispatcher("login.jsp").forward(request, response);
        
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
