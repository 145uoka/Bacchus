
// キー制御処理
$(function(){
	$(document).keydown(function(event){
		// クリックされたキーのコード
		var keyCode = event.keyCode;
		// Ctrlキーがクリックされたか(trueorfalse)
		var ctrlClick = event.ctrlKey;
		// Altキーがクリックされたか(trueorfalse)
		var altClick = event.altKey;
		// キーイベントが発生した対象のオブジェクト
		var obj = event.target;

		// ファンクションキー(F5)を制御する
		if(keyCode == 116)
		{
			return false;
		}

		// エンターキーを制御する
		if(keyCode == 13){
			// テキストボックスを制御する
			if(obj.tagName == "INPUT" && obj.type == "text"){
				return false;
			}
		}

		// バックスペースキーを制御する
		if(keyCode == 8){
			// テキストボックス／テキストエリアを制御する
			if((obj.tagName == "INPUT" && obj.type == "text")
					|| (obj.tagName == "INPUT" && obj.type == "password")
					|| obj.tagName == "TEXTAREA"){
				// 入力できる場合は制御しない
				if(!obj.readOnly && !obj.disabled){
					return true;
				}
			}
			return false;
		}

		// Alt+←を制御する
		if(altClick && (keyCode == 37 || keyCode == 39)){
			return false;
		}

		// Ctrl+Nを制御する
		if(ctrlClick && keyCode == 78){
			return false;
		}
	});
});