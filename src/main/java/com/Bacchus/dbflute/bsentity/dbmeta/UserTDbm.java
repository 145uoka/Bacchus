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
 * The DB meta of user_t. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserTDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserTDbm _instance = new UserTDbm();
    private UserTDbm() {}
    public static UserTDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserT)et).getUserId(), (et, vl) -> ((UserT)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((UserT)et).getLoginId(), (et, vl) -> ((UserT)et).setLoginId((String)vl), "loginId");
        setupEpg(_epgMap, et -> ((UserT)et).getLineId(), (et, vl) -> ((UserT)et).setLineId((String)vl), "lineId");
        setupEpg(_epgMap, et -> ((UserT)et).getUserName(), (et, vl) -> ((UserT)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((UserT)et).getLineFlg(), (et, vl) -> ((UserT)et).setLineFlg(cti(vl)), "lineFlg");
        setupEpg(_epgMap, et -> ((UserT)et).getLastName(), (et, vl) -> ((UserT)et).setLastName((String)vl), "lastName");
        setupEpg(_epgMap, et -> ((UserT)et).getFirstName(), (et, vl) -> ((UserT)et).setFirstName((String)vl), "firstName");
        setupEpg(_epgMap, et -> ((UserT)et).getEmail(), (et, vl) -> ((UserT)et).setEmail((String)vl), "email");
        setupEpg(_epgMap, et -> ((UserT)et).getPassword(), (et, vl) -> ((UserT)et).setPassword((String)vl), "password");
        setupEpg(_epgMap, et -> ((UserT)et).getAuthLevel(), (et, vl) -> ((UserT)et).setAuthLevel(cti(vl)), "authLevel");
        setupEpg(_epgMap, et -> ((UserT)et).getUserTypeId(), (et, vl) -> ((UserT)et).setUserTypeId(cti(vl)), "userTypeId");
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
        setupEfpg(_efpgMap, et -> ((UserT)et).getUserTypeM(), (et, vl) -> ((UserT)et).setUserTypeM((OptionalEntity<UserTypeM>)vl), "userTypeM");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_t";
    protected final String _tableDispName = "user_t";
    protected final String _tablePropertyName = "userT";
    protected final TableSqlName _tableSqlName = new TableSqlName("user_t", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, true, true, true, "serial", 10, 0, "nextval('user_t_user_id_seq'::regclass)", false, null, null, null, "entryTList,eventTList", null, false);
    protected final ColumnInfo _columnLoginId = cci("login_id", "login_id", null, null, String.class, "loginId", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineId = cci("line_id", "line_id", null, null, String.class, "lineId", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserName = cci("user_name", "user_name", null, null, String.class, "userName", null, false, false, true, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLineFlg = cci("line_flg", "line_flg", null, null, Integer.class, "lineFlg", null, false, false, true, "int4", 10, 0, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLastName = cci("last_name", "last_name", null, null, String.class, "lastName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFirstName = cci("first_name", "first_name", null, null, String.class, "firstName", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEmail = cci("email", "email", null, null, String.class, "email", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPassword = cci("password", "password", null, null, String.class, "password", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuthLevel = cci("auth_level", "auth_level", null, null, Integer.class, "authLevel", null, false, false, true, "int4", 10, 0, "0", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserTypeId = cci("user_type_id", "user_type_id", null, null, Integer.class, "userTypeId", null, false, false, true, "int4", 10, 0, null, false, null, null, "userTypeM", null, null, false);

    /**
     * user_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * login_id: {UQ, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoginId() { return _columnLoginId; }
    /**
     * line_id: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineId() { return _columnLineId; }
    /**
     * user_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * line_flg: {NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLineFlg() { return _columnLineFlg; }
    /**
     * last_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLastName() { return _columnLastName; }
    /**
     * first_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFirstName() { return _columnFirstName; }
    /**
     * email: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEmail() { return _columnEmail; }
    /**
     * password: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPassword() { return _columnPassword; }
    /**
     * auth_level: {NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthLevel() { return _columnAuthLevel; }
    /**
     * user_type_id: {NotNull, int4(10), FK to user_type_m}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserTypeId() { return _columnUserTypeId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnLoginId());
        ls.add(columnLineId());
        ls.add(columnUserName());
        ls.add(columnLineFlg());
        ls.add(columnLastName());
        ls.add(columnFirstName());
        ls.add(columnEmail());
        ls.add(columnPassword());
        ls.add(columnAuthLevel());
        ls.add(columnUserTypeId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnLoginId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * user_type_m by my user_type_id, named 'userTypeM'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserTypeM() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserTypeId(), UserTypeMDbm.getInstance().columnUserTypeId());
        return cfi("user_t_user_type_id_fkey", "userTypeM", this, UserTypeMDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userTList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * entry_t by user_id, named 'entryTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerEntryTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), EntryTDbm.getInstance().columnUserId());
        return cri("entry_t_user_id_fkey", "entryTList", this, EntryTDbm.getInstance(), mp, false, "userT");
    }
    /**
     * event_t by user_id, named 'eventTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerEventTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), EventTDbm.getInstance().columnUserId());
        return cri("event_t_user_id_fkey", "eventTList", this, EventTDbm.getInstance(), mp, false, "userT");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "user_t_user_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.UserT"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.UserTCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.UserTBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserT> getEntityType() { return UserT.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserT newEntity() { return new UserT(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserT)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserT)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
