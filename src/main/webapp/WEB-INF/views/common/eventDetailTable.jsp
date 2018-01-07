<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="table table-striped table-bordered table-hover table-condensed">
  <tr>
    <th class="main-background-color col-md-3 text-center">イベント名</th>
    <td class="text-center"><c:out value="${eventDto.eventName}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">イベント詳細</th>
    <td class="text-center"><c:out value="${eventDto.eventDetail}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">場所</th>
    <td class="text-center"><c:out value="${eventDto.eventPlace}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">URL</th>
    <td class="text-center"><a href="${eventDto.eventUrl}"><c:out value="${eventDto.eventUrl}" /></a></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">電話番号</th>
    <td class="text-center"><c:out value="${eventDto.tell}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">イベント参加費</th>
    <td class="text-center">
    <fmt:formatNumber value="${eventDto.eventEntryFee}" type="CURRENCY" currencySymbol="¥" maxFractionDigits="0" />
    </td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">経費補助有無</th>
    <td class="text-center"><c:out value="${eventDto.auxiliaryFlgDisplay}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">店舗名</th>
    <td class="text-center"><c:out value="${eventDto.storeName}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">幹事</th>
    <td class="text-center"><c:out value="${eventDto.plannerLastName}" />&nbsp;<c:out value="${eventDto.plannerFirstName}" /></td>
  </tr>
</table>