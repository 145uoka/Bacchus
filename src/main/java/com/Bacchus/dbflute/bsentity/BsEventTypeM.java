package com.Bacchus.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.Bacchus.dbflute.allcommon.DBMetaInstanceHandler;
import com.Bacchus.dbflute.exentity.*;

/**
 * The entity of event_type_m as TABLE. <br>
 * イベント区分_M
 * <pre>
 * [primary-key]
 *     event_type_id
 *
 * [column]
 *     event_type_id, event_type_name, order_num
 *
 * [sequence]
 *     event_type_m_event_type_id_seq
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     event_t
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     eventTList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer eventTypeId = entity.getEventTypeId();
 * String eventTypeName = entity.getEventTypeName();
 * Integer orderNum = entity.getOrderNum();
 * entity.setEventTypeId(eventTypeId);
 * entity.setEventTypeName(eventTypeName);
 * entity.setOrderNum(orderNum);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEventTypeM extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** event_type_id: {PK, ID, NotNull, serial(10)} */
    protected Integer _eventTypeId;

    /** event_type_name: {NotNull, text(2147483647)} */
    protected String _eventTypeName;

    /** order_num: {int4(10)} */
    protected Integer _orderNum;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "event_type_m";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_eventTypeId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** event_t by event_type_id, named 'eventTList'. */
    protected List<EventT> _eventTList;

    /**
     * [get] event_t by event_type_id, named 'eventTList'.
     * @return The entity list of referrer property 'eventTList'. (NotNull: even if no loading, returns empty list)
     */
    public List<EventT> getEventTList() {
        if (_eventTList == null) { _eventTList = newReferrerList(); }
        return _eventTList;
    }

    /**
     * [set] event_t by event_type_id, named 'eventTList'.
     * @param eventTList The entity list of referrer property 'eventTList'. (NullAllowed)
     */
    public void setEventTList(List<EventT> eventTList) {
        _eventTList = eventTList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsEventTypeM) {
            BsEventTypeM other = (BsEventTypeM)obj;
            if (!xSV(_eventTypeId, other._eventTypeId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _eventTypeId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_eventTList != null) { for (EventT et : _eventTList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "eventTList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_eventTypeId));
        sb.append(dm).append(xfND(_eventTypeName));
        sb.append(dm).append(xfND(_orderNum));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_eventTList != null && !_eventTList.isEmpty())
        { sb.append(dm).append("eventTList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public EventTypeM clone() {
        return (EventTypeM)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] event_type_id: {PK, ID, NotNull, serial(10)} <br>
     * イベント区分ID
     * @return The value of the column 'event_type_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getEventTypeId() {
        checkSpecifiedProperty("eventTypeId");
        return _eventTypeId;
    }

    /**
     * [set] event_type_id: {PK, ID, NotNull, serial(10)} <br>
     * イベント区分ID
     * @param eventTypeId The value of the column 'event_type_id'. (basically NotNull if update: for the constraint)
     */
    public void setEventTypeId(Integer eventTypeId) {
        registerModifiedProperty("eventTypeId");
        _eventTypeId = eventTypeId;
    }

    /**
     * [get] event_type_name: {NotNull, text(2147483647)} <br>
     * イベント区分名称
     * @return The value of the column 'event_type_name'. (basically NotNull if selected: for the constraint)
     */
    public String getEventTypeName() {
        checkSpecifiedProperty("eventTypeName");
        return _eventTypeName;
    }

    /**
     * [set] event_type_name: {NotNull, text(2147483647)} <br>
     * イベント区分名称
     * @param eventTypeName The value of the column 'event_type_name'. (basically NotNull if update: for the constraint)
     */
    public void setEventTypeName(String eventTypeName) {
        registerModifiedProperty("eventTypeName");
        _eventTypeName = eventTypeName;
    }

    /**
     * [get] order_num: {int4(10)} <br>
     * 表示順
     * @return The value of the column 'order_num'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOrderNum() {
        checkSpecifiedProperty("orderNum");
        return _orderNum;
    }

    /**
     * [set] order_num: {int4(10)} <br>
     * 表示順
     * @param orderNum The value of the column 'order_num'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrderNum(Integer orderNum) {
        registerModifiedProperty("orderNum");
        _orderNum = orderNum;
    }
}
