package cn.hups.productMageMent.entity;

import java.util.ArrayList;
import java.util.List;

public class WfProductionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfProductionExample() {
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

        public Criteria andPkProductionIsNull() {
            addCriterion("pk_production is null");
            return (Criteria) this;
        }

        public Criteria andPkProductionIsNotNull() {
            addCriterion("pk_production is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductionEqualTo(Integer value) {
            addCriterion("pk_production =", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionNotEqualTo(Integer value) {
            addCriterion("pk_production <>", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionGreaterThan(Integer value) {
            addCriterion("pk_production >", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_production >=", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionLessThan(Integer value) {
            addCriterion("pk_production <", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionLessThanOrEqualTo(Integer value) {
            addCriterion("pk_production <=", value, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionIn(List<Integer> values) {
            addCriterion("pk_production in", values, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionNotIn(List<Integer> values) {
            addCriterion("pk_production not in", values, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionBetween(Integer value1, Integer value2) {
            addCriterion("pk_production between", value1, value2, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductionNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_production not between", value1, value2, "pkProduction");
            return (Criteria) this;
        }

        public Criteria andPkProductIsNull() {
            addCriterion("pk_product is null");
            return (Criteria) this;
        }

        public Criteria andPkProductIsNotNull() {
            addCriterion("pk_product is not null");
            return (Criteria) this;
        }

        public Criteria andPkProductEqualTo(Integer value) {
            addCriterion("pk_product =", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotEqualTo(Integer value) {
            addCriterion("pk_product <>", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductGreaterThan(Integer value) {
            addCriterion("pk_product >", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_product >=", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductLessThan(Integer value) {
            addCriterion("pk_product <", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductLessThanOrEqualTo(Integer value) {
            addCriterion("pk_product <=", value, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductIn(List<Integer> values) {
            addCriterion("pk_product in", values, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotIn(List<Integer> values) {
            addCriterion("pk_product not in", values, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductBetween(Integer value1, Integer value2) {
            addCriterion("pk_product between", value1, value2, "pkProduct");
            return (Criteria) this;
        }

        public Criteria andPkProductNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_product not between", value1, value2, "pkProduct");
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

        public Criteria andWorkshopIsNull() {
            addCriterion("\" workshop\" is null");
            return (Criteria) this;
        }

        public Criteria andWorkshopIsNotNull() {
            addCriterion("\" workshop\" is not null");
            return (Criteria) this;
        }

        public Criteria andWorkshopEqualTo(String value) {
            addCriterion("\" workshop\" =", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotEqualTo(String value) {
            addCriterion("\" workshop\" <>", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopGreaterThan(String value) {
            addCriterion("\" workshop\" >", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopGreaterThanOrEqualTo(String value) {
            addCriterion("\" workshop\" >=", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLessThan(String value) {
            addCriterion("\" workshop\" <", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLessThanOrEqualTo(String value) {
            addCriterion("\" workshop\" <=", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopLike(String value) {
            addCriterion("\" workshop\" like", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotLike(String value) {
            addCriterion("\" workshop\" not like", value, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopIn(List<String> values) {
            addCriterion("\" workshop\" in", values, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotIn(List<String> values) {
            addCriterion("\" workshop\" not in", values, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopBetween(String value1, String value2) {
            addCriterion("\" workshop\" between", value1, value2, "workshop");
            return (Criteria) this;
        }

        public Criteria andWorkshopNotBetween(String value1, String value2) {
            addCriterion("\" workshop\" not between", value1, value2, "workshop");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeIsNull() {
            addCriterion("estimated_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeIsNotNull() {
            addCriterion("estimated_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeEqualTo(String value) {
            addCriterion("estimated_start_time =", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeNotEqualTo(String value) {
            addCriterion("estimated_start_time <>", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeGreaterThan(String value) {
            addCriterion("estimated_start_time >", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("estimated_start_time >=", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeLessThan(String value) {
            addCriterion("estimated_start_time <", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeLessThanOrEqualTo(String value) {
            addCriterion("estimated_start_time <=", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeLike(String value) {
            addCriterion("estimated_start_time like", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeNotLike(String value) {
            addCriterion("estimated_start_time not like", value, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeIn(List<String> values) {
            addCriterion("estimated_start_time in", values, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeNotIn(List<String> values) {
            addCriterion("estimated_start_time not in", values, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeBetween(String value1, String value2) {
            addCriterion("estimated_start_time between", value1, value2, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedStartTimeNotBetween(String value1, String value2) {
            addCriterion("estimated_start_time not between", value1, value2, "estimatedStartTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIsNull() {
            addCriterion("estimated_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIsNotNull() {
            addCriterion("estimated_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeEqualTo(String value) {
            addCriterion("estimated_end_time =", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotEqualTo(String value) {
            addCriterion("estimated_end_time <>", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeGreaterThan(String value) {
            addCriterion("estimated_end_time >", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("estimated_end_time >=", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeLessThan(String value) {
            addCriterion("estimated_end_time <", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeLessThanOrEqualTo(String value) {
            addCriterion("estimated_end_time <=", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeLike(String value) {
            addCriterion("estimated_end_time like", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotLike(String value) {
            addCriterion("estimated_end_time not like", value, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeIn(List<String> values) {
            addCriterion("estimated_end_time in", values, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotIn(List<String> values) {
            addCriterion("estimated_end_time not in", values, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeBetween(String value1, String value2) {
            addCriterion("estimated_end_time between", value1, value2, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedEndTimeNotBetween(String value1, String value2) {
            addCriterion("estimated_end_time not between", value1, value2, "estimatedEndTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIsNull() {
            addCriterion("actual_start_time is null");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIsNotNull() {
            addCriterion("actual_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeEqualTo(String value) {
            addCriterion("actual_start_time =", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotEqualTo(String value) {
            addCriterion("actual_start_time <>", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeGreaterThan(String value) {
            addCriterion("actual_start_time >", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_start_time >=", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeLessThan(String value) {
            addCriterion("actual_start_time <", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeLessThanOrEqualTo(String value) {
            addCriterion("actual_start_time <=", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeLike(String value) {
            addCriterion("actual_start_time like", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotLike(String value) {
            addCriterion("actual_start_time not like", value, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeIn(List<String> values) {
            addCriterion("actual_start_time in", values, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotIn(List<String> values) {
            addCriterion("actual_start_time not in", values, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeBetween(String value1, String value2) {
            addCriterion("actual_start_time between", value1, value2, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualStartTimeNotBetween(String value1, String value2) {
            addCriterion("actual_start_time not between", value1, value2, "actualStartTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNull() {
            addCriterion("actual_end_time is null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIsNotNull() {
            addCriterion("actual_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeEqualTo(String value) {
            addCriterion("actual_end_time =", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotEqualTo(String value) {
            addCriterion("actual_end_time <>", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThan(String value) {
            addCriterion("actual_end_time >", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_end_time >=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThan(String value) {
            addCriterion("actual_end_time <", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLessThanOrEqualTo(String value) {
            addCriterion("actual_end_time <=", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeLike(String value) {
            addCriterion("actual_end_time like", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotLike(String value) {
            addCriterion("actual_end_time not like", value, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeIn(List<String> values) {
            addCriterion("actual_end_time in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotIn(List<String> values) {
            addCriterion("actual_end_time not in", values, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeBetween(String value1, String value2) {
            addCriterion("actual_end_time between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andActualEndTimeNotBetween(String value1, String value2) {
            addCriterion("actual_end_time not between", value1, value2, "actualEndTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberIsNull() {
            addCriterion("estimated_number is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberIsNotNull() {
            addCriterion("estimated_number is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberEqualTo(Integer value) {
            addCriterion("estimated_number =", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberNotEqualTo(Integer value) {
            addCriterion("estimated_number <>", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberGreaterThan(Integer value) {
            addCriterion("estimated_number >", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("estimated_number >=", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberLessThan(Integer value) {
            addCriterion("estimated_number <", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberLessThanOrEqualTo(Integer value) {
            addCriterion("estimated_number <=", value, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberIn(List<Integer> values) {
            addCriterion("estimated_number in", values, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberNotIn(List<Integer> values) {
            addCriterion("estimated_number not in", values, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberBetween(Integer value1, Integer value2) {
            addCriterion("estimated_number between", value1, value2, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andEstimatedNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("estimated_number not between", value1, value2, "estimatedNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNull() {
            addCriterion("actual_number is null");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNotNull() {
            addCriterion("actual_number is not null");
            return (Criteria) this;
        }

        public Criteria andActualNumberEqualTo(Integer value) {
            addCriterion("actual_number =", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotEqualTo(Integer value) {
            addCriterion("actual_number <>", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThan(Integer value) {
            addCriterion("actual_number >", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_number >=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThan(Integer value) {
            addCriterion("actual_number <", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThanOrEqualTo(Integer value) {
            addCriterion("actual_number <=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIn(List<Integer> values) {
            addCriterion("actual_number in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotIn(List<Integer> values) {
            addCriterion("actual_number not in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberBetween(Integer value1, Integer value2) {
            addCriterion("actual_number between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_number not between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andWfStateIsNull() {
            addCriterion("wf_state is null");
            return (Criteria) this;
        }

        public Criteria andWfStateIsNotNull() {
            addCriterion("wf_state is not null");
            return (Criteria) this;
        }

        public Criteria andWfStateEqualTo(Integer value) {
            addCriterion("wf_state =", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateNotEqualTo(Integer value) {
            addCriterion("wf_state <>", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateGreaterThan(Integer value) {
            addCriterion("wf_state >", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("wf_state >=", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateLessThan(Integer value) {
            addCriterion("wf_state <", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateLessThanOrEqualTo(Integer value) {
            addCriterion("wf_state <=", value, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateIn(List<Integer> values) {
            addCriterion("wf_state in", values, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateNotIn(List<Integer> values) {
            addCriterion("wf_state not in", values, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateBetween(Integer value1, Integer value2) {
            addCriterion("wf_state between", value1, value2, "wfState");
            return (Criteria) this;
        }

        public Criteria andWfStateNotBetween(Integer value1, Integer value2) {
            addCriterion("wf_state not between", value1, value2, "wfState");
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

        public Criteria andDrEqualTo(String value) {
            addCriterion("dr =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(String value) {
            addCriterion("dr <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(String value) {
            addCriterion("dr >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(String value) {
            addCriterion("dr >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(String value) {
            addCriterion("dr <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(String value) {
            addCriterion("dr <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLike(String value) {
            addCriterion("dr like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotLike(String value) {
            addCriterion("dr not like", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<String> values) {
            addCriterion("dr in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<String> values) {
            addCriterion("dr not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(String value1, String value2) {
            addCriterion("dr between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(String value1, String value2) {
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