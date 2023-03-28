package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="inputController", urlPatterns = "/org/zerock/w1/calc/input")
public class InputCountroller extends HttpServlet {
    @Override //doGet()은 Get방식을 사용하기 위해서 사용
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("InputController...doGet...");
        //RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input_get.jsp"); // 요청을 다른 쪽으로 전달 및 배포
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input_post.jsp"); // 요청을 다른 쪽으로 전달 및 배포
        dispatcher.forward(req,resp);
    }

} // end of class
