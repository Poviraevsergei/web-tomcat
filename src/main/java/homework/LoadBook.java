package homework;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

@WebServlet("/download")
public class LoadBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain"); //txt format

        String bookName = req.getParameter("book-name");

        resp.setHeader("Content-Disposition", "attachment; filename=\"" + bookName + ".txt\"");
        try {
            OutputStream outputStream = resp.getOutputStream();
            //тут смотрим что за книга, ищем на диске FileReader FileWriter
            //если есть такой файл тогда вычитываем в outputResult переменную
            String outputResult = "This is Test";
            outputStream.write(outputResult.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
