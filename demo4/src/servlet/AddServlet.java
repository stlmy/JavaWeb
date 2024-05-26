package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddServlet", value = "/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String sn1 = request.getParameter("num1");
        String sn2 = request.getParameter("num2");
        int num1 = Integer.parseInt(sn1);
        int num2 = Integer.parseInt(sn2);
        int total = 0;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            total += i;
        }
        request.setAttribute("total",total);
        request.getRequestDispatcher("ShowResultServlet.jsp").forward(request,response);
    }
}
