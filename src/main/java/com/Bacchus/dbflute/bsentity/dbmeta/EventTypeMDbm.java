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
 * The DB meta of event_type_m. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class EventTypeMDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final EventTypeMDbm _instance = new EventTypeMDbm();
    private EventTypeMDbm() {}
    public static EventTypeMDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((EventTypeM)et).getEventTypeId(), (et, vl) -> ((EventTypeM)et).setEventTypeId(cti(vl)), "eventTypeId");
        setupEpg(_epgMap, et -> ((EventTypeM)et).getEventTypeName(), (et, vl) -> ((EventTypeM)et).setEventTypeName((String)vl), "eventTypeName");
        setupEpg(_epgMap, et -> ((EventTypeM)et).getOrderNum(), (et, vl) -> ((EventTypeM)et).setOrderNum(cti(vl)), "orderNum");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "event_type_m";
    protected final String _tableDispName = "event_type_m";
    protected final String _tablePropertyName = "eventTypeM";
    protected final TableSqlName _tableSqlName = new TableSqlName("event_type_m", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnEventTypeId = cci("event_type_id", "event_type_id", null, null, Integer.class, "eventTypeId", null, true, true, true, "serial", 10, 0, "nextval('event_type_m_event_type_id_seq'::regclass)", false, null, null, null, "eventTList", null, false);
    protected final ColumnInfo _columnEventTypeName = cci("event_type_name", "event_type_name", null, null, String.class, "eventTypeName", null, false, false, true, "text", 2147483647, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnOrderNum = cci("order_num", "order_num", null, null, Integer.class, "orderNum", null, false, false, false, "int4", 10, 0, null, false, null, null, null, null, null, false);

    /**
     * event_type_id: {PK, ID, NotNull, serial(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventTypeId() { return _columnEventTypeId; }
    /**
     * event_type_name: {NotNull, text(2147483647)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEventTypeName() { return _columnEventTypeName; }
    /**
     * order_num: {int4(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnOrderNum() { return _columnOrderNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnEventTypeId());
        ls.add(columnEventTypeName());
        ls.add(columnOrderNum());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnEventTypeId()); }
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
     * event_t by event_type_id, named 'eventTList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerEventTList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnEventTypeId(), EventTDbm.getInstance().columnEventTypeId());
        return cri("event_t_event_type_id_fkey", "eventTList", this, EventTDbm.getInstance(), mp, false, "eventTypeM");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "event_type_m_event_type_id_seq"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.Bacchus.dbflute.exentity.EventTypeM"; }
    public String getConditionBeanTypeName() { return "com.Bacchus.dbflute.cbean.EventTypeMCB"; }
    public String getBehaviorTypeName() { return "com.Bacchus.dbflute.exbhv.EventTypeMBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<EventTypeM> getEntityType() { return EventTypeM.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public EventTypeM newEntity() { return new EventTypeM(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((EventTypeM)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((EventTypeM)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
