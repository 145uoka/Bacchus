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
 * The DB meta of entry_t. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EntryTDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EntryTDbm _instance = new EntryTDbm();
    private EntryTDbm() {}
    public static EntryTDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EntryT)et).getEntryId(), (et, vl) -> ((EntryT)et).setEntryId(ctl(vl)), "entryId");
        setupEpg(_epgMap, et -> ((EntryT)et).getCandidateNo(), (et, vl) -> ((EntryT)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((EntryT)et).getEntryDiv(), (et, vl) -> ((EntryT)et).setEntryDiv(cti(vl)), "entryDiv");
        setupEpg(_epgMap, et -> ((EntryT)et).getUserId(), (et, vl) -> ((EntryT)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EntryT)et).getRegisterDatetime(), (et, vl) -> ((EntryT)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((EntryT)et).getRegisterUser(), (et, vl) -> ((EntryT)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((EntryT)et).getUpdateDatetime(), (et, vl) -> ((EntryT)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((EntryT)et).getUpdateUser(), (et, vl) -> ((EntryT)et).setUpdateUser((String)vl), "updateUser");
        setupEpg(_epgMap, et -> ((EntryT)et).getDeleteFlag(), (et, vl) -> ((EntryT)et).setDeleteFlag((Boolean)vl), "deleteFlag");
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
        setupEfpg(_efpgMap, et -> ((EntryT)et).getCandidateT(), (et, vl) -> ((EntryT)et).setCandidateT((OptionalEntity<CandidateT>)vl), "candidateT");
        setupEfpg(_efpgMap, et -> ((EntryT)et).getUserT(), (et, vl) -> ((EntryT)et).setUserT((OptionalEntity<UserT>)vl), "userT");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "entry_t";
    protected final String _tableDispName = "entry_t";
    protected final String _tablePropertyName = "entryT";
    protected final TableSqlName _tableSqlName = new TableSqlName("entry_t", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEntryId = cci("entry_id", "entry_id", null, null, Long.class, "entryId", null, true, true, true, "bigserial", 19, 0, "nextval('entry_t_entry_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCandidateNo = cci("candidate_no", "candidate_no", null, null, Integer.class, "candidateNo", null, false, false, true, "int4", 10, 0, null, false, null, null, "candidateT", null, null, false);
    protected final ColumnInfo _columnEntryDiv = cci("entry_div", "entry_div", null, null, Integer.class, "entryDiv", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, true, "int4", 10, 0, null, false, null, null, "userT", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, false, "timestamp", 29, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 29, 6, "CURRENT_TIMESTAMP", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnDeleteFlag = cci("delete_flag", "delete_flag", null, null, Boolean.class, "deleteFlag", null, false, false, false, "bool", 1, 0, "false", false, null, null, null, null, null, false);

    /**
     * entry_id: {PK, ID, NotNull, bigserial(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryId() { return _columnEntryId; }
    /**
     * candidate_no: {NotNull, int4(10), FK to candidate_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * entry_div: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryDiv() { return _columnEntryDiv; }
    /**
     * user_id: {NotNull, int4(10), FK to user_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * register_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_user: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    /**
     * update_datetime: {timestamp(29, 6), default=[CURRENT_TIMESTAMP]}
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
        ls.add(columnEntryId());
        ls.add(columnCandidateNo());
        ls.add(columnEntryDiv());
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
    protected UniqueInfo cpui() { return hpcpui(columnEntryId()); }
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
     * candidate_t by my candidate_no, named 'candidateT'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignCandidateT() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCandidateNo(), CandidateTDbm.getInstance().columnCandidateNo());
        return cfi("entry_t_candidate_no_fkey", "candidateT", this, CandidateTDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "entryTList", false);
    }
    /**
     * user_t by my user_id, named 'userT'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserT() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserTDbm.getInstance().columnUserId());
        return cfi("entry_t_user_id_fkey", "userT", this, UserTDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "entryTList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "entry_t_entry_id_seq"; }
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
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.EntryT"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.EntryTCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.EntryTBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EntryT> getEntityType() { return EntryT.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EntryT newEntity() { return new EntryT(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EntryT)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EntryT)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
