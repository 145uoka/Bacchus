package com.Bacchus.webbase.common.constants;


/**
 * 出力用項目名の定数クラス
 *
 * @author ishigouoka_k
 * $Id: ItemNameConstants.java 241 2017-06-01 11:33:12Z kanai_y@glue-si.com $
 */
public class ItemNameConstants {

    private ItemNameConstants(){};

    /**
     * keyから項目名を取得。
     *
     * @param key キー
     * @return 最大桁数
     */
    public static String getItemName(String key) {

        Item item = Item.getItem(key);

        if (item == null) {
            return null;
        }

        return item.getName();
    }

    /**
     * 項目名定義
     */
    public enum Item {

        ACCOUNT_NAME("accountName", "アカウント名"),
        LOGIN_ID("loginId", "ログインID"),
        PASSWORD("password", "パスワード"),
        NOW_PASSWORD("password", "現在のパスワード"),
        NEW_PASSWORD("newPassword", "新しいパスワード"),
        COMFIRM_PASSWORD("confirmPassword", "確認用パスワード"),
        ACCESS_TOKEN("accessToken", "アクセストークン"),
        AUTH_LEVEL("authLevel","権限レベル"),
        WORK_LOCAIONT_CODE("workLocationCode","勤務地コード"),
        EMP_CONTRACT_CODE("empContractCode","雇用契約コード"),
        EFFECTIVE_DATE("effectiveDate", "有効日"),
        ORDER_NUMBER("orderNumber", "表示順"),
        JOB_CODE("jobCode" , "職位コード"),
        DEPARTMENT_CODE("departmentCode" , "所属コード"),
        DEPARTMENT_NAME("name" , "所属名称"),
        PARENTCODE("parentCode" , "上位所属コード"),
        EFFECTIVE_START_DATE("effectiveStartDate" , "有効開始日"),
        EFFECTIVE_END_DATE("effectiveEndDate" , "有効終了日"),
        POSTAL_CODE("postalCode1" , "郵便番号"),
        BUSINESSTRIP_CODE("businessTripPostalCode1" , "出張先郵便番号"),
        SEARCH_EFFECTIVE_DATE("effectiveDate" , "郵便番号"),
        PHONE_NUMBER("phoneNumber1" , "電話番号"),
        MOBILE_NUMBER("mobileNumber1" , "携帯電話番号"),
        HIRE_DATE("hireDate" , "入社年月日"),
        TRIAL_END_DATE_1("trialEndDate1", "試用期間満了日1"),
        TRIAL_END_DATE_2("trialEndDate2", "試用期間満了日2"),
        RETIREMENT_DATE("retirementDate", "退職年月日"),
        LICENSE_NAME("licenceName", "資格名"),
        LICENSE_ABBREVIATION("licenceAbbreviation", "資格名略称"),
        LICENSE_NUMBER("licenceNumber", "資格番号"),
        LICENSE_ORDERNUMBER("orderNumber", "表示順"),
        ACADEMIC_DROP_OUT("droppedOut","中退年月日"),
        ACADEMIC_ADDMISSION_DATE("admissionDate", "入学年月日"),
        ACADEMIC_STATE_CODE("stateCode", "状態区分"),
        ACADEMIC_GRADUATE_DATE("graduateDate", "卒業年月日"),
        INSURANCE_EMPLOYMENT_PROC_STATUS("employmentProcStatus", "雇用保険処理状態"),
        INSURANCE_WELFARE_TREATED_FLG("welfareTreatedFlg", "厚生年金処理状態"),
        INSURANCE_HEALTH_PROC_STATUS("healthProcStatus", "健康保険処理状態"),
        INSURANCE_EMPLOYMENT_INSURANCE("employmentInsurance", "雇用保険番号"),
        INSURANCE_WELFARE_PENSION("welfarePension", "厚生年金被保険者番号"),
        INSURANCE_HEALTH("health", "健康保険番号"),
        EXHIBIT_COVENANT("covenant","誓約書"),
        EXHIBIT_COVENANTCONFIRMDATE("covenantConfirmDate","誓約書確認日"),
        EXHIBIT_SECURITYPROTECTION("securityProtection","機密保持誓約書"),
        EXHIBIT_SECURITYPROTECTIONCONFIRMDATE("securityProtectionConfirmDate","機密保持誓約書確認日"),
        EXHIBIT_CONVIVIALMEETING("convivialMeeting","親睦会同意書"),
        EXHIBIT_CONVIVIALMEETINGCONFIRMDATE("convivialMeetingConfirmDate","親睦会同意書確認日"),
        EXHIBIT_EMPLOYMENTCONTRACTS("employmentContracts","雇用契約書"),
        EXHIBIT_EMPLOYMENTCONTRACTSCONFIRMDATE("employmentContractsConfirmDate","雇用契約書確認日"),
        EXHIBIT_PMARK("pmark","Pマーク同意書"),
        EXHIBIT_PMARKCONFIRMDATE("pmarkConfirmDate","Pマーク同意書確認日"),
        EXHIBIT_WORKERSLIST("workersList","労働者名簿"),
        EXHIBIT_WORKERSLISTCONFIRMDATE("workersListConfirmDate","労働者名簿確認日"),
        EXHIBIT_HEALTHCERTIFICATE("healthCertificate","健康診断書"),
        EXHIBIT_HEALTHCERTIFICATECONFIRMDATE("healthCertificateConfirmDate","健康診断書確認日"),
        EXHIBIT_TRANSPORTATIONEXPENSES("transportationExpenses","通勤交通費"),
        EXHIBIT_TRANSPORTATIONEXPENSESCONFIRMDATE("transportationExpensesConfirmDate","通勤交通費確認日"),
        EXHIBIT_RENTALCOMPANYBADGE("rentalCompanyBadge","物品貸出_社章"),
        EXHIBIT_RENTALCOMPANYBADGECONFIRMDATE("rentalCompanyBadgeConfirmDate","物品貸出_社章確認日"),
        EXHIBIT_RENTALPROJECTCARD("rentalProjectCard","物品貸出_プロジェクトカード"),
        EXHIBIT_RENTALPROJECTCARDCONFIRMDATE("rentalProjectCardConfirmDate","物品貸出_プロジェクトカード確認日"),
        EXHIBIT_IDENTIFICATIONCARD("identificationCard","身分証明書"),
        EXHIBIT_IDENTIFICATIONCARDCONFIRMDATE("identificationCardConfirmDate","身分証明書確認日"),
        EXHIBIT_DIRECTDEBIT("directDebit","口座振替"),
        EXHIBIT_DIRECTDEBITCONFIRMDATE("directDebitConfirmDate","口座振替確認日"),
        EXHIBIT_PERSONALRECORD("personalRecord","履歴書"),
        EXHIBIT_PERSONALRECORDCONFIRMDATE("personalRecordConfirmDate","履歴書確認日"),
        EXHIBIT_CONTACT("contact","緊急時連絡先"),
        EXHIBIT_CONTACTCONFIRMDATE("contactConfirmDate","緊急時連絡先確認日"),
        EXHIBIT_EMPLOYMENTINSURANCECARD("employmentInsuranceCard","雇用保険被保険者証"),
        EXHIBIT_EMPLOYMENTINSURANCECARDCONFIRMDATE("employmentInsuranceCardConfirmDate","雇用保険被保険者証確認日"),
        EXHIBIT_PENSIONBOOK("pensionBook","年金手帳コピー"),
        EXHIBIT_PENSIONBOOKCONFIRMDATE("pensionBookConfirmDate","年金手帳コピー確認日"),
        EXHIBIT_MYNO("myNo","マイナンバー"),
        EXHIBIT_MYNOCONFIRMDATE("myNoConfirmDate","マイナンバー確認日"),
        LEAVE_STARTDATE("startDate", "開始日"),
        LEAVE_EXPECTEDDATE("expectedDate", "終了予定日"),
        TARGET_YM("targetYM","対象年月"),
        PJCARD_EFFECTIVESTARTDATE("effectiveStartDate","有効開始日"),
        EFFECTIVE_START_MONTH("effectiveStartMonth" , "有効開始月"),
        EMP_NO("empNo" , "社員番号")
        ;


        private String key;
        private String name;

        private Item(String key, String name) {
            this.key = key;
            this.name = name;
        }

        /**
         * keyを取得。
         * @return key
         */
        public String getKey() {
            return key;
        }

        /**
         * nameを取得。
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * key値から対象の項目名定義を返却。
         * @param key 項目key
         * @return 項目名定義
         */
        public static Item getItem(String key){

            if (key == null) {
                return null;
            }

            for(Item item: Item.values()) {
                if(key.equals(item.getKey())) {
                    return item;
                }
            }

            return null;
        }
    }

}