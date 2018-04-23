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



<link href='<c:url value="/resources/css/common/effect.css"/>' rel="stylesheet">
<script type="text/javascript" src='<c:url value="/resources/js/event.js"/>'></script>

<script type="text/javascript">

var startDateCnt = <c:out value="${fn:length(form.startDate)}"/>;

function updateCandidate() {
	//候補日追加（最終行1行追加）

	var table = document.getElementById('candidateTable');
	var tr = table.insertRow(-1);
	var td1 = tr.insertCell(-1), td2 = tr.insertCell(-1), td3 = tr
			.insertCell(-1);
	td1.classList.add("p-details");
	td2.classList.add("p-details");
	td3.classList.add("p-details");

	var $startDateCol = '<div class="input-group date date-ymd"style="width: 180px; ">';
	$startDateCol += '<input id="startDate[' + startDateCnt + ']" name="startDate[' + startDateCnt + ']" ';
	$startDateCol += 'class="form-control" type="text" maxlength="10" placeholder="yyyy/MM/dd"/><span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>';
	$startDateCol += '</div>';

	var $fixFlgCol = '<input id="fixDate" name="fixDate" type="radio" value="'+ startDateCnt + '"/>';
	var $deleteCol = '<td class="p-details"><a type="button" class="btn btn-danger" onClick="deleteRow(this)">削除</a></td>';

	td1.innerHTML = $startDateCol;
	td2.innerHTML = $fixFlgCol;
	td3.innerHTML = $deleteCol;
	initRadioTable();
	initDatepicker();
	startDateCnt++;
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
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/event/update" class="form-horizontal">


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
              <div class="form-group <ext:isErrors path='eventName' value='has-error'/>">
                <label class="col-md-4 control-label">
                  イベント名
                  <span class="label label-danger" style="margin-left: 10px">必須</span>
                </label>
                <div class="col-md-6">
                  <form:input path="eventName" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventName" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='eventTypeId' value='has-error'/>">
                <label class="col-md-4 control-label">イベント種別<span class="label label-danger" style="margin-left: 10px"></span></label>
                <div class="col-md-6">
                  <form:select path="eventTypeId" class="form-control" items="${eventTypeList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventTypeId" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='eventDetail' value='has-error'/>">
                <label class="col-md-4 control-label">
                  説明
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:textarea path="eventDetail" class="form-control" rows="4" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventDetail" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='storeName' value='has-error'/>">
                <label class="col-md-4 control-label">
                  店舗名
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:input path="storeName" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="storeName" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='eventPlace' value='has-error'/>">
                <label class="col-md-4 control-label">
                  場所
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:input path="eventPlace" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventPlace" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='eventUrl' value='has-error'/>">
                <label class="col-md-4 control-label">
                  URL
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:input path="eventUrl" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventUrl" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='tell' value='has-error'/>">
                <label class="col-md-4 control-label">
                  TEL
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
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
              <div class="form-group <ext:isErrors path='userId' value='has-error'/>">
                <label class="col-md-4 control-label">
                  幹事
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:select path="userId" class="form-control" items="${userNameSelectList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="userId" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='eventEntryFee' value='has-error'/>">
                <label class="col-md-4 control-label">
                  参加費
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:input path="eventEntryFee" class="form-control" placeholder="半角数値" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="eventEntryFee" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='auxiliaryFlg' value='has-error' />">
                <label class="col-md-4 control-label">
                  経費補助有無
                  <span class="label label-danger" style="margin-left: 10px"></span>
                </label>
                <div class="col-md-6">
                  <form:select path="auxiliaryFlg" class="form-control" items="${auxiliaryFlgSelectList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="auxiliaryFlg" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4 text-right">
                  <label class="control-label">候補日</label>
                </div>
                <div class="col-md-6 ">
                  <table class="table radio_table table-striped table-bordered table-hover table-condensed panel " id="candidateTable">
                    <thead class="main-background-color">
                      <tr>
                        <th class="text-center">日付</th>
                        <th class="text-center">確定</th>
                        <th class="text-center">削除</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td class="p-details">未確定</td>
                        <td class="radio_col">
                          <form:radiobutton path="fixDate" value="" checked="checked" />
                        </td>
                        <td class="p-details">-</td>
                      </tr>


                      <c:choose>
                        <c:when test="${fn:length(form.startDate) > 0}">

                          <c:forEach var="list" items="${form.startDate}" varStatus="status">
                            <tr>
                              <td class="p-details">
                                <div class=" <ext:isErrors path='startDate[${status.index}]' value='has-error'/>">
                                  <div class="input-group date date-ymd" style="width: 180px; <ext:isErrors path='startDate[${status.index}]' value='has-error' />">
                                    <form:input type="text" path="startDate[${status.index}]" value="${form.startDate[status.index]}" maxlength="10" class="form-control" placeholder="yyyy/MM/dd" />
                                    <span class="input-group-addon">
                                      <i class="glyphicon glyphicon-calendar"></i>
                                    </span>
                                  </div>
                                  <div style="clear: both;">
                                    <form:errors path="startDate[${status.index}]" element="div" cssClass="text-danger" />
                                  </div>
                                </div>
                              </td>
                              <td class="p-details">
                                <form:radiobutton path="fixDate" id="count" value="${status.index}" />
                              </td>
                              <td class="p-details">
                                <a type="button" class="btn btn-danger" onClick="deleteRow(this)">削除</a>
                              </td>
                            </tr>
                          </c:forEach>

                        </c:when>
                        <c:otherwise>
                        </c:otherwise>
                      </c:choose>



                    </tbody>
                  </table>
                  <div class="row">
                    <div class="col-md-offset-1 col-md-10" align="center">
                      <table style="margin-bottom: 20px">
                        <tr id="copy">
                          <td>
                            <label class="space" style="width: 30px;"></label>
                          </td>
                          <td style="vertical-align: middle;">
                            <button type="button" id="candidate" onClick="updateCandidate()" class="btn btn-info">候補日追加</button>
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
      <form:hidden path="eventNo"/>
      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td><label class="space" style="width: 30px;"></label></td>
              <td style="vertical-align: middle;">
                <button type="submit" class="btn btn-edit">更新</button>
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