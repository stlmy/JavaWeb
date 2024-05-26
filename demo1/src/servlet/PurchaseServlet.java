package servlet;

import bean.Book;
import bean.BookDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");

        if(id==null) {
            String url = request.getContextPath() + "/ListBookServlet";
            response.sendRedirect(url);
            return;
        }
        Book book = BookDB.getBook(id);


        HttpSession session = request.getSession();
        List<Book> cart = (List) session.getAttribute("cart");
        boolean bookInCart = false;
        if(cart == null) {
            cart = new ArrayList<Book>();
            cart.add(book);
        } else {
            for (Book b : cart) {
                if( b.getId().equals(id)) {
                    b.setNum(b.getNum() + 1);
                    bookInCart = true;
                    break;
                }
            }
            if (!bookInCart) {
                cart.add(book);
            }
        }
        session.setAttribute("cart",cart);
        String url = request.getContextPath() + "/CartServlet";
        String newurl = response.encodeRedirectURL(url);
        response.sendRedirect(newurl);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
