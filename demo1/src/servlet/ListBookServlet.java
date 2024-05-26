package servlet;

import bean.Book;
import bean.BookDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

@WebServlet(urlPatterns = "/ListBookServlet")
public class ListBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        Collection<Book> books = BookDB.getAll();
        out.write("本站提供的图书有：<br>");
        for(Book book : books) {
            String url = request.getContextPath() + "/PurchaseServlet?id=" + book.getId();
            String newUrl = response.encodeRedirectURL(url);
            out.write(book.getName() + "<a href=' " + newUrl + " '>点击购买</a><br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
