package servlet;
import bean.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        if(session == null || session.getAttribute("cart")==null){
            out.write("对不起！您还没有购买任何商品！<br>");
        } else {
            List<Book> cart = (List<Book>) session.getAttribute("cart");
            if(cart.isEmpty()) {
                out.write("对不起！您还没有购买任何商品！<br>");
            } else {
                out.write("您购买的图书有：<br>");
                for (Book book : cart) {
                    out.write(book.getName() + "<br>");
                    out.write(book.getNum() + "<br>");
                }
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
