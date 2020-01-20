package cn.hups.productMageMent.entity;

import java.util.ArrayList;
import java.util.List;

public class WfWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfWarehouseExample() {
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

        public Criteria andWhStateIsNull() {
            addCriterion("wh_state is null");
            return (Criteria) this;
        }

        public Criteria andWhStateIsNotNull() {
            addCriterion("wh_state is not null");
            return (Criteria) this;
        }

        public Criteria andWhStateEqualTo(Integer value) {
            addCriterion("wh_state =", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotEqualTo(Integer value) {
            addCriterion("wh_state <>", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateGreaterThan(Integer value) {
            addCriterion("wh_state >", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("wh_state >=", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateLessThan(Integer value) {
            addCriterion("wh_state <", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateLessThanOrEqualTo(Integer value) {
            addCriterion("wh_state <=", value, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateIn(List<Integer> values) {
            addCriterion("wh_state in", values, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotIn(List<Integer> values) {
            addCriterion("wh_state not in", values, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateBetween(Integer value1, Integer value2) {
            addCriterion("wh_state between", value1, value2, "whState");
            return (Criteria) this;
        }

        public Criteria andWhStateNotBetween(Integer value1, Integer value2) {
            addCriterion("wh_state not between", value1, value2, "whState");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNull() {
            addCriterion("arrivaltime is null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIsNotNull() {
            addCriterion("arrivaltime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeEqualTo(String value) {
            addCriterion("arrivaltime =", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotEqualTo(String value) {
            addCriterion("arrivaltime <>", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThan(String value) {
            addCriterion("arrivaltime >", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrivaltime >=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThan(String value) {
            addCriterion("arrivaltime <", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLessThanOrEqualTo(String value) {
            addCriterion("arrivaltime <=", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeLike(String value) {
            addCriterion("arrivaltime like", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotLike(String value) {
            addCriterion("arrivaltime not like", value, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeIn(List<String> values) {
            addCriterion("arrivaltime in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotIn(List<String> values) {
            addCriterion("arrivaltime not in", values, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeBetween(String value1, String value2) {
            addCriterion("arrivaltime between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andArrivaltimeNotBetween(String value1, String value2) {
            addCriterion("arrivaltime not between", value1, value2, "arrivaltime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeIsNull() {
            addCriterion("mpr_affirmtime is null");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeIsNotNull() {
            addCriterion("mpr_affirmtime is not null");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeEqualTo(String value) {
            addCriterion("mpr_affirmtime =", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeNotEqualTo(String value) {
            addCriterion("mpr_affirmtime <>", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeGreaterThan(String value) {
            addCriterion("mpr_affirmtime >", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeGreaterThanOrEqualTo(String value) {
            addCriterion("mpr_affirmtime >=", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeLessThan(String value) {
            addCriterion("mpr_affirmtime <", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeLessThanOrEqualTo(String value) {
            addCriterion("mpr_affirmtime <=", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeLike(String value) {
            addCriterion("mpr_affirmtime like", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeNotLike(String value) {
            addCriterion("mpr_affirmtime not like", value, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeIn(List<String> values) {
            addCriterion("mpr_affirmtime in", values, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeNotIn(List<String> values) {
            addCriterion("mpr_affirmtime not in", values, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeBetween(String value1, String value2) {
            addCriterion("mpr_affirmtime between", value1, value2, "mprAffirmtime");
            return (Criteria) this;
        }

        public Criteria andMprAffirmtimeNotBetween(String value1, String value2) {
            addCriterion("mpr_affirmtime not between", value1, value2, "mprAffirmtime");
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

        public Criteria andModifiedtimeIsNull() {
            addCriterion("modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("modifiedtime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("modifiedtime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("modifiedtime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("modifiedtime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("modifiedtime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("modifiedtime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("modifiedtime like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("modifiedtime not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("modifiedtime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("modifiedtime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("modifiedtime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("modifiedtime not between", value1, value2, "modifiedtime");
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