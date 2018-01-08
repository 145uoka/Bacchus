package com.Bacchus.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.exentity.customize.*;

/**
 * The DB meta of EventIndex. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventIndexDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventIndexDbm _instance = new EventIndexDbm();
    private EventIndexDbm() {}
    public static EventIndexDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventNo(), (et, vl) -> ((EventIndex)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventName(), (et, vl) -> ((EventIndex)et).setEventName((String)vl), "eventName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventDetail(), (et, vl) -> ((EventIndex)et).setEventDetail((String)vl), "eventDetail");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventPlace(), (et, vl) -> ((EventIndex)et).setEventPlace((String)vl), "eventPlace");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventUrl(), (et, vl) -> ((EventIndex)et).setEventUrl((String)vl), "eventUrl");
        setupEpg(_epgMap, et -> ((EventIndex)et).getTell(), (et, vl) -> ((EventIndex)et).setTell((String)vl), "tell");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventEntryFee(), (et, vl) -> ((EventIndex)et).setEventEntryFee(cti(vl)), "eventEntryFee");
        setupEpg(_epgMap, et -> ((EventIndex)et).getAuxiliaryFlg(), (et, vl) -> ((EventIndex)et).setAuxiliaryFlg(cti(vl)), "auxiliaryFlg");
        setupEpg(_epgMap, et -> ((EventIndex)et).getFixFlg(), (et, vl) -> ((EventIndex)et).setFixFlg(cti(vl)), "fixFlg");
        setupEpg(_epgMap, et -> ((EventIndex)et).getCandidateNo(), (et, vl) -> ((EventIndex)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((EventIndex)et).getStoreName(), (et, vl) -> ((EventIndex)et).setStoreName((String)vl), "storeName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventDiv(), (et, vl) -> ((EventIndex)et).setEventDiv((String)vl), "eventDiv");
        setupEpg(_epgMap, et -> ((EventIndex)et).getUserId(), (et, vl) -> ((EventIndex)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EventIndex)et).getLoginId(), (et, vl) -> ((EventIndex)et).setLoginId((String)vl), "loginId");
        setupEpg(_epgMap, et -> ((EventIndex)et).getLineFlg(), (et, vl) -> ((EventIndex)et).setLineFlg(cti(vl)), "lineFlg");
        setupEpg(_epgMap, et -> ((EventIndex)et).getLineId(), (et, vl) -> ((EventIndex)et).setLineId((String)vl), "lineId");
        setupEpg(_epgMap, et -> ((EventIndex)et).getLineUserName(), (et, vl) -> ((EventIndex)et).setLineUserName((String)vl), "lineUserName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getUserName(), (et, vl) -> ((EventIndex)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getLastName(), (et, vl) -> ((EventIndex)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getFirstName(), (et, vl) -> ((EventIndex)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEmail(), (et, vl) -> ((EventIndex)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((EventIndex)et).getPassword(), (et, vl) -> ((EventIndex)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((EventIndex)et).getUserTypeId(), (et, vl) -> ((EventIndex)et).setUserTypeId(cti(vl)), "userTypeId");
        setupEpg(_epgMap, et -> ((EventIndex)et).getAuthLevel(), (et, vl) -> ((EventIndex)et).setAuthLevel(cti(vl)), "authLevel");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventStartDatetime(), (et, vl) -> ((EventIndex)et).setEventStartDatetime(ctldt(vl)), "eventStartDatetime");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEventEndDatetime(), (et, vl) -> ((EventIndex)et).setEventEndDatetime(ctldt(vl)), "eventEndDatetime");
        setupEpg(_epgMap, et -> ((EventIndex)et).getStartDate(), (et, vl) -> ((EventIndex)et).setStartDate((String)vl), "startDate");
        setupEpg(_epgMap, et -> ((EventIndex)et).getStartTime(), (et, vl) -> ((EventIndex)et).setStartTime((String)vl), "startTime");
        setupEpg(_epgMap, et -> ((EventIndex)et).getEntryCount(), (et, vl) -> ((EventIndex)et).setEntryCount(ctl(vl)), "entryCount");
        setupEpg(_epgMap, et -> ((EventIndex)et).getCodeId(), (et, vl) -> ((EventIndex)et).setCodeId(cti(vl)), "codeId");
        setupEpg(_epgMap, et -> ((EventIndex)et).getCodeDiv(), (et, vl) -> ((EventIndex)et).setCodeDiv((String)vl), "codeDiv");
        setupEpg(_epgMap, et -> ((EventIndex)et).getCode(), (et, vl) -> ((EventIndex)et).setCode((String)vl), "code");
        setupEpg(_epgMap, et -> ((EventIndex)et).getName(), (et, vl) -> ((EventIndex)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((EventIndex)et).getOrderNumber(), (et, vl) -> ((EventIndex)et).setOrderNumber(cti(vl)), "orderNumber");
        setupEpg(_epgMap, et -> ((EventIndex)et).getRemarks(), (et, vl) -> ((EventIndex)et).setRemarks((String)vl), "remarks");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "EventIndex";
    protected final String _tableDispName = "EventIndex";
    protected final String _tablePropertyName = "eventIndex";
    protected final TableSqlName _tableSqlName = new TableSqlName("EventIndex", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, false, false, false, "serial", 10, 0, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnEventDiv = cci("event_div", "event_div", null, null, String.class, "eventDiv", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoginId = cci("login_id", "login_id", null, null, String.class, "loginId", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineFlg = cci("line_flg", "line_flg", null, null, Integer.class, "lineFlg", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineId = cci("line_id", "line_id", null, null, String.class, "lineId", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineUserName = cci("line_user_name", "line_user_name", null, null, String.class, "lineUserName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserName = cci("user_name", "user_name", null, null, String.class, "userName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("last_name", "last_name", null, null, String.class, "lastName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("first_name", "first_name", null, null, String.class, "firstName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("email", "email", null, null, String.class, "email", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("password", "password", null, null, String.class, "password", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserTypeId = cci("user_type_id", "user_type_id", null, null, Integer.class, "userTypeId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuthLevel = cci("auth_level", "auth_level", null, null, Integer.class, "authLevel", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventStartDatetime = cci("event_start_datetime", "event_start_datetime", null, null, java.time.LocalDateTime.class, "eventStartDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventEndDatetime = cci("event_end_datetime", "event_end_datetime", null, null, java.time.LocalDateTime.class, "eventEndDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartDate = cci("start_date", "start_date", null, null, String.class, "startDate", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("start_time", "start_time", null, null, String.class, "startTime", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryCount = cci("entry_count", "entry_count", null, null, Long.class, "entryCount", null, false, false, false, "int8", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodeId = cci("code_id", "code_id", null, null, Integer.class, "codeId", null, false, false, false, "serial", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodeDiv = cci("code_div", "code_div", null, null, String.class, "codeDiv", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCode = cci("code", "code", null, null, String.class, "code", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNumber = cci("order_number", "order_number", null, null, Integer.class, "orderNumber", null, false, false, false, "int2", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);

    /**
     * event_no: {serial(10), refers to event_t.event_no}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * event_name: {text(2147483647), refers to event_t.event_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventName() { return _columnEventName; }
    /**
     * event_detail: {text(2147483647), refers to event_t.event_detail}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventDetail() { return _columnEventDetail; }
    /**
     * event_place: {text(2147483647), refers to event_t.event_place}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventPlace() { return _columnEventPlace; }
    /**
     * event_url: {text(2147483647), refers to event_t.event_url}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventUrl() { return _columnEventUrl; }
    /**
     * tell: {text(2147483647), refers to event_t.tell}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTell() { return _columnTell; }
    /**
     * event_entry_fee: {int4(10), refers to event_t.event_entry_fee}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventEntryFee() { return _columnEventEntryFee; }
    /**
     * auxiliary_flg: {int2(5), refers to event_t.auxiliary_flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuxiliaryFlg() { return _columnAuxiliaryFlg; }
    /**
     * fix_flg: {int2(5), refers to event_t.fix_flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixFlg() { return _columnFixFlg; }
    /**
     * candidate_no: {int4(10), refers to event_t.candidate_no}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * store_name: {text(2147483647), refers to event_t.store_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreName() { return _columnStoreName; }
    /**
     * event_div: {text(2147483647), refers to event_t.event_div}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventDiv() { return _columnEventDiv; }
    /**
     * user_id: {int4(10), refers to event_t.user_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * login_id: {text(2147483647), refers to user_t.login_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginId() { return _columnLoginId; }
    /**
     * line_flg: {int4(10), refers to user_t.line_flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineFlg() { return _columnLineFlg; }
    /**
     * line_id: {text(2147483647), refers to user_t.line_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineId() { return _columnLineId; }
    /**
     * line_user_name: {text(2147483647), refers to user_t.line_user_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineUserName() { return _columnLineUserName; }
    /**
     * user_name: {text(2147483647), refers to user_t.user_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * last_name: {text(2147483647), refers to user_t.last_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * first_name: {text(2147483647), refers to user_t.first_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * email: {text(2147483647), refers to user_t.email}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * password: {text(2147483647), refers to user_t.password}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * user_type_id: {int4(10), refers to user_t.user_type_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserTypeId() { return _columnUserTypeId; }
    /**
     * auth_level: {int4(10), refers to user_t.auth_level}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthLevel() { return _columnAuthLevel; }
    /**
     * event_start_datetime: {timestamp(29, 6), refers to candidate_t.event_start_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventStartDatetime() { return _columnEventStartDatetime; }
    /**
     * event_end_datetime: {timestamp(29, 6), refers to candidate_t.event_end_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventEndDatetime() { return _columnEventEndDatetime; }
    /**
     * start_date: {text(2147483647), refers to candidate_t.start_date}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartDate() { return _columnStartDate; }
    /**
     * start_time: {text(2147483647), refers to candidate_t.start_time}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
    /**
     * entry_count: {int8(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryCount() { return _columnEntryCount; }
    /**
     * code_id: {serial(10), refers to general_code_m.code_id}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeId() { return _columnCodeId; }
    /**
     * code_div: {text(2147483647), refers to general_code_m.code_div}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeDiv() { return _columnCodeDiv; }
    /**
     * code: {text(2147483647), refers to general_code_m.code}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode() { return _columnCode; }
    /**
     * name: {text(2147483647), refers to general_code_m.name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * order_number: {int2(5), refers to general_code_m.order_number}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNumber() { return _columnOrderNumber; }
    /**
     * remarks: {text(2147483647), refers to general_code_m.remarks}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }

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
        ls.add(columnEventDiv());
        ls.add(columnUserId());
        ls.add(columnLoginId());
        ls.add(columnLineFlg());
        ls.add(columnLineId());
        ls.add(columnLineUserName());
        ls.add(columnUserName());
        ls.add(columnLastName());
        ls.add(columnFirstName());
        ls.add(columnEmail());
        ls.add(columnPassword());
        ls.add(columnUserTypeId());
        ls.add(columnAuthLevel());
        ls.add(columnEventStartDatetime());
        ls.add(columnEventEndDatetime());
        ls.add(columnStartDate());
        ls.add(columnStartTime());
        ls.add(columnEntryCount());
        ls.add(columnCodeId());
        ls.add(columnCodeDiv());
        ls.add(columnCode());
        ls.add(columnName());
        ls.add(columnOrderNumber());
        ls.add(columnRemarks());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.customize.EventIndex"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventIndex> getEntityType() { return EventIndex.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventIndex newEntity() { return new EventIndex(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventIndex)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventIndex)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
