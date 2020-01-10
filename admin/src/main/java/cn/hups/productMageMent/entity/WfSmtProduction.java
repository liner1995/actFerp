package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfSmtProduction extends PagePoJo implements Serializable {
    private Integer pkSmtProduction;

    private Integer pkWarehousing;

    private String process;

    private Integer smtState;

    private String pickingtime;

    private String starttime;

    private String finishtime;

    private String numbertime;

    private String productionName;

    private Integer completionNumber;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfSmtProduction(Integer pkSmtProduction, Integer pkWarehousing, String process, Integer smtState, String pickingtime, String starttime, String finishtime, String numbertime, String productionName, Integer completionNumber, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkSmtProduction = pkSmtProduction;
        this.pkWarehousing = pkWarehousing;
        this.process = process;
        this.smtState = smtState;
        this.pickingtime = pickingtime;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.numbertime = numbertime;
        this.productionName = productionName;
        this.completionNumber = completionNumber;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfSmtProduction() {
        super();
    }

    public Integer getPkSmtProduction() {
        return pkSmtProduction;
    }

    public void setPkSmtProduction(Integer pkSmtProduction) {
        this.pkSmtProduction = pkSmtProduction;
    }

    public Integer getPkWarehousing() {
        return pkWarehousing;
    }

    public void setPkWarehousing(Integer pkWarehousing) {
        this.pkWarehousing = pkWarehousing;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Integer getSmtState() {
        return smtState;
    }

    public void setSmtState(Integer smtState) {
        this.smtState = smtState;
    }

    public String getPickingtime() {
        return pickingtime;
    }

    public void setPickingtime(String pickingtime) {
        this.pickingtime = pickingtime == null ? null : pickingtime.trim();
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String finishtime) {
        this.finishtime = finishtime == null ? null : finishtime.trim();
    }

    public String getNumbertime() {
        return numbertime;
    }

    public void setNumbertime(String numbertime) {
        this.numbertime = numbertime == null ? null : numbertime.trim();
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName == null ? null : productionName.trim();
    }

    public Integer getCompletionNumber() {
        return completionNumber;
    }

    public void setCompletionNumber(Integer completionNumber) {
        this.completionNumber = completionNumber;
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