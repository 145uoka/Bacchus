package com.Bacchus.app.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * BeanのUtilクラス。
 *
 * @author ishigouoka_k
 * $Id: BeanUtilz.java 239 2017-06-01 06:41:46Z ishigouoka_k@glue-si.com $
 */
public class BeanUtilz {

    /**
     * Beanのリストから、対象のフィールドが指定した値である要素を返却。
     * <p>
     * 対象の要素が複数件存在する場合は、最初にHitした要素を返却する。<br/>
     * 複数の要素を返却したい場合は、{@link searchFromListByStringId}を利用
     *
     * @param beanList Beanのリスト
     * @param filedName フィールド名
     * @param value 値
     * @return 対象のBean
     *
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> T searchFromListById(List<T> beanList, String filedName, String value)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        for(T bean : beanList) {

            Map<String, String> baseObjMap = BeanUtils.describe(bean);

            String destValue = baseObjMap.get(filedName);

            if (StringUtils.equals(destValue, value)) {
                return bean;
            }
        }
        return null;
    }

    /**
     * Beanのリストから、対象のフィールドが指定した値である要素を返却。
     * <p>
     * 対象の要素が複数件存在する場合は、最初にHitした要素を返却する。<br/>
     * 複数の要素を返却したい場合は、{@link searchFromListByStringId}を利用
     *
     * @param beanList Beanのリスト
     * @param filedName フィールド名
     * @param value 値
     * @return 対象のBean
     *
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> T searchFromListByIntegerId(List<T> beanList, String filedName, Integer value)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        for(T bean : beanList) {

            Map<String, String> baseObjMap = BeanUtils.describe(bean);

            String destValue = baseObjMap.get(filedName);

            String stringValue = value.toString();

            if (StringUtils.equals(destValue, stringValue)) {
                return bean;
            }
        }
        return null;
    }

    /**
     * Beanのリストから、対象のフィールドが指定した値である要素を返却。
     * <p>
     *
     * @param beanList Beanのリスト
     * @param fieldName フィールド名
     * @param values 値のリスト
     * @return 対象のBeanリスト
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> List<T> searchFromListByStringId(List<T> beanList, String fieldName, List<String> values)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        List<T> resultList = new ArrayList<T>();

        for(T bean : beanList) {

            Map<String, String> baseObjMap = BeanUtils.describe(bean);

            String destValue = baseObjMap.get(fieldName);
            for (String value : values) {
                if (StringUtils.equals(destValue, value)) {
                    resultList.add(bean);
                    break;
                }
            }
        }

        return resultList;
    }

    public static <T> List<T> searchFromListByIntegerId(List<T> beanList, String fieldName, List<Integer> values)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        List<T> resultList = new ArrayList<T>();

        for(T bean : beanList) {

            Map<String, String> baseObjMap = BeanUtils.describe(bean);

            String destValue = baseObjMap.get(fieldName);
            for (Integer value : values) {
                if (StringUtils.equals(destValue, String.valueOf(value))) {
                    resultList.add(bean);
                    break;
                }
            }
        }

        return resultList;
    }

    /**
     * Beanのリストから、対象のフィールドが指定した値である要素を返却。
     * <p>
     *
     * @param beanList Beanのリスト
     * @param fieldName フィールド名
     * @param values 値のリスト
     * @return 対象のBeanリスト
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> List<T> notFoundSearchFromListByStringId(List<T> beanList, String fieldName, List<String> values)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        List<T> resultList = new ArrayList<T>(beanList);

        for (String value : values) {
            for(int i = 0; i < resultList.size(); i++) {
                T bean = resultList.get(i);
                Map<String, String> baseObjMap = BeanUtils.describe(bean);

                String destValue = baseObjMap.get(fieldName);

                if (StringUtils.equals(destValue, value)) {
                    resultList.remove(i);
                }
            }
        }

        return resultList;
    }

    /**
     * Beanのリストから、対象のフィールドの値を抽出したリストを返却。
     *
     * @param beanList Beanのリスト
     * @param fieldName フィールド名
     * @return 対象のフィールドの値を抽出したリスト
     *
     * @throws IntrospectionException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    @SuppressWarnings("unchecked")
    public static <T> List<?> searchValueListByName(List<T> beanList, String fieldName)
            throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        List<T> resultList = new ArrayList<T>();

        for(T bean : beanList) {

            PropertyDescriptor nameProp = new PropertyDescriptor(fieldName, bean.getClass());

            Method getterMethod = nameProp.getReadMethod();
            resultList.add((T)getterMethod.invoke(bean, (Object[]) null));
        }

        return resultList;
    }

    /**
     * bean同士で、任意のフィールドの値が一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean equalsString(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        String value1 = (String) PropertyUtils.getProperty(bean1, fieldName);
        String value2 = (String) PropertyUtils.getProperty(bean2, fieldName);
        return StringUtils.equals(value1, value2);
    }

    /**
     * bean同士で、任意のフィールドの値が不一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:不一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean notEqualsString(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        return !equalsString(fieldName, bean1, bean2);
    }

    /**
     * bean同士で、任意のフィールドの値が一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean equalsBoolean(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        boolean value1 = (boolean) PropertyUtils.getProperty(bean1, fieldName);
        boolean value2 = (boolean) PropertyUtils.getProperty(bean2, fieldName);
        return (value1 == value2);
    }

    /**
     * bean同士で、任意のフィールドの値が不一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:不一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean notEqualsBoolean(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        return !equalsBoolean(fieldName, bean1, bean2);
    }

    /**
     * bean同士で、任意のフィールドの値が一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean equalsInteger(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Integer value1 = (Integer) PropertyUtils.getProperty(bean1, fieldName);
        Integer value2 = (Integer) PropertyUtils.getProperty(bean2, fieldName);

        if (value1 == null && value2 == null) {
            return true;
        }
        if (value1 != null) {
            return (value1.compareTo(value2) == 0);
        } else {
            return (value2.compareTo(value1) == 0);
        }
    }

    /**
     * bean同士で、任意のフィールドの値が不一致であるかを判定.
     *
     * @param fieldName フィールド名
     * @param bean1 比較対象bean
     * @param bean2 比較対象bean
     * @return true:不一致, false:不一致
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
    public static <T> boolean notEqualsInteger(String fieldName, Object bean1, Object bean2)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        return !equalsInteger(fieldName, bean1, bean2);
    }
}
