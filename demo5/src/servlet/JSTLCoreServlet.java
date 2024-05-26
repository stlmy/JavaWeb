package servlet;

import bean.Order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "JSTLCoreServlet",value = "/JSTLCoreServlet")
public class JSTLCoreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Order> orderList = new ArrayList<>();

        Order order1 = new Order();
        order1.setId("001");
        order1.setAddress("北京");
        order1.setPhone("13125647895");

        Order order2 = new Order();
        order2.setId("002");
        order2.setAddress("上海");
        order2.setPhone("13325647896");

        orderList.add(order1);
        orderList.add(order2);

        request.setAttribute("username","张三");
        request.setAttribute("orders",orderList);
        request.getRequestDispatcher("JSTLCore.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
