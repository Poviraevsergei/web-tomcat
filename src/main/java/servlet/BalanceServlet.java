package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;

@WebServlet("/balance")
public class BalanceServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] names = {"Dima", "Toma", "Kiril", "Sergey", "Anton"};
        req.setAttribute("names", names);

        req.setAttribute("visible",req.getParameter("visible"));
        getServletContext().getRequestDispatcher("/pages/balance-page.jsp").forward(req, resp);
    }
}
