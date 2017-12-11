<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="check_table table table-striped table-bordered table-hover table-condensed">
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
    <td class="text-center"><c:out value="${eventDto.eventUrl}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">電話番号</th>
    <td class="text-center"><c:out value="${eventDto.tell}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">イベント参加費</th>
    <td class="text-center"><c:out value="${eventDto.eventEntryFee}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">店舗名</th>
    <td class="text-center"><c:out value="${eventDto.storeName}" /></td>
  </tr>
  <tr>
    <th class="main-background-color col-md-3 text-center">幹事</th>
    <td class="text-center"><c:out value="" /></td>
  </tr>
</table>