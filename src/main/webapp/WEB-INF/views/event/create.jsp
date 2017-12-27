<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
<%-- <script type="text/javascript" src="<c:url value="/resources/js/common/alert.js"/>"></script> --%>



<link href='<c:url value="/resources/css/common/effect.css"/>'
	rel="stylesheet">
<script type="text/javascript">
	var startDateCnt = 0;

	function addCandidate() {
		++startDateCnt;
		var $input = '<tr><td class="text-center"><div class="input-group date date-ymd"style="width: 180px; ">';
		$input = $input
				+ '<input id="startDate';
 	$input = $input + '['+ startDateCnt + ']"';
 	$input = $input + ' name="startDate';
 	$input = $input + '['+ startDateCnt + ']"';
 	$input = $input + ' value="" class="form-control" type="text" value="" maxlength="10"/><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span></div></td><td class="text-center">';
		$input = $input
				+ '<input id="fixFlg" name="fixFlg" type="radio" value="';
 	$input = $input + startDateCnt + '"/></label></div></div></div></td></tr>';
		$("#table").append($input);
		initDatepicker();

	}
</script>


<script type="text/javascript">
	if ("${successMessages}".length > 0) {
		$(document).ready(function() {
			$('.alert').fadeIn(1500).delay(1000).fadeOut(1000);
		});
	}
</script>


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
					<div class="alert alert-success" role="alert" align="left">
						<c:forEach var="successMessage" items="${successMessages}">
							<c:out value="${successMessage}" />
							<button type="button" class="close" data-dismiss="alert">×</button>
						</c:forEach>
					</div>
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
									class="label label-danger" style="margin-left: 10px"></span></label>
								<div class="col-md-6">
									<form:textarea path="eventDetail" class="form-control" rows="4" />
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
								class="form-group <ext:isErrors path='eventPlace' value='has-error'/>">
								<label class="col-md-4 control-label">場所<span
									class="label label-danger" style="margin-left: 10px"></span></label>
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
									class="label label-danger" style="margin-left: 10px"></span></label>
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
									class="label label-danger" style="margin-left: 10px"></span></label>
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
									class="label label-danger" style="margin-left: 10px"></span></label>
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
									class="label label-danger" style="margin-left: 10px"></span></label>
								<div class="col-md-6">
									<form:select path="auxiliaryFlg" class="form-control"
										items="${auxiliaryFlgSelectList}" itemLabel="label"
										itemValue="value" />
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
								<div class="col-md-offset-2 col-md-8">
									<table
										class="table table-striped table-bordered table-hover table-condensed"
										id="table">
										<thead class="main-background-color">
											<tr>
												<th class="text-center">日付</th>
												<th class="text-center">確定</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td class="text-center">未確定</td>
												<td class="text-center"><label> <form:radiobutton
															path="fixFlg" value="" checked="checked" /></label></td>
											</tr>
											<c:choose>
												<c:when test="${fn:length(form.startDate) > 0}">
													<c:forEach var="list" items="${form.startDate}"
														varStatus="status">
														<tr>
															<td class="text-center">
																<div
																	class=" <ext:isErrors path='startDate[${status.index}]' value='has-error'/>">
																	<div class="input-group date date-ymd"
																		style="width: 180px; <ext:isErrors path='startDate[${status.index}]' value='has-error' />">
																		<input type="text" id="startDate[${status.index}]"
																			name="startDate[${status.index}]"
																			value="${form.startDate[status.index]}"
																			maxlength="10" class="form-control" /> <span
																			class="input-group-addon"><i
																			class="glyphicon glyphicon-calendar"></i></span>
																	</div>
																	<div style="clear: both;">
																		<span class="col-md-4"></span>
																		<div class="col-md-6">
																			<form:errors path="startDate[${status.index}]"
																				element="div" cssClass="text-danger" />
																		</div>
																	</div>
																</div>
															</td>
															<td class="text-center"><label><form:radiobutton
																		path="fixFlg" value="${status.index}" /></label></td>
														</tr>
													</c:forEach>

												</c:when>
												<c:otherwise>
													<tr>
														<td class="text-center">
															<div class="input-group date date-ymd"
																style="width: 180px; <ext:isErrors path='startDate[0]' value='has-error' />">
																<input type="text" id="startDate[0]" name="startDate[0]"
																	value="" maxlength="10" class="form-control" /> <span
																	class="input-group-addon"><i
																	class="glyphicon glyphicon-calendar"></i></span>
															</div>
															<div style="clear: both;">
																<span class="col-md-4"></span>
																<div class="col-md-6">
																	<form:errors path="startDate[0]" element="div"
																		cssClass="text-danger" />
																</div>
															</div>
														</td>
														<td class="text-center"><label><form:radiobutton
																	path="fixFlg" value="0" /></label></td>
													</tr>
												</c:otherwise>

											</c:choose>
										</tbody>
									</table>
									<div class="row">
										<div class="col-md-offset-1 col-md-10" align="center">
											<table style="margin-bottom: 20px">
												<tr id="copy">
													<td><label class="space" style="width: 30px;"></label></td>
													<td style="vertical-align: middle;">
														<button type="button" id="candidate"
															onClick="addCandidate()" class="btn btn-info">候補日追加</button>
													</td>
												</tr>
											</table>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div></div>
			<div class="row">
				<div class="col-md-offset-1 col-md-10" align="center">
					<table style="margin-bottom: 20px">
						<tr>
							<td><label class="space" style="width: 30px;"></label></td>
							<td style="vertical-align: middle;">
								<button type="submit" class="btn btn-success">登録</button>
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