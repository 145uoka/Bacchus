<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="common/common.jsp" />
<link href='<c:url value="/resources/css/common/button.css"/>' rel="stylesheet">
</head>
<body>
  <jsp:include page="common/header.jsp" />
  <form:form modelAttribute="form" action="${pageContext.request.contextPath}/login" method="post" class="form-horizontal">
    <div class="container">
      <!-- コンテンツエリア -->
      <%-- メッセージ領域 --%>
      <div class="row">
         <div class="col-lg-8 col-lg-offset-2 col-md-8 col-md-offset-2 col-sm-8 col-sm-offset-2 col-xs-8 col-xs-offset-2">
          <%@include file="/WEB-INF/fragment/messages.jspf"%>
        </div>
      </div>

      <div class="row">
        <div class="col-lg-4 col-lg-offset-4 col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2" align="center">
          <a class="btn-line-login" href="${pageContext.request.contextPath}/login/lineLogin"></a>
        </div>
      </div>
    </div>
  </form:form>
  <jsp:include page="common/footer.jsp" />
</body>
</html>