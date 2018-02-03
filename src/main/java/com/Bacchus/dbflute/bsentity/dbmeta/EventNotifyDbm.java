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
 * The DB meta of event_notify. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventNotifyDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventNotifyDbm _instance = new EventNotifyDbm();
    private EventNotifyDbm() {}
    public static EventNotifyDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EventNotify)et).getEventNotifyNo(), (et, vl) -> ((EventNotify)et).setEventNotifyNo(cti(vl)), "eventNotifyNo");
        setupEpg(_epgMap, et -> ((EventNotify)et).getEventNo(), (et, vl) -> ((EventNotify)et).setEventNo(cti(vl)), "eventNo");
        setupEpg(_epgMap, et -> ((EventNotify)et).getUserId(), (et, vl) -> ((EventNotify)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((EventNotify)et).getNotifyDatetime(), (et, vl) -> ((EventNotify)et).setNotifyDatetime(ctldt(vl)), "notifyDatetime");
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
        setupEfpg(_efpgMap, et -> ((EventNotify)et).getEventT(), (et, vl) -> ((EventNotify)et).setEventT((OptionalEntity<EventT>)vl), "eventT");
        setupEfpg(_efpgMap, et -> ((EventNotify)et).getUserT(), (et, vl) -> ((EventNotify)et).setUserT((OptionalEntity<UserT>)vl), "userT");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "event_notify";
    protected final String _tableDispName = "event_notify";
    protected final String _tablePropertyName = "eventNotify";
    protected final TableSqlName _tableSqlName = new TableSqlName("event_notify", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEventNotifyNo = cci("event_notify_no", "event_notify_no", null, null, Integer.class, "eventNotifyNo", null, true, true, true, "serial", 10, 0, "nextval('event_notify_event_notify_no_seq'::regclass)", false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEventNo = cci("event_no", "event_no", null, null, Integer.class, "eventNo", null, false, false, true, "int4", 10, 0, null, false, null, null, "eventT", null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, true, "int4", 10, 0, null, false, null, null, "userT", null, null, false);
    protected final ColumnInfo _columnNotifyDatetime = cci("notify_datetime", "notify_datetime", null, null, java.time.LocalDateTime.class, "notifyDatetime", null, false, false, false, "timestamp", 29, 6, null, false, null, null, null, null, null, false);

    /**
     * event_notify_no: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNotifyNo() { return _columnEventNotifyNo; }
    /**
     * event_no: {UQ+, NotNull, int4(10), FK to event_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventNo() { return _columnEventNo; }
    /**
     * user_id: {+UQ, NotNull, int4(10), FK to user_t}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * notify_datetime: {timestamp(29, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnNotifyDatetime() { return _columnNotifyDatetime; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEventNotifyNo());
        ls.add(columnEventNo());
        ls.add(columnUserId());
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
    protected UniqueInfo cpui() { return hpcpui(columnEventNotifyNo()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnEventNo());
        ls.add(columnUserId());
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
        return cfi("event_notify_event_no_fkey", "eventT", this, EventTDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "eventNotifyList", false);
    }
    /**
     * user_t by my user_id, named 'userT'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserT() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), UserTDbm.getInstance().columnUserId());
        return cfi("event_notify_user_id_fkey", "userT", this, UserTDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "eventNotifyList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "event_notify_event_notify_no_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.EventNotify"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.EventNotifyCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.EventNotifyBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventNotify> getEntityType() { return EventNotify.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventNotify newEntity() { return new EventNotify(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventNotify)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventNotify)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
