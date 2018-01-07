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
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/user/store" class="form-horizontal">

    <%-- コンテンツエリア --%>
    <div class="container">

	ハローワールド<br />
	${key1}<br />
	${key2}

		<table class="table table-striped table-bordered table-hover table-condensed">
		<thead class="main-background-color">
		<tr>
			<th>社員番号</th>
			<th>社員名</th>
		</tr>
		</thead>
		<%--
		<tr>
			<td>001</td>
			<td>石郷岡</td>
		</tr>
		<tr class = "danger">
			<td>${key3.empNo}</td>
			<td>${key3.empName}</td>
		</tr>
		<tr class = "warning">
			<td>003</td>
			<td>徳野</td>
		</tr>
		<c:forEach var="employee" items="${key4}" varStatus="status">
		<tr>
			<td>${employee.empNo}</td>
			<td>${employee.empName}</td>
		</tr>
		</c:forEach>
		--%>
		<c:forEach var="employee" items="${key5}" varStatus="status">
		<tr>
			<td>${employee.empNo}</td>
			<td>${employee.empName}</td>
		</tr>
		</c:forEach>
	</table>

    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />
</body>
</html>