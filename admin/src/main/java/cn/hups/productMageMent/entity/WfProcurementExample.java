package cn.hups.productMageMent.entity;

import java.util.ArrayList;
import java.util.List;

public class WfProcurementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfProcurementExample() {
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

        public Criteria andPkProcurementIsNull() {
            addCriterion("pk_procurement is null");
            return (Criteria) this;
        }

        public Criteria andPkProcurementIsNotNull() {
            addCriterion("pk_procurement is not null");
            return (Criteria) this;
        }

        public Criteria andPkProcurementEqualTo(Integer value) {
            addCriterion("pk_procurement =", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementNotEqualTo(Integer value) {
            addCriterion("pk_procurement <>", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementGreaterThan(Integer value) {
            addCriterion("pk_procurement >", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_procurement >=", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementLessThan(Integer value) {
            addCriterion("pk_procurement <", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementLessThanOrEqualTo(Integer value) {
            addCriterion("pk_procurement <=", value, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementIn(List<Integer> values) {
            addCriterion("pk_procurement in", values, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementNotIn(List<Integer> values) {
            addCriterion("pk_procurement not in", values, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementBetween(Integer value1, Integer value2) {
            addCriterion("pk_procurement between", value1, value2, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkProcurementNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_procurement not between", value1, value2, "pkProcurement");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseIsNull() {
            addCriterion("pk_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseIsNotNull() {
            addCriterion("pk_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseEqualTo(Integer value) {
            addCriterion("pk_warehouse =", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseNotEqualTo(Integer value) {
            addCriterion("pk_warehouse <>", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseGreaterThan(Integer value) {
            addCriterion("pk_warehouse >", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_warehouse >=", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseLessThan(Integer value) {
            addCriterion("pk_warehouse <", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseLessThanOrEqualTo(Integer value) {
            addCriterion("pk_warehouse <=", value, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseIn(List<Integer> values) {
            addCriterion("pk_warehouse in", values, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseNotIn(List<Integer> values) {
            addCriterion("pk_warehouse not in", values, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseBetween(Integer value1, Integer value2) {
            addCriterion("pk_warehouse between", value1, value2, "pkWarehouse");
            return (Criteria) this;
        }

        public Criteria andPkWarehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_warehouse not between", value1, value2, "pkWarehouse");
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

        public Criteria andPrStateIsNull() {
            addCriterion("pr_state is null");
            return (Criteria) this;
        }

        public Criteria andPrStateIsNotNull() {
            addCriterion("pr_state is not null");
            return (Criteria) this;
        }

        public Criteria andPrStateEqualTo(Integer value) {
            addCriterion("pr_state =", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateNotEqualTo(Integer value) {
            addCriterion("pr_state <>", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateGreaterThan(Integer value) {
            addCriterion("pr_state >", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_state >=", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateLessThan(Integer value) {
            addCriterion("pr_state <", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateLessThanOrEqualTo(Integer value) {
            addCriterion("pr_state <=", value, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateIn(List<Integer> values) {
            addCriterion("pr_state in", values, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateNotIn(List<Integer> values) {
            addCriterion("pr_state not in", values, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateBetween(Integer value1, Integer value2) {
            addCriterion("pr_state between", value1, value2, "prState");
            return (Criteria) this;
        }

        public Criteria andPrStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_state not between", value1, value2, "prState");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeIsNull() {
            addCriterion("estimated_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeIsNotNull() {
            addCriterion("estimated_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeEqualTo(String value) {
            addCriterion("estimated_finish_time =", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeNotEqualTo(String value) {
            addCriterion("estimated_finish_time <>", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeGreaterThan(String value) {
            addCriterion("estimated_finish_time >", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("estimated_finish_time >=", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeLessThan(String value) {
            addCriterion("estimated_finish_time <", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeLessThanOrEqualTo(String value) {
            addCriterion("estimated_finish_time <=", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeLike(String value) {
            addCriterion("estimated_finish_time like", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeNotLike(String value) {
            addCriterion("estimated_finish_time not like", value, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeIn(List<String> values) {
            addCriterion("estimated_finish_time in", values, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeNotIn(List<String> values) {
            addCriterion("estimated_finish_time not in", values, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeBetween(String value1, String value2) {
            addCriterion("estimated_finish_time between", value1, value2, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedFinishTimeNotBetween(String value1, String value2) {
            addCriterion("estimated_finish_time not between", value1, value2, "estimatedFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeIsNull() {
            addCriterion("actual_finish_time is null");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeIsNotNull() {
            addCriterion("actual_finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeEqualTo(String value) {
            addCriterion("actual_finish_time =", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeNotEqualTo(String value) {
            addCriterion("actual_finish_time <>", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeGreaterThan(String value) {
            addCriterion("actual_finish_time >", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_finish_time >=", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeLessThan(String value) {
            addCriterion("actual_finish_time <", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeLessThanOrEqualTo(String value) {
            addCriterion("actual_finish_time <=", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeLike(String value) {
            addCriterion("actual_finish_time like", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeNotLike(String value) {
            addCriterion("actual_finish_time not like", value, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeIn(List<String> values) {
            addCriterion("actual_finish_time in", values, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeNotIn(List<String> values) {
            addCriterion("actual_finish_time not in", values, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeBetween(String value1, String value2) {
            addCriterion("actual_finish_time between", value1, value2, "actualFinishTime");
            return (Criteria) this;
        }

        public Criteria andActualFinishTimeNotBetween(String value1, String value2) {
            addCriterion("actual_finish_time not between", value1, value2, "actualFinishTime");
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