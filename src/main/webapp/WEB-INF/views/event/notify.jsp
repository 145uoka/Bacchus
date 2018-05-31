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
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/event/notify/${form.eventNo}/exec" class="form-horizontal">

    <form:hidden path="eventNo" />

    <%-- コンテンツエリア --%>
    <div class="container">

      <%-- ボタン  --%>
      <div class="row">
        <div align="left">
          <table style="margin-bottom: 10px">
            <tr>
              <td style="vertical-align: middle;"><a href="${pageContext.request.contextPath}/event/show/${form.eventNo}" type="button" class="btn btn-warning"> <i
                  class="glyphicon glyphicon-chevron-left"></i>&nbsp;戻る
              </a></td>
            </tr>
          </table>
        </div>
      </div>

      <%-- 画面タイトル --%>
      <div class="row">
        <h3>
          <c:out value="${displayTitle}" />
        </h3>
      </div>

      <%-- メッセージ領域 --%>
      <div class="row">
        <%@include file="/WEB-INF/fragment/messages.jspf"%>
      </div>


      <div class="row">
        <table class="table table-striped table-bordered table-hover table-condensed">
          <tr>
            <th class="main-background-color col-md-3 text-center">イベント名</th>
            <td class="text-center col-md-9"><c:out value="${eventDto.eventName}" /></td>
          </tr>
          <tr>
            <th class="main-background-color col-md-3 text-center">イベント区分</th>
            <td class="text-center col-md-9"><c:out value="${eventDto.eventTypeDto.eventTypeName}" /></td>
          </tr>
          <tr>
            <th class="main-background-color col-md-3 text-center">場所</th>
            <td class="text-center col-md-9"><c:out value="${eventDto.eventPlace}" /></td>
          </tr>
        </table>
      </div>

      <!-- ボタン -->
      <div class="row">
        <div align="left">
          <table style="margin-bottom: 10px">
            <tr>
              <c:choose>
                <c:when test="${empty candidateDtoList}">
                  <td style="vertical-align: middle;"><a type="button" class="btn btn-success disabled" id="allCheck"><i class="glyphicon glyphicon-check"></i>&nbsp;全選択</a></td>
                  <td><label class="space" style="width: 30px;"></label></td>
                  <td style="vertical-align: middle;"><a type="button" class="btn btn-danger disabled" id="allUnCheck"><i class="glyphicon glyphicon-unchecked"></i>&nbsp;全解除</a></td>
                </c:when>
                <c:otherwise>
                  <td style="vertical-align: middle;"><a type="button" class="btn btn-success" id="allCheck"><i class="glyphicon glyphicon-check"></i>&nbsp;全選択</a></td>
                  <td><label class="space" style="width: 30px;"></label></td>
                  <td style="vertical-align: middle;"><a type="button" class="btn btn-danger" id="allUnCheck"><i class="glyphicon glyphicon-unchecked"></i>&nbsp;全解除</a></td>
                </c:otherwise>
              </c:choose>
            </tr>
          </table>
        </div>
      </div>

      <!-- テーブル -->
      <div class="row">
        <table class="check_table table table-striped table-bordered table-hover table-condensed">
          <thead class="main-background-color">
            <tr>
              <th class="text-center">No</th>
              <th class="text-center">選択</th>
              <th class="text-center">氏名</th>
              <th class="text-center">ユーザー区分</th>
              <th class="text-center">直近通知日時</th>
            </tr>
          </thead>
          <c:forEach var="list" items="${userList}" varStatus="status">
            <tr>
              <td class="text-center"><c:out value="${status.count}" /></td>
              <td class="text-center"><input type="checkbox" name="userIds" value="${list.userId}" /></td>
              <td class="text-center"><c:out value="${list.lastName} ${list.firstName}" /></td>
              <td class="text-center"><c:out value="${list.userTypeName }" /></td>
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

      <!-- ボタン -->
      <div class="row">
        <div align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
                <c:choose>
                  <c:when test="${empty candidateDtoList}">
                    <a type="button" class="btn btn-info disabled" onClick="notifyExec()">通知</a>
                  </c:when>
                  <c:otherwise>
                    <a type="button" class="btn btn-info" onClick="notifyExec()">通知</a>
                  </c:otherwise>
                </c:choose>
              </td>
            </tr>
          </table>
        </div>
      </div>
    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">
      function notifyExec() {

          if ($("input[name=userIds]:checked").size() <= 0) {
              window.alert("送信対象のユーザが選択されていません。");
              return;
          }

          // 「OK」時の処理終了
          if (window.confirm('通知しますか？')) {
              document.form.submit();
          }
      }

      $('#allCheck').on('click', function() {
          $('input[name=userIds]').prop('checked', true);
      });
      $('#allUnCheck').on('click', function() {
          $('input[name=userIds]').prop('checked', false);
      });
  </script>
</body>
</html>