<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<title>エラーページ</title>
<jsp:include page="common/common.jsp" />
</head>
<body>
	<jsp:include page="common/header.jsp" />
	<div class="container">
		<!-- コンテンツエリア -->
		<div class="container">
			<div class="container-main">
				<div class="container">
					<div class="row">
						<div
							class="col-lg-6 col-lg-offset-3 col-md-6 col-md-offset-3 col-sm-6 col-sm-offset-3 col-xs-8 col-xs-offset-2"
							align="center">

							<%@include file="/WEB-INF/fragment/messages.jspf"%>

						</div>
					</div>
				</div>
			</div>
		</div>
		</div>
		<jsp:include page="common/footer.jsp" />
</body>
</html>