package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfProduction extends PagePoJo implements Serializable {
    private Integer pkProduction;

    private Integer pkProduct;

    private String process;

    private String workshop;

    private String estimatedStartTime;

    private String estimatedEndTime;

    private String actualStartTime;

    private String actualEndTime;

    private Integer estimatedNumber;

    private Integer actualNumber;

    private Integer wfState;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfProduction(Integer pkProduction, Integer pkProduct, String process, String workshop, String estimatedStartTime, String estimatedEndTime, String actualStartTime, String actualEndTime, Integer estimatedNumber, Integer actualNumber, Integer wfState, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkProduction = pkProduction;
        this.pkProduct = pkProduct;
        this.process = process;
        this.workshop = workshop;
        this.estimatedStartTime = estimatedStartTime;
        this.estimatedEndTime = estimatedEndTime;
        this.actualStartTime = actualStartTime;
        this.actualEndTime = actualEndTime;
        this.estimatedNumber = estimatedNumber;
        this.actualNumber = actualNumber;
        this.wfState = wfState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfProduction() {
        super();
    }

    public Integer getPkProduction() {
        return pkProduction;
    }

    public void setPkProduction(Integer pkProduction) {
        this.pkProduction = pkProduction;
    }

    public Integer getPkProduct() {
        return pkProduct;
    }

    public void setPkProduct(Integer pkProduct) {
        this.pkProduct = pkProduct;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getWorkshop() {
        return workshop;
    }

    public void setWorkshop(String workshop) {
        this.workshop = workshop == null ? null : workshop.trim();
    }

    public String getEstimatedStartTime() {
        return estimatedStartTime;
    }

    public void setEstimatedStartTime(String estimatedStartTime) {
        this.estimatedStartTime = estimatedStartTime == null ? null : estimatedStartTime.trim();
    }

    public String getEstimatedEndTime() {
        return estimatedEndTime;
    }

    public void setEstimatedEndTime(String estimatedEndTime) {
        this.estimatedEndTime = estimatedEndTime == null ? null : estimatedEndTime.trim();
    }

    public String getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime == null ? null : actualStartTime.trim();
    }

    public String getActualEndTime() {
        return actualEndTime;
    }

    public void setActualEndTime(String actualEndTime) {
        this.actualEndTime = actualEndTime == null ? null : actualEndTime.trim();
    }

    public Integer getEstimatedNumber() {
        return estimatedNumber;
    }

    public void setEstimatedNumber(Integer estimatedNumber) {
        this.estimatedNumber = estimatedNumber;
    }

    public Integer getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(Integer actualNumber) {
        this.actualNumber = actualNumber;
    }

    public Integer getWfState() {
        return wfState;
    }

    public void setWfState(Integer wfState) {
        this.wfState = wfState;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime == null ? null : creationtime.trim();
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifiertime() {
        return modifiertime;
    }

    public void setModifiertime(String modifiertime) {
        this.modifiertime = modifiertime == null ? null : modifiertime.trim();
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr == null ? null : dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}