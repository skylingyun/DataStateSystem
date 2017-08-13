package com.ybz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NodeExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer startRow;

    protected Integer pageSize;

    public NodeExpenseExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIsNull() {
            addCriterion("expense_date is null");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIsNotNull() {
            addCriterion("expense_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseDateEqualTo(Date value) {
            addCriterionForJDBCDate("expense_date =", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expense_date <>", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expense_date >", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expense_date >=", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateLessThan(Date value) {
            addCriterionForJDBCDate("expense_date <", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expense_date <=", value, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateIn(List<Date> values) {
            addCriterionForJDBCDate("expense_date in", values, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expense_date not in", values, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expense_date between", value1, value2, "expenseDate");
            return (Criteria) this;
        }

        public Criteria andExpenseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expense_date not between", value1, value2, "expenseDate");
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

        public Criteria andBilltypecodeIsNull() {
            addCriterion("billtypecode is null");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeIsNotNull() {
            addCriterion("billtypecode is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeEqualTo(String value) {
            addCriterion("billtypecode =", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeNotEqualTo(String value) {
            addCriterion("billtypecode <>", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeGreaterThan(String value) {
            addCriterion("billtypecode >", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("billtypecode >=", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeLessThan(String value) {
            addCriterion("billtypecode <", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeLessThanOrEqualTo(String value) {
            addCriterion("billtypecode <=", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeLike(String value) {
            addCriterion("billtypecode like", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeNotLike(String value) {
            addCriterion("billtypecode not like", value, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeIn(List<String> values) {
            addCriterion("billtypecode in", values, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeNotIn(List<String> values) {
            addCriterion("billtypecode not in", values, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeBetween(String value1, String value2) {
            addCriterion("billtypecode between", value1, value2, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypecodeNotBetween(String value1, String value2) {
            addCriterion("billtypecode not between", value1, value2, "billtypecode");
            return (Criteria) this;
        }

        public Criteria andBilltypenameIsNull() {
            addCriterion("billtypename is null");
            return (Criteria) this;
        }

        public Criteria andBilltypenameIsNotNull() {
            addCriterion("billtypename is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypenameEqualTo(String value) {
            addCriterion("billtypename =", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameNotEqualTo(String value) {
            addCriterion("billtypename <>", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameGreaterThan(String value) {
            addCriterion("billtypename >", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameGreaterThanOrEqualTo(String value) {
            addCriterion("billtypename >=", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameLessThan(String value) {
            addCriterion("billtypename <", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameLessThanOrEqualTo(String value) {
            addCriterion("billtypename <=", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameLike(String value) {
            addCriterion("billtypename like", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameNotLike(String value) {
            addCriterion("billtypename not like", value, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameIn(List<String> values) {
            addCriterion("billtypename in", values, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameNotIn(List<String> values) {
            addCriterion("billtypename not in", values, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameBetween(String value1, String value2) {
            addCriterion("billtypename between", value1, value2, "billtypename");
            return (Criteria) this;
        }

        public Criteria andBilltypenameNotBetween(String value1, String value2) {
            addCriterion("billtypename not between", value1, value2, "billtypename");
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

        public Criteria andSzitemkeyIsNull() {
            addCriterion("szitemKey is null");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyIsNotNull() {
            addCriterion("szitemKey is not null");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyEqualTo(String value) {
            addCriterion("szitemKey =", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyNotEqualTo(String value) {
            addCriterion("szitemKey <>", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyGreaterThan(String value) {
            addCriterion("szitemKey >", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyGreaterThanOrEqualTo(String value) {
            addCriterion("szitemKey >=", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyLessThan(String value) {
            addCriterion("szitemKey <", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyLessThanOrEqualTo(String value) {
            addCriterion("szitemKey <=", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyLike(String value) {
            addCriterion("szitemKey like", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyNotLike(String value) {
            addCriterion("szitemKey not like", value, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyIn(List<String> values) {
            addCriterion("szitemKey in", values, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyNotIn(List<String> values) {
            addCriterion("szitemKey not in", values, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyBetween(String value1, String value2) {
            addCriterion("szitemKey between", value1, value2, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemkeyNotBetween(String value1, String value2) {
            addCriterion("szitemKey not between", value1, value2, "szitemkey");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueIsNull() {
            addCriterion("szitemValue is null");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueIsNotNull() {
            addCriterion("szitemValue is not null");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueEqualTo(String value) {
            addCriterion("szitemValue =", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueNotEqualTo(String value) {
            addCriterion("szitemValue <>", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueGreaterThan(String value) {
            addCriterion("szitemValue >", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueGreaterThanOrEqualTo(String value) {
            addCriterion("szitemValue >=", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueLessThan(String value) {
            addCriterion("szitemValue <", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueLessThanOrEqualTo(String value) {
            addCriterion("szitemValue <=", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueLike(String value) {
            addCriterion("szitemValue like", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueNotLike(String value) {
            addCriterion("szitemValue not like", value, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueIn(List<String> values) {
            addCriterion("szitemValue in", values, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueNotIn(List<String> values) {
            addCriterion("szitemValue not in", values, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueBetween(String value1, String value2) {
            addCriterion("szitemValue between", value1, value2, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andSzitemvalueNotBetween(String value1, String value2) {
            addCriterion("szitemValue not between", value1, value2, "szitemvalue");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyIsNull() {
            addCriterion("requisitionKey is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyIsNotNull() {
            addCriterion("requisitionKey is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyEqualTo(String value) {
            addCriterion("requisitionKey =", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyNotEqualTo(String value) {
            addCriterion("requisitionKey <>", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyGreaterThan(String value) {
            addCriterion("requisitionKey >", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("requisitionKey >=", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyLessThan(String value) {
            addCriterion("requisitionKey <", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyLessThanOrEqualTo(String value) {
            addCriterion("requisitionKey <=", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyLike(String value) {
            addCriterion("requisitionKey like", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyNotLike(String value) {
            addCriterion("requisitionKey not like", value, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyIn(List<String> values) {
            addCriterion("requisitionKey in", values, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyNotIn(List<String> values) {
            addCriterion("requisitionKey not in", values, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyBetween(String value1, String value2) {
            addCriterion("requisitionKey between", value1, value2, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionkeyNotBetween(String value1, String value2) {
            addCriterion("requisitionKey not between", value1, value2, "requisitionkey");
            return (Criteria) this;
        }

        public Criteria andRequisitionIsNull() {
            addCriterion("requisition is null");
            return (Criteria) this;
        }

        public Criteria andRequisitionIsNotNull() {
            addCriterion("requisition is not null");
            return (Criteria) this;
        }

        public Criteria andRequisitionEqualTo(String value) {
            addCriterion("requisition =", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionNotEqualTo(String value) {
            addCriterion("requisition <>", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionGreaterThan(String value) {
            addCriterion("requisition >", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionGreaterThanOrEqualTo(String value) {
            addCriterion("requisition >=", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionLessThan(String value) {
            addCriterion("requisition <", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionLessThanOrEqualTo(String value) {
            addCriterion("requisition <=", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionLike(String value) {
            addCriterion("requisition like", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionNotLike(String value) {
            addCriterion("requisition not like", value, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionIn(List<String> values) {
            addCriterion("requisition in", values, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionNotIn(List<String> values) {
            addCriterion("requisition not in", values, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionBetween(String value1, String value2) {
            addCriterion("requisition between", value1, value2, "requisition");
            return (Criteria) this;
        }

        public Criteria andRequisitionNotBetween(String value1, String value2) {
            addCriterion("requisition not between", value1, value2, "requisition");
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

        public Criteria andOverStandardIsNull() {
            addCriterion("over_standard is null");
            return (Criteria) this;
        }

        public Criteria andOverStandardIsNotNull() {
            addCriterion("over_standard is not null");
            return (Criteria) this;
        }

        public Criteria andOverStandardEqualTo(Boolean value) {
            addCriterion("over_standard =", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardNotEqualTo(Boolean value) {
            addCriterion("over_standard <>", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardGreaterThan(Boolean value) {
            addCriterion("over_standard >", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("over_standard >=", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardLessThan(Boolean value) {
            addCriterion("over_standard <", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardLessThanOrEqualTo(Boolean value) {
            addCriterion("over_standard <=", value, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardIn(List<Boolean> values) {
            addCriterion("over_standard in", values, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardNotIn(List<Boolean> values) {
            addCriterion("over_standard not in", values, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardBetween(Boolean value1, Boolean value2) {
            addCriterion("over_standard between", value1, value2, "overStandard");
            return (Criteria) this;
        }

        public Criteria andOverStandardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("over_standard not between", value1, value2, "overStandard");
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