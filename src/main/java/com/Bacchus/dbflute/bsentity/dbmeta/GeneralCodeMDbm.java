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
 * The DB meta of general_code_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class GeneralCodeMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final GeneralCodeMDbm _instance = new GeneralCodeMDbm();
    private GeneralCodeMDbm() {}
    public static GeneralCodeMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getCodeId(), (et, vl) -> ((GeneralCodeM)et).setCodeId(cti(vl)), "codeId");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getCodeDiv(), (et, vl) -> ((GeneralCodeM)et).setCodeDiv((String)vl), "codeDiv");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getCode(), (et, vl) -> ((GeneralCodeM)et).setCode((String)vl), "code");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getName(), (et, vl) -> ((GeneralCodeM)et).setName((String)vl), "name");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getOrderNumber(), (et, vl) -> ((GeneralCodeM)et).setOrderNumber(cti(vl)), "orderNumber");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getRemarks(), (et, vl) -> ((GeneralCodeM)et).setRemarks((String)vl), "remarks");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getDelFlg(), (et, vl) -> ((GeneralCodeM)et).setDelFlg(cti(vl)), "delFlg");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getRegisterDatetime(), (et, vl) -> ((GeneralCodeM)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getRegisterUser(), (et, vl) -> ((GeneralCodeM)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getUpdateDatetime(), (et, vl) -> ((GeneralCodeM)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((GeneralCodeM)et).getUpdateUser(), (et, vl) -> ((GeneralCodeM)et).setUpdateUser((String)vl), "updateUser");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "general_code_m";
    protected final String _tableDispName = "general_code_m";
    protected final String _tablePropertyName = "generalCodeM";
    protected final TableSqlName _tableSqlName = new TableSqlName("general_code_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCodeId = cci("code_id", "code_id", null, null, Integer.class, "codeId", null, true, true, true, "serial", 10, 0, "nextval('general_code_m_code_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCodeDiv = cci("code_div", "code_div", null, null, String.class, "codeDiv", null, false, false, true, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCode = cci("code", "code", null, null, String.class, "code", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnName = cci("name", "name", null, null, String.class, "name", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNumber = cci("order_number", "order_number", null, null, Integer.class, "orderNumber", null, false, false, false, "int2", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRemarks = cci("remarks", "remarks", null, null, String.class, "remarks", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDelFlg = cci("del_flg", "del_flg", null, null, Integer.class, "delFlg", null, false, false, false, "int2", 5, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);

    /**
     * code_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeId() { return _columnCodeId; }
    /**
     * code_div: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCodeDiv() { return _columnCodeDiv; }
    /**
     * code: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCode() { return _columnCode; }
    /**
     * name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnName() { return _columnName; }
    /**
     * order_number: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNumber() { return _columnOrderNumber; }
    /**
     * remarks: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRemarks() { return _columnRemarks; }
    /**
     * del_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDelFlg() { return _columnDelFlg; }
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

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnCodeId());
        ls.add(columnCodeDiv());
        ls.add(columnCode());
        ls.add(columnName());
        ls.add(columnOrderNumber());
        ls.add(columnRemarks());
        ls.add(columnDelFlg());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnCodeId()); }
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
    public String getSequenceName() { return "general_code_m_code_id_seq"; }
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
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.GeneralCodeM"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.GeneralCodeMCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.GeneralCodeMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<GeneralCodeM> getEntityType() { return GeneralCodeM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public GeneralCodeM newEntity() { return new GeneralCodeM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((GeneralCodeM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((GeneralCodeM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
