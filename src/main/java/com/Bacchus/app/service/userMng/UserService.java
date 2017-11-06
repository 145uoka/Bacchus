//package com.Bacchus.app.service.userMng;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.dbflute.cbean.scoping.OrQuery;
//import org.dbflute.optional.OptionalEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.Bacchus.app.form.userMng.UserAddForm;
//import com.Bacchus.app.util.DateUtil;
//import com.Bacchus.dbflute.exbhv.UserTBhv;
//import com.Bacchus.dbflute.exentity.UserT;
//
///**
// * 雇用契約設定のサービスクラス。
// *
// * @author majo_k
// */
//@Service
//@Transactional(rollbackFor = Exception.class)
//public class UserService{
//
//	@Autowired
//	UserTBhv userTBhv;
//
//	/**
//	 * 新規登録。
//	 *
//	 * @param form
//	 * @return 登録ID
//	 */
//	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
//	public void registerEmpContract(UserAddForm form) {
//
//		// 登録データの生成
//		UserT userT = new UserT();
//		userT.setUserName(form.getUserName());
//		userT.setUserType(form.getUserCode());
//		userT.setEmail(form.getEmail());
//		userT.setPassword(form.getPassword());
//
//		// 登録
//		userTBhv.insert(userT);
//
//	}
//
//	/**
//	 * 更新。
//	 *
//	 * @param form
//	 */
//	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
//	public void updateEmpContract(ContractMstEditForm form) {
//
//		OptionalEntity<EmpContractM> empContractMOE = empContractMBhv.selectByPK(form.getEmpContractId());
//		EmpContractM empContractM = empContractMOE.get();
//		// int beforeEffectiveFlag = empContractM.getEffectiveFlag();
//
//		// 登録データの生成
//		empContractM.setEmpContractId(form.getEmpContractId());
//		empContractM.setEmpContractCode(form.getEmpContractCode());
//		empContractM.setName(form.getName());
//		empContractM.setAbbreviation(form.getAbbreviation());
//		// empContractM.setEffectiveFlag(empContractM.getEffectiveFlag());
//		empContractM.setEffectiveStartDate(DateUtil.convertToLocalDate(form.getEffectiveStartDate()));
//		if (!form.getEffectiveEndDate().isEmpty()) {
//			empContractM.setEffectiveEndDate(DateUtil.convertToLocalDate(form.getEffectiveEndDate()));
//		} else {
//			empContractM.setEffectiveEndDate(null);
//		}
//		// if(form.getEffectiveEndDate().isEmpty()) {
//		// empContractM.setEffectiveFlag(1);
//		// } else {
//		// empContractM.setEffectiveFlag(0);
//		// }
//		/*
//		 * if (beforeEffectiveFlag != form.getEffectiveFlag()) { // 有効フラグ変更時 if
//		 * (Flag.ON.getIntegerValue() == form.getEffectiveFlag()) { //
//		 * 有効にした場合、有効終了日クリア empContractM.setEffectiveEndDate(null); } else { //
//		 * 無効にした場合、有効終了日に本日をセット
//		 * empContractM.setEffectiveEndDate(LocalDate.now()); } }
//		 */
//		// 更新
//		empContractMBhv.update(empContractM);
//	}
//
//	/**
//	 * 対象IDレコード取得。
//	 *
//	 * @param id
//	 *            ID
//	 * @return DTO
//	 */
//	public EmpContractDto selectEmpContractWhereIdEqualsChecked(Integer id) {
//		OptionalEntity<EmpContractM> empContractM = empContractMBhv.selectByPK(id);
//		EmpContractDto empContractDto = convertEmpContractMEntityToDto(empContractM.get());
//		return empContractDto;
//	}
//
//	/**
//	 * エンティティリストをDTOリストに変換。
//	 *
//	 * @param empContractMList
//	 *            [雇用契約_M]エンティティリスト
//	 * @return [雇用契約_M]DTOリスト
//	 */
//	private List<EmpContractDto> convertEmpContractMEntityListToDtoList(List<EmpContractM> empContractMList) {
//		// [雇用契約_M]から取得したレコードのエンティティをDTOに変換してListを再構築
//		List<EmpContractDto> empContractDtoList = new ArrayList<>();
//		for (EmpContractM ecm : empContractMList) {
//			EmpContractDto empContractDto = new EmpContractDto();
//			empContractDto.setEmpContractId(ecm.getEmpContractId());
//			empContractDto.setEmpContractCode(ecm.getEmpContractCode());
//			empContractDto.setName(ecm.getName());
//			empContractDto.setAbbreviation(ecm.getAbbreviation());
//			// empContractDto.setEffectiveFlag(ecm.getEffectiveFlag());
//			empContractDto.setEffectiveStartDate(ecm.getEffectiveStartDate());
//			empContractDto.setEffectiveEndDate(ecm.getEffectiveEndDate());
//			empContractDto.setEffectiveStartDateStr(DateUtil.date2DisplayStr(ecm.getEffectiveStartDate()));
//			empContractDto.setEffectiveEndDateStr(DateUtil.date2DisplayStr(ecm.getEffectiveEndDate()));
//			empContractDtoList.add(empContractDto);
//		}
//		return empContractDtoList;
//	}
//
//	/**
//	 * エンティティリストを先頭がブランクのDTOリストに変換（プルダウン用）。
//	 *
//	 * @param empContractMList
//	 *            [雇用契約_M]エンティティリスト
//	 * @return [雇用契約_M]DTOリスト
//	 */
//	private List<EmpContractDto> convertEmpContractMEntityListToDtoListWithBlank(List<EmpContractM> empContractMList) {
//		// [雇用契約_M]から取得したレコードのエンティティをDTOに変換してListを再構築
//		List<EmpContractDto> empContractDtoList = new ArrayList<>();
//		empContractDtoList.add(new EmpContractDto());
//		for (EmpContractM ecm : empContractMList) {
//			EmpContractDto empContractDto = new EmpContractDto();
//			empContractDto.setEmpContractId(ecm.getEmpContractId());
//			empContractDto.setEmpContractCode(ecm.getEmpContractCode());
//			empContractDto.setName(ecm.getName());
//			empContractDto.setAbbreviation(ecm.getAbbreviation());
//			// empContractDto.setEffectiveFlag(ecm.getEffectiveFlag());
//			empContractDto.setEffectiveStartDate(ecm.getEffectiveStartDate());
//			empContractDto.setEffectiveEndDate(ecm.getEffectiveEndDate());
//			empContractDto.setEffectiveStartDateStr(DateUtil.date2DisplayStr(ecm.getEffectiveStartDate()));
//			empContractDto.setEffectiveEndDateStr(DateUtil.date2DisplayStr(ecm.getEffectiveEndDate()));
//			empContractDtoList.add(empContractDto);
//		}
//		return empContractDtoList;
//	}
//
//	/**
//	 * エンティティをDTOに変換。
//	 *
//	 * @param ecm
//	 *            エンティティ
//	 * @return DTO
//	 */
//	private EmpContractDto convertEmpContractMEntityToDto(EmpContractM ecm) {
//		EmpContractDto dto = new EmpContractDto();
//		dto.setEmpContractId(ecm.getEmpContractId());
//		dto.setEmpContractCode(ecm.getEmpContractCode());
//		dto.setName(ecm.getName());
//		dto.setAbbreviation(ecm.getAbbreviation());
//		// dto.setEffectiveFlag(ecm.getEffectiveFlag());
//		dto.setEffectiveStartDate(ecm.getEffectiveStartDate());
//		dto.setEffectiveEndDate(ecm.getEffectiveEndDate());
//		return dto;
//	}
//
//	/**
//	 * 指定日に有効な雇用契約レコードを取得
//	 *
//	 * @param day
//	 *            指定日
//	 * @return EmpContractDtoのList
//	 */
//	public List<EmpContractDto> getContractList(String day) {
//		LocalDate targetDate = DateUtil.convertToLocalDate(day);
//		EmpContractMCB ecmcb = new EmpContractMCB();
//		ecmcb.query().addOrderBy_EmpContractCode_Asc();
//		ecmcb.query().setEffectiveStartDate_LessEqual(targetDate);
//		ecmcb.orScopeQuery(new OrQuery<EmpContractMCB>() {
//			public void query(EmpContractMCB orCB) {
//				orCB.query().setEffectiveEndDate_GreaterEqual(targetDate);
//				orCB.query().setEffectiveEndDate_IsNull();
//			}
//		});
//
//		// 取得したレコードのエンティティをDTOに変換してListを再構築
//		return convertEmpContractMEntityListToDtoListWithBlank(empContractMBhv.readList(ecmcb));
//	}
//
//}
