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
	<form:form modelAttribute="form" method="post" name="form"
		action="${pageContext.request.contextPath}/event/store"
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
							<div
								class="form-group <ext:isErrors path='eventName' value='has-error'/>">
								<label class="col-md-4 control-label">イベント名<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="eventName" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="eventName" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='eventDetail' value='has-error'/>">
								<label class="col-md-4 control-label">説明<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="eventDetail" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="eventDetail" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='fixFlg' value='has-error'/>">
								<label class="col-md-4 control-label">開催日<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="fixFlg" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="fixFlg" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='eventPlace' value='has-error'/>">
								<label class="col-md-4 control-label">場所<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="eventPlace" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="eventPlace" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='eventUrl' value='has-error'/>">
								<label class="col-md-4 control-label">URL<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="eventUrl" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="eventUrl" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='tell' value='has-error'/>">
								<label class="col-md-4 control-label">TEL<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:input path="tell" class="form-control" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="tell" element="div" cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='userId' value='has-error'/>">
								<label class="col-md-4 control-label">幹事<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<form:select path="userId" class="form-control"
										items="${userNameSelectList}" itemLabel="label"
										itemValue="value" />
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="userId" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div
								class="form-group <ext:isErrors path='auxiliaryFlg' value='has-error' />">
								<label class="col-md-4 control-label">経費補助有無<span
									class="label label-danger" style="margin-left: 10px">必須</span></label>
								<div class="col-md-6">
									<select name="auxiliaryFlg" class="form-control">
										<option value="">－－－選択してください－－－</option>
										<option value="0">有</option>
										<option value="1">無</option>
									</select>
								</div>
								<div style="clear: both;">
									<span class="col-md-4"></span>
									<div class="col-md-6">
										<form:errors path="auxiliaryFlg" element="div"
											cssClass="text-danger" />
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-offset-1 col-md-10" align="center">
									<table style="margin-bottom: 20px">
										<tr>
											<td></td>
											<td><div
													class="form-group <ext:isErrors path='' value='has-error'/>">
													<label class="col-md-4 control-label"><span
														class="label label-danger" style="margin-left: 27px">確定日</span></label>
													<div class="col-md-6"></div>
												</div></td>
										</tr>
										<tr>
											<td>
												<div
													class="form-group
													<ext:isErrors path='candidateNo' value='has-error'/>">
													<label class="col-md-4 control-label">候補日a<span
														class="label label-danger" style="margin-left: 10px">必須</span></label>
													<div class="col-md-6">
														<form:input path="candidateNo" value="YYYY/MM/DD" maxlength="10"
															class="form-control" />
														<span class="input-group-addon"><i
															class="glyphicon glyphicon-calendar"></i></span>
													</div>
													<div style="clear: both;">
														<span class="col-md-4"></span>
														<div class="col-md-6">
															<form:errors path="candidateNo" element="div" cssClass="text-danger" />
														</div>
													</div>
												</div>
											</td>
											<td>
												<div
													class="form-group <ext:isErrors path='fixFlg' value='has-error'/>">
													<label class="col-md-4 control-label"><span
														class="label label-danger" style="margin-left: 10px"></span></label>
													<div class="col-md-6">
														<input type="radio" name="fixFlg" value="サンプル">
													</div>
													<div style="clear: both;">
														<span class="col-md-4"></span>
														<div class="col-md-6">
															<form:errors path="fixFlg" element="div" cssClass="text-danger" />
														</div>
													</div>
												</div>
											</td>
										</tr>
									</table>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-offset-1 col-md-10" align="center">
								<table style="margin-bottom: 20px">
									<tr>
										<td><label class="space" style="width: 30px;"></label></td>
										<td style="vertical-align: middle;">
											<button type="submit" class="btn btn-info">候補日追加</button>
										</td>
									</tr>
								</table>
							</div>
						</div>
						<div class="row">
							<div class="col-md-offset-1 col-md-10" align="center">
								<table style="margin-bottom: 20px">
									<tr>
										<td><label class="space" style="width: 30px;"></label></td>
										<td style="vertical-align: middle;">
											<button type="submit" class="btn btn-danger">登録・配信</button>
										</td>
										<td><label class="space" style="width: 30px;"></label></td>
										<td style="vertical-align: middle;">
											<button type="submit" class="btn btn-success">登録</button>
										</td>
										<td><label class="space" style="width: 30px;"></label></td>
										<td style="vertical-align: middle;">
											<button type="submit" class="btn btn-warning">配信</button>
										</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
	</form:form>

	<jsp:include page="../common/footer.jsp" />
</body>
</html>