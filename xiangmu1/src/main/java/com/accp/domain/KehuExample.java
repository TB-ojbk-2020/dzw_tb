package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KehuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KehuExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLianxirIsNull() {
            addCriterion("lianxir is null");
            return (Criteria) this;
        }

        public Criteria andLianxirIsNotNull() {
            addCriterion("lianxir is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirEqualTo(String value) {
            addCriterion("lianxir =", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirNotEqualTo(String value) {
            addCriterion("lianxir <>", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirGreaterThan(String value) {
            addCriterion("lianxir >", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirGreaterThanOrEqualTo(String value) {
            addCriterion("lianxir >=", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirLessThan(String value) {
            addCriterion("lianxir <", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirLessThanOrEqualTo(String value) {
            addCriterion("lianxir <=", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirLike(String value) {
            addCriterion("lianxir like", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirNotLike(String value) {
            addCriterion("lianxir not like", value, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirIn(List<String> values) {
            addCriterion("lianxir in", values, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirNotIn(List<String> values) {
            addCriterion("lianxir not in", values, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirBetween(String value1, String value2) {
            addCriterion("lianxir between", value1, value2, "lianxir");
            return (Criteria) this;
        }

        public Criteria andLianxirNotBetween(String value1, String value2) {
            addCriterion("lianxir not between", value1, value2, "lianxir");
            return (Criteria) this;
        }

        public Criteria andTdataIsNull() {
            addCriterion("tdata is null");
            return (Criteria) this;
        }

        public Criteria andTdataIsNotNull() {
            addCriterion("tdata is not null");
            return (Criteria) this;
        }

        public Criteria andTdataEqualTo(String value) {
            addCriterion("tdata =", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataNotEqualTo(String value) {
            addCriterion("tdata <>", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataGreaterThan(String value) {
            addCriterion("tdata >", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataGreaterThanOrEqualTo(String value) {
            addCriterion("tdata >=", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataLessThan(String value) {
            addCriterion("tdata <", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataLessThanOrEqualTo(String value) {
            addCriterion("tdata <=", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataLike(String value) {
            addCriterion("tdata like", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataNotLike(String value) {
            addCriterion("tdata not like", value, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataIn(List<String> values) {
            addCriterion("tdata in", values, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataNotIn(List<String> values) {
            addCriterion("tdata not in", values, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataBetween(String value1, String value2) {
            addCriterion("tdata between", value1, value2, "tdata");
            return (Criteria) this;
        }

        public Criteria andTdataNotBetween(String value1, String value2) {
            addCriterion("tdata not between", value1, value2, "tdata");
            return (Criteria) this;
        }

        public Criteria andLianxidIsNull() {
            addCriterion("lianxid is null");
            return (Criteria) this;
        }

        public Criteria andLianxidIsNotNull() {
            addCriterion("lianxid is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidEqualTo(String value) {
            addCriterion("lianxid =", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidNotEqualTo(String value) {
            addCriterion("lianxid <>", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidGreaterThan(String value) {
            addCriterion("lianxid >", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidGreaterThanOrEqualTo(String value) {
            addCriterion("lianxid >=", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidLessThan(String value) {
            addCriterion("lianxid <", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidLessThanOrEqualTo(String value) {
            addCriterion("lianxid <=", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidLike(String value) {
            addCriterion("lianxid like", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidNotLike(String value) {
            addCriterion("lianxid not like", value, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidIn(List<String> values) {
            addCriterion("lianxid in", values, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidNotIn(List<String> values) {
            addCriterion("lianxid not in", values, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidBetween(String value1, String value2) {
            addCriterion("lianxid between", value1, value2, "lianxid");
            return (Criteria) this;
        }

        public Criteria andLianxidNotBetween(String value1, String value2) {
            addCriterion("lianxid not between", value1, value2, "lianxid");
            return (Criteria) this;
        }

        public Criteria andFuzerIsNull() {
            addCriterion("fuzer is null");
            return (Criteria) this;
        }

        public Criteria andFuzerIsNotNull() {
            addCriterion("fuzer is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerEqualTo(String value) {
            addCriterion("fuzer =", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerNotEqualTo(String value) {
            addCriterion("fuzer <>", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerGreaterThan(String value) {
            addCriterion("fuzer >", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerGreaterThanOrEqualTo(String value) {
            addCriterion("fuzer >=", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerLessThan(String value) {
            addCriterion("fuzer <", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerLessThanOrEqualTo(String value) {
            addCriterion("fuzer <=", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerLike(String value) {
            addCriterion("fuzer like", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerNotLike(String value) {
            addCriterion("fuzer not like", value, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerIn(List<String> values) {
            addCriterion("fuzer in", values, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerNotIn(List<String> values) {
            addCriterion("fuzer not in", values, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerBetween(String value1, String value2) {
            addCriterion("fuzer between", value1, value2, "fuzer");
            return (Criteria) this;
        }

        public Criteria andFuzerNotBetween(String value1, String value2) {
            addCriterion("fuzer not between", value1, value2, "fuzer");
            return (Criteria) this;
        }

        public Criteria andDenjihaoIsNull() {
            addCriterion("denjihao is null");
            return (Criteria) this;
        }

        public Criteria andDenjihaoIsNotNull() {
            addCriterion("denjihao is not null");
            return (Criteria) this;
        }

        public Criteria andDenjihaoEqualTo(String value) {
            addCriterion("denjihao =", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoNotEqualTo(String value) {
            addCriterion("denjihao <>", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoGreaterThan(String value) {
            addCriterion("denjihao >", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoGreaterThanOrEqualTo(String value) {
            addCriterion("denjihao >=", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoLessThan(String value) {
            addCriterion("denjihao <", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoLessThanOrEqualTo(String value) {
            addCriterion("denjihao <=", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoLike(String value) {
            addCriterion("denjihao like", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoNotLike(String value) {
            addCriterion("denjihao not like", value, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoIn(List<String> values) {
            addCriterion("denjihao in", values, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoNotIn(List<String> values) {
            addCriterion("denjihao not in", values, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoBetween(String value1, String value2) {
            addCriterion("denjihao between", value1, value2, "denjihao");
            return (Criteria) this;
        }

        public Criteria andDenjihaoNotBetween(String value1, String value2) {
            addCriterion("denjihao not between", value1, value2, "denjihao");
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