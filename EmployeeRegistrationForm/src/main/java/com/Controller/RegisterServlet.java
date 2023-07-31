package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.registerDao;
import com.Dao.registerDaoImpl;
import com.register.register;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public RegisterServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        String fName = request.getParameter("fName");
        String lName = request.getParameter("lName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        register r = new register(fName, lName, email, password);
        List<register> lst = new ArrayList<register>();
        lst.add(r);
        registerDao rdao = new registerDaoImpl();
        int i = rdao.create(lst);
        HttpSession session = request.getSession();
       
        if (i > 0) {
        	
            pw.println("<h1>Registration Complete</h1>");
       
        } else {
            pw.println("Not register");
        }
    }
}
