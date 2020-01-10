package cn.hups.productMageMent.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WfFinishedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WfFinishedExample() {
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

        public Criteria andPkFinishedIsNull() {
            addCriterion("pk_finished is null");
            return (Criteria) this;
        }

        public Criteria andPkFinishedIsNotNull() {
            addCriterion("pk_finished is not null");
            return (Criteria) this;
        }

        public Criteria andPkFinishedEqualTo(Integer value) {
            addCriterion("pk_finished =", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedNotEqualTo(Integer value) {
            addCriterion("pk_finished <>", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedGreaterThan(Integer value) {
            addCriterion("pk_finished >", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("pk_finished >=", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedLessThan(Integer value) {
            addCriterion("pk_finished <", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedLessThanOrEqualTo(Integer value) {
            addCriterion("pk_finished <=", value, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedIn(List<Integer> values) {
            addCriterion("pk_finished in", values, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedNotIn(List<Integer> values) {
            addCriterion("pk_finished not in", values, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedBetween(Integer value1, Integer value2) {
            addCriterion("pk_finished between", value1, value2, "pkFinished");
            return (Criteria) this;
        }

        public Criteria andPkFinishedNotBetween(Integer value1, Integer value2) {
            addCriterion("pk_finished not between", value1, value2, "pkFinished");
            return (Criteria) this;
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

        public Criteria andSerialIsNull() {
            addCriterion("Serial is null");
            return (Criteria) this;
        }

        public Criteria andSerialIsNotNull() {
            addCriterion("Serial is not null");
            return (Criteria) this;
        }

        public Criteria andSerialEqualTo(String value) {
            addCriterion("Serial =", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotEqualTo(String value) {
            addCriterion("Serial <>", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThan(String value) {
            addCriterion("Serial >", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialGreaterThanOrEqualTo(String value) {
            addCriterion("Serial >=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThan(String value) {
            addCriterion("Serial <", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLessThanOrEqualTo(String value) {
            addCriterion("Serial <=", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialLike(String value) {
            addCriterion("Serial like", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotLike(String value) {
            addCriterion("Serial not like", value, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialIn(List<String> values) {
            addCriterion("Serial in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotIn(List<String> values) {
            addCriterion("Serial not in", values, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialBetween(String value1, String value2) {
            addCriterion("Serial between", value1, value2, "serial");
            return (Criteria) this;
        }

        public Criteria andSerialNotBetween(String value1, String value2) {
            addCriterion("Serial not between", value1, value2, "serial");
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

        public Criteria andQcNumberIsNull() {
            addCriterion("qc_number is null");
            return (Criteria) this;
        }

        public Criteria andQcNumberIsNotNull() {
            addCriterion("qc_number is not null");
            return (Criteria) this;
        }

        public Criteria andQcNumberEqualTo(Integer value) {
            addCriterion("qc_number =", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberNotEqualTo(Integer value) {
            addCriterion("qc_number <>", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberGreaterThan(Integer value) {
            addCriterion("qc_number >", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("qc_number >=", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberLessThan(Integer value) {
            addCriterion("qc_number <", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberLessThanOrEqualTo(Integer value) {
            addCriterion("qc_number <=", value, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberIn(List<Integer> values) {
            addCriterion("qc_number in", values, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberNotIn(List<Integer> values) {
            addCriterion("qc_number not in", values, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberBetween(Integer value1, Integer value2) {
            addCriterion("qc_number between", value1, value2, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andQcNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("qc_number not between", value1, value2, "qcNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberIsNull() {
            addCriterion("pass_number is null");
            return (Criteria) this;
        }

        public Criteria andPassNumberIsNotNull() {
            addCriterion("pass_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassNumberEqualTo(Integer value) {
            addCriterion("pass_number =", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotEqualTo(Integer value) {
            addCriterion("pass_number <>", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberGreaterThan(Integer value) {
            addCriterion("pass_number >", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pass_number >=", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberLessThan(Integer value) {
            addCriterion("pass_number <", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pass_number <=", value, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberIn(List<Integer> values) {
            addCriterion("pass_number in", values, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotIn(List<Integer> values) {
            addCriterion("pass_number not in", values, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberBetween(Integer value1, Integer value2) {
            addCriterion("pass_number between", value1, value2, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pass_number not between", value1, value2, "passNumber");
            return (Criteria) this;
        }

        public Criteria andPassRateIsNull() {
            addCriterion("pass_rate is null");
            return (Criteria) this;
        }

        public Criteria andPassRateIsNotNull() {
            addCriterion("pass_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPassRateEqualTo(BigDecimal value) {
            addCriterion("pass_rate =", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotEqualTo(BigDecimal value) {
            addCriterion("pass_rate <>", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateGreaterThan(BigDecimal value) {
            addCriterion("pass_rate >", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pass_rate >=", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateLessThan(BigDecimal value) {
            addCriterion("pass_rate <", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pass_rate <=", value, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateIn(List<BigDecimal> values) {
            addCriterion("pass_rate in", values, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotIn(List<BigDecimal> values) {
            addCriterion("pass_rate not in", values, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pass_rate between", value1, value2, "passRate");
            return (Criteria) this;
        }

        public Criteria andPassRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pass_rate not between", value1, value2, "passRate");
            return (Criteria) this;
        }

        public Criteria andPutNumberIsNull() {
            addCriterion("put_number is null");
            return (Criteria) this;
        }

        public Criteria andPutNumberIsNotNull() {
            addCriterion("put_number is not null");
            return (Criteria) this;
        }

        public Criteria andPutNumberEqualTo(Integer value) {
            addCriterion("put_number =", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberNotEqualTo(Integer value) {
            addCriterion("put_number <>", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberGreaterThan(Integer value) {
            addCriterion("put_number >", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("put_number >=", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberLessThan(Integer value) {
            addCriterion("put_number <", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberLessThanOrEqualTo(Integer value) {
            addCriterion("put_number <=", value, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberIn(List<Integer> values) {
            addCriterion("put_number in", values, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberNotIn(List<Integer> values) {
            addCriterion("put_number not in", values, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberBetween(Integer value1, Integer value2) {
            addCriterion("put_number between", value1, value2, "putNumber");
            return (Criteria) this;
        }

        public Criteria andPutNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("put_number not between", value1, value2, "putNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIsNull() {
            addCriterion("output_number is null");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIsNotNull() {
            addCriterion("output_number is not null");
            return (Criteria) this;
        }

        public Criteria andOutputNumberEqualTo(Integer value) {
            addCriterion("output_number =", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotEqualTo(Integer value) {
            addCriterion("output_number <>", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberGreaterThan(Integer value) {
            addCriterion("output_number >", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("output_number >=", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberLessThan(Integer value) {
            addCriterion("output_number <", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberLessThanOrEqualTo(Integer value) {
            addCriterion("output_number <=", value, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberIn(List<Integer> values) {
            addCriterion("output_number in", values, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotIn(List<Integer> values) {
            addCriterion("output_number not in", values, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberBetween(Integer value1, Integer value2) {
            addCriterion("output_number between", value1, value2, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andOutputNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("output_number not between", value1, value2, "outputNumber");
            return (Criteria) this;
        }

        public Criteria andAccumulationIsNull() {
            addCriterion("accumulation is null");
            return (Criteria) this;
        }

        public Criteria andAccumulationIsNotNull() {
            addCriterion("accumulation is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulationEqualTo(Integer value) {
            addCriterion("accumulation =", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationNotEqualTo(Integer value) {
            addCriterion("accumulation <>", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationGreaterThan(Integer value) {
            addCriterion("accumulation >", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationGreaterThanOrEqualTo(Integer value) {
            addCriterion("accumulation >=", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationLessThan(Integer value) {
            addCriterion("accumulation <", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationLessThanOrEqualTo(Integer value) {
            addCriterion("accumulation <=", value, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationIn(List<Integer> values) {
            addCriterion("accumulation in", values, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationNotIn(List<Integer> values) {
            addCriterion("accumulation not in", values, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationBetween(Integer value1, Integer value2) {
            addCriterion("accumulation between", value1, value2, "accumulation");
            return (Criteria) this;
        }

        public Criteria andAccumulationNotBetween(Integer value1, Integer value2) {
            addCriterion("accumulation not between", value1, value2, "accumulation");
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