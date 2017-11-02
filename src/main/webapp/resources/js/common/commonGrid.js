function setGridHeight(maxHeight) {

    // 行数取得
    var rowsLength = $('#gridTable').prop('rows').length

    // テーブルの高さの最大値設定する
    var gridDivHeight = rowsLength * 27 + 19;
    if (gridDivHeight > maxHeight) {
        gridDivHeight = maxHeight;
    }
    $('#gridDiv').css('height', gridDivHeight + 'px');
}

/**
 * gridの高さを設定。
 * rowsLength * 23px > maxHeight ・・・ maxHeightの高さを返却
 * rowsLength * 23px <= maxHeight ・・・ rowsLength * 23pxの高さを返却
 *
 * @param rowsLength データ行数
 * @param maxHeight 最大高さ
 * @returns {Number}
 */
function getGridHeight(rowsLength, maxHeight) {

    // テーブルの高さの最大値設定する
    var gridHeight = rowsLength * 23 + 19;
    if (gridHeight > maxHeight) {
        gridHeight = maxHeight;
    }
    return gridHeight;
}

/**
 * GRID領域の幅から、各カラムの幅を減算した幅数を返却。
 *
 * @param gridWidth grid領域幅
 * @param colWidths 各カラム幅を保持した配列
 * @param optionColNum オプションで追加したカラム数
 * @returns {Number}
 */
function getRemainingColWidth(gridWidth, colWidths, optionColNum) {
    var remainingColWidth = gridWidth;
    remainingColWidth -= (35 * optionColNum);
    remainingColWidth -= 19;
    for (var i = 0; i < colWidths.length; i ++) {
        remainingColWidth -= colWidths[i];
    }
    return remainingColWidth;
}

function getRemainingColWidthForJqGrid(gridWidth, colModelSettings, optionColmNum) {
    var sumWidth = 0;
    sumWidth += (35 * optionColmNum);
    sumWidth += 19;
    for(var index in colModelSettings){
        var currentWidth = colModelSettings[index].width;
        var isHidden = colModelSettings[index].hidden;
        if (isFinite(currentWidth) && !isHidden) {
            sumWidth += currentWidth;
        }
    }
    if (sumWidth < gridWidth) {
        var remainingColWidth = gridWidth - sumWidth;
        for(var index in colModelSettings){
            var isRemaining = colModelSettings[index].isRemaining;
            if (isRemaining) {
                colModelSettings[index].width += remainingColWidth;
                break;
            }
        }
    }

    return colModelSettings;
}

/**
 * GRID内で選択されたチェックボックスのvalueを配列で返却。
 *
 * @returns {Array}
 */
function getMultiCheckedRowId() {
    var grid = jQuery("#gridTable");
    var selrows = jQuery('#gridTable').getGridParam('selarrrow');

    var form = document.form;

    var checkedArray = [];
    if (selrows.length > 0) {
        for (var i = 0; i < selrows.length; i++) {
            // 選択行
            var row = $('#gridTable').getRowData(selrows[i]);
            checkedArray.push(row.rowId);
        }
    }
    return checkedArray;
}

/**
 * GRID内で選択されたチェックボックスindexを配列で返却。
 *
 * @returns {Array}
 */
function getMultiCheckedRowValue() {

    var checkedArray =  $('input[name="checked"]:checked').map(function() {
        return $(this).val();
      }).get();

    return checkedArray;
}

function getSingleCheckedRowValue() {

    var checkedArray =  $('input[name="checked"]:checked').map(function() {
        return $(this).val();
      }).get();

    return checkedArray;
}

function countChecked() {

    var form = document.form;
    var cnt = 0;

    // チェックボックスの選択数取得
    if (form.checked.length) {
        for (var i = 0; i < form.checked.length; i++) {
            if (form.elements[i].checked) {
                cnt++;
            }
        }
    } else {
        if (form.checked.checked) {
            cnt++;
        }
    }

    return cnt;
}

