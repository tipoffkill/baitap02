<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Đăng ký</title>
</head>
<body>
  <h2>Tạo tài khoản mới</h2>

  <c:if test="${alert != null}">
    <p style="color:red;"><c:out value="${alert}"/></p>
  </c:if>

  <form action="${pageContext.request.contextPath}/register" method="post">
    <p>
      <label>Tài khoản:</label>
      <input type="text" name="username" required>
    </p>
    <p>
      <label>Mật khẩu:</label>
      <input type="password" name="password" required>
    </p>
    <p>
      <label>Email:</label>
      <input type="email" name="email" required>
    </p>
    <p>
      <label>Họ tên:</label>
      <input type="text" name="fullname" required>
    </p>
    <p>
      <label>Số điện thoại:</label>
      <input type="text" name="phone">
    </p>
    <p>
      <button type="submit">Đăng ký</button>
    </p>
    <p>
      Đã có tài khoản?
      <a href="${pageContext.request.contextPath}/login">Đăng nhập ngay</a>
    </p>
  </form>
</body>
</html>
