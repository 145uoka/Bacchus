package com.Bacchus.webbase.common.constants;

/**
 * メッセージKeyの定数クラス
 *
 * $Id$
 */
public class MessageKeyConstants {

    /**
     * Glue-Net独自のvalidationメッセージ。
     */
    public static class GlueNetValidator {
        /**  ブランクは許可されていません。 */
        public static final String NOTBLANK = "{glue-net.validator.NotBlank}";
        /**  {0}のブランクは許可されていません。 */
        public static final String NOTBLANK_WITH_FIELD = "{glue-net.validator.NotBlank.with.field}";
        /**  必須入力です。 */
        public static final String NOTEMPTY = "{glue-net.validator.NotEmpty}";
        /**  {0}は必須入力です。 */
        public static final String NOTEMPTY_WITH_FIELD = "{glue-net.validator.NotEmpty.with.field}";
        /**  半角英数字で入力してください。 */
        public static final String ALPHANUMERIC = "{glue-net.validator.AlphaNumeric}";
        /**  半角数字で入力してください。 */
        public static final String NUMERIC = "{glue-net.validator.Numeric}";
        /**  {name}は半角数字で入力してください。 */
        public static final String NUMERIC_WITH_FIELD = "{glue-net.validator.Numeric.with.field}";
        /**  半角英数字と記号で入力してください。 */
        public static final String ALPHANUMSYMBOL = "{glue-net.validator.AlphaNumSymbol}";
        /**  {0}は半角英数字で入力してください。 */
        public static final String ALPHANUMERIC_WITH_FIELD = "{glue-net.validator.AlphaNumeric.with.field}";
        /**  利用できない文字が含まれています。 */
        public static final String CONSTRAINTS_NOT_AVAILABLE = "{glue-net.validator.constraints.not.available}";
        /**  {min}文字以上{max}文字以下で入力してください。 */
        public static final String CONSTRAINTS_LENGTH = "{glue-net.validator.constraints.Length}";
        /**  {max}文字以下で入力してください。 */
        public static final String CONSTRAINTS_MAXLENGTH = "{glue-net.validator.constraints.MaxLength}";
        /**  {name}は数字{length}文字以下で入力してください。 */
        public static final String CONSTRAINTS_MAXLENGTH_WITH_FIELD = "{glue-net.validator.constraints.MaxLength.with.field}";
        /**  {0}は{min}文字以上{max}文字以下で入力してください。 */
        public static final String CONSTRAINTS_LENGTH_FIELD = "{glue-net.validator.constraints.Length.field}";
        /**  必須入力です。（ブランクも不可） */
        public static final String NOTEMPTY_AND_NOTBLANK = "{glue-net.validator.NotEmpty.and.NotBlank}";
        /** 一つ以上選択してください。 */
        public static final String MUSTSELECTANY = "{glue-net.validator.MustSelectAny}";
        /** 未選択不可です。 */
        public static final String MUSTSELECT = "{glue-net.validator.MustSelect}";
        /** 一度に選択可能な項目は一つまでです。（未選択も不可） */
        public static final String MUSTSELECTONLYONE = "{glue-net.validator.MustSelectOnlyOne}";
        /** 固定{length}文字で入力してください。 */
        public static final String CONSTRAINTS_FIXEDLENGTH = "{glue-net.validator.constraints.FixedLength}";
        /** {name}は固定{length}文字で入力してください。 */
        public static final String CONSTRAINTS_FIXEDLENGTH_WITH_FIELD = "{glue-net.validator.constraints.FixedLength.with.field}";
        /** 整数{integer}桁以下、小数{fraction}桁以下で入力してください。 */
        public static final String CONSTRAINTS_DIGITS = "{glue-net.validator.constraints.Digits}";
        /** 整数{integer}桁以上、{fraction}桁以下で入力してください。 */
        public static final String INTEGRAL_VALUE_LIMIT = "{glue-net.validator.integral.Value.Limit}";
        /** 過去日は設定できません。 */
        public static final String NOT_SETTING_PAST = "{glue-net.validator.not.setting.past}";
        /** すでに使用されている値です。 */
        public static final String RESERVED_VALUE = "{glue-net.validator.reserved.value}";
        /** 半角ｶﾅで入力してください。 */
        public static final String HALFSIZEKATAKANA = "{glue-net.validator.HalfSizeKatakana}";
        /** 入力値に誤りがあります。 */
        public static final String INVALID = "{glue-net.validator.Invalid}";
        /** 期間の入力が逆転しています。 */
        public static final String PERIOD = "{glue-net.validator.Period}";
        /** 処理状態を選択して下さい。 */
        public static final String MUSTSELECTPROCESSINGSTATE = "{glue-net.validator.MustSelectProcessingState}";
        /** 番号を入力して下さい。 */
        public static final String NOTINPUTINSURANCENUMBER = "{glue-net.validator.NotInputInsuranceNumber}";
        /** 未来日は設定できません。 */
        public static final String NOTFUTURE = "{glue-net.validator.NotFuture}";
    }

