<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />

<script type="text/javascript">
	function deleteConfirmation() {


		if (window.confirm('削除しますか？')) {

			document.form.action = "${pageContext.request.contextPath}/user/delete"

			document.form.submit();

		}
	}

	function accountUpdate(){
	     console.log('更新押下')
	     document.form.action = "${pageContext.request.contextPath}/user/update"

	         document.form.submit();
	}
	</script>

<script type="text/javascript">

    /*ログインID、パスワードの入力項目初期表示 (チェック：入力可、チェックなし：入力不可) */
	$(document).ready(function() {
		var loginCheck = document.getElementById('loginCheck');
		var loginCheckResult = loginCheck.checked;
		var loginId = document.getElementById('loginId');

		var passwardCheck = document.getElementById('passwardCheck');
		var passwardCheckResult = passwardCheck.checked;
		var firstPassward = document.getElementById('firstPassward');
		var confirmPassword = document.getElementById('confirmPassword');

		if (loginCheckResult) {
			loginId.disabled = false;
		} else {
			loginId.disabled = true;
		}

		if (passwardCheckResult) {
			firstPassward.disabled = false;
			confirmPassword.disabled = false;
		} else {
			firstPassward.disabled = true;
			confirmPassword.disabled = true;
		}

	});

	/*ログインID入力項目の切り替え*/
	function switchDisabledLoginId() {
		if ($('#loginCheck').prop('checked')) {
			$('#loginId').prop('disabled', false);

		} else {
			$('#loginId').prop('disabled', true);
		}
	}

	/*パスワードの入力項目の切り替え*/
	function switchDisabledPassward() {
		if ($('#passwardCheck').prop('checked')) {
			$('#firstPassward').prop('disabled', false);
			$('#confirmPassword').prop('disabled', false);

		} else {
			$('#firstPassward').prop('disabled', true);
			$('#confirmPassword').prop('disabled', true);
		}
	}
</script>
</head>

<body>

	<jsp:include page="../common/header.jsp" />
	<form:form modelAttribute="form" method="post" name="form"
		action="${pageContext.request.contextPath}/user/update"
		class="form-horizontal">


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
	<div class="row">
        <div class="col-md-offset-1 col-md-10">
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">

              <div class="form-group">
                <label class="col-md-4 control-label">LINE 設定</label>
                <c:choose>
                  <c:when test="${userTDto.lineFlg == 1}">
                    <div class="col-md-6">
                      <label class="control-label"><span class="label label-success">設定済</span></label>
                    </div>
                  </c:when>
                  <c:otherwise>
                    <div class="col-md-6 text-left">
                      <label class="control-label"><span class="label label-danger">未設定</span></label>
                    </div>
                  </c:otherwise>
                </c:choose>
              </div>
              <div class="form-group">
                <label class="col-md-4 control-label">LINE ユーザ名</label>
                <div class="col-md-6">
                  <form:input path="lineUserName" class="form-control" disabled="true" />
                </div>
              </div>
              <div class="form-group <ext:isErrors path='firstName' value='has-error'/> <ext:isErrors path='lastName' value='has-error'/>">
                <label class="col-md-4 control-label">氏名<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-3">
                  <%-- <form:input path="lastName" class="form-control" maxlength="${ext:getMaxLen('CNT0001') }" placeholder="氏"/> --%>
                  <form:input path="lastName" value="${userTDto.lastName}" class="form-control" maxlength="${ext:getMaxLen('CNT0001') }" placeholder="氏"/>
                </div>
                <div class="col-md-3">
                  <%-- <form:input path="firstName" class="form-control" maxlength="${ext:getMaxLen('CNT0001') }" placeholder="名"/> --%>
                  <form:input path="firstName" value="${userTDto.firstName}" class="form-control" maxlength="${ext:getMaxLen('CNT0001') }" placeholder="名"/>
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-3">
                    <form:errors path="lastName" element="div" cssClass="text-danger" />
                  </div>
                  <div class="col-md-3">
                    <form:errors path="firstName" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='authLevel' value='has-error' />">
                <label class="col-md-4 control-label">権限レベル<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-6">
                  <form:select path="authLevel" class="form-control" items="${authList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="authLevel" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='userTypeId' value='has-error'/>">
                <label class="col-md-4 control-label">ユーザー区分<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-6">
                  <form:select path="userTypeId" class="form-control" items="${userTypeSelectList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="userTypeId" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
            <%--
              <div class="form-group <ext:isErrors path='userName' value='has-error'/>">
                <label class="col-md-4 control-label">ユーザー名<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-6">
                  <form:input path="userName" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="userName" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='email' value='has-error'/>">
                <label class="col-md-4 control-label">メールアドレス<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-6">
                  <form:input path="email" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="email" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              --%>
              <div class="form-group <ext:isErrors path='loginId' value='has-error'/>">
                <label class="col-md-4 control-label">ログインID</label>
                <div class="col-md-2 checkbox">
                  <label>
                    <form:checkbox path="loginCheck" id="loginCheck" value="1" onClick="switchDisabledLoginId()"/>ID変更
                  </label>
                </div>
                <div class="col-md-4">
                  <form:input path="loginId" value="${userTDto.loginId}" class="form-control" maxlength="${ext:getMaxLen('CNT0001') }" disabled=""/>
                  <div style="clear: both;">
                    <div class="col-md-10">
                      <form:errors path="loginId" element="div" cssClass="text-danger" />
                    </div>
                  </div>
                </div>
              </div>

              <div class="form-group <ext:isErrors path='firstPassward' value='has-error'/>">
                <label class="col-md-4 control-label">パスワード</label>
                <div class="col-md-2 checkbox">
                  <label>
                    <form:checkbox  path="passwardCheck" id="passwardCheck" value="1" onClick="switchDisabledPassward()"/>パスワード変更
                  </label>
                </div>
                <div class="col-md-4">
                  <form:input type="password" path="firstPassward" class="form-control" disabled="" />
                  <div style="clear: both;">
                    <div class="col-md-10">
                      <form:errors path="firstPassward" element="div" cssClass="text-danger" />
                    </div>
                  </div>
                </div>
              </div>

              <div class="form-group <ext:isErrors path='confirmPassword' value='has-error'/>">
                <label class="col-md-4 control-label">パスワード確認</label>
                <div class="col-md-2"></div>
                <div class="col-md-4">
                  <form:input type="password" path="confirmPassword" class="form-control" disabled=""/>
                  <div style="clear: both;">
                    <div class="col-md-10">
                      <form:errors path="confirmPassword" element="div" cssClass="text-danger" />
                    </div>
                  </div>
                </div>
              </div>

            </div>
          </div>
        </div>
      </div>

      <input type="hidden" name="userId" value="${form.userId}">

			<div class="row">
				<div class="col-md-offset-1 col-md-10" align="center">
					<table style="margin-bottom: 20px">
						<tr>
							<td style="vertical-align: middle;">
								<button type="button" class="btn btn-info"
                onClick="accountUpdate()">更新</button>
							</td>
							<td><label class="space" style="width: 30px;"></label></td>

							<td style="vertical-align: middle;">
								<button type="button" class="btn btn-danger"
									onClick="deleteConfirmation()">削除</button>
							</td>
						</tr>
					</table>
				</div>
			</div>
			</div>
	</form:form>

	<jsp:include page="../common/footer.jsp" />
</body>
</html>