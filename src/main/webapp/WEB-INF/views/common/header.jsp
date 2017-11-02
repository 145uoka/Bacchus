<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
  <!-- ナビゲーションバー -->
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">TOP</a>
      </div>
      <!-- メニュー -->
      <c:if test="${userInfo.logined}">
        <ul class="nav navbar-nav">
          <li><a href="${pageContext.request.contextPath}/">xxxx</a></li>
          <c:if test="${userInfo.adminFlg}">
            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button">アカウント管理<span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="${pageContext.request.contextPath}/">一覧表示</a></li>
              <li><a href="${pageContext.request.contextPath}/">新規登録</a></li>
            </ul></li>
          </c:if>
        </ul>
        <!-- ログアウト -->
        <div class="navbar-form navbar-right">
          <c:if test="${userInfo.logined}">
            <span class="glyphicon glyphicon-user">
              <c:out value="ようこそ　${userInfo.userName}　さん" />
            </span>
          </c:if>
          <span style="margin-left: 20px">
            <a href="${pageContext.request.contextPath}/logout" class="btn btn-primary btn-large"> <i class="glyphicon glyphicon-log-out"></i> Log out
            </a>
          </span>
        </div>
      </c:if>
    </div>
  </nav>
</div>