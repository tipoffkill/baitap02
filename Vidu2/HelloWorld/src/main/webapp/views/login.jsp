<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Đăng nhập</title>
</head>
<body>
  <h2>Đăng nhập</h2>

  <c:if test="${alert != null}">
    <p style="color:red;"><c:out value="${alert}"/></p>
  </c:if>

  <form action="${pageContext.request.contextPath}/login" method="post">
    <p>
      <label>Tài khoản:</label>
      <input type="text" name="username" required>
    </p>
    <p>
      <label>Mật khẩu:</label>
      <input type="password" name="password" required>
    </p>
    <p>
      <label><input type="checkbox" name="remember"> Ghi nhớ tôi</label>
    </p>
    <p>
      <button type="submit">Đăng nhập</button>
    </p>

  
    <p>
      Chưa có tài khoản?
      <a href="${pageContext.request.contextPath}/register">Đăng ký ngay</a>
    </p>
    <!-- <<< -->
  </form>
</body>
</html>
