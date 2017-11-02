<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="common/common.jsp" />
</head>
<body>
  <jsp:include page="common/header.jsp" />
  <form id="form" accept-charset="UTF-8" action="${pageContext.request.contextPath}/login" method="get">
    <div class="container">
      <!-- コンテンツエリア -->
      <div class="container">
        <div class="container-main">
          <div class="row">
            <div class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" align="center">
              <%@include file="/WEB-INF/fragment/messages.jspf"%>
              <c:out value="${message}" />
            </div>
          </div>
        </div>
      </div>
    </div>
  </form>
  <jsp:include page="common/footer.jsp" />
</body>
</html>