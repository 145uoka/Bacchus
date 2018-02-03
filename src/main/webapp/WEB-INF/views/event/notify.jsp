<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />
<script type="text/javascript">
  function notifyExec() {

    // 「OK」時の処理終了
    if (window.confirm('通知しますか？')) {
      document.form.submit();
    }
  }
</script>
</head>
<body>
  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/event/notify/exec" class="form-horizontal">

    <form:hidden path="eventNo"/>

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
          <table class="check_table table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">No</th>
                <th class="text-center">選択</th>
                <th class="text-center">氏名</th>
                <th class="text-center">ユーザー区分</th>
                <th class="text-center">LINE</th>
                <th class="text-center">直近通知日時</th>
              </tr>
            </thead>
            <c:forEach var="list" items="${userList}" varStatus="status">
              <tr>
                <td class="text-center"><c:out value="${status.count}" /></td>
                <td class="text-center"><c:choose>
                    <c:when test="${list.lineFlg == 1}">
                      <input type="checkbox" name="userIds" value="${list.userId}"/>
                    </c:when>
                    <c:otherwise>
                      <input type="checkbox" name="userIds" disabled />
                    </c:otherwise>
                  </c:choose></td>
                <td class="text-center"><c:out value="${list.lastName} ${list.firstName}" /></td>
                <td class="text-center"><c:out value="${list.userTypeName }" /></td>
                <td class="text-center"><c:choose>
                    <c:when test="${list.lineFlg == 1}">
                      <label class="control-label"><span class="label label-success">設定済</span></label>
                    </c:when>
                    <c:otherwise>
                      <label class="control-label"><span class="label label-danger">未設定</span></label>
                    </c:otherwise>
                  </c:choose></td>
                <td class="text-center"><c:choose>
                    <c:when test="${empty list.notifyDatetimeDisplay}">
                      <label class="control-label"><span class="label label-danger">未通知</span></label>
                    </c:when>
                    <c:otherwise>
                      <label class="control-label"><c:out value="${list.notifyDatetimeDisplay}" /></label>
                    </c:otherwise>
                  </c:choose></td>
              </tr>
            </c:forEach>
          </table>
        </div>
      </div>
      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
              <a type="button" class="btn btn-info" onClick="notifyExec()">通知</a>
            </tr>
          </table>
        </div>
      </div>
    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />
</body>
</html>