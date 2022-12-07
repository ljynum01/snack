package com.example.snacksback.model;

import java.util.ArrayList;
import java.util.List;

public class StateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StateExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDstateidIsNull() {
            addCriterion("dstateid is null");
            return (Criteria) this;
        }

        public Criteria andDstateidIsNotNull() {
            addCriterion("dstateid is not null");
            return (Criteria) this;
        }

        public Criteria andDstateidEqualTo(Integer value) {
            addCriterion("dstateid =", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidNotEqualTo(Integer value) {
            addCriterion("dstateid <>", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidGreaterThan(Integer value) {
            addCriterion("dstateid >", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dstateid >=", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidLessThan(Integer value) {
            addCriterion("dstateid <", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidLessThanOrEqualTo(Integer value) {
            addCriterion("dstateid <=", value, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidIn(List<Integer> values) {
            addCriterion("dstateid in", values, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidNotIn(List<Integer> values) {
            addCriterion("dstateid not in", values, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidBetween(Integer value1, Integer value2) {
            addCriterion("dstateid between", value1, value2, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("dstateid not between", value1, value2, "dstateid");
            return (Criteria) this;
        }

        public Criteria andDstateIsNull() {
            addCriterion("dstate is null");
            return (Criteria) this;
        }

        public Criteria andDstateIsNotNull() {
            addCriterion("dstate is not null");
            return (Criteria) this;
        }

        public Criteria andDstateEqualTo(String value) {
            addCriterion("dstate =", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotEqualTo(String value) {
            addCriterion("dstate <>", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThan(String value) {
            addCriterion("dstate >", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateGreaterThanOrEqualTo(String value) {
            addCriterion("dstate >=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThan(String value) {
            addCriterion("dstate <", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLessThanOrEqualTo(String value) {
            addCriterion("dstate <=", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateLike(String value) {
            addCriterion("dstate like", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotLike(String value) {
            addCriterion("dstate not like", value, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateIn(List<String> values) {
            addCriterion("dstate in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotIn(List<String> values) {
            addCriterion("dstate not in", values, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateBetween(String value1, String value2) {
            addCriterion("dstate between", value1, value2, "dstate");
            return (Criteria) this;
        }

        public Criteria andDstateNotBetween(String value1, String value2) {
            addCriterion("dstate not between", value1, value2, "dstate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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