    /**
     * CustomValidatorのメッセージ。
     */
    public static class CustomValidators {
        /** 半角英数字で入力してください。 */
        public static final String ALPHANUMERIC_MESSAGE = "{custom.validator.constraints.AlphaNumeric.message}";
        /** 日付は {format} の形式で入力してください。 */
        public static final String DATEFORMAT_MESSAGE = "{custom.validator.constraints.DateFormat.message}";
        /** {length}桁以内の数値で入力してください。 */
        public static final String NUMERIC_MESSAGE = "{custom.validator.constraints.Numeric.message}";
        /** 有効な数値で入力してください。 */
        public static final String DECIMAL_MESSAGE = "{custom.validator.constraints.Decimal.message}";
        /** 機種依存文字は入力できません。 */
        public static final String SJIS_MESSAGE = "{custom.validator.constraints.SJIS.message}";
        /** ファイルを選択してください。 */
        public static final String SELECTFILE_MESSAGE = "{custom.validator.constraints.SelectFile.message}";
        /** {length}文字以内で入力してください。 */
        public static final String MAXLENGTH_MESSAGE = "{custom.validator.constraints.MaxLength.message}";
        /** {length}バイト以内で入力してください。（日本語文字は3バイト） */
        public static final String MAXLENGTHUTF8_MESSAGE = "{custom.validator.constraints.MaxLengthUTF8.message}";
        /** 値を選択してください。 */
        public static final String MUSTSELECT_MESSAGE = "{custom.validator.constraints.MustSelect.message}";
        /** 一つ以上選択してください。 */
        public static final String MUSTSELECTANY_MESSAGE = "{custom.validator.constraints.MustSelectAny.message}";
        /** 半角英字で入力してください。 */
        public static final String ALPHA_MESSAGE = "{custom.validator.constraints.Alpha.message}";
        /** 半角英数字で入力してください。 */
        public static final String ALPHANUM_MESSAGE = "{custom.validator.constraints.AlphaNum.message}";
        /** 半角英数字と記号で入力してください。 */
        public static final String ALPHANUMSYMBOL_MESSAGE = "{custom.validator.constraints.AlphaNumSymbol.message}";
        /** 半角数値で入力してください。 */
        public static final String NUMBER_MESSAGE = "{custom.validator.constraints.Number.message}";
        /** 全角で入力してください。 */
        public static final String FULLWIDTH_MESSAGE = "{custom.validator.constraints.Fullwidth.message}";
        /** 全角カタカナで入力してください。 */
        public static final String FULLWIDTHKATAKANA_MESSAGE = "{custom.validator.constraints.FullwidthKatakana.message}";
        /** 全角カタカナと数値で入力してください。 */
        public static final String FULLWIDTHKATAKANANUM_MESSAGE = "{custom.validator.constraints.FullwidthKatakanaNum.message}";
        /** 1以上の数値で入力してください。 */
        public static final String NUMREQUIRED_MESSAGE = "{custom.validator.constraints.NumRequired.message}";
        /** 、，"は入力できません。 */
        public static final String PROHIBITIONCHECK_MESSAGE = "{custom.validator.constraints.ProhibitionCheck.message}";
        /** 半角{length}桁で入力してください。 */
        public static final String SIZEEQUAL_MESSAGE = "{custom.validator.constraints.SizeEqual.message}";
    }

