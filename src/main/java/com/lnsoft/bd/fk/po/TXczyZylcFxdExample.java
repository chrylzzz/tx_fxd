package com.lnsoft.bd.fk.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TXczyZylcFxdExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public TXczyZylcFxdExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andObjIdIsNull() {
            addCriterion("OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(String value) {
            addCriterion("OBJ_ID =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(String value) {
            addCriterion("OBJ_ID <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(String value) {
            addCriterion("OBJ_ID >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_ID >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(String value) {
            addCriterion("OBJ_ID <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(String value) {
            addCriterion("OBJ_ID <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLike(String value) {
            addCriterion("OBJ_ID like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotLike(String value) {
            addCriterion("OBJ_ID not like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<String> values) {
            addCriterion("OBJ_ID in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<String> values) {
            addCriterion("OBJ_ID not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(String value1, String value2) {
            addCriterion("OBJ_ID between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(String value1, String value2) {
            addCriterion("OBJ_ID not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andFxdmcIsNull() {
            addCriterion("FXDMC is null");
            return (Criteria) this;
        }

        public Criteria andFxdmcIsNotNull() {
            addCriterion("FXDMC is not null");
            return (Criteria) this;
        }

        public Criteria andFxdmcEqualTo(String value) {
            addCriterion("FXDMC =", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcNotEqualTo(String value) {
            addCriterion("FXDMC <>", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcGreaterThan(String value) {
            addCriterion("FXDMC >", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcGreaterThanOrEqualTo(String value) {
            addCriterion("FXDMC >=", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcLessThan(String value) {
            addCriterion("FXDMC <", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcLessThanOrEqualTo(String value) {
            addCriterion("FXDMC <=", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcLike(String value) {
            addCriterion("FXDMC like", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcNotLike(String value) {
            addCriterion("FXDMC not like", value, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcIn(List<String> values) {
            addCriterion("FXDMC in", values, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcNotIn(List<String> values) {
            addCriterion("FXDMC not in", values, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcBetween(String value1, String value2) {
            addCriterion("FXDMC between", value1, value2, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdmcNotBetween(String value1, String value2) {
            addCriterion("FXDMC not between", value1, value2, "fxdmc");
            return (Criteria) this;
        }

        public Criteria andFxdnrIsNull() {
            addCriterion("FXDNR is null");
            return (Criteria) this;
        }

        public Criteria andFxdnrIsNotNull() {
            addCriterion("FXDNR is not null");
            return (Criteria) this;
        }

        public Criteria andFxdnrEqualTo(String value) {
            addCriterion("FXDNR =", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrNotEqualTo(String value) {
            addCriterion("FXDNR <>", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrGreaterThan(String value) {
            addCriterion("FXDNR >", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrGreaterThanOrEqualTo(String value) {
            addCriterion("FXDNR >=", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrLessThan(String value) {
            addCriterion("FXDNR <", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrLessThanOrEqualTo(String value) {
            addCriterion("FXDNR <=", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrLike(String value) {
            addCriterion("FXDNR like", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrNotLike(String value) {
            addCriterion("FXDNR not like", value, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrIn(List<String> values) {
            addCriterion("FXDNR in", values, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrNotIn(List<String> values) {
            addCriterion("FXDNR not in", values, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrBetween(String value1, String value2) {
            addCriterion("FXDNR between", value1, value2, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andFxdnrNotBetween(String value1, String value2) {
            addCriterion("FXDNR not between", value1, value2, "fxdnr");
            return (Criteria) this;
        }

        public Criteria andWjmIsNull() {
            addCriterion("WJM is null");
            return (Criteria) this;
        }

        public Criteria andWjmIsNotNull() {
            addCriterion("WJM is not null");
            return (Criteria) this;
        }

        public Criteria andWjmEqualTo(String value) {
            addCriterion("WJM =", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmNotEqualTo(String value) {
            addCriterion("WJM <>", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmGreaterThan(String value) {
            addCriterion("WJM >", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmGreaterThanOrEqualTo(String value) {
            addCriterion("WJM >=", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmLessThan(String value) {
            addCriterion("WJM <", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmLessThanOrEqualTo(String value) {
            addCriterion("WJM <=", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmLike(String value) {
            addCriterion("WJM like", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmNotLike(String value) {
            addCriterion("WJM not like", value, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmIn(List<String> values) {
            addCriterion("WJM in", values, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmNotIn(List<String> values) {
            addCriterion("WJM not in", values, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmBetween(String value1, String value2) {
            addCriterion("WJM between", value1, value2, "wjm");
            return (Criteria) this;
        }

        public Criteria andWjmNotBetween(String value1, String value2) {
            addCriterion("WJM not between", value1, value2, "wjm");
            return (Criteria) this;
        }

        public Criteria andBzidIsNull() {
            addCriterion("BZID is null");
            return (Criteria) this;
        }

        public Criteria andBzidIsNotNull() {
            addCriterion("BZID is not null");
            return (Criteria) this;
        }

        public Criteria andBzidEqualTo(String value) {
            addCriterion("BZID =", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidNotEqualTo(String value) {
            addCriterion("BZID <>", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidGreaterThan(String value) {
            addCriterion("BZID >", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidGreaterThanOrEqualTo(String value) {
            addCriterion("BZID >=", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidLessThan(String value) {
            addCriterion("BZID <", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidLessThanOrEqualTo(String value) {
            addCriterion("BZID <=", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidLike(String value) {
            addCriterion("BZID like", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidNotLike(String value) {
            addCriterion("BZID not like", value, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidIn(List<String> values) {
            addCriterion("BZID in", values, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidNotIn(List<String> values) {
            addCriterion("BZID not in", values, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidBetween(String value1, String value2) {
            addCriterion("BZID between", value1, value2, "bzid");
            return (Criteria) this;
        }

        public Criteria andBzidNotBetween(String value1, String value2) {
            addCriterion("BZID not between", value1, value2, "bzid");
            return (Criteria) this;
        }

        public Criteria andFxdbzIsNull() {
            addCriterion("FXDBZ is null");
            return (Criteria) this;
        }

        public Criteria andFxdbzIsNotNull() {
            addCriterion("FXDBZ is not null");
            return (Criteria) this;
        }

        public Criteria andFxdbzEqualTo(BigDecimal value) {
            addCriterion("FXDBZ =", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzNotEqualTo(BigDecimal value) {
            addCriterion("FXDBZ <>", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzGreaterThan(BigDecimal value) {
            addCriterion("FXDBZ >", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FXDBZ >=", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzLessThan(BigDecimal value) {
            addCriterion("FXDBZ <", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FXDBZ <=", value, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzIn(List<BigDecimal> values) {
            addCriterion("FXDBZ in", values, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzNotIn(List<BigDecimal> values) {
            addCriterion("FXDBZ not in", values, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FXDBZ between", value1, value2, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andFxdbzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FXDBZ not between", value1, value2, "fxdbz");
            return (Criteria) this;
        }

        public Criteria andZxrIsNull() {
            addCriterion("ZXR is null");
            return (Criteria) this;
        }

        public Criteria andZxrIsNotNull() {
            addCriterion("ZXR is not null");
            return (Criteria) this;
        }

        public Criteria andZxrEqualTo(String value) {
            addCriterion("ZXR =", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrNotEqualTo(String value) {
            addCriterion("ZXR <>", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrGreaterThan(String value) {
            addCriterion("ZXR >", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrGreaterThanOrEqualTo(String value) {
            addCriterion("ZXR >=", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrLessThan(String value) {
            addCriterion("ZXR <", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrLessThanOrEqualTo(String value) {
            addCriterion("ZXR <=", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrLike(String value) {
            addCriterion("ZXR like", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrNotLike(String value) {
            addCriterion("ZXR not like", value, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrIn(List<String> values) {
            addCriterion("ZXR in", values, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrNotIn(List<String> values) {
            addCriterion("ZXR not in", values, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrBetween(String value1, String value2) {
            addCriterion("ZXR between", value1, value2, "zxr");
            return (Criteria) this;
        }

        public Criteria andZxrNotBetween(String value1, String value2) {
            addCriterion("ZXR not between", value1, value2, "zxr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated do_not_delete_during_merge Thu Nov 01 14:06:53 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_XCZY_ZYLC_FXD
     *
     * @mbggenerated Thu Nov 01 14:06:53 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}