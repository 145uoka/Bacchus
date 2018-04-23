<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<%
  response.setHeader("Expires", "-1");
  response.setHeader("Pragma","no-cache");
  response.setHeader("Cache-Control","no-cache");
%>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta http-equiv="content-Type" content="text/html;charset=UTF-8" />

<meta http-equiv="content-style-type" content="text/css" />
<meta http-equiv="content-script-type" content="text/javascript" />

<title><c:out value="Bacchus" /></title>

<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/static/favicon.ico" />
<link rel="apple-touch-icon" href="${pageContext.request.contextPath}/resources/static/safari_favicon.png" />

<!-- CSS vendor -->
<link href='<c:url value="/resources/css/vendor/bootstrap/bootstrap.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/vendor/jquery/jquery-ui-1.10.4.custom.min.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/vendor/fontawesome/font-awesome.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/vendor/sticky_footer/sticky-footer.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/vendor/bootstrap_datepicker/datepicker.css"/>' rel="stylesheet">

<!-- CSS Glue-net -->
<link href='<c:url value="/resources/css/color/templateColor.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/common/commonTableStyle.css"/>' rel="stylesheet">
<link href='<c:url value="/resources/css/common/common.css"/>' rel="stylesheet">

<!-- JS vendor -->
<script type="text/javascript" src='<c:url value="/resources/js/vendor/jquery/jquery-1.11.1.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/jquery/jquery-ui.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/bootstrap/bootstrap.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/bootstrap/bootstrap-datepicker.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/bootstrap/bootstrap-datepicker.ja.min.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/jquery_blockUI/jquery.blockUI.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/vendor/bootstrap_tab/tab.js"/>'></script>
<script type="text/javascript" src='<c:url value="/resources/js/common/keyControl.js"/>'></script>

<!-- JS Glue-net -->
<script type="text/javascript" src='<c:url value="/resources/js/common/common.js"/>'></script>

