package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/my-first-servlet")
public class MainServlet extends HttpServlet {
    //1. Отработает при создании сервлет (при первом обращении)
    @Override
    public void init() {
        System.out.println("This is INIT method !");
    }

    //2. При каждом обращении к этому сервлету
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("This is SERVICE method !");
    }

    //3. при удалении этого обьекта
    @Override
    public void destroy() {
        System.out.println("This is DESTROY method !");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/page-answer-from-servlet.html").forward(req, resp);
    }
}