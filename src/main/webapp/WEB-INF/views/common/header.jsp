<%@ page contentType="text/html;charset=Windows-31J" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>
  <!-- ナビゲーションバー -->
  <nav class="navbar navbar-default">
    <div class="container-fluid">

      <div class="navbar-header">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/"></a>
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#defaultNavbar1">
          <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
        </button>
      </div>

      <div class="collapse navbar-collapse" id="defaultNavbar1">
        <!-- メニュー -->
        <c:if test="${userInfo.logined}">
          <ul class="nav navbar-nav">
            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"><span class="glyphicon glyphicon-calendar"></span>Event<span class="caret"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="${pageContext.request.contextPath}/event/index">一覧表示</a></li>
                <li><a href="${pageContext.request.contextPath}/event/create">新規登録</a></li>
              </ul></li>
            <c:if test="${userInfo.adminFlg}">
              <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"><span class="glyphicon glyphicon-user"></span>Account<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="${pageContext.request.contextPath}/user/index">一覧表示</a></li>
                  <li><a href="${pageContext.request.contextPath}/user/create">新規登録</a></li>
                </ul></li>
            </c:if>
          </ul>
          <!-- ログアウト -->
          <div class="navbar-right">
            <c:if test="${userInfo.logined}">
              <ul class="nav navbar-nav">
                <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"><span class="glyphicon glyphicon-user"> <c:out
                        value="${userInfo.lastName} ${userInfo.firstName}" />
                  </span><span class="caret"></span></a>
                  <ul class="dropdown-menu" role="menu">
                    <li><a href="${pageContext.request.contextPath}/profile/edit"><span class="glyphicon glyphicon-edit">&nbsp;</span>プロフィール編集</a></li>
                    <li><a href="${pageContext.request.contextPath}/logout"><span class="glyphicon glyphicon-log-out">&nbsp;</span>Log out</a></li>
                  </ul></li>
              </ul>
            </c:if>
          </div>
        </c:if>
      </div>
      <!-- /.navbar-collapse -->
    </div>
    <!-- /.container-fluid -->
  </nav>
</div>