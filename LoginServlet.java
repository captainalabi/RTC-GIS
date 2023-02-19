/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.startcollabo.rtc_gis_data_system;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author ALABI
 */
//@WebServlet(urlPatterns={"/LoginServlet"})
public class LoginServlet extends HttpServlet {


    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userName = request.getParameter("uName");
        String passWord = request.getParameter("pWord");

        String defaultUname = "defaultUname";
        String defaultPw = "defaultPw";

        String successMessage = "";

        if(userName.equals(defaultUname) && passWord.equals(defaultPw) ){

        successMessage = "You are welcome onboard";
        }else{
        successMessage = "Your username or password or both are incorrect ";
        }

        request.setAttribute("successMessage", successMessage);
        request.getRequestDispatcher("log-in-page.jsp").forward(request,response);


        //PrintWriter out = response.getWriter();
        //out.print("good morning");
    }


    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "to receive login parameters from index and return success or failure "
                + "message";
    }// </editor-fold>

}
