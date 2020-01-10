package cn.hups.productMageMent.entity;

import java.util.ArrayList;
import java.util.List;

public class WfDipProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfDipProductionExample() {
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

        public Criteria andPkDipProductionIsNull() {
            addCriterion("pk_dip_production is null");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionIsNotNull() {
            addCriterion("pk_dip_production is not null");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionEqualTo(Integer value) {
            addCriterion("pk_dip_production =", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionNotEqualTo(Integer value) {
            addCriterion("pk_dip_production <>", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionGreaterThan(Integer value) {
            addCriterion("pk_dip_production >", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_dip_production >=", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionLessThan(Integer value) {
            addCriterion("pk_dip_production <", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionLessThanOrEqualTo(Integer value) {
            addCriterion("pk_dip_production <=", value, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionIn(List<Integer> values) {
            addCriterion("pk_dip_production in", values, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionNotIn(List<Integer> values) {
            addCriterion("pk_dip_production not in", values, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionBetween(Integer value1, Integer value2) {
            addCriterion("pk_dip_production between", value1, value2, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkDipProductionNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_dip_production not between", value1, value2, "pkDipProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionIsNull() {
            addCriterion("pk_smt_production is null");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionIsNotNull() {
            addCriterion("pk_smt_production is not null");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionEqualTo(Integer value) {
            addCriterion("pk_smt_production =", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionNotEqualTo(Integer value) {
            addCriterion("pk_smt_production <>", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionGreaterThan(Integer value) {
            addCriterion("pk_smt_production >", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_smt_production >=", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionLessThan(Integer value) {
            addCriterion("pk_smt_production <", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionLessThanOrEqualTo(Integer value) {
            addCriterion("pk_smt_production <=", value, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionIn(List<Integer> values) {
            addCriterion("pk_smt_production in", values, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionNotIn(List<Integer> values) {
            addCriterion("pk_smt_production not in", values, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionBetween(Integer value1, Integer value2) {
            addCriterion("pk_smt_production between", value1, value2, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andPkSmtProductionNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_smt_production not between", value1, value2, "pkSmtProduction");
            return (Criteria) this;
        }

        public Criteria andProcessIsNull() {
            addCriterion("process is null");
            return (Criteria) this;
        }

        public Criteria andProcessIsNotNull() {
            addCriterion("process is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEqualTo(String value) {
            addCriterion("process =", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotEqualTo(String value) {
            addCriterion("process <>", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThan(String value) {
            addCriterion("process >", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessGreaterThanOrEqualTo(String value) {
            addCriterion("process >=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThan(String value) {
            addCriterion("process <", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLessThanOrEqualTo(String value) {
            addCriterion("process <=", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessLike(String value) {
            addCriterion("process like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotLike(String value) {
            addCriterion("process not like", value, "process");
            return (Criteria) this;
        }

        public Criteria andProcessIn(List<String> values) {
            addCriterion("process in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotIn(List<String> values) {
            addCriterion("process not in", values, "process");
            return (Criteria) this;
        }

        public Criteria andProcessBetween(String value1, String value2) {
            addCriterion("process between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andProcessNotBetween(String value1, String value2) {
            addCriterion("process not between", value1, value2, "process");
            return (Criteria) this;
        }

        public Criteria andDipStateIsNull() {
            addCriterion("dip_state is null");
            return (Criteria) this;
        }

        public Criteria andDipStateIsNotNull() {
            addCriterion("dip_state is not null");
            return (Criteria) this;
        }

        public Criteria andDipStateEqualTo(Integer value) {
            addCriterion("dip_state =", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateNotEqualTo(Integer value) {
            addCriterion("dip_state <>", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateGreaterThan(Integer value) {
            addCriterion("dip_state >", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("dip_state >=", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateLessThan(Integer value) {
            addCriterion("dip_state <", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateLessThanOrEqualTo(Integer value) {
            addCriterion("dip_state <=", value, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateIn(List<Integer> values) {
            addCriterion("dip_state in", values, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateNotIn(List<Integer> values) {
            addCriterion("dip_state not in", values, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateBetween(Integer value1, Integer value2) {
            addCriterion("dip_state between", value1, value2, "dipState");
            return (Criteria) this;
        }

        public Criteria andDipStateNotBetween(Integer value1, Integer value2) {
            addCriterion("dip_state not between", value1, value2, "dipState");
            return (Criteria) this;
        }

        public Criteria andPickingtimeIsNull() {
            addCriterion("pickingtime is null");
            return (Criteria) this;
        }

        public Criteria andPickingtimeIsNotNull() {
            addCriterion("pickingtime is not null");
            return (Criteria) this;
        }

        public Criteria andPickingtimeEqualTo(String value) {
            addCriterion("pickingtime =", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeNotEqualTo(String value) {
            addCriterion("pickingtime <>", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeGreaterThan(String value) {
            addCriterion("pickingtime >", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeGreaterThanOrEqualTo(String value) {
            addCriterion("pickingtime >=", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeLessThan(String value) {
            addCriterion("pickingtime <", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeLessThanOrEqualTo(String value) {
            addCriterion("pickingtime <=", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeLike(String value) {
            addCriterion("pickingtime like", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeNotLike(String value) {
            addCriterion("pickingtime not like", value, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeIn(List<String> values) {
            addCriterion("pickingtime in", values, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeNotIn(List<String> values) {
            addCriterion("pickingtime not in", values, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeBetween(String value1, String value2) {
            addCriterion("pickingtime between", value1, value2, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andPickingtimeNotBetween(String value1, String value2) {
            addCriterion("pickingtime not between", value1, value2, "pickingtime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(String value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(String value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(String value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(String value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(String value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLike(String value) {
            addCriterion("starttime like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotLike(String value) {
            addCriterion("starttime not like", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<String> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<String> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(String value1, String value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(String value1, String value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishtime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishtime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(String value) {
            addCriterion("finishtime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(String value) {
            addCriterion("finishtime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(String value) {
            addCriterion("finishtime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(String value) {
            addCriterion("finishtime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(String value) {
            addCriterion("finishtime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(String value) {
            addCriterion("finishtime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLike(String value) {
            addCriterion("finishtime like", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotLike(String value) {
            addCriterion("finishtime not like", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<String> values) {
            addCriterion("finishtime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<String> values) {
            addCriterion("finishtime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(String value1, String value2) {
            addCriterion("finishtime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(String value1, String value2) {
            addCriterion("finishtime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeIsNull() {
            addCriterion("numbertime is null");
            return (Criteria) this;
        }

        public Criteria andNumbertimeIsNotNull() {
            addCriterion("numbertime is not null");
            return (Criteria) this;
        }

        public Criteria andNumbertimeEqualTo(String value) {
            addCriterion("numbertime =", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeNotEqualTo(String value) {
            addCriterion("numbertime <>", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeGreaterThan(String value) {
            addCriterion("numbertime >", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeGreaterThanOrEqualTo(String value) {
            addCriterion("numbertime >=", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeLessThan(String value) {
            addCriterion("numbertime <", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeLessThanOrEqualTo(String value) {
            addCriterion("numbertime <=", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeLike(String value) {
            addCriterion("numbertime like", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeNotLike(String value) {
            addCriterion("numbertime not like", value, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeIn(List<String> values) {
            addCriterion("numbertime in", values, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeNotIn(List<String> values) {
            addCriterion("numbertime not in", values, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeBetween(String value1, String value2) {
            addCriterion("numbertime between", value1, value2, "numbertime");
            return (Criteria) this;
        }

        public Criteria andNumbertimeNotBetween(String value1, String value2) {
            addCriterion("numbertime not between", value1, value2, "numbertime");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberIsNull() {
            addCriterion("completion_number is null");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberIsNotNull() {
            addCriterion("completion_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberEqualTo(Integer value) {
            addCriterion("completion_number =", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberNotEqualTo(Integer value) {
            addCriterion("completion_number <>", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberGreaterThan(Integer value) {
            addCriterion("completion_number >", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("completion_number >=", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberLessThan(Integer value) {
            addCriterion("completion_number <", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("completion_number <=", value, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberIn(List<Integer> values) {
            addCriterion("completion_number in", values, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberNotIn(List<Integer> values) {
            addCriterion("completion_number not in", values, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberBetween(Integer value1, Integer value2) {
            addCriterion("completion_number between", value1, value2, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCompletionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("completion_number not between", value1, value2, "completionNumber");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationtime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("creationtime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("creationtime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("creationtime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("creationtime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("creationtime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("creationtime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("creationtime like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("creationtime not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("creationtime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("creationtime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("creationtime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("creationtime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiertimeIsNull() {
            addCriterion("modifiertime is null");
            return (Criteria) this;
        }

        public Criteria andModifiertimeIsNotNull() {
            addCriterion("modifiertime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiertimeEqualTo(String value) {
            addCriterion("modifiertime =", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeNotEqualTo(String value) {
            addCriterion("modifiertime <>", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeGreaterThan(String value) {
            addCriterion("modifiertime >", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifiertime >=", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeLessThan(String value) {
            addCriterion("modifiertime <", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeLessThanOrEqualTo(String value) {
            addCriterion("modifiertime <=", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeLike(String value) {
            addCriterion("modifiertime like", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeNotLike(String value) {
            addCriterion("modifiertime not like", value, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeIn(List<String> values) {
            addCriterion("modifiertime in", values, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeNotIn(List<String> values) {
            addCriterion("modifiertime not in", values, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeBetween(String value1, String value2) {
            addCriterion("modifiertime between", value1, value2, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andModifiertimeNotBetween(String value1, String value2) {
            addCriterion("modifiertime not between", value1, value2, "modifiertime");
            return (Criteria) this;
        }

        public Criteria andDrIsNull() {
            addCriterion("dr is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("dr is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(Integer value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(Integer value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(Integer value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(Integer value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(Integer value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<Integer> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<Integer> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(Integer value1, Integer value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(Integer value1, Integer value2) {
            addCriterion("dr not between", value1, value2, "dr");
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

        public Criteria andTsEqualTo(String value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("ts like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("ts not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("ts not between", value1, value2, "ts");
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