package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfDipProduction extends PagePoJo implements Serializable {
    private Integer pkDipProduction;

    private Integer pkSmtProduction;

    private String process;

    private Integer dipState;

    private String pickingtime;

    private String starttime;

    private String finishtime;

    private String numbertime;

    private Integer completionNumber;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfDipProduction(Integer pkDipProduction, Integer pkSmtProduction, String process, Integer dipState, String pickingtime, String starttime, String finishtime, String numbertime, Integer completionNumber, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkDipProduction = pkDipProduction;
        this.pkSmtProduction = pkSmtProduction;
        this.process = process;
        this.dipState = dipState;
        this.pickingtime = pickingtime;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.numbertime = numbertime;
        this.completionNumber = completionNumber;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfDipProduction() {
        super();
    }

    public Integer getPkDipProduction() {
        return pkDipProduction;
    }

    public void setPkDipProduction(Integer pkDipProduction) {
        this.pkDipProduction = pkDipProduction;
    }

    public Integer getPkSmtProduction() {
        return pkSmtProduction;
    }

    public void setPkSmtProduction(Integer pkSmtProduction) {
        this.pkSmtProduction = pkSmtProduction;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Integer getDipState() {
        return dipState;
    }

    public void setDipState(Integer dipState) {
        this.dipState = dipState;
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