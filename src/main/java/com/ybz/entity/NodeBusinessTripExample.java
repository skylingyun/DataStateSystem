package com.ybz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NodeBusinessTripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startRow;

    protected Integer pageSize;

    public NodeBusinessTripExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPkIsNull() {
            addCriterion("pk is null");
            return (Criteria) this;
        }

        public Criteria andPkIsNotNull() {
            addCriterion("pk is not null");
            return (Criteria) this;
        }

        public Criteria andPkEqualTo(String value) {
            addCriterion("pk =", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotEqualTo(String value) {
            addCriterion("pk <>", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThan(String value) {
            addCriterion("pk >", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkGreaterThanOrEqualTo(String value) {
            addCriterion("pk >=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThan(String value) {
            addCriterion("pk <", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLessThanOrEqualTo(String value) {
            addCriterion("pk <=", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkLike(String value) {
            addCriterion("pk like", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotLike(String value) {
            addCriterion("pk not like", value, "pk");
            return (Criteria) this;
        }

        public Criteria andPkIn(List<String> values) {
            addCriterion("pk in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotIn(List<String> values) {
            addCriterion("pk not in", values, "pk");
            return (Criteria) this;
        }

        public Criteria andPkBetween(String value1, String value2) {
            addCriterion("pk between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andPkNotBetween(String value1, String value2) {
            addCriterion("pk not between", value1, value2, "pk");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andZdyheadIsNull() {
            addCriterion("zdyhead is null");
            return (Criteria) this;
        }

        public Criteria andZdyheadIsNotNull() {
            addCriterion("zdyhead is not null");
            return (Criteria) this;
        }

        public Criteria andZdyheadEqualTo(String value) {
            addCriterion("zdyhead =", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadNotEqualTo(String value) {
            addCriterion("zdyhead <>", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadGreaterThan(String value) {
            addCriterion("zdyhead >", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadGreaterThanOrEqualTo(String value) {
            addCriterion("zdyhead >=", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadLessThan(String value) {
            addCriterion("zdyhead <", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadLessThanOrEqualTo(String value) {
            addCriterion("zdyhead <=", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadLike(String value) {
            addCriterion("zdyhead like", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadNotLike(String value) {
            addCriterion("zdyhead not like", value, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadIn(List<String> values) {
            addCriterion("zdyhead in", values, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadNotIn(List<String> values) {
            addCriterion("zdyhead not in", values, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadBetween(String value1, String value2) {
            addCriterion("zdyhead between", value1, value2, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadNotBetween(String value1, String value2) {
            addCriterion("zdyhead not between", value1, value2, "zdyhead");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueIsNull() {
            addCriterion("zdyheadValue is null");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueIsNotNull() {
            addCriterion("zdyheadValue is not null");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueEqualTo(String value) {
            addCriterion("zdyheadValue =", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueNotEqualTo(String value) {
            addCriterion("zdyheadValue <>", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueGreaterThan(String value) {
            addCriterion("zdyheadValue >", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueGreaterThanOrEqualTo(String value) {
            addCriterion("zdyheadValue >=", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueLessThan(String value) {
            addCriterion("zdyheadValue <", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueLessThanOrEqualTo(String value) {
            addCriterion("zdyheadValue <=", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueLike(String value) {
            addCriterion("zdyheadValue like", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueNotLike(String value) {
            addCriterion("zdyheadValue not like", value, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueIn(List<String> values) {
            addCriterion("zdyheadValue in", values, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueNotIn(List<String> values) {
            addCriterion("zdyheadValue not in", values, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueBetween(String value1, String value2) {
            addCriterion("zdyheadValue between", value1, value2, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andZdyheadvalueNotBetween(String value1, String value2) {
            addCriterion("zdyheadValue not between", value1, value2, "zdyheadvalue");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNull() {
            addCriterion("billstatus is null");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNotNull() {
            addCriterion("billstatus is not null");
            return (Criteria) this;
        }

        public Criteria andBillstatusEqualTo(Integer value) {
            addCriterion("billstatus =", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotEqualTo(Integer value) {
            addCriterion("billstatus <>", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThan(Integer value) {
            addCriterion("billstatus >", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("billstatus >=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThan(Integer value) {
            addCriterion("billstatus <", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThanOrEqualTo(Integer value) {
            addCriterion("billstatus <=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusIn(List<Integer> values) {
            addCriterion("billstatus in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotIn(List<Integer> values) {
            addCriterion("billstatus not in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusBetween(Integer value1, Integer value2) {
            addCriterion("billstatus between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("billstatus not between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusIsNull() {
            addCriterion("reimburstatus is null");
            return (Criteria) this;
        }

        public Criteria andReimburstatusIsNotNull() {
            addCriterion("reimburstatus is not null");
            return (Criteria) this;
        }

        public Criteria andReimburstatusEqualTo(Integer value) {
            addCriterion("reimburstatus =", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusNotEqualTo(Integer value) {
            addCriterion("reimburstatus <>", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusGreaterThan(Integer value) {
            addCriterion("reimburstatus >", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("reimburstatus >=", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusLessThan(Integer value) {
            addCriterion("reimburstatus <", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusLessThanOrEqualTo(Integer value) {
            addCriterion("reimburstatus <=", value, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusIn(List<Integer> values) {
            addCriterion("reimburstatus in", values, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusNotIn(List<Integer> values) {
            addCriterion("reimburstatus not in", values, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusBetween(Integer value1, Integer value2) {
            addCriterion("reimburstatus between", value1, value2, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andReimburstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("reimburstatus not between", value1, value2, "reimburstatus");
            return (Criteria) this;
        }

        public Criteria andPkBillIsNull() {
            addCriterion("pk_bill is null");
            return (Criteria) this;
        }

        public Criteria andPkBillIsNotNull() {
            addCriterion("pk_bill is not null");
            return (Criteria) this;
        }

        public Criteria andPkBillEqualTo(String value) {
            addCriterion("pk_bill =", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillNotEqualTo(String value) {
            addCriterion("pk_bill <>", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillGreaterThan(String value) {
            addCriterion("pk_bill >", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillGreaterThanOrEqualTo(String value) {
            addCriterion("pk_bill >=", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillLessThan(String value) {
            addCriterion("pk_bill <", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillLessThanOrEqualTo(String value) {
            addCriterion("pk_bill <=", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillLike(String value) {
            addCriterion("pk_bill like", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillNotLike(String value) {
            addCriterion("pk_bill not like", value, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillIn(List<String> values) {
            addCriterion("pk_bill in", values, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillNotIn(List<String> values) {
            addCriterion("pk_bill not in", values, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillBetween(String value1, String value2) {
            addCriterion("pk_bill between", value1, value2, "pkBill");
            return (Criteria) this;
        }

        public Criteria andPkBillNotBetween(String value1, String value2) {
            addCriterion("pk_bill not between", value1, value2, "pkBill");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNull() {
            addCriterion("dealdate is null");
            return (Criteria) this;
        }

        public Criteria andDealdateIsNotNull() {
            addCriterion("dealdate is not null");
            return (Criteria) this;
        }

        public Criteria andDealdateEqualTo(Date value) {
            addCriterionForJDBCDate("dealdate =", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dealdate <>", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThan(Date value) {
            addCriterionForJDBCDate("dealdate >", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dealdate >=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThan(Date value) {
            addCriterionForJDBCDate("dealdate <", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dealdate <=", value, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateIn(List<Date> values) {
            addCriterionForJDBCDate("dealdate in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dealdate not in", values, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dealdate between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andDealdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dealdate not between", value1, value2, "dealdate");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Boolean value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Boolean value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Boolean value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Boolean value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Boolean value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Boolean> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Boolean> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Boolean value1, Boolean value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andTagpkIsNull() {
            addCriterion("tagPk is null");
            return (Criteria) this;
        }

        public Criteria andTagpkIsNotNull() {
            addCriterion("tagPk is not null");
            return (Criteria) this;
        }

        public Criteria andTagpkEqualTo(String value) {
            addCriterion("tagPk =", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkNotEqualTo(String value) {
            addCriterion("tagPk <>", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkGreaterThan(String value) {
            addCriterion("tagPk >", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkGreaterThanOrEqualTo(String value) {
            addCriterion("tagPk >=", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkLessThan(String value) {
            addCriterion("tagPk <", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkLessThanOrEqualTo(String value) {
            addCriterion("tagPk <=", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkLike(String value) {
            addCriterion("tagPk like", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkNotLike(String value) {
            addCriterion("tagPk not like", value, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkIn(List<String> values) {
            addCriterion("tagPk in", values, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkNotIn(List<String> values) {
            addCriterion("tagPk not in", values, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkBetween(String value1, String value2) {
            addCriterion("tagPk between", value1, value2, "tagpk");
            return (Criteria) this;
        }

        public Criteria andTagpkNotBetween(String value1, String value2) {
            addCriterion("tagPk not between", value1, value2, "tagpk");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNull() {
            addCriterion("is_closed is null");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNotNull() {
            addCriterion("is_closed is not null");
            return (Criteria) this;
        }

        public Criteria andIsClosedEqualTo(Boolean value) {
            addCriterion("is_closed =", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotEqualTo(Boolean value) {
            addCriterion("is_closed <>", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThan(Boolean value) {
            addCriterion("is_closed >", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_closed >=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThan(Boolean value) {
            addCriterion("is_closed <", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_closed <=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedIn(List<Boolean> values) {
            addCriterion("is_closed in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotIn(List<Boolean> values) {
            addCriterion("is_closed not in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_closed between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_closed not between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIsNull() {
            addCriterion("budget_money is null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIsNotNull() {
            addCriterion("budget_money is not null");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyEqualTo(Double value) {
            addCriterion("budget_money =", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotEqualTo(Double value) {
            addCriterion("budget_money <>", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyGreaterThan(Double value) {
            addCriterion("budget_money >", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("budget_money >=", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyLessThan(Double value) {
            addCriterion("budget_money <", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyLessThanOrEqualTo(Double value) {
            addCriterion("budget_money <=", value, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyIn(List<Double> values) {
            addCriterion("budget_money in", values, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotIn(List<Double> values) {
            addCriterion("budget_money not in", values, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyBetween(Double value1, Double value2) {
            addCriterion("budget_money between", value1, value2, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andBudgetMoneyNotBetween(Double value1, Double value2) {
            addCriterion("budget_money not between", value1, value2, "budgetMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyIsNull() {
            addCriterion("rest_money is null");
            return (Criteria) this;
        }

        public Criteria andRestMoneyIsNotNull() {
            addCriterion("rest_money is not null");
            return (Criteria) this;
        }

        public Criteria andRestMoneyEqualTo(Double value) {
            addCriterion("rest_money =", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyNotEqualTo(Double value) {
            addCriterion("rest_money <>", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyGreaterThan(Double value) {
            addCriterion("rest_money >", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("rest_money >=", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyLessThan(Double value) {
            addCriterion("rest_money <", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyLessThanOrEqualTo(Double value) {
            addCriterion("rest_money <=", value, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyIn(List<Double> values) {
            addCriterion("rest_money in", values, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyNotIn(List<Double> values) {
            addCriterion("rest_money not in", values, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyBetween(Double value1, Double value2) {
            addCriterion("rest_money between", value1, value2, "restMoney");
            return (Criteria) this;
        }

        public Criteria andRestMoneyNotBetween(Double value1, Double value2) {
            addCriterion("rest_money not between", value1, value2, "restMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIsNull() {
            addCriterion("used_money is null");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIsNotNull() {
            addCriterion("used_money is not null");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyEqualTo(Double value) {
            addCriterion("used_money =", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotEqualTo(Double value) {
            addCriterion("used_money <>", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyGreaterThan(Double value) {
            addCriterion("used_money >", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("used_money >=", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyLessThan(Double value) {
            addCriterion("used_money <", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("used_money <=", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIn(List<Double> values) {
            addCriterion("used_money in", values, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotIn(List<Double> values) {
            addCriterion("used_money not in", values, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyBetween(Double value1, Double value2) {
            addCriterion("used_money between", value1, value2, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("used_money not between", value1, value2, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andMatterIsNull() {
            addCriterion("matter is null");
            return (Criteria) this;
        }

        public Criteria andMatterIsNotNull() {
            addCriterion("matter is not null");
            return (Criteria) this;
        }

        public Criteria andMatterEqualTo(String value) {
            addCriterion("matter =", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotEqualTo(String value) {
            addCriterion("matter <>", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterGreaterThan(String value) {
            addCriterion("matter >", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterGreaterThanOrEqualTo(String value) {
            addCriterion("matter >=", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLessThan(String value) {
            addCriterion("matter <", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLessThanOrEqualTo(String value) {
            addCriterion("matter <=", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLike(String value) {
            addCriterion("matter like", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotLike(String value) {
            addCriterion("matter not like", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterIn(List<String> values) {
            addCriterion("matter in", values, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotIn(List<String> values) {
            addCriterion("matter not in", values, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterBetween(String value1, String value2) {
            addCriterion("matter between", value1, value2, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotBetween(String value1, String value2) {
            addCriterion("matter not between", value1, value2, "matter");
            return (Criteria) this;
        }

        public Criteria andCostProjectIsNull() {
            addCriterion("cost_project is null");
            return (Criteria) this;
        }

        public Criteria andCostProjectIsNotNull() {
            addCriterion("cost_project is not null");
            return (Criteria) this;
        }

        public Criteria andCostProjectEqualTo(String value) {
            addCriterion("cost_project =", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectNotEqualTo(String value) {
            addCriterion("cost_project <>", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectGreaterThan(String value) {
            addCriterion("cost_project >", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectGreaterThanOrEqualTo(String value) {
            addCriterion("cost_project >=", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectLessThan(String value) {
            addCriterion("cost_project <", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectLessThanOrEqualTo(String value) {
            addCriterion("cost_project <=", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectLike(String value) {
            addCriterion("cost_project like", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectNotLike(String value) {
            addCriterion("cost_project not like", value, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectIn(List<String> values) {
            addCriterion("cost_project in", values, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectNotIn(List<String> values) {
            addCriterion("cost_project not in", values, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectBetween(String value1, String value2) {
            addCriterion("cost_project between", value1, value2, "costProject");
            return (Criteria) this;
        }

        public Criteria andCostProjectNotBetween(String value1, String value2) {
            addCriterion("cost_project not between", value1, value2, "costProject");
            return (Criteria) this;
        }

        public Criteria andDjdlIsNull() {
            addCriterion("djdl is null");
            return (Criteria) this;
        }

        public Criteria andDjdlIsNotNull() {
            addCriterion("djdl is not null");
            return (Criteria) this;
        }

        public Criteria andDjdlEqualTo(String value) {
            addCriterion("djdl =", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotEqualTo(String value) {
            addCriterion("djdl <>", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThan(String value) {
            addCriterion("djdl >", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlGreaterThanOrEqualTo(String value) {
            addCriterion("djdl >=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThan(String value) {
            addCriterion("djdl <", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLessThanOrEqualTo(String value) {
            addCriterion("djdl <=", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlLike(String value) {
            addCriterion("djdl like", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotLike(String value) {
            addCriterion("djdl not like", value, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlIn(List<String> values) {
            addCriterion("djdl in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotIn(List<String> values) {
            addCriterion("djdl not in", values, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlBetween(String value1, String value2) {
            addCriterion("djdl between", value1, value2, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjdlNotBetween(String value1, String value2) {
            addCriterion("djdl not between", value1, value2, "djdl");
            return (Criteria) this;
        }

        public Criteria andDjlxbmIsNull() {
            addCriterion("djlxbm is null");
            return (Criteria) this;
        }

        public Criteria andDjlxbmIsNotNull() {
            addCriterion("djlxbm is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxbmEqualTo(String value) {
            addCriterion("djlxbm =", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmNotEqualTo(String value) {
            addCriterion("djlxbm <>", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmGreaterThan(String value) {
            addCriterion("djlxbm >", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmGreaterThanOrEqualTo(String value) {
            addCriterion("djlxbm >=", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmLessThan(String value) {
            addCriterion("djlxbm <", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmLessThanOrEqualTo(String value) {
            addCriterion("djlxbm <=", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmLike(String value) {
            addCriterion("djlxbm like", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmNotLike(String value) {
            addCriterion("djlxbm not like", value, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmIn(List<String> values) {
            addCriterion("djlxbm in", values, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmNotIn(List<String> values) {
            addCriterion("djlxbm not in", values, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmBetween(String value1, String value2) {
            addCriterion("djlxbm between", value1, value2, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andDjlxbmNotBetween(String value1, String value2) {
            addCriterion("djlxbm not between", value1, value2, "djlxbm");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNull() {
            addCriterion("billtype is null");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNotNull() {
            addCriterion("billtype is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypeEqualTo(String value) {
            addCriterion("billtype =", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotEqualTo(String value) {
            addCriterion("billtype <>", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThan(String value) {
            addCriterion("billtype >", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("billtype >=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThan(String value) {
            addCriterion("billtype <", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThanOrEqualTo(String value) {
            addCriterion("billtype <=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLike(String value) {
            addCriterion("billtype like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotLike(String value) {
            addCriterion("billtype not like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIn(List<String> values) {
            addCriterion("billtype in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotIn(List<String> values) {
            addCriterion("billtype not in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeBetween(String value1, String value2) {
            addCriterion("billtype between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotBetween(String value1, String value2) {
            addCriterion("billtype not between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andDjlxpkIsNull() {
            addCriterion("djlxpk is null");
            return (Criteria) this;
        }

        public Criteria andDjlxpkIsNotNull() {
            addCriterion("djlxpk is not null");
            return (Criteria) this;
        }

        public Criteria andDjlxpkEqualTo(String value) {
            addCriterion("djlxpk =", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkNotEqualTo(String value) {
            addCriterion("djlxpk <>", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkGreaterThan(String value) {
            addCriterion("djlxpk >", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkGreaterThanOrEqualTo(String value) {
            addCriterion("djlxpk >=", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkLessThan(String value) {
            addCriterion("djlxpk <", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkLessThanOrEqualTo(String value) {
            addCriterion("djlxpk <=", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkLike(String value) {
            addCriterion("djlxpk like", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkNotLike(String value) {
            addCriterion("djlxpk not like", value, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkIn(List<String> values) {
            addCriterion("djlxpk in", values, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkNotIn(List<String> values) {
            addCriterion("djlxpk not in", values, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkBetween(String value1, String value2) {
            addCriterion("djlxpk between", value1, value2, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDjlxpkNotBetween(String value1, String value2) {
            addCriterion("djlxpk not between", value1, value2, "djlxpk");
            return (Criteria) this;
        }

        public Criteria andDefitem1IsNull() {
            addCriterion("defitem1 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem1IsNotNull() {
            addCriterion("defitem1 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem1EqualTo(String value) {
            addCriterion("defitem1 =", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1NotEqualTo(String value) {
            addCriterion("defitem1 <>", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1GreaterThan(String value) {
            addCriterion("defitem1 >", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1GreaterThanOrEqualTo(String value) {
            addCriterion("defitem1 >=", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1LessThan(String value) {
            addCriterion("defitem1 <", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1LessThanOrEqualTo(String value) {
            addCriterion("defitem1 <=", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1Like(String value) {
            addCriterion("defitem1 like", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1NotLike(String value) {
            addCriterion("defitem1 not like", value, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1In(List<String> values) {
            addCriterion("defitem1 in", values, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1NotIn(List<String> values) {
            addCriterion("defitem1 not in", values, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1Between(String value1, String value2) {
            addCriterion("defitem1 between", value1, value2, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem1NotBetween(String value1, String value2) {
            addCriterion("defitem1 not between", value1, value2, "defitem1");
            return (Criteria) this;
        }

        public Criteria andDefitem2IsNull() {
            addCriterion("defitem2 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem2IsNotNull() {
            addCriterion("defitem2 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem2EqualTo(String value) {
            addCriterion("defitem2 =", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2NotEqualTo(String value) {
            addCriterion("defitem2 <>", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2GreaterThan(String value) {
            addCriterion("defitem2 >", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2GreaterThanOrEqualTo(String value) {
            addCriterion("defitem2 >=", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2LessThan(String value) {
            addCriterion("defitem2 <", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2LessThanOrEqualTo(String value) {
            addCriterion("defitem2 <=", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2Like(String value) {
            addCriterion("defitem2 like", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2NotLike(String value) {
            addCriterion("defitem2 not like", value, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2In(List<String> values) {
            addCriterion("defitem2 in", values, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2NotIn(List<String> values) {
            addCriterion("defitem2 not in", values, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2Between(String value1, String value2) {
            addCriterion("defitem2 between", value1, value2, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem2NotBetween(String value1, String value2) {
            addCriterion("defitem2 not between", value1, value2, "defitem2");
            return (Criteria) this;
        }

        public Criteria andDefitem3IsNull() {
            addCriterion("defitem3 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem3IsNotNull() {
            addCriterion("defitem3 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem3EqualTo(String value) {
            addCriterion("defitem3 =", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3NotEqualTo(String value) {
            addCriterion("defitem3 <>", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3GreaterThan(String value) {
            addCriterion("defitem3 >", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3GreaterThanOrEqualTo(String value) {
            addCriterion("defitem3 >=", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3LessThan(String value) {
            addCriterion("defitem3 <", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3LessThanOrEqualTo(String value) {
            addCriterion("defitem3 <=", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3Like(String value) {
            addCriterion("defitem3 like", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3NotLike(String value) {
            addCriterion("defitem3 not like", value, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3In(List<String> values) {
            addCriterion("defitem3 in", values, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3NotIn(List<String> values) {
            addCriterion("defitem3 not in", values, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3Between(String value1, String value2) {
            addCriterion("defitem3 between", value1, value2, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem3NotBetween(String value1, String value2) {
            addCriterion("defitem3 not between", value1, value2, "defitem3");
            return (Criteria) this;
        }

        public Criteria andDefitem4IsNull() {
            addCriterion("defitem4 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem4IsNotNull() {
            addCriterion("defitem4 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem4EqualTo(String value) {
            addCriterion("defitem4 =", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4NotEqualTo(String value) {
            addCriterion("defitem4 <>", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4GreaterThan(String value) {
            addCriterion("defitem4 >", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4GreaterThanOrEqualTo(String value) {
            addCriterion("defitem4 >=", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4LessThan(String value) {
            addCriterion("defitem4 <", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4LessThanOrEqualTo(String value) {
            addCriterion("defitem4 <=", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4Like(String value) {
            addCriterion("defitem4 like", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4NotLike(String value) {
            addCriterion("defitem4 not like", value, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4In(List<String> values) {
            addCriterion("defitem4 in", values, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4NotIn(List<String> values) {
            addCriterion("defitem4 not in", values, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4Between(String value1, String value2) {
            addCriterion("defitem4 between", value1, value2, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem4NotBetween(String value1, String value2) {
            addCriterion("defitem4 not between", value1, value2, "defitem4");
            return (Criteria) this;
        }

        public Criteria andDefitem5IsNull() {
            addCriterion("defitem5 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem5IsNotNull() {
            addCriterion("defitem5 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem5EqualTo(String value) {
            addCriterion("defitem5 =", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5NotEqualTo(String value) {
            addCriterion("defitem5 <>", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5GreaterThan(String value) {
            addCriterion("defitem5 >", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5GreaterThanOrEqualTo(String value) {
            addCriterion("defitem5 >=", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5LessThan(String value) {
            addCriterion("defitem5 <", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5LessThanOrEqualTo(String value) {
            addCriterion("defitem5 <=", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5Like(String value) {
            addCriterion("defitem5 like", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5NotLike(String value) {
            addCriterion("defitem5 not like", value, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5In(List<String> values) {
            addCriterion("defitem5 in", values, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5NotIn(List<String> values) {
            addCriterion("defitem5 not in", values, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5Between(String value1, String value2) {
            addCriterion("defitem5 between", value1, value2, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem5NotBetween(String value1, String value2) {
            addCriterion("defitem5 not between", value1, value2, "defitem5");
            return (Criteria) this;
        }

        public Criteria andDefitem6IsNull() {
            addCriterion("defitem6 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem6IsNotNull() {
            addCriterion("defitem6 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem6EqualTo(String value) {
            addCriterion("defitem6 =", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6NotEqualTo(String value) {
            addCriterion("defitem6 <>", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6GreaterThan(String value) {
            addCriterion("defitem6 >", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6GreaterThanOrEqualTo(String value) {
            addCriterion("defitem6 >=", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6LessThan(String value) {
            addCriterion("defitem6 <", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6LessThanOrEqualTo(String value) {
            addCriterion("defitem6 <=", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6Like(String value) {
            addCriterion("defitem6 like", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6NotLike(String value) {
            addCriterion("defitem6 not like", value, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6In(List<String> values) {
            addCriterion("defitem6 in", values, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6NotIn(List<String> values) {
            addCriterion("defitem6 not in", values, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6Between(String value1, String value2) {
            addCriterion("defitem6 between", value1, value2, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem6NotBetween(String value1, String value2) {
            addCriterion("defitem6 not between", value1, value2, "defitem6");
            return (Criteria) this;
        }

        public Criteria andDefitem7IsNull() {
            addCriterion("defitem7 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem7IsNotNull() {
            addCriterion("defitem7 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem7EqualTo(String value) {
            addCriterion("defitem7 =", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7NotEqualTo(String value) {
            addCriterion("defitem7 <>", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7GreaterThan(String value) {
            addCriterion("defitem7 >", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7GreaterThanOrEqualTo(String value) {
            addCriterion("defitem7 >=", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7LessThan(String value) {
            addCriterion("defitem7 <", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7LessThanOrEqualTo(String value) {
            addCriterion("defitem7 <=", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7Like(String value) {
            addCriterion("defitem7 like", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7NotLike(String value) {
            addCriterion("defitem7 not like", value, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7In(List<String> values) {
            addCriterion("defitem7 in", values, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7NotIn(List<String> values) {
            addCriterion("defitem7 not in", values, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7Between(String value1, String value2) {
            addCriterion("defitem7 between", value1, value2, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem7NotBetween(String value1, String value2) {
            addCriterion("defitem7 not between", value1, value2, "defitem7");
            return (Criteria) this;
        }

        public Criteria andDefitem8IsNull() {
            addCriterion("defitem8 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem8IsNotNull() {
            addCriterion("defitem8 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem8EqualTo(String value) {
            addCriterion("defitem8 =", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8NotEqualTo(String value) {
            addCriterion("defitem8 <>", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8GreaterThan(String value) {
            addCriterion("defitem8 >", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8GreaterThanOrEqualTo(String value) {
            addCriterion("defitem8 >=", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8LessThan(String value) {
            addCriterion("defitem8 <", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8LessThanOrEqualTo(String value) {
            addCriterion("defitem8 <=", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8Like(String value) {
            addCriterion("defitem8 like", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8NotLike(String value) {
            addCriterion("defitem8 not like", value, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8In(List<String> values) {
            addCriterion("defitem8 in", values, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8NotIn(List<String> values) {
            addCriterion("defitem8 not in", values, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8Between(String value1, String value2) {
            addCriterion("defitem8 between", value1, value2, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem8NotBetween(String value1, String value2) {
            addCriterion("defitem8 not between", value1, value2, "defitem8");
            return (Criteria) this;
        }

        public Criteria andDefitem9IsNull() {
            addCriterion("defitem9 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem9IsNotNull() {
            addCriterion("defitem9 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem9EqualTo(String value) {
            addCriterion("defitem9 =", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9NotEqualTo(String value) {
            addCriterion("defitem9 <>", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9GreaterThan(String value) {
            addCriterion("defitem9 >", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9GreaterThanOrEqualTo(String value) {
            addCriterion("defitem9 >=", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9LessThan(String value) {
            addCriterion("defitem9 <", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9LessThanOrEqualTo(String value) {
            addCriterion("defitem9 <=", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9Like(String value) {
            addCriterion("defitem9 like", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9NotLike(String value) {
            addCriterion("defitem9 not like", value, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9In(List<String> values) {
            addCriterion("defitem9 in", values, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9NotIn(List<String> values) {
            addCriterion("defitem9 not in", values, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9Between(String value1, String value2) {
            addCriterion("defitem9 between", value1, value2, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem9NotBetween(String value1, String value2) {
            addCriterion("defitem9 not between", value1, value2, "defitem9");
            return (Criteria) this;
        }

        public Criteria andDefitem10IsNull() {
            addCriterion("defitem10 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem10IsNotNull() {
            addCriterion("defitem10 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem10EqualTo(String value) {
            addCriterion("defitem10 =", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10NotEqualTo(String value) {
            addCriterion("defitem10 <>", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10GreaterThan(String value) {
            addCriterion("defitem10 >", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10GreaterThanOrEqualTo(String value) {
            addCriterion("defitem10 >=", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10LessThan(String value) {
            addCriterion("defitem10 <", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10LessThanOrEqualTo(String value) {
            addCriterion("defitem10 <=", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10Like(String value) {
            addCriterion("defitem10 like", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10NotLike(String value) {
            addCriterion("defitem10 not like", value, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10In(List<String> values) {
            addCriterion("defitem10 in", values, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10NotIn(List<String> values) {
            addCriterion("defitem10 not in", values, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10Between(String value1, String value2) {
            addCriterion("defitem10 between", value1, value2, "defitem10");
            return (Criteria) this;
        }

        public Criteria andDefitem10NotBetween(String value1, String value2) {
            addCriterion("defitem10 not between", value1, value2, "defitem10");
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

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}