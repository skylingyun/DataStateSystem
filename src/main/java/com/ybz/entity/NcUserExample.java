package com.ybz.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NcUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcUserExample() {
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

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("usercode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("usercode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("usercode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("usercode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("usercode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("usercode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("usercode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("usercode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("usercode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("usercode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("usercode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("usercode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("usercode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("usercode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUserpkIsNull() {
            addCriterion("userpk is null");
            return (Criteria) this;
        }

        public Criteria andUserpkIsNotNull() {
            addCriterion("userpk is not null");
            return (Criteria) this;
        }

        public Criteria andUserpkEqualTo(String value) {
            addCriterion("userpk =", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkNotEqualTo(String value) {
            addCriterion("userpk <>", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkGreaterThan(String value) {
            addCriterion("userpk >", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkGreaterThanOrEqualTo(String value) {
            addCriterion("userpk >=", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkLessThan(String value) {
            addCriterion("userpk <", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkLessThanOrEqualTo(String value) {
            addCriterion("userpk <=", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkLike(String value) {
            addCriterion("userpk like", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkNotLike(String value) {
            addCriterion("userpk not like", value, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkIn(List<String> values) {
            addCriterion("userpk in", values, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkNotIn(List<String> values) {
            addCriterion("userpk not in", values, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkBetween(String value1, String value2) {
            addCriterion("userpk between", value1, value2, "userpk");
            return (Criteria) this;
        }

        public Criteria andUserpkNotBetween(String value1, String value2) {
            addCriterion("userpk not between", value1, value2, "userpk");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andDeptpkIsNull() {
            addCriterion("deptpk is null");
            return (Criteria) this;
        }

        public Criteria andDeptpkIsNotNull() {
            addCriterion("deptpk is not null");
            return (Criteria) this;
        }

        public Criteria andDeptpkEqualTo(String value) {
            addCriterion("deptpk =", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkNotEqualTo(String value) {
            addCriterion("deptpk <>", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkGreaterThan(String value) {
            addCriterion("deptpk >", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkGreaterThanOrEqualTo(String value) {
            addCriterion("deptpk >=", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkLessThan(String value) {
            addCriterion("deptpk <", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkLessThanOrEqualTo(String value) {
            addCriterion("deptpk <=", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkLike(String value) {
            addCriterion("deptpk like", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkNotLike(String value) {
            addCriterion("deptpk not like", value, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkIn(List<String> values) {
            addCriterion("deptpk in", values, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkNotIn(List<String> values) {
            addCriterion("deptpk not in", values, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkBetween(String value1, String value2) {
            addCriterion("deptpk between", value1, value2, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptpkNotBetween(String value1, String value2) {
            addCriterion("deptpk not between", value1, value2, "deptpk");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptname is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptname is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptname =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptname <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptname >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptname >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptname <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptname <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptname like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptname not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptname in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptname not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptname between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptname not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andOrgpkIsNull() {
            addCriterion("orgpk is null");
            return (Criteria) this;
        }

        public Criteria andOrgpkIsNotNull() {
            addCriterion("orgpk is not null");
            return (Criteria) this;
        }

        public Criteria andOrgpkEqualTo(String value) {
            addCriterion("orgpk =", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkNotEqualTo(String value) {
            addCriterion("orgpk <>", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkGreaterThan(String value) {
            addCriterion("orgpk >", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkGreaterThanOrEqualTo(String value) {
            addCriterion("orgpk >=", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkLessThan(String value) {
            addCriterion("orgpk <", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkLessThanOrEqualTo(String value) {
            addCriterion("orgpk <=", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkLike(String value) {
            addCriterion("orgpk like", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkNotLike(String value) {
            addCriterion("orgpk not like", value, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkIn(List<String> values) {
            addCriterion("orgpk in", values, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkNotIn(List<String> values) {
            addCriterion("orgpk not in", values, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkBetween(String value1, String value2) {
            addCriterion("orgpk between", value1, value2, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgpkNotBetween(String value1, String value2) {
            addCriterion("orgpk not between", value1, value2, "orgpk");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNull() {
            addCriterion("orgname is null");
            return (Criteria) this;
        }

        public Criteria andOrgnameIsNotNull() {
            addCriterion("orgname is not null");
            return (Criteria) this;
        }

        public Criteria andOrgnameEqualTo(String value) {
            addCriterion("orgname =", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotEqualTo(String value) {
            addCriterion("orgname <>", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThan(String value) {
            addCriterion("orgname >", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameGreaterThanOrEqualTo(String value) {
            addCriterion("orgname >=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThan(String value) {
            addCriterion("orgname <", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLessThanOrEqualTo(String value) {
            addCriterion("orgname <=", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameLike(String value) {
            addCriterion("orgname like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotLike(String value) {
            addCriterion("orgname not like", value, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameIn(List<String> values) {
            addCriterion("orgname in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotIn(List<String> values) {
            addCriterion("orgname not in", values, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameBetween(String value1, String value2) {
            addCriterion("orgname between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andOrgnameNotBetween(String value1, String value2) {
            addCriterion("orgname not between", value1, value2, "orgname");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPassengeridIsNull() {
            addCriterion("passengerid is null");
            return (Criteria) this;
        }

        public Criteria andPassengeridIsNotNull() {
            addCriterion("passengerid is not null");
            return (Criteria) this;
        }

        public Criteria andPassengeridEqualTo(String value) {
            addCriterion("passengerid =", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotEqualTo(String value) {
            addCriterion("passengerid <>", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridGreaterThan(String value) {
            addCriterion("passengerid >", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridGreaterThanOrEqualTo(String value) {
            addCriterion("passengerid >=", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLessThan(String value) {
            addCriterion("passengerid <", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLessThanOrEqualTo(String value) {
            addCriterion("passengerid <=", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridLike(String value) {
            addCriterion("passengerid like", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotLike(String value) {
            addCriterion("passengerid not like", value, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridIn(List<String> values) {
            addCriterion("passengerid in", values, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotIn(List<String> values) {
            addCriterion("passengerid not in", values, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridBetween(String value1, String value2) {
            addCriterion("passengerid between", value1, value2, "passengerid");
            return (Criteria) this;
        }

        public Criteria andPassengeridNotBetween(String value1, String value2) {
            addCriterion("passengerid not between", value1, value2, "passengerid");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkIsNull() {
            addCriterion("fatherdeptpk is null");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkIsNotNull() {
            addCriterion("fatherdeptpk is not null");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkEqualTo(String value) {
            addCriterion("fatherdeptpk =", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkNotEqualTo(String value) {
            addCriterion("fatherdeptpk <>", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkGreaterThan(String value) {
            addCriterion("fatherdeptpk >", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkGreaterThanOrEqualTo(String value) {
            addCriterion("fatherdeptpk >=", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkLessThan(String value) {
            addCriterion("fatherdeptpk <", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkLessThanOrEqualTo(String value) {
            addCriterion("fatherdeptpk <=", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkLike(String value) {
            addCriterion("fatherdeptpk like", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkNotLike(String value) {
            addCriterion("fatherdeptpk not like", value, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkIn(List<String> values) {
            addCriterion("fatherdeptpk in", values, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkNotIn(List<String> values) {
            addCriterion("fatherdeptpk not in", values, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkBetween(String value1, String value2) {
            addCriterion("fatherdeptpk between", value1, value2, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptpkNotBetween(String value1, String value2) {
            addCriterion("fatherdeptpk not between", value1, value2, "fatherdeptpk");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameIsNull() {
            addCriterion("fatherdeptname is null");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameIsNotNull() {
            addCriterion("fatherdeptname is not null");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameEqualTo(String value) {
            addCriterion("fatherdeptname =", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameNotEqualTo(String value) {
            addCriterion("fatherdeptname <>", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameGreaterThan(String value) {
            addCriterion("fatherdeptname >", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("fatherdeptname >=", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameLessThan(String value) {
            addCriterion("fatherdeptname <", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameLessThanOrEqualTo(String value) {
            addCriterion("fatherdeptname <=", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameLike(String value) {
            addCriterion("fatherdeptname like", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameNotLike(String value) {
            addCriterion("fatherdeptname not like", value, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameIn(List<String> values) {
            addCriterion("fatherdeptname in", values, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameNotIn(List<String> values) {
            addCriterion("fatherdeptname not in", values, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameBetween(String value1, String value2) {
            addCriterion("fatherdeptname between", value1, value2, "fatherdeptname");
            return (Criteria) this;
        }

        public Criteria andFatherdeptnameNotBetween(String value1, String value2) {
            addCriterion("fatherdeptname not between", value1, value2, "fatherdeptname");
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