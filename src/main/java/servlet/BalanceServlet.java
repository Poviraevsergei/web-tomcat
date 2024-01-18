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
    HashMap<String, Integer> balance = new HashMap<>();

    @Override
    public void init() throws ServletException {
        balance.put("Maxim", 15);
        balance.put("Polina", 20);
        balance.put("Vadim", 30);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        req.setAttribute("name",name);
        req.setAttribute("money",balance.get(name));

        getServletContext().getRequestDispatcher("/pages/balance-page.jsp").forward(req, resp);
    }
}
