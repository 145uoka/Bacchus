package com.Bacchus.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.exentity.*;

/**
 * The DB meta of user_type_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserTypeMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserTypeMDbm _instance = new UserTypeMDbm();
    private UserTypeMDbm() {}
    public static UserTypeMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((UserTypeM)et).getUserTypeId(), (et, vl) -> ((UserTypeM)et).setUserTypeId(cti(vl)), "userTypeId");
        setupEpg(_epgMap, et -> ((UserTypeM)et).getUserTypeName(), (et, vl) -> ((UserTypeM)et).setUserTypeName((String)vl), "userTypeName");
        setupEpg(_epgMap, et -> ((UserTypeM)et).getSubsidyAmount(), (et, vl) -> ((UserTypeM)et).setSubsidyAmount(cti(vl)), "subsidyAmount");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_type_m";
    protected final String _tableDispName = "user_type_m";
    protected final String _tablePropertyName = "userTypeM";
    protected final TableSqlName _tableSqlName = new TableSqlName("user_type_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserTypeId = cci("user_type_id", "user_type_id", null, null, Integer.class, "userTypeId", null, true, true, true, "serial", 10, 0, "nextval('user_type_m_user_type_id_seq'::regclass)", false, null, null, null, "userTList", null, false);
    protected final ColumnInfo _columnUserTypeName = cci("user_type_name", "user_type_name", null, null, String.class, "userTypeName", null, false, false, true, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnSubsidyAmount = cci("subsidy_amount", "subsidy_amount", null, null, Integer.class, "subsidyAmount", null, false, false, true, "int4", 10, 0, "0", false, null, null, null, null, null, false);

    /**
     * user_type_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserTypeId() { return _columnUserTypeId; }
    /**
     * user_type_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserTypeName() { return _columnUserTypeName; }
    /**
     * subsidy_amount: {NotNull, int4(10), default=[0]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnSubsidyAmount() { return _columnSubsidyAmount; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserTypeId());
        ls.add(columnUserTypeName());
        ls.add(columnSubsidyAmount());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserTypeId()); }
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

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * user_t by user_type_id, named 'userTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserTypeId(), UserTDbm.getInstance().columnUserTypeId());
        return cri("user_t_user_type_id_fkey", "userTList", this, UserTDbm.getInstance(), mp, false, "userTypeM");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "user_type_m_user_type_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.UserTypeM"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.UserTypeMCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.UserTypeMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserTypeM> getEntityType() { return UserTypeM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserTypeM newEntity() { return new UserTypeM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserTypeM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserTypeM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
