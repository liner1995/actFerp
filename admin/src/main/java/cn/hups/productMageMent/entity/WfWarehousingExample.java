package cn.hups.productMageMent.entity;

import java.util.ArrayList;
import java.util.List;

public class WfWarehousingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfWarehousingExample() {
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

        public Criteria andPkWarehousingIsNull() {
            addCriterion("pk_warehousing is null");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingIsNotNull() {
            addCriterion("pk_warehousing is not null");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingEqualTo(Integer value) {
            addCriterion("pk_warehousing =", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingNotEqualTo(Integer value) {
            addCriterion("pk_warehousing <>", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingGreaterThan(Integer value) {
            addCriterion("pk_warehousing >", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_warehousing >=", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingLessThan(Integer value) {
            addCriterion("pk_warehousing <", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingLessThanOrEqualTo(Integer value) {
            addCriterion("pk_warehousing <=", value, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingIn(List<Integer> values) {
            addCriterion("pk_warehousing in", values, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingNotIn(List<Integer> values) {
            addCriterion("pk_warehousing not in", values, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingBetween(Integer value1, Integer value2) {
            addCriterion("pk_warehousing between", value1, value2, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andPkWarehousingNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_warehousing not between", value1, value2, "pkWarehousing");
            return (Criteria) this;
        }

        public Criteria andMaterialQcIsNull() {
            addCriterion("material_qc is null");
            return (Criteria) this;
        }

        public Criteria andMaterialQcIsNotNull() {
            addCriterion("material_qc is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialQcEqualTo(Integer value) {
            addCriterion("material_qc =", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcNotEqualTo(Integer value) {
            addCriterion("material_qc <>", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcGreaterThan(Integer value) {
            addCriterion("material_qc >", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcGreaterThanOrEqualTo(Integer value) {
            addCriterion("material_qc >=", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcLessThan(Integer value) {
            addCriterion("material_qc <", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcLessThanOrEqualTo(Integer value) {
            addCriterion("material_qc <=", value, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcIn(List<Integer> values) {
            addCriterion("material_qc in", values, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcNotIn(List<Integer> values) {
            addCriterion("material_qc not in", values, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcBetween(Integer value1, Integer value2) {
            addCriterion("material_qc between", value1, value2, "materialQc");
            return (Criteria) this;
        }

        public Criteria andMaterialQcNotBetween(Integer value1, Integer value2) {
            addCriterion("material_qc not between", value1, value2, "materialQc");
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

        public Criteria andWStateIsNull() {
            addCriterion("w_state is null");
            return (Criteria) this;
        }

        public Criteria andWStateIsNotNull() {
            addCriterion("w_state is not null");
            return (Criteria) this;
        }

        public Criteria andWStateEqualTo(Integer value) {
            addCriterion("w_state =", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateNotEqualTo(Integer value) {
            addCriterion("w_state <>", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateGreaterThan(Integer value) {
            addCriterion("w_state >", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("w_state >=", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateLessThan(Integer value) {
            addCriterion("w_state <", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateLessThanOrEqualTo(Integer value) {
            addCriterion("w_state <=", value, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateIn(List<Integer> values) {
            addCriterion("w_state in", values, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateNotIn(List<Integer> values) {
            addCriterion("w_state not in", values, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateBetween(Integer value1, Integer value2) {
            addCriterion("w_state between", value1, value2, "wState");
            return (Criteria) this;
        }

        public Criteria andWStateNotBetween(Integer value1, Integer value2) {
            addCriterion("w_state not between", value1, value2, "wState");
            return (Criteria) this;
        }

        public Criteria andFilefullnamIsNull() {
            addCriterion("filefullnam is null");
            return (Criteria) this;
        }

        public Criteria andFilefullnamIsNotNull() {
            addCriterion("filefullnam is not null");
            return (Criteria) this;
        }

        public Criteria andFilefullnamEqualTo(String value) {
            addCriterion("filefullnam =", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamNotEqualTo(String value) {
            addCriterion("filefullnam <>", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamGreaterThan(String value) {
            addCriterion("filefullnam >", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamGreaterThanOrEqualTo(String value) {
            addCriterion("filefullnam >=", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamLessThan(String value) {
            addCriterion("filefullnam <", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamLessThanOrEqualTo(String value) {
            addCriterion("filefullnam <=", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamLike(String value) {
            addCriterion("filefullnam like", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamNotLike(String value) {
            addCriterion("filefullnam not like", value, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamIn(List<String> values) {
            addCriterion("filefullnam in", values, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamNotIn(List<String> values) {
            addCriterion("filefullnam not in", values, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamBetween(String value1, String value2) {
            addCriterion("filefullnam between", value1, value2, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilefullnamNotBetween(String value1, String value2) {
            addCriterion("filefullnam not between", value1, value2, "filefullnam");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
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