package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfProcurement extends PagePoJo implements Serializable {
    private Integer pkProcurement;

    private Integer pkWarehouse;

    private String process;

    private Integer prState;

    private String estimatedFinishTime;

    private String actualFinishTime;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfProcurement(Integer pkProcurement, Integer pkWarehouse, String process, Integer prState, String estimatedFinishTime, String actualFinishTime, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkProcurement = pkProcurement;
        this.pkWarehouse = pkWarehouse;
        this.process = process;
        this.prState = prState;
        this.estimatedFinishTime = estimatedFinishTime;
        this.actualFinishTime = actualFinishTime;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfProcurement() {
        super();
    }

    public Integer getPkProcurement() {
        return pkProcurement;
    }

    public void setPkProcurement(Integer pkProcurement) {
        this.pkProcurement = pkProcurement;
    }

    public Integer getPkWarehouse() {
        return pkWarehouse;
    }

    public void setPkWarehouse(Integer pkWarehouse) {
        this.pkWarehouse = pkWarehouse;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Integer getPrState() {
        return prState;
    }

    public void setPrState(Integer prState) {
        this.prState = prState;
    }

    public String getEstimatedFinishTime() {
        return estimatedFinishTime;
    }

    public void setEstimatedFinishTime(String estimatedFinishTime) {
        this.estimatedFinishTime = estimatedFinishTime == null ? null : estimatedFinishTime.trim();
    }

    public String getActualFinishTime() {
        return actualFinishTime;
    }

    public void setActualFinishTime(String actualFinishTime) {
        this.actualFinishTime = actualFinishTime == null ? null : actualFinishTime.trim();
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
        this.dr = dr;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }
}