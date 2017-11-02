package com.Bacchus.app.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Bacchus.app.Exception.AbnormalRecordsDetection;
import com.Bacchus.app.components.GeneralCodeDto;
import com.Bacchus.dbflute.cbean.GeneralCodeMCB;
import com.Bacchus.dbflute.exbhv.GeneralCodeMBhv;
import com.Bacchus.dbflute.exentity.GeneralCodeM;
import com.Bacchus.webbase.common.constants.SystemCodeConstants;

/**
 * 共通サービスクラス。
 *
 * @author ishigouoka_k
 * $Id:$
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CommonService {

    @Autowired
    GeneralCodeMBhv generalCodeMBhv;


    /**
     * 入力されたコードに関連する[汎用_M]の名称を取得
     *
     * @param codeDiv
     * @param code
     * @return 汎用名称
     * @throws AbnormalRecordsDetection
     */
    public String getGeneralName(String codeDiv , String code) throws AbnormalRecordsDetection{

        if (StringUtils.isEmpty(code)) {
            return null;
        }
        GeneralCodeMCB generalCodeMCB = new GeneralCodeMCB();
        generalCodeMCB.query().setCodeDiv_Equal(codeDiv);
        generalCodeMCB.query().setCode_Equal(code);
        List<GeneralCodeM> generalCodeMList = generalCodeMBhv.readList(generalCodeMCB);

        if (generalCodeMList.size() != 1) {
            throw new AbnormalRecordsDetection(1, generalCodeMList.size());
        }
        GeneralCodeM GeneralCodeM = generalCodeMList.get(0);
        String generalName = GeneralCodeM.getName();
        return generalName;
    }

    /**
     * 入力されたコードに関連する[汎用_M]の備考を取得
     *
     * @param codeDiv
     * @param code
     * @return 汎用備考
     * @throws AbnormalRecordsDetection
     */
    public String getGeneralRemarks(String codeDiv, String code){

        if (StringUtils.isEmpty(code)) {
            return null;
        }
        GeneralCodeMCB generalCodeMCB = new GeneralCodeMCB();
        generalCodeMCB.query().setCodeDiv_Equal(codeDiv);
        generalCodeMCB.query().setCode_Equal(code);
        List<GeneralCodeM> generalCodeMList = generalCodeMBhv.readList(generalCodeMCB);

        if (generalCodeMList.size() != 1) {
            return null;
        }
        GeneralCodeM GeneralCodeM = generalCodeMList.get(0);
        String generalRemarks = GeneralCodeM.getRemarks();
        return generalRemarks;
    }

    /**
     * 性別リストを取得
     * @return 性別リスト
     */
    public List<GeneralCodeDto> getSexList(){
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_Equal(SystemCodeConstants.GeneralCodeKbn.SEX_CODE);
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }

    /**
     * 在籍状況リストを取得
     * @return 在籍状況リスト
     */
    public List<GeneralCodeDto> getEmploymentStatusList() {
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_Equal(SystemCodeConstants.GeneralCodeKbn.EMPLOYEE_STATUS);
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        // 取得したレコードのエンティティをDTOに変換してListを再構築
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }

    /**
     * 職種リストを取得
     * @return 職種リスト
     */
    public List<GeneralCodeDto> getOccupationList(){
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_Equal(SystemCodeConstants.GeneralCodeKbn.OCCUPATION_CODE);
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        // 取得したレコードのエンティティをDTOに変換してListを再構築
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }

    /**
     * 所属地域リストを取得
     * @return 所属地域リスト
     */
    public List<GeneralCodeDto> getAreaList(){
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_Equal(SystemCodeConstants.GeneralCodeKbn.AREA_CODE);
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        // 取得したレコードのエンティティをDTOに変換してListを再構築
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }


    /**
     * 指定したコード区分の汎用コードマスタのリストを取得。
     * @param codeKbn
     * @return 汎用コードマスタのリスト
     */
    public List<GeneralCodeDto> getGeneralCodeListByCodeKbn(String codeKbn) {
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_Equal(codeKbn);
        wlmcb.query().setDelFlg_Equal(SystemCodeConstants.Flag.OFF.getIntegerValue());
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        // 取得したレコードのエンティティをDTOに変換してListを再構築
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }

    /**
     * 指定した複数のコード区分の汎用コードマスタのリストを取得。
     * @param codeKbnList
     * @return 汎用コードマスタのリスト
     */
    public List<GeneralCodeDto> getGeneralCodeListByCodeKbn(List<String> codeKbnList) {
        GeneralCodeMCB wlmcb = new GeneralCodeMCB();
        wlmcb.query().setCodeDiv_InScope(codeKbnList);
        wlmcb.query().setDelFlg_Equal(SystemCodeConstants.Flag.OFF.getIntegerValue());
        wlmcb.query().addOrderBy_OrderNumber_Asc();
        // 取得したレコードのエンティティをDTOに変換してListを再構築
        return convertGeneralCodeMListToDtoList(generalCodeMBhv.readList(wlmcb));
    }

    /**
     * [汎用コード_M]のエンティティリストからDTOを作成
     * @param generalCodeMList [汎用コード_M]のエンティティリスト
     * @return DTOリスト
     */
    private static List<GeneralCodeDto> convertGeneralCodeMListToDtoList(List<GeneralCodeM> generalCodeMList) {
        List<GeneralCodeDto> dtoList = new ArrayList<>();
        dtoList.add(new GeneralCodeDto());
        for (GeneralCodeM entity : generalCodeMList) {
            GeneralCodeDto dto = new GeneralCodeDto();
            dto.setCodeId(entity.getCodeId());
            dto.setCodeDiv(entity.getCodeDiv());
            dto.setCode(entity.getCode());
            dto.setName(entity.getName());
            dto.setOrderNumber(entity.getOrderNumber());
            dto.setRemarks(entity.getRemarks());
            dto.setDelFlg(entity.getDelFlg());
            dtoList.add(dto);
        }
        return dtoList;
    }

}
