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
 * The DB meta of event_t. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventTDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventTDbm _instance = new EventTDbm();
    private EventTDbm() {}
    public static EventTDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EventT)et).getEventNo(), (et, vl) -> ((EventT)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((EventT)et).getEventName(), (et, vl) -> ((EventT)et).setEventName((String)vl), "eventName");
        setupEpg(_epgMap, et -> ((EventT)et).getEventDetail(), (et, vl) -> ((EventT)et).setEventDetail((String)vl), "eventDetail");
        setupEpg(_epgMap, et -> ((EventT)et).getEventPlace(), (et, vl) -> ((EventT)et).setEventPlace((String)vl), "eventPlace");
        setupEpg(_epgMap, et -> ((EventT)et).getEventUrl(), (et, vl) -> ((EventT)et).setEventUrl((String)vl), "eventUrl");
        setupEpg(_epgMap, et -> ((EventT)et).getTell(), (et, vl) -> ((EventT)et).setTell((String)vl), "tell");
        setupEpg(_epgMap, et -> ((EventT)et).getEventEntryFee(), (et, vl) -> ((EventT)et).setEventEntryFee(cti(vl)), "eventEntryFee");
        setupEpg(_epgMap, et -> ((EventT)et).getAuxiliaryFlg(), (et, vl) -> ((EventT)et).setAuxiliaryFlg(cti(vl)), "auxiliaryFlg");
        setupEpg(_epgMap, et -> ((EventT)et).getFixFlg(), (et, vl) -> ((EventT)et).setFixFlg(cti(vl)), "fixFlg");
        setupEpg(_epgMap, et -> ((EventT)et).getCandidateNo(), (et, vl) -> ((EventT)et).setCandidateNo(cti(vl)), "candidateNo");
        setupEpg(_epgMap, et -> ((EventT)et).getStoreName(), (et, vl) -> ((EventT)et).setStoreName((String)vl), "storeName");
        setupEpg(_epgMap, et -> ((EventT)et).getEntryPeople(), (et, vl) -> ((EventT)et).setEntryPeople(cti(vl)), "entryPeople");
        setupEpg(_epgMap, et -> ((EventT)et).getEventDiv(), (et, vl) -> ((EventT)et).setEventDiv((String)vl), "eventDiv");
        setupEpg(_epgMap, et -> ((EventT)et).getUserId(), (et, vl) -> ((EventT)et).setUserId(cti(vl)), "userId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "event_t";
    protected final String _tableDispName = "event_t";
    protected final String _tablePropertyName = "eventT";
    protected final TableSqlName _tableSqlName = new TableSqlName("event_t", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, true, true, true, "serial", 10, 0, "nextval('event_t_event_no_seq'::regclass)", false, null, null, null, null, null, false);
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
    protected final ColumnInfo _columnEntryPeople = cci("entry_people", "entry_people", null, null, Integer.class, "entryPeople", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventDiv = cci("event_div", "event_div", null, null, String.class, "eventDiv", null, false, false, false, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * event_no: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * event_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventName() { return _columnEventName; }
    /**
     * event_detail: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventDetail() { return _columnEventDetail; }
    /**
     * event_place: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventPlace() { return _columnEventPlace; }
    /**
     * event_url: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventUrl() { return _columnEventUrl; }
    /**
     * tell: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTell() { return _columnTell; }
    /**
     * event_entry_fee: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventEntryFee() { return _columnEventEntryFee; }
    /**
     * auxiliary_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuxiliaryFlg() { return _columnAuxiliaryFlg; }
    /**
     * fix_flg: {int2(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFixFlg() { return _columnFixFlg; }
    /**
     * candidate_no: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnCandidateNo() { return _columnCandidateNo; }
    /**
     * store_name: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnStoreName() { return _columnStoreName; }
    /**
     * entry_people: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEntryPeople() { return _columnEntryPeople; }
    /**
     * event_div: {text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventDiv() { return _columnEventDiv; }
    /**
     * user_id: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }

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
        ls.add(columnEntryPeople());
        ls.add(columnEventDiv());
        ls.add(columnUserId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEventNo()); }
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
    public String getSequenceName() { return "event_t_event_no_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.EventT"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.EventTCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.EventTBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventT> getEntityType() { return EventT.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventT newEntity() { return new EventT(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventT)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventT)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
