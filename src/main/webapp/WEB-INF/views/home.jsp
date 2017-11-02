<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />
</head>
<body>

  <jsp:include page="/WEB-INF/views/common/header.jsp" />

  <%-- コンテンツエリア --%>
  <div class="container">

    <div class="row">
      <div class="col-md-offset-2 col-md-8">
        <h3>
          <c:out value="${displayTitle}" />
        </h3>
      </div>
    </div>
  </div>

  <jsp:include page="/WEB-INF/views/common/footer.jsp" />


</body>
</html>
