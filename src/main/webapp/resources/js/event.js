/**
 * 候補日の表記
 */
var startDateCnt = 0;
function addCandidate() {
	//候補日追加（最終行1行追加）
	++startDateCnt;

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
}

function deleteRow(index) {
//削除ボタンを押された任意の1行を削除する。
	tr = index.parentNode.parentNode;
	tr.parentNode.deleteRow(tr.sectionRowIndex);
}
