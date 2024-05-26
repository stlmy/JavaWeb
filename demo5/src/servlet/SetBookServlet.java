package servlet;

import bean.BookBean;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SetBookServlet",value = "/SetBookServlet")
public class SetBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<BookBean> booklist = new ArrayList<>();
        booklist.add(new BookBean(1001,"JAVA程序设计","John",45.2f));
        booklist.add(new BookBean(1002,"JSP程序设计","Mary",55.2f));
        booklist.add(new BookBean(1003,"Java Web程序设计","Lily",65.2f));
        request.setAttribute("booklist",booklist);
        request.getRequestDispatcher("show.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
