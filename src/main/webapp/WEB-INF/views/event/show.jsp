<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />

<script type="text/javascript">
	function deleteConfirmation() {

		// 「OK」時の処理終了
		if (window.confirm('削除しますか？')) {
			document.form.action = "${pageContext.request.contextPath}/event/delete";
			document.form.submit();

		}

	}
</script>
</head>

<body>

  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" name="form" action="${pageContext.request.contextPath}/entry/create" method="get" class="form-horizontal">

    <form:hidden path="eventNo" />

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

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <c:if test="${not empty candidateDtoList}">
                <td style="vertical-align: middle;"><a class="btn btn-add" href="${pageContext.request.contextPath}/entry/create?eventNo=${form.eventNo}"
                  role="button">参加可否更新</a></td>
                <td><label class="space" style="width: 30px;"></label></td>
                <td style="vertical-align: middle;"><a class="btn btn-info" href="${pageContext.request.contextPath}/event/notify?eventNo=${form.eventNo}" role="button">通知</a></td>
                <td><label class="space" style="width: 30px;"></label></td>
              </c:if>
              <td style="vertical-align: middle;"><a type="button" class="btn btn-edit" href="${pageContext.request.contextPath}/event/edit?eventNo=${form.eventNo}" role="button">編集</a></td>
              <td><label class="space" style="width: 30px;"></label></td>
              <td style="vertical-align: middle;"><a type="button" class="btn btn-danger" onClick="deleteConfirmation()">削除</a></td>
            </tr>
          </table>
        </div>
      </div>

      <!-- テーブル -->
      <c:if test="${not empty candidateDtoList}">
        <div class="row">
          <div class="col-md-offset-1 col-md-10">
            <c:choose>
              <c:when test="${userInfo.adminFlg}">
                <table class="link_table table table-striped table-bordered table-hover table-condensed">
                  </c:when>
                  <c:otherwise>
                    <table class="table table-striped table-bordered table-hover table-condensed">
                      </c:otherwise>
                      </c:choose>
                      <thead class="main-background-color">
                        <tr>
                          <th class="text-center">No</th>
                          <th class="text-center">名前</th>
                          <th class="text-center">LINEユーザ名</th>
                          <c:forEach var="list" items="${candidateDtoList}" varStatus="status">
                            <th class="text-center"><c:out value="${list.eventStartDatetimeDisplay}" /></th>
                          </c:forEach>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td class="text-center" colspan="3">参加者数</td>
                          <c:forEach var="entrySummary" items="${entrySummaryList}" varStatus="status">
                            <td class="text-center"><c:out value="${entrySummary}" /></td>
                          </c:forEach>
                        </tr>
                        <c:forEach var="list" items="${entryDispListDtoList}" varStatus="status">
                          <c:choose>
                            <c:when test="${userInfo.adminFlg}">
                              <tr data-href="${pageContext.request.contextPath}/entry/create?eventNo=${form.eventNo}&userId=${list.userId}">
                            </c:when>
                            <c:otherwise>
                              <tr>
                            </c:otherwise>
                          </c:choose>
                          <td class="text-center"><c:out value="${status.count}" /></td>
                          <td><c:out value="${list.lastName} ${list.firstName}" /></td>
                          <c:choose>
                              <c:when test="${!empty list.lineUserName}">
                                <td><c:out value="${list.lineUserName}" /></td>
                              </c:when>
                              <c:otherwise>
                                <td class="text-center"><c:out value="-" /></td>
                              </c:otherwise>
                            </c:choose>
                          <c:forEach var="entryDtoList" items="${list.entryDtoList}" varStatus="status">
                            <td class="text-center"><c:choose>
                                <c:when test="${entryDtoList.entryDiv == 1}">
                                  <span class="label label-info" style="margin-left: 10px"> <c:out value="${entryDtoList.entryDivDisp}" />
                                  </span>
                                </c:when>
                                <c:when test="${entryDtoList.entryDiv == 2}">
                                  <span class="label label-danger" style="margin-left: 10px"> <c:out value="${entryDtoList.entryDivDisp}" />
                                  </span>
                                </c:when>
                                <c:otherwise>
                                  <span class="label label-warning" style="margin-left: 10px"> <c:out value="${entryDtoList.entryDivDisp}" />
                                  </span>
                                </c:otherwise>
                              </c:choose></td>
                          </c:forEach>
                          <!-- </tr>  -->
                        </c:forEach>
                      </tbody>
                    </table>
                </table>
          </div>
        </div>
      </c:if>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />

</body>
</html>
