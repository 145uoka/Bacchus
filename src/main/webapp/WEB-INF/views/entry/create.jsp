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
  <form:form modelAttribute="form" name="form" action="${pageContext.request.contextPath}/entry/store" method="post" class="form-horizontal">

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

      <form:hidden path="eventNo" />
      <form:hidden path="userId" />

      <!-- テーブル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <%@include file="/WEB-INF/views/common/eventDetailTable.jsp"%>
        </div>
      </div>

      <!-- テーブル -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <table class="check_table table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">No</th>
                <th class="text-center">候補日時</th>
                <th class="text-center">参加可否</th>
              </tr>
            </thead>
            <c:forEach var="list" items="${form.entryFormList}" varStatus="status">
              <tr>
                <td class="text-center"><c:out value="${status.count}" /></td>
                <td><c:out value="${list.startDate}" /> <c:if test="${!empty list.startTime}">
                    <c:out value="${list.startTime}" />
                  </c:if></td>
                <td><form:select path="entryFormList[${status.index}].entryDiv" class="form-control" items="${entrySelectList}" itemLabel="label" itemValue="value" /></td>
              </tr>
              <form:hidden path="entryFormList[${status.index}].candidateNo" />
            </c:forEach>
          </table>
        </div>
      </div>

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
                <button type="submit" class="btn btn-warning">更新</button>
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
