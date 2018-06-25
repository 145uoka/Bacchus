package com.Bacchus.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The DB meta of event_t. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventTDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventTDbm _instance = new EventTDbm();
    private EventTDbm() {}
    public static EventTDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((EventT)et).getEventNo(), (et, vl) -> ((EventT)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((EventT)et).getEventName(), (et, vl) -> ((EventT)et).setEventName((String)vl), "eventName");
        setupEpg(_epgMap, et -> ((EventT)et).getEventDetail(), (et, vl) -> ((EventT)et).setEventDetail((String)vl), "eventDetail");
        setupEpg(_epgMap, et -> ((EventT)et).getEventPlace(), (et, vl) -> ((EventT)et).setEventPlace((String)vl), "eventPlace");
        setupEpg(_epgMap, et -> ((EventT)et).getEventUrl(), (et, vl) -> ((EventT)et).setEventUrl((String)vl), "eventUrl");
        setupEpg(_epgMap, et -> ((EventT)et).getTell(), (et, vl) -> ((EventT)et).setTell((String)vl), "tell");
        setupEpg(_epgMap, et -> ((EventT)et).getEventEntryFee(), (et, vl) -> ((EventT)et).setEventEntryFee(cti(vl)), "eventEntryFee");
        setupEpg(_epgMap, et -> ((EventT)et).getAuxiliaryFlg(), (et, vl) -> ((EventT)et).setAuxiliaryFlg(cti(vl)), "auxiliaryFlg");
        setupEpg(_epgMap, et -> ((EventT)et).getFixFlg(), (et, vl) -> ((EventT)et).setFixFlg(cti(vl)), "fixFlg");
        setupEpg(_epgMap, et -> ((EventT)et).getCandidateNo(), (et, vl) -> ((EventT)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((EventT)et).getStoreName(), (et, vl) -> ((EventT)et).setStoreName((String)vl), "storeName");
        setupEpg(_epgMap, et -> ((EventT)et).getEventTypeId(), (et, vl) -> ((EventT)et).setEventTypeId(cti(vl)), "eventTypeId");
        setupEpg(_epgMap, et -> ((EventT)et).getUserId(), (et, vl) -> ((EventT)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EventT)et).getRegisterDatetime(), (et, vl) -> ((EventT)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((EventT)et).getRegisterUser(), (et, vl) -> ((EventT)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((EventT)et).getUpdateDatetime(), (et, vl) -> ((EventT)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((EventT)et).getUpdateUser(), (et, vl) -> ((EventT)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((EventT)et).getDeleteFlag(), (et, vl) -> ((EventT)et).setDeleteFlag((Boolean)vl), "deleteFlag");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((EventT)et).getEventTypeM(), (et, vl) -> ((EventT)et).setEventTypeM((OptionalEntity<EventTypeM>)vl), "eventTypeM");
        setupEfpg(_efpgMap, et -> ((EventT)et).getUserT(), (et, vl) -> ((EventT)et).setUserT((OptionalEntity<UserT>)vl), "userT");
        setupEfpg(_efpgMap, et -> ((EventT)et).getEventNotifyAsOne(), (et, vl) -> ((EventT)et).setEventNotifyAsOne((OptionalEntity<EventNotify>)vl), "eventNotifyAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "event_t";
    protected final String _tableDispName = "event_t";
    protected final String _tablePropertyName = "eventT";
    protected final TableSqlName _tableSqlName = new TableSqlName("event_t", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, true, true, true, "serial", 10, 0, "nextval('event_t_event_no_seq'::regclass)", false, null, null, null, "candidateTList", null, false);
    protected final ColumnInfo _columnEventName = cci("event_name", "event_name", null, null, String.class, "eventName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventDetail = cci("event_detail", "event_detail", null, null, String.class, "eventDetail", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventPlace = cci("event_place", "event_place", null, null, String.class, "eventPlace", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventUrl = cci("event_url", "event_url", null, null, String.class, "eventUrl", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTell = cci("tell", "tell", null, null, String.class, "tell", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventEntryFee = cci("event_entry_fee", "event_entry_fee", null, null, Integer.class, "eventEntryFee", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuxiliaryFlg = cci("auxiliary_flg", "auxiliary_flg", null, null, Integer.class, "auxiliaryFlg", null, false, false, false, "int2", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFixFlg = cci("fix_flg", "fix_flg", null, null, Integer.class, "fixFlg", null, false, false, false, "int2", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCandidateNo = cci("candidate_no", "candidate_no", null, null, Integer.class, "candidateNo", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStoreName = cci("store_name", "store_name", null, null, String.class, "storeName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventTypeId = cci("event_type_id", "event_type_id", null, null, Integer.class, "eventTypeId", null, false, false, false, "int4", 10, 0, null, false, null, null, "eventTypeM", null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "int4", 10, 0, null, false, null, null, "userT", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, false, "bool", 1, 0, "false", false, null, null, null, null, null, false);

    /**
     * event_no: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * event_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventName() { return _columnEventName; }
    /**
     * event_detail: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventDetail() { return _columnEventDetail; }
    /**
     * event_place: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventPlace() { return _columnEventPlace; }
    /**
     * event_url: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventUrl() { return _columnEventUrl; }
    /**
     * tell: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTell() { return _columnTell; }
    /**
     * event_entry_fee: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventEntryFee() { return _columnEventEntryFee; }
    /**
     * auxiliary_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuxiliaryFlg() { return _columnAuxiliaryFlg; }
    /**
     * fix_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixFlg() { return _columnFixFlg; }
    /**
     * candidate_no: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * store_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreName() { return _columnStoreName; }
    /**
     * event_type_id: {int4(10), FK to event_type_m}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventTypeId() { return _columnEventTypeId; }
    /**
     * user_id: {int4(10), FK to user_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_user: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_user: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    /**
     * delete_flag: {bool(1), default=[false]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDeleteFlag() { return _columnDeleteFlag; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEventNo());
        ls.add(columnEventName());
        ls.add(columnEventDetail());
        ls.add(columnEventPlace());
        ls.add(columnEventUrl());
        ls.add(columnTell());
        ls.add(columnEventEntryFee());
        ls.add(columnAuxiliaryFlg());
        ls.add(columnFixFlg());
        ls.add(columnCandidateNo());
        ls.add(columnStoreName());
        ls.add(columnEventTypeId());
        ls.add(columnUserId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnDeleteFlag());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEventNo()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * event_type_m by my event_type_id, named 'eventTypeM'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignEventTypeM() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEventTypeId(), EventTypeMDbm.getInstance().columnEventTypeId());
        return cfi("event_t_event_type_id_fkey", "eventTypeM", this, EventTypeMDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "eventTList", false);
    }
    /**
     * user_t by my user_id, named 'userT'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserT() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserTDbm.getInstance().columnUserId());
        return cfi("event_t_user_id_fkey", "userT", this, UserTDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "eventTList", false);
    }
    /**
     * event_notify by event_no, named 'eventNotifyAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignEventNotifyAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEventNo(), EventNotifyDbm.getInstance().columnEventNo());
        return cfi("event_notify_event_no_fkey", "eventNotifyAsOne", this, EventNotifyDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "eventT", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * candidate_t by event_no, named 'candidateTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerCandidateTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEventNo(), CandidateTDbm.getInstance().columnEventNo());
        return cri("candidate_t_event_no_fkey", "candidateTList", this, CandidateTDbm.getInstance(), mp, false, "eventT");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "event_t_event_no_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.EventT"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.EventTCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.EventTBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventT> getEntityType() { return EventT.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventT newEntity() { return new EventT(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventT)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventT)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
