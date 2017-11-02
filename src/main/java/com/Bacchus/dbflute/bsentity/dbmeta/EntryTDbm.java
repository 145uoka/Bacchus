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
        setupEpg(_epgMap, et -> ((EntryT)et).getEntryId(), (et, vl) -> ((EntryT)et).setEntryId(cti(vl)), "entryId");
        setupEpg(_epgMap, et -> ((EntryT)et).getCandidateNo(), (et, vl) -> ((EntryT)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((EntryT)et).getUserId(), (et, vl) -> ((EntryT)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EntryT)et).getEntryDiv(), (et, vl) -> ((EntryT)et).setEntryDiv(cti(vl)), "entryDiv");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

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
    protected final ColumnInfo _columnEntryId = cci("entry_id", "entry_id", null, null, Integer.class, "entryId", null, true, true, true, "serial", 10, 0, "nextval('entry_t_entry_id_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnCandidateNo = cci("candidate_no", "candidate_no", null, null, Integer.class, "candidateNo", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEntryDiv = cci("entry_div", "entry_div", null, null, Integer.class, "entryDiv", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * entry_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryId() { return _columnEntryId; }
    /**
     * candidate_no: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * user_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * entry_div: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryDiv() { return _columnEntryDiv; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEntryId());
        ls.add(columnCandidateNo());
        ls.add(columnUserId());
        ls.add(columnEntryDiv());
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
