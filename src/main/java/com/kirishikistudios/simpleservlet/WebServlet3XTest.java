package com.kirishikistudios.simpleservlet;

/**
 * User: a12353
 * Date: 2014/04/29
 * Time: 18:12
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="WebServlet3XTest",urlPatterns={"/simpleservlet"})
public class WebServlet3XTest extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().print("it is Servlet 3.0. ");
    }
}
