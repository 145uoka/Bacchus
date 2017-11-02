/**
 * カレンダー表記
 */
$(document).ready(function() {
    // 表示するカレンダーを日本形式に変更
    $("div.date-ymd").datepicker({
        format : 'yyyy/mm/dd',
        language : 'ja',
        autoclose : true,
        clearBtn : true
    });
    // 表示するカレンダーを日本形式に変更
    $("div.date-ym").datepicker({
        format : 'yyyy/mm',
        language : 'ja',
        autoclose : true,
        minViewMode: 'months',
        clearBtn : true
    });
    // カレンダーで選択した日付をセット
    $("div.date").datepicker().on("changeDate", function(ev) {
        $("div.datepicker.dropdown-menu").hide();
    });
});
/**
 * ポップアップ表示
 **/
$(function() {
    $('[rel=popover]').popover();
});

$(function() {
    $('.check_table tr').hover(function() {
        $(this).addClass('hover_tr');
    }, function() {
        $(this).removeClass('hover_tr');
    }).click(function(evt) {
        var $t = $(this);
        var chk = $t.find(':checkbox')[0];
        if (chk === undefined || chk === null) {
            return;
        }
        if (evt.target != chk) {
            chk.checked = !chk.checked;
        }
        if (chk.checked) {
            $t.addClass('checked_tr');
        } else {
            $t.removeClass('checked_tr');
        }
    });
});


$(function() {
    $('.radio_table tr').hover(function() {
        $(this).addClass('hover_tr');
    }, function() {
        $(this).removeClass('hover_tr');
    }).click(function(evt) {
        var $t = $(this);
        var chk = $t.find(':radio')[0];
        if (chk === undefined || chk === null) {
            return;
        }
        if (evt.target != chk) {
            chk.checked = true;
        }

        var tr = $(".radio_table tr");//全行を取得
        for(var i=0; i < tr.length; i++ ){
            tr.removeClass('checked_tr');
        }
        if (chk.checked) {
            $t.addClass('checked_tr');
        }
    });
});


function clickCheckLine(obj) {

    var checkbox = obj.find(":checkbox");

    if (checkbox.is(':disabled')) {
        return;
    }

    var isChecked = checkbox.prop("checked");
    var tag = $(event.target).prop("tagName");
    if (tag === "INPUT" || tag === "LABEL") {
        return;
    }
    checkbox.prop("checked", !isChecked);

    if (!isChecked) {
        obj.addClass('selected_row');
    } else {
        obj.removeClass('selected_row');
    }

}

function blocUIOn() {
    $.blockUI({
        message: 'Now Loading',
        css: {
            border: 'none',
            padding: '10px',
            backgroundColor: '#333',
            opacity: .5,
            color: '#fff'
        },
        overlayCSS: {
            backgroundColor: '#000',
            opacity: 0.6
        }
    });
}

function blocUIOff() {
    $.unblockUI();
}
