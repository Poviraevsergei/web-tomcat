import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyFirstServlet extends HttpServlet {
    //1. Отработает при создании сервлет (при первом обращении)
    @Override
    public void init() {
        System.out.println("This is INIT method !");
    }

    //2. При каждом обращении к этому сервлету
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // выполнить это тут !
        super.service(req, resp);
        System.out.println("This is SERVICE method !");
    }

    //3. при удалении этого обьекта
    @Override
    public void destroy() {
        System.out.println("This is DESTROY method !");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

/*            //достать параметры из пути
            String nameFromURL = req.getParameter("name");*/

        String nameFromURL = req.getRequestURI();

        PrintWriter writer = resp.getWriter();
        writer.println("Hello " + nameFromURL);
        writer.close();
    }

    //TODO: scope, как возвращать HTML, Filter, Listener, как загружать на сервер файлы, HTML, CSS


}