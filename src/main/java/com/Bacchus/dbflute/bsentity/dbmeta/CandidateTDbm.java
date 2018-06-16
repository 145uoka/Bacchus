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
 * The DB meta of candidate_t. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class CandidateTDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final CandidateTDbm _instance = new CandidateTDbm();
    private CandidateTDbm() {}
    public static CandidateTDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((CandidateT)et).getCandidateNo(), (et, vl) -> ((CandidateT)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((CandidateT)et).getEventNo(), (et, vl) -> ((CandidateT)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((CandidateT)et).getEventStartDatetime(), (et, vl) -> ((CandidateT)et).setEventStartDatetime(ctldt(vl)), "eventStartDatetime");
        setupEpg(_epgMap, et -> ((CandidateT)et).getEventEndDatetime(), (et, vl) -> ((CandidateT)et).setEventEndDatetime(ctldt(vl)), "eventEndDatetime");
        setupEpg(_epgMap, et -> ((CandidateT)et).getStartDate(), (et, vl) -> ((CandidateT)et).setStartDate((String)vl), "startDate");
        setupEpg(_epgMap, et -> ((CandidateT)et).getStartTime(), (et, vl) -> ((CandidateT)et).setStartTime((String)vl), "startTime");
        setupEpg(_epgMap, et -> ((CandidateT)et).getRegisterDatetime(), (et, vl) -> ((CandidateT)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((CandidateT)et).getRegisterUser(), (et, vl) -> ((CandidateT)et).setRegisterUser((String)vl), "registerUser");
        setupEpg(_epgMap, et -> ((CandidateT)et).getUpdateDatetime(), (et, vl) -> ((CandidateT)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((CandidateT)et).getUpdateUser(), (et, vl) -> ((CandidateT)et).setUpdateUser((String)vl), "updateUser");
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
        setupEfpg(_efpgMap, et -> ((CandidateT)et).getEventT(), (et, vl) -> ((CandidateT)et).setEventT((OptionalEntity<EventT>)vl), "eventT");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "candidate_t";
    protected final String _tableDispName = "candidate_t";
    protected final String _tablePropertyName = "candidateT";
    protected final TableSqlName _tableSqlName = new TableSqlName("candidate_t", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnCandidateNo = cci("candidate_no", "candidate_no", null, null, Integer.class, "candidateNo", null, true, true, true, "serial", 10, 0, "nextval('candidate_t_candidate_no_seq'::regclass)", false, null, null, null, "entryTList", null, false);
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, false, false, true, "int4", 10, 0, null, false, null, null, "eventT", null, null, false);
    protected final ColumnInfo _columnEventStartDatetime = cci("event_start_datetime", "event_start_datetime", null, null, java.time.LocalDateTime.class, "eventStartDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventEndDatetime = cci("event_end_datetime", "event_end_datetime", null, null, java.time.LocalDateTime.class, "eventEndDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartDate = cci("start_date", "start_date", null, null, String.class, "startDate", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnStartTime = cci("start_time", "start_time", null, null, String.class, "startTime", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterUser = cci("register_user", "register_user", null, null, String.class, "registerUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, false, "timestamp", 29, 6, "now()", true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateUser = cci("update_user", "update_user", null, null, String.class, "updateUser", null, false, false, false, "text", 2147483647, 0, null, true, null, null, null, null, null, false);

    /**
     * candidate_no: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * event_start_datetime: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventStartDatetime() { return _columnEventStartDatetime; }
    /**
     * event_end_datetime: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventEndDatetime() { return _columnEventEndDatetime; }
    /**
     * start_date: {+UQ, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartDate() { return _columnStartDate; }
    /**
     * start_time: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStartTime() { return _columnStartTime; }
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
        ls.add(columnCandidateNo());
        ls.add(columnEventNo());
        ls.add(columnEventStartDatetime());
        ls.add(columnEventEndDatetime());
        ls.add(columnStartDate());
        ls.add(columnStartTime());
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
    protected UniqueInfo cpui() { return hpcpui(columnCandidateNo()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnEventNo());
        ls.add(columnStartDate());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * event_t by my event_no, named 'eventT'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignEventT() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEventNo(), EventTDbm.getInstance().columnEventNo());
        return cfi("candidate_t_event_no_fkey", "eventT", this, EventTDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "candidateTList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * entry_t by candidate_no, named 'entryTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerEntryTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnCandidateNo(), EntryTDbm.getInstance().columnCandidateNo());
        return cri("entry_t_candidate_no_fkey", "entryTList", this, EntryTDbm.getInstance(), mp, false, "candidateT");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "candidate_t_candidate_no_seq"; }
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
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.CandidateT"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.CandidateTCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.CandidateTBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<CandidateT> getEntityType() { return CandidateT.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public CandidateT newEntity() { return new CandidateT(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((CandidateT)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((CandidateT)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
