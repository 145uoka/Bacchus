package com.Bacchus.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.Bacchus.dbflute.allcommon.*;
import com.Bacchus.dbflute.cbean.*;
import com.Bacchus.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of general_code_m.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsGeneralCodeMCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsGeneralCodeMCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "general_code_m";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_Equal(Integer codeId) {
        doSetCodeId_Equal(codeId);
    }

    protected void doSetCodeId_Equal(Integer codeId) {
        regCodeId(CK_EQ, codeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_NotEqual(Integer codeId) {
        doSetCodeId_NotEqual(codeId);
    }

    protected void doSetCodeId_NotEqual(Integer codeId) {
        regCodeId(CK_NES, codeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_GreaterThan(Integer codeId) {
        regCodeId(CK_GT, codeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_LessThan(Integer codeId) {
        regCodeId(CK_LT, codeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_GreaterEqual(Integer codeId) {
        regCodeId(CK_GE, codeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeId The value of codeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodeId_LessEqual(Integer codeId) {
        regCodeId(CK_LE, codeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of codeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of codeId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCodeId_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCodeId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param minNumber The min number of codeId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of codeId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCodeId_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodeId(), "code_id", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeIdList The collection of codeId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeId_InScope(Collection<Integer> codeIdList) {
        doSetCodeId_InScope(codeIdList);
    }

    protected void doSetCodeId_InScope(Collection<Integer> codeIdList) {
        regINS(CK_INS, cTL(codeIdList), xgetCValueCodeId(), "code_id");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     * @param codeIdList The collection of codeId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeId_NotInScope(Collection<Integer> codeIdList) {
        doSetCodeId_NotInScope(codeIdList);
    }

    protected void doSetCodeId_NotInScope(Collection<Integer> codeIdList) {
        regINS(CK_NINS, cTL(codeIdList), xgetCValueCodeId(), "code_id");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCodeId_IsNull() { regCodeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * code_id: {PK, ID, NotNull, serial(10)}
     */
    public void setCodeId_IsNotNull() { regCodeId(CK_ISNN, DOBJ); }

    protected void regCodeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodeId(), "code_id"); }
    protected abstract ConditionValue xgetCValueCodeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_Equal(String codeDiv) {
        doSetCodeDiv_Equal(fRES(codeDiv));
    }

    protected void doSetCodeDiv_Equal(String codeDiv) {
        regCodeDiv(CK_EQ, codeDiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_NotEqual(String codeDiv) {
        doSetCodeDiv_NotEqual(fRES(codeDiv));
    }

    protected void doSetCodeDiv_NotEqual(String codeDiv) {
        regCodeDiv(CK_NES, codeDiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_GreaterThan(String codeDiv) {
        regCodeDiv(CK_GT, fRES(codeDiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_LessThan(String codeDiv) {
        regCodeDiv(CK_LT, fRES(codeDiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_GreaterEqual(String codeDiv) {
        regCodeDiv(CK_GE, fRES(codeDiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_LessEqual(String codeDiv) {
        regCodeDiv(CK_LE, fRES(codeDiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDivList The collection of codeDiv as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_InScope(Collection<String> codeDivList) {
        doSetCodeDiv_InScope(codeDivList);
    }

    protected void doSetCodeDiv_InScope(Collection<String> codeDivList) {
        regINS(CK_INS, cTL(codeDivList), xgetCValueCodeDiv(), "code_div");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDivList The collection of codeDiv as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCodeDiv_NotInScope(Collection<String> codeDivList) {
        doSetCodeDiv_NotInScope(codeDivList);
    }

    protected void doSetCodeDiv_NotInScope(Collection<String> codeDivList) {
        regINS(CK_NINS, cTL(codeDivList), xgetCValueCodeDiv(), "code_div");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setCodeDiv_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param codeDiv The value of codeDiv as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCodeDiv_LikeSearch(String codeDiv, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCodeDiv_LikeSearch(codeDiv, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)} <br>
     * <pre>e.g. setCodeDiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param codeDiv The value of codeDiv as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCodeDiv_LikeSearch(String codeDiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(codeDiv), xgetCValueCodeDiv(), "code_div", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCodeDiv_NotLikeSearch(String codeDiv, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCodeDiv_NotLikeSearch(codeDiv, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code_div: {NotNull, text(2147483647)}
     * @param codeDiv The value of codeDiv as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCodeDiv_NotLikeSearch(String codeDiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(codeDiv), xgetCValueCodeDiv(), "code_div", likeSearchOption);
    }

    protected void regCodeDiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodeDiv(), "code_div"); }
    protected abstract ConditionValue xgetCValueCodeDiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_Equal(String code) {
        doSetCode_Equal(fRES(code));
    }

    protected void doSetCode_Equal(String code) {
        regCode(CK_EQ, code);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_NotEqual(String code) {
        doSetCode_NotEqual(fRES(code));
    }

    protected void doSetCode_NotEqual(String code) {
        regCode(CK_NES, code);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_GreaterThan(String code) {
        regCode(CK_GT, fRES(code));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_LessThan(String code) {
        regCode(CK_LT, fRES(code));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_GreaterEqual(String code) {
        regCode(CK_GE, fRES(code));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_LessEqual(String code) {
        regCode(CK_LE, fRES(code));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)}
     * @param codeList The collection of code as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_InScope(Collection<String> codeList) {
        doSetCode_InScope(codeList);
    }

    protected void doSetCode_InScope(Collection<String> codeList) {
        regINS(CK_INS, cTL(codeList), xgetCValueCode(), "code");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)}
     * @param codeList The collection of code as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setCode_NotInScope(Collection<String> codeList) {
        doSetCode_NotInScope(codeList);
    }

    protected void doSetCode_NotInScope(Collection<String> codeList) {
        regINS(CK_NINS, cTL(codeList), xgetCValueCode(), "code");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)} <br>
     * <pre>e.g. setCode_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param code The value of code as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCode_LikeSearch(String code, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCode_LikeSearch(code, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)} <br>
     * <pre>e.g. setCode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param code The value of code as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setCode_LikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(code), xgetCValueCode(), "code", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setCode_NotLikeSearch(String code, ConditionOptionCall<LikeSearchOption> opLambda) {
        setCode_NotLikeSearch(code, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * code: {text(2147483647)}
     * @param code The value of code as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setCode_NotLikeSearch(String code, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(code), xgetCValueCode(), "code", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     */
    public void setCode_IsNull() { regCode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     */
    public void setCode_IsNullOrEmpty() { regCode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * code: {text(2147483647)}
     */
    public void setCode_IsNotNull() { regCode(CK_ISNN, DOBJ); }

    protected void regCode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCode(), "code"); }
    protected abstract ConditionValue xgetCValueCode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param nameList The collection of name as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param nameList The collection of name as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "name");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_LikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, ConditionOptionCall<LikeSearchOption> opLambda) {
        setName_NotLikeSearch(name, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * name: {text(2147483647)}
     * @param name The value of name as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "name", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNullOrEmpty() { regName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * name: {text(2147483647)}
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "name"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_Equal(Integer orderNumber) {
        doSetOrderNumber_Equal(orderNumber);
    }

    protected void doSetOrderNumber_Equal(Integer orderNumber) {
        regOrderNumber(CK_EQ, orderNumber);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_NotEqual(Integer orderNumber) {
        doSetOrderNumber_NotEqual(orderNumber);
    }

    protected void doSetOrderNumber_NotEqual(Integer orderNumber) {
        regOrderNumber(CK_NES, orderNumber);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_GreaterThan(Integer orderNumber) {
        regOrderNumber(CK_GT, orderNumber);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_LessThan(Integer orderNumber) {
        regOrderNumber(CK_LT, orderNumber);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_GreaterEqual(Integer orderNumber) {
        regOrderNumber(CK_GE, orderNumber);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumber The value of orderNumber as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderNumber_LessEqual(Integer orderNumber) {
        regOrderNumber(CK_LE, orderNumber);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param minNumber The min number of orderNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of orderNumber. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setOrderNumber_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setOrderNumber_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     * @param minNumber The min number of orderNumber. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of orderNumber. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setOrderNumber_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderNumber(), "order_number", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumberList The collection of orderNumber as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrderNumber_InScope(Collection<Integer> orderNumberList) {
        doSetOrderNumber_InScope(orderNumberList);
    }

    protected void doSetOrderNumber_InScope(Collection<Integer> orderNumberList) {
        regINS(CK_INS, cTL(orderNumberList), xgetCValueOrderNumber(), "order_number");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * order_number: {int2(5)}
     * @param orderNumberList The collection of orderNumber as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setOrderNumber_NotInScope(Collection<Integer> orderNumberList) {
        doSetOrderNumber_NotInScope(orderNumberList);
    }

    protected void doSetOrderNumber_NotInScope(Collection<Integer> orderNumberList) {
        regINS(CK_NINS, cTL(orderNumberList), xgetCValueOrderNumber(), "order_number");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     */
    public void setOrderNumber_IsNull() { regOrderNumber(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * order_number: {int2(5)}
     */
    public void setOrderNumber_IsNotNull() { regOrderNumber(CK_ISNN, DOBJ); }

    protected void regOrderNumber(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNumber(), "order_number"); }
    protected abstract ConditionValue xgetCValueOrderNumber();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_Equal(String remarks) {
        doSetRemarks_Equal(fRES(remarks));
    }

    protected void doSetRemarks_Equal(String remarks) {
        regRemarks(CK_EQ, remarks);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_NotEqual(String remarks) {
        doSetRemarks_NotEqual(fRES(remarks));
    }

    protected void doSetRemarks_NotEqual(String remarks) {
        regRemarks(CK_NES, remarks);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_GreaterThan(String remarks) {
        regRemarks(CK_GT, fRES(remarks));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_LessThan(String remarks) {
        regRemarks(CK_LT, fRES(remarks));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_GreaterEqual(String remarks) {
        regRemarks(CK_GE, fRES(remarks));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_LessEqual(String remarks) {
        regRemarks(CK_LE, fRES(remarks));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarksList The collection of remarks as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_InScope(Collection<String> remarksList) {
        doSetRemarks_InScope(remarksList);
    }

    protected void doSetRemarks_InScope(Collection<String> remarksList) {
        regINS(CK_INS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarksList The collection of remarks as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRemarks_NotInScope(Collection<String> remarksList) {
        doSetRemarks_NotInScope(remarksList);
    }

    protected void doSetRemarks_NotInScope(Collection<String> remarksList) {
        regINS(CK_NINS, cTL(remarksList), xgetCValueRemarks(), "remarks");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param remarks The value of remarks as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_LikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_LikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)} <br>
     * <pre>e.g. setRemarks_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param remarks The value of remarks as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRemarks_LikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRemarks_NotLikeSearch(String remarks, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRemarks_NotLikeSearch(remarks, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * remarks: {text(2147483647)}
     * @param remarks The value of remarks as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRemarks_NotLikeSearch(String remarks, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(remarks), xgetCValueRemarks(), "remarks", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNull() { regRemarks(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNullOrEmpty() { regRemarks(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * remarks: {text(2147483647)}
     */
    public void setRemarks_IsNotNull() { regRemarks(CK_ISNN, DOBJ); }

    protected void regRemarks(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRemarks(), "remarks"); }
    protected abstract ConditionValue xgetCValueRemarks();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(Integer delFlg) {
        doSetDelFlg_Equal(delFlg);
    }

    protected void doSetDelFlg_Equal(Integer delFlg) {
        regDelFlg(CK_EQ, delFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_NotEqual(Integer delFlg) {
        doSetDelFlg_NotEqual(delFlg);
    }

    protected void doSetDelFlg_NotEqual(Integer delFlg) {
        regDelFlg(CK_NES, delFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_GreaterThan(Integer delFlg) {
        regDelFlg(CK_GT, delFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_LessThan(Integer delFlg) {
        regDelFlg(CK_LT, delFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_GreaterEqual(Integer delFlg) {
        regDelFlg(CK_GE, delFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlg The value of delFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelFlg_LessEqual(Integer delFlg) {
        regDelFlg(CK_LE, delFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param minNumber The min number of delFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of delFlg. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDelFlg_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDelFlg_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     * @param minNumber The min number of delFlg. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of delFlg. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDelFlg_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelFlg(), "del_flg", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlgList The collection of delFlg as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelFlg_InScope(Collection<Integer> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    protected void doSetDelFlg_InScope(Collection<Integer> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "del_flg");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * del_flg: {int2(5)}
     * @param delFlgList The collection of delFlg as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDelFlg_NotInScope(Collection<Integer> delFlgList) {
        doSetDelFlg_NotInScope(delFlgList);
    }

    protected void doSetDelFlg_NotInScope(Collection<Integer> delFlgList) {
        regINS(CK_NINS, cTL(delFlgList), xgetCValueDelFlg(), "del_flg");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     */
    public void setDelFlg_IsNull() { regDelFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * del_flg: {int2(5)}
     */
    public void setDelFlg_IsNotNull() { regDelFlg(CK_ISNN, DOBJ); }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "del_flg"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "register_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setRegisterDatetime_IsNull() { regRegisterDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * register_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setRegisterDatetime_IsNotNull() { regRegisterDatetime(CK_ISNN, DOBJ); }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "register_datetime"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_Equal(String registerUser) {
        doSetRegisterUser_Equal(fRES(registerUser));
    }

    protected void doSetRegisterUser_Equal(String registerUser) {
        regRegisterUser(CK_EQ, registerUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotEqual(String registerUser) {
        doSetRegisterUser_NotEqual(fRES(registerUser));
    }

    protected void doSetRegisterUser_NotEqual(String registerUser) {
        regRegisterUser(CK_NES, registerUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterThan(String registerUser) {
        regRegisterUser(CK_GT, fRES(registerUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessThan(String registerUser) {
        regRegisterUser(CK_LT, fRES(registerUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_GreaterEqual(String registerUser) {
        regRegisterUser(CK_GE, fRES(registerUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_LessEqual(String registerUser) {
        regRegisterUser(CK_LE, fRES(registerUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUserList The collection of registerUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_InScope(Collection<String> registerUserList) {
        doSetRegisterUser_InScope(registerUserList);
    }

    protected void doSetRegisterUser_InScope(Collection<String> registerUserList) {
        regINS(CK_INS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUserList The collection of registerUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setRegisterUser_NotInScope(Collection<String> registerUserList) {
        doSetRegisterUser_NotInScope(registerUserList);
    }

    protected void doSetRegisterUser_NotInScope(Collection<String> registerUserList) {
        regINS(CK_NINS, cTL(registerUserList), xgetCValueRegisterUser(), "register_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_LikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_LikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)} <br>
     * <pre>e.g. setRegisterUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param registerUser The value of registerUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegisterUser_LikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegisterUser_NotLikeSearch(String registerUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegisterUser_NotLikeSearch(registerUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * register_user: {text(2147483647)}
     * @param registerUser The value of registerUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegisterUser_NotLikeSearch(String registerUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(registerUser), xgetCValueRegisterUser(), "register_user", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNull() { regRegisterUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNullOrEmpty() { regRegisterUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * register_user: {text(2147483647)}
     */
    public void setRegisterUser_IsNotNull() { regRegisterUser(CK_ISNN, DOBJ); }

    protected void regRegisterUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterUser(), "register_user"); }
    protected abstract ConditionValue xgetCValueRegisterUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_Equal(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_EQ,  updateDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GT,  updateDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessThan(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LT,  updateDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_GreaterEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_GE,  updateDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * @param updateDatetime The value of updateDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdateDatetime_LessEqual(java.time.LocalDateTime updateDatetime) {
        regUpdateDatetime(CK_LE, updateDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdateDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     * <pre>e.g. setUpdateDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updateDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdateDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "update_datetime"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdateDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setUpdateDatetime_IsNull() { regUpdateDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_datetime: {timestamp(29, 6), default=[now()]}
     */
    public void setUpdateDatetime_IsNotNull() { regUpdateDatetime(CK_ISNN, DOBJ); }

    protected void regUpdateDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateDatetime(), "update_datetime"); }
    protected abstract ConditionValue xgetCValueUpdateDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_Equal(String updateUser) {
        doSetUpdateUser_Equal(fRES(updateUser));
    }

    protected void doSetUpdateUser_Equal(String updateUser) {
        regUpdateUser(CK_EQ, updateUser);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotEqual(String updateUser) {
        doSetUpdateUser_NotEqual(fRES(updateUser));
    }

    protected void doSetUpdateUser_NotEqual(String updateUser) {
        regUpdateUser(CK_NES, updateUser);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterThan(String updateUser) {
        regUpdateUser(CK_GT, fRES(updateUser));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessThan(String updateUser) {
        regUpdateUser(CK_LT, fRES(updateUser));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_GreaterEqual(String updateUser) {
        regUpdateUser(CK_GE, fRES(updateUser));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_LessEqual(String updateUser) {
        regUpdateUser(CK_LE, fRES(updateUser));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUserList The collection of updateUser as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_InScope(Collection<String> updateUserList) {
        doSetUpdateUser_InScope(updateUserList);
    }

    protected void doSetUpdateUser_InScope(Collection<String> updateUserList) {
        regINS(CK_INS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUserList The collection of updateUser as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUpdateUser_NotInScope(Collection<String> updateUserList) {
        doSetUpdateUser_NotInScope(updateUserList);
    }

    protected void doSetUpdateUser_NotInScope(Collection<String> updateUserList) {
        regINS(CK_NINS, cTL(updateUserList), xgetCValueUpdateUser(), "update_user");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_LikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_LikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)} <br>
     * <pre>e.g. setUpdateUser_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updateUser The value of updateUser as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdateUser_LikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdateUser_NotLikeSearch(String updateUser, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdateUser_NotLikeSearch(updateUser, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * update_user: {text(2147483647)}
     * @param updateUser The value of updateUser as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdateUser_NotLikeSearch(String updateUser, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updateUser), xgetCValueUpdateUser(), "update_user", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNull() { regUpdateUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNullOrEmpty() { regUpdateUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * update_user: {text(2147483647)}
     */
    public void setUpdateUser_IsNotNull() { regUpdateUser(CK_ISNN, DOBJ); }

    protected void regUpdateUser(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdateUser(), "update_user"); }
    protected abstract ConditionValue xgetCValueUpdateUser();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     * @param deleteFlag The value of deleteFlag as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeleteFlag_Equal(Boolean deleteFlag) {
        regDeleteFlag(CK_EQ, deleteFlag);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     */
    public void setDeleteFlag_IsNull() { regDeleteFlag(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * delete_flag: {bool(1), default=[false]}
     */
    public void setDeleteFlag_IsNotNull() { regDeleteFlag(CK_ISNN, DOBJ); }

    protected void regDeleteFlag(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeleteFlag(), "delete_flag"); }
    protected abstract ConditionValue xgetCValueDeleteFlag();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, GeneralCodeMCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, GeneralCodeMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, GeneralCodeMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, GeneralCodeMCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, GeneralCodeMCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;GeneralCodeMCB&gt;() {
     *     public void query(GeneralCodeMCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<GeneralCodeMCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, GeneralCodeMCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        GeneralCodeMCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(GeneralCodeMCQ sq);

    protected GeneralCodeMCB xcreateScalarConditionCB() {
        GeneralCodeMCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected GeneralCodeMCB xcreateScalarConditionPartitionByCB() {
        GeneralCodeMCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<GeneralCodeMCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GeneralCodeMCB cb = new GeneralCodeMCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "code_id";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(GeneralCodeMCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<GeneralCodeMCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(GeneralCodeMCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        GeneralCodeMCB cb = new GeneralCodeMCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "code_id";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(GeneralCodeMCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<GeneralCodeMCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        GeneralCodeMCB cb = new GeneralCodeMCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(GeneralCodeMCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected GeneralCodeMCB newMyCB() {
        return new GeneralCodeMCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return GeneralCodeMCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