    /**
     * JSR303のvalidationメッセージ。
     */
    public static class Jsr303 {
        /** Falseでなければなりません。 */
        public static final String ASSERTFALSE_MESSAGE = "{javax.validation.constraints.AssertFalse.message}";
        /** Trueでなければなりません。 */
        public static final String ASSERTTRUE_MESSAGE = "{javax.validation.constraints.AssertTrue.message}";
        /** must be less than ${inclusive == true ? 'or equal to ' : ''}{value} */
        public static final String DECIMALMAX_MESSAGE = "{javax.validation.constraints.DecimalMax.message}";
        /** must be greater than ${inclusive == true ? 'or equal to ' : ''}{value} */
        public static final String DECIMALMIN_MESSAGE = "{javax.validation.constraints.DecimalMin.message}";
        /** 境界以外の数値（予測:<{integer} digits>.<{fraction} digits>） */
        public static final String DIGITS_MESSAGE = "{javax.validation.constraints.Digits.message}";
        /** 未来日付でなければなりません。 */
        public static final String FUTURE_MESSAGE = "{javax.validation.constraints.Future.message}";
        /** {value}以下でなければなりません。 */
        public static final String MAX_MESSAGE = "{javax.validation.constraints.Max.message}";
        /** {value}以上でなければなりません。 */
        public static final String MIN_MESSAGE = "{javax.validation.constraints.Min.message}";
        /** Nullは許可されていません。 */
        public static final String NOTNULL_MESSAGE = "{javax.validation.constraints.NotNull.message}";
        /** Nullでなければなりません。 */
        public static final String NULL_MESSAGE = "{javax.validation.constraints.Null.message}";
        /** 過去日付でなければなりません。 */
        public static final String PAST_MESSAGE = "{javax.validation.constraints.Past.message}";
        /** パターン（{regexp}）に一致しなければなりません。 */
        public static final String PATTERN_MESSAGE = "{javax.validation.constraints.Pattern.message}";
        /** サイズは{min}以上{max}以下でなければなりません。 */
        public static final String SIZE_MESSAGE = "{javax.validation.constraints.Size.message}";
    }

    /**
     * Hibernateのvalidationメッセージ。
     */
    public static class Jsr303Hibernate {
        /** 正しいクレジットカード番号ではありません */
        public static final String CREDITCARDNUMBER_MESSAGE = "{org.hibernate.validator.constraints.CreditCardNumber.message}";
        /** invalid {type} barcode */
        public static final String EAN_MESSAGE = "{org.hibernate.validator.constraints.EAN.message}";
        /** 正しいE-Mailの形式ではありません。 */
        public static final String EMAIL_MESSAGE = "{org.hibernate.validator.constraints.Email.message}";
        /** {min}文字以上{max}文字以下で入力してください。 */
        public static final String LENGTH_MESSAGE = "{org.hibernate.validator.constraints.Length.message}";
        /** The check digit for ${value} is invalid, Luhn Modulo 10 checksum failed */
        public static final String LUHNCHECK_MESSAGE = "{org.hibernate.validator.constraints.LuhnCheck.message}";
        /** The check digit for ${value} is invalid, Modulo 10 checksum failed */
        public static final String MOD10CHECK_MESSAGE = "{org.hibernate.validator.constraints.Mod10Check.message}";
        /** The check digit for ${value} is invalid, Modulo 11 checksum failed */
        public static final String MOD11CHECK_MESSAGE = "{org.hibernate.validator.constraints.Mod11Check.message}";
        /** The check digit for ${value} is invalid, ${modType} checksum failed */
        public static final String MODCHECK_MESSAGE = "{org.hibernate.validator.constraints.ModCheck.message}";
        /** ブランクは許可されていません。 */
        public static final String NOTBLANK_MESSAGE = "{org.hibernate.validator.constraints.NotBlank.message}";
        /** 値を入力してください。 */
        public static final String NOTEMPTY_MESSAGE = "{org.hibernate.validator.constraints.NotEmpty.message}";
        /** script expression "{script}" didn't evaluate to true */
        public static final String PARAMETERSSCRIPTASSERT_MESSAGE = "{org.hibernate.validator.constraints.ParametersScriptAssert.message}";
        /** {min}から{max}の範囲内でなければなりません。 */
        public static final String RANGE_MESSAGE = "{org.hibernate.validator.constraints.Range.message}";
        /** 安全ではないHTMLが含まれています。 */
        public static final String SAFEHTML_MESSAGE = "{org.hibernate.validator.constraints.SafeHtml.message}";
        /** {script}による評価が不正です。 */
        public static final String SCRIPTASSERT_MESSAGE = "{org.hibernate.validator.constraints.ScriptAssert.message}";
        /** 正しいURLではありません。 */
        public static final String URL_MESSAGE = "{org.hibernate.validator.constraints.URL.message}";
        /** invalid Brazilian corporate taxpayer registry number (CNPJ) */
        public static final String BR_CNPJ_MESSAGE = "{org.hibernate.validator.constraints.br.CNPJ.message}";
        /** invalid Brazilian individual taxpayer registry number (CPF) */
        public static final String BR_CPF_MESSAGE = "{org.hibernate.validator.constraints.br.CPF.message}";
        /** invalid Brazilian Voter ID card number */
        public static final String BR_TITULOELEITORAL_MESSAGE = "{org.hibernate.validator.constraints.br.TituloEleitoral.message}";
    }

    /**
     * INFO関連メッセージ。
     */
    public static class Info {
        /** {0}に利用できる文字は以下です。 */
        public static final String AVAILABLE_CHARACTER = "{info.available.character}";
        /** {0}は、以下{1}種類を全て組み合わせてください。 */
        public static final String PASSWORD_USE_DIFFERENT_TYPE = "{info.password.use.different.type}";
    }

