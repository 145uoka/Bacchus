package com.Bacchus.webbase.common.web.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Bacchus.webbase.common.result.Message;
import com.Bacchus.webbase.common.result.Result;

/**
 *
 * @author yamamoto_ma
 */
public final class ControllerUtils {

	/** エラーレベル：Infoの際のメッセージキー */
	public static final String INFO_MESSAGE_ATTR_KEY = "infoMessages";
	/** エラーレベル：Warnの際のメッセージキー */
	public static final String WARN_MESSAGE_ATTR_KEY = "warnMessages";
	/** エラーレベル：Errorの際のメッセージキー */
	public static final String ERROR_MESSAGE_ATTR_KEY = "errorMessages";

	/**
	 * Utilクラスのコンストラクタはインスタンスを生成させない為抑止
	 */
	private ControllerUtils() {
	};

	/**
	 * メッセージを保存する。
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model 画面Modelオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param result Controller側でエラーレベル、メッセージキー等をセットしたResultオブジェクト
	 */
	public static void saveMessage(MessageSource messageSource, Model model, Locale locale, Result result) {
		List<String> infoMessages = new ArrayList<>();
		List<String> warnMessages = new ArrayList<>();
		List<String> errorMessages = new ArrayList<>();
		for (Message message : result.getMessages()) {
			String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), locale);
			switch (message.getLevel()) {
			case INFO:
				infoMessages.add(textMessage);
				break;
			case WARN:
				warnMessages.add(textMessage);
				break;
			case ERROR:
				errorMessages.add(textMessage);
				break;
			default:
				break;
			}
		}
		if (!infoMessages.isEmpty()) {
			model.addAttribute(INFO_MESSAGE_ATTR_KEY, infoMessages);
		}
		if (!warnMessages.isEmpty()) {
			model.addAttribute(WARN_MESSAGE_ATTR_KEY, warnMessages);
		}
		if (!errorMessages.isEmpty()) {
			model.addAttribute(ERROR_MESSAGE_ATTR_KEY, errorMessages);
		}
	}

	/**
	 * メッセージを保存する（Redirect用）
	 * @param messageSource FWによりDIされたメッセージソース
	 * @param model RedirectAttributesオブジェクト
	 * @param locale ロケールオブジェクト
	 * @param result Controller側でエラーレベル、メッセージキー等をセットしたResultオブジェクト
	 */
	public static void saveMessage(MessageSource messageSource, RedirectAttributes model,
			Locale locale, Result result) {
		List<String> infoMessages = new ArrayList<>();
		List<String> warnMessages = new ArrayList<>();
		List<String> errorMessages = new ArrayList<>();
		for (Message message : result.getMessages()) {
			String textMessage = messageSource.getMessage(message.getKey(), message.getParameters(), locale);
			switch (message.getLevel()) {
			case INFO:
				infoMessages.add(textMessage);
				break;
			case WARN:
				warnMessages.add(textMessage);
				break;
			case ERROR:
				errorMessages.add(textMessage);
				break;
			default:
				break;
			}
		}
		if (!infoMessages.isEmpty()) {
			model.addFlashAttribute(INFO_MESSAGE_ATTR_KEY, infoMessages);
		}
		if (!warnMessages.isEmpty()) {
			model.addFlashAttribute(WARN_MESSAGE_ATTR_KEY, warnMessages);
		}
		if (!errorMessages.isEmpty()) {
			model.addFlashAttribute(ERROR_MESSAGE_ATTR_KEY, errorMessages);
		}
	}

	/**
	 * Spring用、RedirectのPrefixを付与するメソッド
	 * @param url Redirect先URL
	 * @return Spring書式の文字列
	 */
	public static String redirect(String url) {
		return "redirect:" + url;
	}

	/**
	 * Spring用、ForwardのPrefixを付与するメソッド
	 * @param methodName Forward先メソッド名
	 * @return Spring書式の文字列
	 */
	public static String forward(String methodName) {
		return "forward:" + methodName;
	}

	/**
	 * Overload
	 * @see ControllerUtils#saveFieldError(BindingResult bindingResult,
	 *      Object formBean, String[] errorItem, String key, String[]
	 *      arguments)
	 * @param bindingResult Springのvalidation結果保持オブジェクト
	 * @param formBean 画面FormBeanオブジェクト
	 * @param errorItem エラー項目名
	 * @param key エラーメッセージキー
	 */
	public static void saveFieldError(BindingResult bindingResult,
			Object formBean,
			String errorItem,
			String key) {
		saveFieldError(bindingResult, formBean, errorItem, key, null);
	}

	/**
	 * 項目エラー共通メソッド
	 * @param bindingResult Springのvalidation結果保持オブジェクト
	 * @param formBean 画面FormBeanオブジェクト
	 * @param errorItem エラー項目名
	 * @param key エラーメッセージキー
	 * @param arguments エラーメッセージ引数
	 */
	public static void saveFieldError(
			BindingResult bindingResult,
			Object formBean,
			String errorItem,
			String key,
			String[] arguments) {

		// formBeanのフルパスClass名からClass名を切り出して、先頭を小文字化
		String clazzName = formBean.getClass().getName();
		String objectName = StringUtils.uncapitalize(
				clazzName.substring(clazzName.lastIndexOf(".") + 1));

		// reflectionを使用してFormBeanオブジェクトの値を取得
		String rejectedValue = "";
		Class<?> clazz = formBean.getClass();
		try {
			Field field = clazz.getDeclaredField(errorItem);
			// private変数もアクセス可能とする
			field.setAccessible(true);

			rejectedValue = (String) field.get(formBean);
		} catch (Exception e) {
			// 項目名設定ミスを製造時に検知できるようにするため、例外は処理せずにthrowする
			throw new IllegalArgumentException("not exists param：" + errorItem);
		}

		// MultiField用設定、Keyがnull以外の場合にString配列とする
		String[] keys = null;
		if (key != null) {
			keys = new String[] { key };
		}

		// エラーを生成、セット
		FieldError error = new FieldError(objectName,
				errorItem,
				rejectedValue,
				false,
				keys,
				arguments,
				"");
		bindingResult.addError(error);
	}

	/**
	 * Overload
	 * @see ControllerUtils#saveMultiFieldError(BindingResult bindingResult,
	 *      Object formBean, String[] errorItems, String key, String[]
	 *      arguments)
	 * @param bindingResult Springのvalidation結果保持オブジェクト
	 * @param formBean 画面FormBeanオブジェクト
	 * @param errorItems エラー項目名
	 * @param key  エラーメッセージキー
	 */
	public static void saveMultiFieldError(BindingResult bindingResult,
			Object formBean,
			String[] errorItems,
			String key) {
		saveMultiFieldError(bindingResult, formBean, errorItems, key, null);
	}

	/**
	 * 複数項目エラー共通メソッド
	 * @param bindingResult Springのvalidation結果保持オブジェクト
	 * @param formBean 画面FormBeanオブジェクト
	 * @param errorItems エラー項目名
	 * @param key エラーメッセージキー
	 * @param arguments エラーメッセージ引数
	 */
	public static void saveMultiFieldError(BindingResult bindingResult,
			Object formBean,
			String[] errorItems,
			String key,
			String[] arguments) {
		// 複数個同時に項目エラーとする場合、メッセージ表示は先頭1項目のみとする
		for (int i = 0; i < errorItems.length; i++) {
			String item = errorItems[i];
			if (i == 0) {
				saveFieldError(bindingResult, formBean, item, key, arguments);
			} else {
				saveFieldError(bindingResult, formBean, item, null, null);
			}
		}
	}
}
