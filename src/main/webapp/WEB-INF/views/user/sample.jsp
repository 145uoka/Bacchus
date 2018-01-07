<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />

</head>
<body>
  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/user/store" class="form-horizontal">

    <%-- コンテンツエリア --%>
    <div class="container">


      <%-- 画面タイトル --%>
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3>
            <c:out value="${displayTitle}" />
          </h3>
        </div>
      </div>

      <%-- メッセージ領域 --%>
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <%@include file="/WEB-INF/fragment/messages.jspf"%>
        </div>
      </div>

      <!-- テーブル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <table class="link_table table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">No</th>
                <th class="text-center">氏</th>
                <th class="text-center">名</th>
                <th class="text-center">Eメール</th>
                <th class="text-center">ユーザーID</th>
                <th class="text-center">パスワード</th>
              </tr>
            </thead>
          <c:forEach var="list" items="${userList}" varStatus="status">
              <tr ="${pageContext.request.contextPath}/user/edit?userId=${list.userId}">

                <td class="text-center"><c:out value="${status.count}"></c:out></td>
                /

                <td class="text-center"><c:out value="${list.lastName}" /></td>

                <td class="text-center"><c:out value="${list.firstName}"></c:out></td>

                <td class="text-center"><c:out value="${list.email}"></c:out></td>

                <td class="text-center"><c:out value="${list.userId}"></c:out></td>

                <td class="text-center"><c:out value="${list.password}"></c:out></td>
              </tr>
            </c:forEach>
          </table>
        </div>
        <div>あいうえお</div>
      </div>
    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />
</body>
</html>