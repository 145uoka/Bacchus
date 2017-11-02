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
 * The DB meta of subsidy_mng_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SubsidyMngMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SubsidyMngMDbm _instance = new SubsidyMngMDbm();
    private SubsidyMngMDbm() {}
    public static SubsidyMngMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((SubsidyMngM)et).getMoneyId(), (et, vl) -> ((SubsidyMngM)et).setMoneyId(cti(vl)), "moneyId");
        setupEpg(_epgMap, et -> ((SubsidyMngM)et).getUserType(), (et, vl) -> ((SubsidyMngM)et).setUserType(cti(vl)), "userType");
        setupEpg(_epgMap, et -> ((SubsidyMngM)et).getMoney(), (et, vl) -> ((SubsidyMngM)et).setMoney(cti(vl)), "money");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "subsidy_mng_m";
    protected final String _tableDispName = "subsidy_mng_m";
    protected final String _tablePropertyName = "subsidyMngM";
    protected final TableSqlName _tableSqlName = new TableSqlName("subsidy_mng_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMoneyId = cci("money_id", "money_id", null, null, Integer.class, "moneyId", null, true, true, true, "serial", 10, 0, "nextval('subsidy_mng_m_money_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserType = cci("user_type", "user_type", null, null, Integer.class, "userType", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMoney = cci("money", "money", null, null, Integer.class, "money", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * money_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoneyId() { return _columnMoneyId; }
    /**
     * user_type: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserType() { return _columnUserType; }
    /**
     * money: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMoney() { return _columnMoney; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMoneyId());
        ls.add(columnUserType());
        ls.add(columnMoney());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnMoneyId()); }
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

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "subsidy_mng_m_money_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.SubsidyMngM"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.SubsidyMngMCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.SubsidyMngMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SubsidyMngM> getEntityType() { return SubsidyMngM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public SubsidyMngM newEntity() { return new SubsidyMngM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((SubsidyMngM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((SubsidyMngM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
