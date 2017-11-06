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
	<form:form modelAttribute="form" method="post" name="form"
		action="${pageContext.request.contextPath}/userMng/add"
		class="form-horizontal">

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

			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<button type="submit" class="btn btn-success" id="back">
						<i class="glyphicon glyphicon-menu-left"></i> 戻る
					</button>
				</div>
			</div>
			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<h3>ユーザー登録</h3>
				</div>
			</div>

			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<div class="panel panel-default main-border-color">
						<div class="panel-body sub-background-color">
							<div class="form-group">
								<label class="col-md-3 control-label">氏名</label>
								<div class="col-md-3">
									<form:input path="userName" class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label">ユーザー区分</label>
								<div class="col-md-2">
									<form:input path="userCode" class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label">メールアドレス</label>
								<div class="col-md-2">
									<form:input path="email" class="form-control" />
								</div>
							</div>
							<div class="form-group">
								<label class="col-md-3 control-label">パスワード</label>
								<div class="col-md-2">
									<form:input path="password" class="form-control" />
								</div>
							</div>


							<div class="col-md-offset-1 col-md-10" align="center">

								<table style="margin-bottom: 20px">
									<tr>
										<td style="vertical-align: middle;">
											<button type="submit" class="btn btn-info">登録</button>
										</td>
									</tr>
								</table>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<jsp:include page="../common/footer.jsp" />
	<script src="<c:url value="/resources/js/contractMst/add.js" />"></script>
</body>
</html>