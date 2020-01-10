package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;
import java.math.BigDecimal;

public class WfFinished  extends PagePoJo implements Serializable {
    private Integer pkFinished;

    private Integer pkDipProduction;

    private String serial;

    private String process;

    private Integer qcNumber;

    private Integer passNumber;

    private BigDecimal passRate;

    private Integer putNumber;

    private Integer outputNumber;

    private Integer accumulation;

    private String filename;

    private String filefullnam;

    private Integer finState;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfFinished(Integer pkFinished, Integer pkDipProduction, String serial, String process, Integer qcNumber, Integer passNumber, BigDecimal passRate, Integer putNumber, Integer outputNumber, Integer accumulation, String filename, String filefullnam, Integer finState, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkFinished = pkFinished;
        this.pkDipProduction = pkDipProduction;
        this.serial = serial;
        this.process = process;
        this.qcNumber = qcNumber;
        this.passNumber = passNumber;
        this.passRate = passRate;
        this.putNumber = putNumber;
        this.outputNumber = outputNumber;
        this.accumulation = accumulation;
        this.filename = filename;
        this.filefullnam = filefullnam;
        this.finState = finState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfFinished() {
        super();
    }

    public Integer getPkFinished() {
        return pkFinished;
    }

    public void setPkFinished(Integer pkFinished) {
        this.pkFinished = pkFinished;
    }

    public Integer getPkDipProduction() {
        return pkDipProduction;
    }

    public void setPkDipProduction(Integer pkDipProduction) {
        this.pkDipProduction = pkDipProduction;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial == null ? null : serial.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Integer getQcNumber() {
        return qcNumber;
    }

    public void setQcNumber(Integer qcNumber) {
        this.qcNumber = qcNumber;
    }

    public Integer getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(Integer passNumber) {
        this.passNumber = passNumber;
    }

    public BigDecimal getPassRate() {
        return passRate;
    }

    public void setPassRate(BigDecimal passRate) {
        this.passRate = passRate;
    }

    public Integer getPutNumber() {
        return putNumber;
    }

    public void setPutNumber(Integer putNumber) {
        this.putNumber = putNumber;
    }

    public Integer getOutputNumber() {
        return outputNumber;
    }

    public void setOutputNumber(Integer outputNumber) {
        this.outputNumber = outputNumber;
    }

    public Integer getAccumulation() {
        return accumulation;
    }

    public void setAccumulation(Integer accumulation) {
        this.accumulation = accumulation;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilefullnam() {
        return filefullnam;
    }

    public void setFilefullnam(String filefullnam) {
        this.filefullnam = filefullnam == null ? null : filefullnam.trim();
    }

    public Integer getfinState() {
        return finState;
    }

    public void setfinState(Integer finState) {
        this.finState = finState;
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