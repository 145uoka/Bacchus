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
 * The DB meta of auth_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class AuthMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final AuthMDbm _instance = new AuthMDbm();
    private AuthMDbm() {}
    public static AuthMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((AuthM)et).getAuthLevel(), (et, vl) -> ((AuthM)et).setAuthLevel(cti(vl)), "authLevel");
        setupEpg(_epgMap, et -> ((AuthM)et).getAuthName(), (et, vl) -> ((AuthM)et).setAuthName((String)vl), "authName");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "auth_m";
    protected final String _tableDispName = "auth_m";
    protected final String _tablePropertyName = "authM";
    protected final TableSqlName _tableSqlName = new TableSqlName("auth_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnAuthLevel = cci("auth_level", "auth_level", null, null, Integer.class, "authLevel", null, true, false, true, "int4", 10, 0, null, false, null, null, null, "userTList", null, false);
    protected final ColumnInfo _columnAuthName = cci("auth_name", "auth_name", null, null, String.class, "authName", null, false, false, true, "text", 2147483647, 0, null, false, null, null, null, null, null, false);

    /**
     * auth_level: {PK, NotNull, int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthLevel() { return _columnAuthLevel; }
    /**
     * auth_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthName() { return _columnAuthName; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnAuthLevel());
        ls.add(columnAuthName());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnAuthLevel()); }
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
     * user_t by auth_level, named 'userTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAuthLevel(), UserTDbm.getInstance().columnAuthLevel());
        return cri("user_t_auth_level_fkey", "userTList", this, UserTDbm.getInstance(), mp, false, "authM");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.AuthM"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.AuthMCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.AuthMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<AuthM> getEntityType() { return AuthM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public AuthM newEntity() { return new AuthM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((AuthM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((AuthM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
