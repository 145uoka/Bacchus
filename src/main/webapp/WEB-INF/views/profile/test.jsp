<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
</head>

<body>

  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" action="${pageContext.request.contextPath}/profile/edit/update" method="post" class="form-horizontal">

    <div class="container">

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3><c:out value="${displayTitle}" /></h3>
        </div>
      </div>

      <%@include file="/WEB-INF/fragment/messages.jspf"%>

      <!-- テーブル -->
      <c:out value="${msg}" />
      

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
                <button type="submit" class="btn btn-warning" id="modify">更新</button>
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
