package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfMaterialQc extends PagePoJo implements Serializable {
    private Integer pkMaterialQc;

    private Integer pkProcuremen;

    private Integer qcState;

    private String qcExplain;

    private String filename;

    private String filefullnam;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfMaterialQc(Integer pkMaterialQc, Integer pkProcuremen, Integer qcState, String qcExplain, String filename, String filefullnam, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkMaterialQc = pkMaterialQc;
        this.pkProcuremen = pkProcuremen;
        this.qcState = qcState;
        this.qcExplain = qcExplain;
        this.filename = filename;
        this.filefullnam = filefullnam;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfMaterialQc() {
        super();
    }

    public Integer getPkMaterialQc() {
        return pkMaterialQc;
    }

    public void setPkMaterialQc(Integer pkMaterialQc) {
        this.pkMaterialQc = pkMaterialQc;
    }

    public Integer getPkProcuremen() {
        return pkProcuremen;
    }

    public void setPkProcuremen(Integer pkProcuremen) {
        this.pkProcuremen = pkProcuremen;
    }

    public Integer getQcState() {
        return qcState;
    }

    public void setQcState(Integer qcState) {
        this.qcState = qcState;
    }

    public String getQcExplain() {
        return qcExplain;
    }

    public void setQcExplain(String qcExplain) {
        this.qcExplain = qcExplain == null ? null : qcExplain.trim();
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