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
 * The DB meta of EventNotifyUser. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventNotifyUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventNotifyUserDbm _instance = new EventNotifyUserDbm();
    private EventNotifyUserDbm() {}
    public static EventNotifyUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getUserId(), (et, vl) -> ((EventNotifyUser)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getLoginId(), (et, vl) -> ((EventNotifyUser)et).setLoginId((String)vl), "loginId");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getLineFlg(), (et, vl) -> ((EventNotifyUser)et).setLineFlg(cti(vl)), "lineFlg");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getLineId(), (et, vl) -> ((EventNotifyUser)et).setLineId((String)vl), "lineId");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getLineUserName(), (et, vl) -> ((EventNotifyUser)et).setLineUserName((String)vl), "lineUserName");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getUserName(), (et, vl) -> ((EventNotifyUser)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getLastName(), (et, vl) -> ((EventNotifyUser)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getFirstName(), (et, vl) -> ((EventNotifyUser)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getEmail(), (et, vl) -> ((EventNotifyUser)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getPassword(), (et, vl) -> ((EventNotifyUser)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getUserTypeId(), (et, vl) -> ((EventNotifyUser)et).setUserTypeId(cti(vl)), "userTypeId");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getAuthLevel(), (et, vl) -> ((EventNotifyUser)et).setAuthLevel(cti(vl)), "authLevel");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getUserTypeName(), (et, vl) -> ((EventNotifyUser)et).setUserTypeName((String)vl), "userTypeName");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getSubsidyAmount(), (et, vl) -> ((EventNotifyUser)et).setSubsidyAmount(cti(vl)), "subsidyAmount");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getEventNotifyNo(), (et, vl) -> ((EventNotifyUser)et).setEventNotifyNo(cti(vl)), "eventNotifyNo");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getEventNo(), (et, vl) -> ((EventNotifyUser)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((EventNotifyUser)et).getNotifyDatetime(), (et, vl) -> ((EventNotifyUser)et).setNotifyDatetime(ctldt(vl)), "notifyDatetime");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "EventNotifyUser";
    protected final String _tableDispName = "EventNotifyUser";
    protected final String _tablePropertyName = "eventNotifyUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("EventNotifyUser", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "serial", 10, 0, null, false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnUserTypeName = cci("user_type_name", "user_type_name", null, null, String.class, "userTypeName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubsidyAmount = cci("subsidy_amount", "subsidy_amount", null, null, Integer.class, "subsidyAmount", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventNotifyNo = cci("event_notify_no", "event_notify_no", null, null, Integer.class, "eventNotifyNo", null, false, false, false, "serial", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnNotifyDatetime = cci("notify_datetime", "notify_datetime", null, null, java.time.LocalDateTime.class, "notifyDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);

    /**
     * user_id: {serial(10), refers to user_t.user_id}
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
     * user_type_name: {text(2147483647), refers to user_type_m.user_type_name}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserTypeName() { return _columnUserTypeName; }
    /**
     * subsidy_amount: {int4(10), refers to user_type_m.subsidy_amount}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubsidyAmount() { return _columnSubsidyAmount; }
    /**
     * event_notify_no: {serial(10), refers to event_notify.event_notify_no}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNotifyNo() { return _columnEventNotifyNo; }
    /**
     * event_no: {int4(10), refers to event_notify.event_no}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * notify_datetime: {timestamp(29, 6), refers to event_notify.notify_datetime}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotifyDatetime() { return _columnNotifyDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
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
        ls.add(columnUserTypeName());
        ls.add(columnSubsidyAmount());
        ls.add(columnEventNotifyNo());
        ls.add(columnEventNo());
        ls.add(columnNotifyDatetime());
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
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.customize.EventNotifyUser"; }
    public String getConditionBeanTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventNotifyUser> getEntityType() { return EventNotifyUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventNotifyUser newEntity() { return new EventNotifyUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventNotifyUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventNotifyUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
