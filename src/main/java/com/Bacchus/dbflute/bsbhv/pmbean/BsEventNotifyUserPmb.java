package com.Bacchus.dbflute.bsbhv.pmbean;

import java.util.*;

import org.dbflute.outsidesql.typed.*;
import org.dbflute.jdbc.*;
import org.dbflute.outsidesql.PmbCustodial;
import org.dbflute.util.DfTypeUtil;
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.exbhv.*;
import com.Bacchus.dbflute.exentity.customize.*;

/**
 * The base class for typed parameter-bean of EventNotifyUser. <br>
 * This is related to "<span style="color: #AD4747">selectEventNotifyUser</span>" on UserTBhv.
 * @author DBFlute(AutoGenerator)
 */
public class BsEventNotifyUserPmb implements ListHandlingPmb<UserTBhv, EventNotifyUser>, EntityHandlingPmb<UserTBhv, EventNotifyUser>, FetchBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The parameter of eventNo. */
    protected Integer _eventNo;

    /** The parameter of lineFlg. */
    protected Integer _lineFlg;

    /** The max size of safety result. */
    protected int _safetyMaxResultSize;

    /** The time-zone for filtering e.g. from-to. (NullAllowed: if null, default zone) */
    protected TimeZone _timeZone;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor for the typed parameter-bean of EventNotifyUser. <br>
     * This is related to "<span style="color: #AD4747">selectEventNotifyUser</span>" on UserTBhv.
     */
    public BsEventNotifyUserPmb() {
    }

    // ===================================================================================
    //                                                                Typed Implementation
    //                                                                ====================
    /**
     * {@inheritDoc}
     */
    public String getOutsideSqlPath() { return "selectEventNotifyUser"; }

    /**
     * Get the type of an entity for result. (implementation)
     * @return The type instance of an entity, customize entity. (NotNull)
     */
    public Class<EventNotifyUser> getEntityType() { return EventNotifyUser.class; }

    // ===================================================================================
    //                                                                       Safety Result
    //                                                                       =============
    /**
     * {@inheritDoc}
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        _safetyMaxResultSize = safetyMaxResultSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    // -----------------------------------------------------
    //                                                String
    //                                                ------
    protected String filterStringParameter(String value) { return isEmptyStringParameterAllowed() ? value : convertEmptyToNull(value); }
    protected boolean isEmptyStringParameterAllowed() { return DBFluteConfig.getInstance().isEmptyStringParameterAllowed(); }
    protected String convertEmptyToNull(String value) { return PmbCustodial.convertEmptyToNull(value); }
    
    // -----------------------------------------------------
    //                                                  Date
    //                                                  ----
    protected Date toUtilDate(Object date) { return PmbCustodial.toUtilDate(date, _timeZone); }
    protected <DATE> DATE toLocalDate(Date date, Class<DATE> localType) { return PmbCustodial.toLocalDate(date, localType, chooseRealTimeZone()); }
    protected TimeZone chooseRealTimeZone() { return PmbCustodial.chooseRealTimeZone(_timeZone); }

    /**
     * Set time-zone, basically for LocalDate conversion. <br>
     * Normally you don't need to set this, you can adjust other ways. <br>
     * (DBFlute system's time-zone is used as default)
     * @param timeZone The time-zone for filtering. (NullAllowed: if null, default zone)
     */
    public void zone(TimeZone timeZone) { _timeZone = timeZone; }

    // -----------------------------------------------------
    //                                    by Option Handling
    //                                    ------------------
    // might be called by option handling
    protected <NUMBER extends Number> NUMBER toNumber(Object obj, Class<NUMBER> type) { return PmbCustodial.toNumber(obj, type); }
    protected Boolean toBoolean(Object obj) { return PmbCustodial.toBoolean(obj); }
    @SuppressWarnings("unchecked")
    protected <ELEMENT> ArrayList<ELEMENT> newArrayList(ELEMENT... elements) { return PmbCustodial.newArrayList(elements); }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return The display string of all parameters. (NotNull)
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(DfTypeUtil.toClassTitle(this)).append(":");
        sb.append(xbuildColumnString());
        return sb.toString();
    }
    protected String xbuildColumnString() {
        final String dm = ", ";
        final StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_eventNo);
        sb.append(dm).append(_lineFlg);
        if (sb.length() > 0) { sb.delete(0, dm.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] eventNo <br>
     * @return The value of eventNo. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getEventNo() {
        return _eventNo;
    }

    /**
     * [set] eventNo <br>
     * @param eventNo The value of eventNo. (NullAllowed)
     */
    public void setEventNo(Integer eventNo) {
        _eventNo = eventNo;
    }

    /**
     * [get] lineFlg <br>
     * @return The value of lineFlg. (NullAllowed, NotEmptyString(when String): if empty string, returns null)
     */
    public Integer getLineFlg() {
        return _lineFlg;
    }

    /**
     * [set] lineFlg <br>
     * @param lineFlg The value of lineFlg. (NullAllowed)
     */
    public void setLineFlg(Integer lineFlg) {
        _lineFlg = lineFlg;
    }
}
