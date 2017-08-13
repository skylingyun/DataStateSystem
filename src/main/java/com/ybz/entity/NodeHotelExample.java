package com.ybz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NodeHotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startRow;

    protected Integer pageSize;

    public NodeHotelExample() {
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

        public Criteria andHotelIsNull() {
            addCriterion("hotel is null");
            return (Criteria) this;
        }

        public Criteria andHotelIsNotNull() {
            addCriterion("hotel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelEqualTo(String value) {
            addCriterion("hotel =", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotEqualTo(String value) {
            addCriterion("hotel <>", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThan(String value) {
            addCriterion("hotel >", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel >=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThan(String value) {
            addCriterion("hotel <", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLessThanOrEqualTo(String value) {
            addCriterion("hotel <=", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelLike(String value) {
            addCriterion("hotel like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotLike(String value) {
            addCriterion("hotel not like", value, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelIn(List<String> values) {
            addCriterion("hotel in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotIn(List<String> values) {
            addCriterion("hotel not in", values, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelBetween(String value1, String value2) {
            addCriterion("hotel between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andHotelNotBetween(String value1, String value2) {
            addCriterion("hotel not between", value1, value2, "hotel");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(Boolean value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(Boolean value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(Boolean value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(Boolean value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(Boolean value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<Boolean> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<Boolean> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(Boolean value1, Boolean value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("expense not between", value1, value2, "expense");
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

        public Criteria andTaxrateIsNull() {
            addCriterion("taxrate is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("taxrate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(Double value) {
            addCriterion("taxrate =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(Double value) {
            addCriterion("taxrate <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(Double value) {
            addCriterion("taxrate >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(Double value) {
            addCriterion("taxrate >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(Double value) {
            addCriterion("taxrate <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(Double value) {
            addCriterion("taxrate <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<Double> values) {
            addCriterion("taxrate in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<Double> values) {
            addCriterion("taxrate not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(Double value1, Double value2) {
            addCriterion("taxrate between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(Double value1, Double value2) {
            addCriterion("taxrate not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andIncludtaxIsNull() {
            addCriterion("includtax is null");
            return (Criteria) this;
        }

        public Criteria andIncludtaxIsNotNull() {
            addCriterion("includtax is not null");
            return (Criteria) this;
        }

        public Criteria andIncludtaxEqualTo(Double value) {
            addCriterion("includtax =", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxNotEqualTo(Double value) {
            addCriterion("includtax <>", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxGreaterThan(Double value) {
            addCriterion("includtax >", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxGreaterThanOrEqualTo(Double value) {
            addCriterion("includtax >=", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxLessThan(Double value) {
            addCriterion("includtax <", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxLessThanOrEqualTo(Double value) {
            addCriterion("includtax <=", value, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxIn(List<Double> values) {
            addCriterion("includtax in", values, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxNotIn(List<Double> values) {
            addCriterion("includtax not in", values, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxBetween(Double value1, Double value2) {
            addCriterion("includtax between", value1, value2, "includtax");
            return (Criteria) this;
        }

        public Criteria andIncludtaxNotBetween(Double value1, Double value2) {
            addCriterion("includtax not between", value1, value2, "includtax");
            return (Criteria) this;
        }

        public Criteria andNottaxIsNull() {
            addCriterion("nottax is null");
            return (Criteria) this;
        }

        public Criteria andNottaxIsNotNull() {
            addCriterion("nottax is not null");
            return (Criteria) this;
        }

        public Criteria andNottaxEqualTo(Double value) {
            addCriterion("nottax =", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxNotEqualTo(Double value) {
            addCriterion("nottax <>", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxGreaterThan(Double value) {
            addCriterion("nottax >", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxGreaterThanOrEqualTo(Double value) {
            addCriterion("nottax >=", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxLessThan(Double value) {
            addCriterion("nottax <", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxLessThanOrEqualTo(Double value) {
            addCriterion("nottax <=", value, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxIn(List<Double> values) {
            addCriterion("nottax in", values, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxNotIn(List<Double> values) {
            addCriterion("nottax not in", values, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxBetween(Double value1, Double value2) {
            addCriterion("nottax between", value1, value2, "nottax");
            return (Criteria) this;
        }

        public Criteria andNottaxNotBetween(Double value1, Double value2) {
            addCriterion("nottax not between", value1, value2, "nottax");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNull() {
            addCriterion("invoicenum is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNotNull() {
            addCriterion("invoicenum is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumEqualTo(String value) {
            addCriterion("invoicenum =", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotEqualTo(String value) {
            addCriterion("invoicenum <>", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThan(String value) {
            addCriterion("invoicenum >", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThanOrEqualTo(String value) {
            addCriterion("invoicenum >=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThan(String value) {
            addCriterion("invoicenum <", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThanOrEqualTo(String value) {
            addCriterion("invoicenum <=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLike(String value) {
            addCriterion("invoicenum like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotLike(String value) {
            addCriterion("invoicenum not like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIn(List<String> values) {
            addCriterion("invoicenum in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotIn(List<String> values) {
            addCriterion("invoicenum not in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumBetween(String value1, String value2) {
            addCriterion("invoicenum between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotBetween(String value1, String value2) {
            addCriterion("invoicenum not between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andDemo1IsNull() {
            addCriterion("demo1 is null");
            return (Criteria) this;
        }

        public Criteria andDemo1IsNotNull() {
            addCriterion("demo1 is not null");
            return (Criteria) this;
        }

        public Criteria andDemo1EqualTo(String value) {
            addCriterion("demo1 =", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1NotEqualTo(String value) {
            addCriterion("demo1 <>", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1GreaterThan(String value) {
            addCriterion("demo1 >", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1GreaterThanOrEqualTo(String value) {
            addCriterion("demo1 >=", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1LessThan(String value) {
            addCriterion("demo1 <", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1LessThanOrEqualTo(String value) {
            addCriterion("demo1 <=", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1Like(String value) {
            addCriterion("demo1 like", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1NotLike(String value) {
            addCriterion("demo1 not like", value, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1In(List<String> values) {
            addCriterion("demo1 in", values, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1NotIn(List<String> values) {
            addCriterion("demo1 not in", values, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1Between(String value1, String value2) {
            addCriterion("demo1 between", value1, value2, "demo1");
            return (Criteria) this;
        }

        public Criteria andDemo1NotBetween(String value1, String value2) {
            addCriterion("demo1 not between", value1, value2, "demo1");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeIsNull() {
            addCriterion("imagesystemtype is null");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeIsNotNull() {
            addCriterion("imagesystemtype is not null");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeEqualTo(String value) {
            addCriterion("imagesystemtype =", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeNotEqualTo(String value) {
            addCriterion("imagesystemtype <>", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeGreaterThan(String value) {
            addCriterion("imagesystemtype >", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeGreaterThanOrEqualTo(String value) {
            addCriterion("imagesystemtype >=", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeLessThan(String value) {
            addCriterion("imagesystemtype <", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeLessThanOrEqualTo(String value) {
            addCriterion("imagesystemtype <=", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeLike(String value) {
            addCriterion("imagesystemtype like", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeNotLike(String value) {
            addCriterion("imagesystemtype not like", value, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeIn(List<String> values) {
            addCriterion("imagesystemtype in", values, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeNotIn(List<String> values) {
            addCriterion("imagesystemtype not in", values, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeBetween(String value1, String value2) {
            addCriterion("imagesystemtype between", value1, value2, "imagesystemtype");
            return (Criteria) this;
        }

        public Criteria andImagesystemtypeNotBetween(String value1, String value2) {
            addCriterion("imagesystemtype not between", value1, value2, "imagesystemtype");
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