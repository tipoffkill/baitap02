package webanime.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/home")
public class HomeController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
  }
}
