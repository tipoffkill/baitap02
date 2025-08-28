package webanime.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import webanime.utils.Constant;

@WebServlet(urlPatterns = "/logout")
public class LogoutController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    HttpSession session = req.getSession(false);
    if (session != null) session.invalidate();

    // Xóa cookie remember nếu có
    Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, "");
    cookie.setMaxAge(0);
    cookie.setPath(req.getContextPath());
    resp.addCookie(cookie);

    resp.sendRedirect(req.getContextPath() + "/login");
  }
}