    /**
     * SUCCESS関連メッセージ。
     */
    public static class Success {
        /** 登録処理が正常に終了しました。 */
        public static final String CREATE = "{success.create}";
        /** 更新処理が正常に終了しました。 */
        public static final String UPDATE = "{success.update}";
        /** 削除処理が正常に終了しました。 */
        public static final String DELETE = "{success.delete}";
        /** フォームを追加しました。　更新ボタンが押されるまでDBに反映はされません。 */
        public static final String ADDITION_FORM = "{success.addition.form}";
        /** フォームを削除しました。　更新ボタンが押されるまでDBに反映はされません。 */
        public static final String DELETE_FORM = "{success.delete.form}";
    }

    /**
     * WARN関連メッセージ。
     */
    public static class Warn {
    }

    /**
     * ERROR関連メッセージ。
     */
    public static class Error {
        /** {0}と{1}が一致していません。 */
        public static final String DISAGREEMENT_VALUE = "{error.disagreement.value}";
        /** {0}は既に存在しています。 */
        public static final String ALREADY_EXISTS = "{error.already.exists}";
        /** {0}は既に使用されています。 */
        public static final String ALREADY_USED = "{error.already.used}";
        /** 対象データを選択してください。 */
        public static final String DATA_NOT_SELECT = "{error.data.not.select}";
        /** 現在設定されているパスワードと一致していません。 */
        public static final String PASSWORD_CURRENT_DIFFERENT = "{error.password.current.different}";
        /** {0}は、{1}を全て組み合わせてください。 */
        public static final String PASSWORD_USE_DIFFERENT_TYPE = "{error.password.use.different.type}";
        /** {0}文字以内で入力してください。({1}) */
        public static final String COMMON_MAXLENGTH_MESSAGE = "{error.common.MaxLength.message}";
        /** {0}バイト以内で入力してください。（日本語文字は3バイト）({1}) */
        public static final String COMMON_MAXLENGTHUTF8_MESSAGE = "{error.common.MaxLengthUTF8.message}";
        /** 値が重複しています。({0}) */
        public static final String COMMON_DUPLICATED_MESSAGE = "{error.common.Duplicated.message}";
        /** 許可されていないアカウントのためログインできません。 */
        public static final String LOGIN_NOT_ALLOW_ACCOUNT = "{error.login.not.allow.account}";
        /** ログイン失敗しました。 */
        public static final String LOGIN = "{error.login}";
        /** このアカウントはロックされています。 */
        public static final String LOGIN_LOCKED = "{error.login.locked}";
        /** 一定時間アクセスがありませんでした。再度ログインを行ってください。 */
        public static final String TIMEOUT = "{error.timeout}";
        /** ログイン失敗しました。 */
        public static final String FAILED_LOGIN = "{error.failed.login}";
        /** ログインユーザー自身のアカウントを削除することはできません。 */
        public static final String NOT_DELETE_LOGIN_USER_ACCOUNT = "{error.not.delete.login.user.account}";
        /** これ以上追加することは出来ません。 */
        public static final String LIMIT_REGISTER = "{error.limit.register}";
        /** 削除対象が選択されていません。 */
        public static final String UNCHECKED = "{error.unchecked}";
        /** 入力された権限レベルは既に登録されています。 */
        public static final String ALREADY_REGISTERED = "{error.already.registered}";
        /** 選択した権限レベルは削除できません。 */
        public static final String NOT_DELETE_AUTH_LEVEL = "{error.not.delete.auth.level}";
        /** テンプレートが未設定です。テンプレートを設定してください。 */
        public static final String TEMPLATE_UNSET = "{error.template.unset}";
        /** 有効終了日は有効開始日より過去には設定できません。 */
        public static final String NOT_SETTING_BEFORE_THE_START = "{error.not.setting.before.the.start}";
        /** ログイン中のアカウントに対応する、社員情報が存在しないため編集できません。 */
        public static final String CANOT_EDIT_BY_NOT_EXISTS_EMPLOYEE_INFO = "{error.canot.edit.by.not.exists.employee.info}";
        /** 他のユーザによって既に削除されています。 */
        public static final String OTHER_ALREADY_DELETED = "{error.other.already.deleted}";
        /** 選択された上位所属は設定出来ません。 */
        public static final String NOT_SET_UP_PARENT_CODE = "{error.not.set.up.parent.code}";
        /** メインに設定されている入力フォームは削除できません。 */
        public static final String NOT_DELETE_MAINFORM = "{error.not.delete.mainform}";
    }
}
