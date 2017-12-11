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
		action="${pageContext.request.contextPath}/user/store"
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

			<!-- テーブル -->
			<div class="row">
				<div class="col-md-offset-1 col-md-10">
					<table id=user
						class="check_table table table-striped table-bordered table-hover table-condensed">
						<tr>
							<th class="text-center">No</th>
							<th class="text-center">修正</th>
							<th class="text-center">削除</th>
							<th class="text-center">ユーザー名</th>
							<th class="text-center">メールアドレス</th>
							<th class="text-center">ユーザー区分</th>
						</tr>
						<c:forEach var="list" items="${UserTUserTypeMDtoList}" varStatus="status">
							<tr>
								<td class="text-center table_col_1"><c:out
										value="${list.userId}"></c:out></td>

								<td class="text-center table_col_2"><a href="${pageContext.request.contextPath}/user/userEditing?userId=${list.userId}"
								 type="button" class="btn btn-warning" id="update">修正</a></td>

								<td class="text-center table_col_2"><a href="${pageContext.request.contextPath}/user/delete?userId=${list.userId}"
								 type="button" class="btn btn-danger" id="delete">削除</a></td>

								<td class="text-center table_col_2"><c:out
										value="${list.userName }"></c:out></td>

								<td class="text-center table_col_2"><c:out
										value="${list.email}"></c:out></td>

								<td class="text-center table_col_1"><c:out
										value="${list.userTypeName }"></c:out></td>
							</tr>
						</c:forEach>
					</table>

<!-- 					ボタン -->
<!-- 					<div class="row"> -->
<!-- 						<div class="col-md-offset-1 col-md-10" align="center"> -->
<!-- 							<div style="margin-bottom: 20px"></div> -->
<!-- 							<table> -->
<!-- 								<tr> -->
<!-- 									                    <td style="vertical-align: middle;"><a href="./add.html" type="button" class="btn btn-primary" id="register">追加</a></td> -->
<!-- 									                    <td><label class="space" style="width: 30px;"></label></td> -->
<!-- 									<td style="vertical-align: middle;"> -->
<!-- 										<button type="button" class="btn btn-warning" id="modify">修正</button> -->
<!-- 									</td> -->
<!-- 									<td><label class="space" style="width: 30px;"></label></td> -->
<!-- 									<td style="vertical-align: middle;"> -->
<!-- 										<button type="button" class="btn btn-danger" id="delete">削除</button> -->
<!-- 									</td> -->

<!-- 								</tr> -->
<!-- 							</table> -->
<!-- 						</div> -->
<!-- 					</div> -->
				</div>
				<div></div>
			</div>
		</div>
	</form:form>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>