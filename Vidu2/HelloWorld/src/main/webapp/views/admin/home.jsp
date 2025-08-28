<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Admin Home</title>
</head>
<body>
  <h2>Xin chào Quản trị viên, <c:out value="${sessionScope.account.fullName}"/>!</h2>
  <p>Tài khoản: <c:out value="${sessionScope.account.userName}"/></p>
  <p>Email: <c:out value="${sessionScope.account.email}"/></p>
  <p>Vai trò: <strong>Admin</strong></p>

  <p>
    <a href="${pageContext.request.contextPath}/logout">Đăng xuất</a>
  </p>
</body>
</html>
