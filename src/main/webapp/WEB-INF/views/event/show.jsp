<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
</head>

<body>

  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" name="form" action="${pageContext.request.contextPath}/entry/create" method="get" class="form-horizontal">

    <form:hidden path="eventNo" />
    <form:hidden path="userId" />

    <div class="container">

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3>
            <c:out value="${displayTitle}" />
          </h3>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <%@include file="/WEB-INF/fragment/messages.jspf"%>
        </div>
      </div>

      <!-- テーブル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <%@include file="/WEB-INF/views/common/eventDetailTable.jsp"%>
        </div>
      </div>

      <!-- テーブル -->

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
                <button type="submit" class="btn btn-warning">参加可否更新</button>
              </td>
              <td><label class="space" style="width: 30px;"></label></td>
                  <td style="vertical-align: middle;">
                    <button type="button" class="btn btn-info" id="delete">通知</button>
                  </td>
            </tr>
          </table>
        </div>
      </div>
    </div>
    <div></div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />
</body>
</html>
