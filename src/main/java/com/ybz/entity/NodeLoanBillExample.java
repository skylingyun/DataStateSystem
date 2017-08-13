package com.ybz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NodeLoanBillExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startRow;

    protected Integer pageSize;

    public NodeLoanBillExample() {
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

        public Criteria andHkyeIsNull() {
            addCriterion("hkye is null");
            return (Criteria) this;
        }

        public Criteria andHkyeIsNotNull() {
            addCriterion("hkye is not null");
            return (Criteria) this;
        }

        public Criteria andHkyeEqualTo(Double value) {
            addCriterion("hkye =", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeNotEqualTo(Double value) {
            addCriterion("hkye <>", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeGreaterThan(Double value) {
            addCriterion("hkye >", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeGreaterThanOrEqualTo(Double value) {
            addCriterion("hkye >=", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeLessThan(Double value) {
            addCriterion("hkye <", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeLessThanOrEqualTo(Double value) {
            addCriterion("hkye <=", value, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeIn(List<Double> values) {
            addCriterion("hkye in", values, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeNotIn(List<Double> values) {
            addCriterion("hkye not in", values, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeBetween(Double value1, Double value2) {
            addCriterion("hkye between", value1, value2, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkyeNotBetween(Double value1, Double value2) {
            addCriterion("hkye not between", value1, value2, "hkye");
            return (Criteria) this;
        }

        public Criteria andHkztIsNull() {
            addCriterion("hkzt is null");
            return (Criteria) this;
        }

        public Criteria andHkztIsNotNull() {
            addCriterion("hkzt is not null");
            return (Criteria) this;
        }

        public Criteria andHkztEqualTo(String value) {
            addCriterion("hkzt =", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztNotEqualTo(String value) {
            addCriterion("hkzt <>", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztGreaterThan(String value) {
            addCriterion("hkzt >", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztGreaterThanOrEqualTo(String value) {
            addCriterion("hkzt >=", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztLessThan(String value) {
            addCriterion("hkzt <", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztLessThanOrEqualTo(String value) {
            addCriterion("hkzt <=", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztLike(String value) {
            addCriterion("hkzt like", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztNotLike(String value) {
            addCriterion("hkzt not like", value, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztIn(List<String> values) {
            addCriterion("hkzt in", values, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztNotIn(List<String> values) {
            addCriterion("hkzt not in", values, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztBetween(String value1, String value2) {
            addCriterion("hkzt between", value1, value2, "hkzt");
            return (Criteria) this;
        }

        public Criteria andHkztNotBetween(String value1, String value2) {
            addCriterion("hkzt not between", value1, value2, "hkzt");
            return (Criteria) this;
        }

        public Criteria andSzxmIsNull() {
            addCriterion("szxm is null");
            return (Criteria) this;
        }

        public Criteria andSzxmIsNotNull() {
            addCriterion("szxm is not null");
            return (Criteria) this;
        }

        public Criteria andSzxmEqualTo(String value) {
            addCriterion("szxm =", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmNotEqualTo(String value) {
            addCriterion("szxm <>", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmGreaterThan(String value) {
            addCriterion("szxm >", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmGreaterThanOrEqualTo(String value) {
            addCriterion("szxm >=", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmLessThan(String value) {
            addCriterion("szxm <", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmLessThanOrEqualTo(String value) {
            addCriterion("szxm <=", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmLike(String value) {
            addCriterion("szxm like", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmNotLike(String value) {
            addCriterion("szxm not like", value, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmIn(List<String> values) {
            addCriterion("szxm in", values, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmNotIn(List<String> values) {
            addCriterion("szxm not in", values, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmBetween(String value1, String value2) {
            addCriterion("szxm between", value1, value2, "szxm");
            return (Criteria) this;
        }

        public Criteria andSzxmNotBetween(String value1, String value2) {
            addCriterion("szxm not between", value1, value2, "szxm");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("project is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("project is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("project =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("project <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("project >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("project >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("project <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("project <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("project like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("project not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("project in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("project not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("project between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("project not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyIsNull() {
            addCriterion("bankAccountKey is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyIsNotNull() {
            addCriterion("bankAccountKey is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyEqualTo(String value) {
            addCriterion("bankAccountKey =", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyNotEqualTo(String value) {
            addCriterion("bankAccountKey <>", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyGreaterThan(String value) {
            addCriterion("bankAccountKey >", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccountKey >=", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyLessThan(String value) {
            addCriterion("bankAccountKey <", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyLessThanOrEqualTo(String value) {
            addCriterion("bankAccountKey <=", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyLike(String value) {
            addCriterion("bankAccountKey like", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyNotLike(String value) {
            addCriterion("bankAccountKey not like", value, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyIn(List<String> values) {
            addCriterion("bankAccountKey in", values, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyNotIn(List<String> values) {
            addCriterion("bankAccountKey not in", values, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyBetween(String value1, String value2) {
            addCriterion("bankAccountKey between", value1, value2, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountkeyNotBetween(String value1, String value2) {
            addCriterion("bankAccountKey not between", value1, value2, "bankaccountkey");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNull() {
            addCriterion("bankAccount is null");
            return (Criteria) this;
        }

        public Criteria andBankaccountIsNotNull() {
            addCriterion("bankAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBankaccountEqualTo(String value) {
            addCriterion("bankAccount =", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotEqualTo(String value) {
            addCriterion("bankAccount <>", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThan(String value) {
            addCriterion("bankAccount >", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("bankAccount >=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThan(String value) {
            addCriterion("bankAccount <", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLessThanOrEqualTo(String value) {
            addCriterion("bankAccount <=", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountLike(String value) {
            addCriterion("bankAccount like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotLike(String value) {
            addCriterion("bankAccount not like", value, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountIn(List<String> values) {
            addCriterion("bankAccount in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotIn(List<String> values) {
            addCriterion("bankAccount not in", values, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountBetween(String value1, String value2) {
            addCriterion("bankAccount between", value1, value2, "bankaccount");
            return (Criteria) this;
        }

        public Criteria andBankaccountNotBetween(String value1, String value2) {
            addCriterion("bankAccount not between", value1, value2, "bankaccount");
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

        public Criteria andDefitem11IsNull() {
            addCriterion("defitem11 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem11IsNotNull() {
            addCriterion("defitem11 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem11EqualTo(String value) {
            addCriterion("defitem11 =", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11NotEqualTo(String value) {
            addCriterion("defitem11 <>", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11GreaterThan(String value) {
            addCriterion("defitem11 >", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11GreaterThanOrEqualTo(String value) {
            addCriterion("defitem11 >=", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11LessThan(String value) {
            addCriterion("defitem11 <", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11LessThanOrEqualTo(String value) {
            addCriterion("defitem11 <=", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11Like(String value) {
            addCriterion("defitem11 like", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11NotLike(String value) {
            addCriterion("defitem11 not like", value, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11In(List<String> values) {
            addCriterion("defitem11 in", values, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11NotIn(List<String> values) {
            addCriterion("defitem11 not in", values, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11Between(String value1, String value2) {
            addCriterion("defitem11 between", value1, value2, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem11NotBetween(String value1, String value2) {
            addCriterion("defitem11 not between", value1, value2, "defitem11");
            return (Criteria) this;
        }

        public Criteria andDefitem12IsNull() {
            addCriterion("defitem12 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem12IsNotNull() {
            addCriterion("defitem12 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem12EqualTo(String value) {
            addCriterion("defitem12 =", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12NotEqualTo(String value) {
            addCriterion("defitem12 <>", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12GreaterThan(String value) {
            addCriterion("defitem12 >", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12GreaterThanOrEqualTo(String value) {
            addCriterion("defitem12 >=", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12LessThan(String value) {
            addCriterion("defitem12 <", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12LessThanOrEqualTo(String value) {
            addCriterion("defitem12 <=", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12Like(String value) {
            addCriterion("defitem12 like", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12NotLike(String value) {
            addCriterion("defitem12 not like", value, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12In(List<String> values) {
            addCriterion("defitem12 in", values, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12NotIn(List<String> values) {
            addCriterion("defitem12 not in", values, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12Between(String value1, String value2) {
            addCriterion("defitem12 between", value1, value2, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem12NotBetween(String value1, String value2) {
            addCriterion("defitem12 not between", value1, value2, "defitem12");
            return (Criteria) this;
        }

        public Criteria andDefitem13IsNull() {
            addCriterion("defitem13 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem13IsNotNull() {
            addCriterion("defitem13 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem13EqualTo(String value) {
            addCriterion("defitem13 =", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13NotEqualTo(String value) {
            addCriterion("defitem13 <>", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13GreaterThan(String value) {
            addCriterion("defitem13 >", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13GreaterThanOrEqualTo(String value) {
            addCriterion("defitem13 >=", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13LessThan(String value) {
            addCriterion("defitem13 <", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13LessThanOrEqualTo(String value) {
            addCriterion("defitem13 <=", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13Like(String value) {
            addCriterion("defitem13 like", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13NotLike(String value) {
            addCriterion("defitem13 not like", value, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13In(List<String> values) {
            addCriterion("defitem13 in", values, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13NotIn(List<String> values) {
            addCriterion("defitem13 not in", values, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13Between(String value1, String value2) {
            addCriterion("defitem13 between", value1, value2, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem13NotBetween(String value1, String value2) {
            addCriterion("defitem13 not between", value1, value2, "defitem13");
            return (Criteria) this;
        }

        public Criteria andDefitem14IsNull() {
            addCriterion("defitem14 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem14IsNotNull() {
            addCriterion("defitem14 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem14EqualTo(String value) {
            addCriterion("defitem14 =", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14NotEqualTo(String value) {
            addCriterion("defitem14 <>", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14GreaterThan(String value) {
            addCriterion("defitem14 >", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14GreaterThanOrEqualTo(String value) {
            addCriterion("defitem14 >=", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14LessThan(String value) {
            addCriterion("defitem14 <", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14LessThanOrEqualTo(String value) {
            addCriterion("defitem14 <=", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14Like(String value) {
            addCriterion("defitem14 like", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14NotLike(String value) {
            addCriterion("defitem14 not like", value, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14In(List<String> values) {
            addCriterion("defitem14 in", values, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14NotIn(List<String> values) {
            addCriterion("defitem14 not in", values, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14Between(String value1, String value2) {
            addCriterion("defitem14 between", value1, value2, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem14NotBetween(String value1, String value2) {
            addCriterion("defitem14 not between", value1, value2, "defitem14");
            return (Criteria) this;
        }

        public Criteria andDefitem15IsNull() {
            addCriterion("defitem15 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem15IsNotNull() {
            addCriterion("defitem15 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem15EqualTo(String value) {
            addCriterion("defitem15 =", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15NotEqualTo(String value) {
            addCriterion("defitem15 <>", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15GreaterThan(String value) {
            addCriterion("defitem15 >", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15GreaterThanOrEqualTo(String value) {
            addCriterion("defitem15 >=", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15LessThan(String value) {
            addCriterion("defitem15 <", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15LessThanOrEqualTo(String value) {
            addCriterion("defitem15 <=", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15Like(String value) {
            addCriterion("defitem15 like", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15NotLike(String value) {
            addCriterion("defitem15 not like", value, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15In(List<String> values) {
            addCriterion("defitem15 in", values, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15NotIn(List<String> values) {
            addCriterion("defitem15 not in", values, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15Between(String value1, String value2) {
            addCriterion("defitem15 between", value1, value2, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem15NotBetween(String value1, String value2) {
            addCriterion("defitem15 not between", value1, value2, "defitem15");
            return (Criteria) this;
        }

        public Criteria andDefitem16IsNull() {
            addCriterion("defitem16 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem16IsNotNull() {
            addCriterion("defitem16 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem16EqualTo(String value) {
            addCriterion("defitem16 =", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16NotEqualTo(String value) {
            addCriterion("defitem16 <>", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16GreaterThan(String value) {
            addCriterion("defitem16 >", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16GreaterThanOrEqualTo(String value) {
            addCriterion("defitem16 >=", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16LessThan(String value) {
            addCriterion("defitem16 <", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16LessThanOrEqualTo(String value) {
            addCriterion("defitem16 <=", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16Like(String value) {
            addCriterion("defitem16 like", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16NotLike(String value) {
            addCriterion("defitem16 not like", value, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16In(List<String> values) {
            addCriterion("defitem16 in", values, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16NotIn(List<String> values) {
            addCriterion("defitem16 not in", values, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16Between(String value1, String value2) {
            addCriterion("defitem16 between", value1, value2, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem16NotBetween(String value1, String value2) {
            addCriterion("defitem16 not between", value1, value2, "defitem16");
            return (Criteria) this;
        }

        public Criteria andDefitem17IsNull() {
            addCriterion("defitem17 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem17IsNotNull() {
            addCriterion("defitem17 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem17EqualTo(String value) {
            addCriterion("defitem17 =", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17NotEqualTo(String value) {
            addCriterion("defitem17 <>", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17GreaterThan(String value) {
            addCriterion("defitem17 >", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17GreaterThanOrEqualTo(String value) {
            addCriterion("defitem17 >=", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17LessThan(String value) {
            addCriterion("defitem17 <", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17LessThanOrEqualTo(String value) {
            addCriterion("defitem17 <=", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17Like(String value) {
            addCriterion("defitem17 like", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17NotLike(String value) {
            addCriterion("defitem17 not like", value, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17In(List<String> values) {
            addCriterion("defitem17 in", values, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17NotIn(List<String> values) {
            addCriterion("defitem17 not in", values, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17Between(String value1, String value2) {
            addCriterion("defitem17 between", value1, value2, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem17NotBetween(String value1, String value2) {
            addCriterion("defitem17 not between", value1, value2, "defitem17");
            return (Criteria) this;
        }

        public Criteria andDefitem18IsNull() {
            addCriterion("defitem18 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem18IsNotNull() {
            addCriterion("defitem18 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem18EqualTo(String value) {
            addCriterion("defitem18 =", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18NotEqualTo(String value) {
            addCriterion("defitem18 <>", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18GreaterThan(String value) {
            addCriterion("defitem18 >", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18GreaterThanOrEqualTo(String value) {
            addCriterion("defitem18 >=", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18LessThan(String value) {
            addCriterion("defitem18 <", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18LessThanOrEqualTo(String value) {
            addCriterion("defitem18 <=", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18Like(String value) {
            addCriterion("defitem18 like", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18NotLike(String value) {
            addCriterion("defitem18 not like", value, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18In(List<String> values) {
            addCriterion("defitem18 in", values, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18NotIn(List<String> values) {
            addCriterion("defitem18 not in", values, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18Between(String value1, String value2) {
            addCriterion("defitem18 between", value1, value2, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem18NotBetween(String value1, String value2) {
            addCriterion("defitem18 not between", value1, value2, "defitem18");
            return (Criteria) this;
        }

        public Criteria andDefitem19IsNull() {
            addCriterion("defitem19 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem19IsNotNull() {
            addCriterion("defitem19 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem19EqualTo(String value) {
            addCriterion("defitem19 =", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19NotEqualTo(String value) {
            addCriterion("defitem19 <>", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19GreaterThan(String value) {
            addCriterion("defitem19 >", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19GreaterThanOrEqualTo(String value) {
            addCriterion("defitem19 >=", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19LessThan(String value) {
            addCriterion("defitem19 <", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19LessThanOrEqualTo(String value) {
            addCriterion("defitem19 <=", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19Like(String value) {
            addCriterion("defitem19 like", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19NotLike(String value) {
            addCriterion("defitem19 not like", value, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19In(List<String> values) {
            addCriterion("defitem19 in", values, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19NotIn(List<String> values) {
            addCriterion("defitem19 not in", values, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19Between(String value1, String value2) {
            addCriterion("defitem19 between", value1, value2, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem19NotBetween(String value1, String value2) {
            addCriterion("defitem19 not between", value1, value2, "defitem19");
            return (Criteria) this;
        }

        public Criteria andDefitem20IsNull() {
            addCriterion("defitem20 is null");
            return (Criteria) this;
        }

        public Criteria andDefitem20IsNotNull() {
            addCriterion("defitem20 is not null");
            return (Criteria) this;
        }

        public Criteria andDefitem20EqualTo(String value) {
            addCriterion("defitem20 =", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20NotEqualTo(String value) {
            addCriterion("defitem20 <>", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20GreaterThan(String value) {
            addCriterion("defitem20 >", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20GreaterThanOrEqualTo(String value) {
            addCriterion("defitem20 >=", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20LessThan(String value) {
            addCriterion("defitem20 <", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20LessThanOrEqualTo(String value) {
            addCriterion("defitem20 <=", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20Like(String value) {
            addCriterion("defitem20 like", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20NotLike(String value) {
            addCriterion("defitem20 not like", value, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20In(List<String> values) {
            addCriterion("defitem20 in", values, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20NotIn(List<String> values) {
            addCriterion("defitem20 not in", values, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20Between(String value1, String value2) {
            addCriterion("defitem20 between", value1, value2, "defitem20");
            return (Criteria) this;
        }

        public Criteria andDefitem20NotBetween(String value1, String value2) {
            addCriterion("defitem20 not between", value1, value2, "defitem20");
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