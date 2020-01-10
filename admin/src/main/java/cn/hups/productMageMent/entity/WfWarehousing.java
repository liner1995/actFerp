package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfWarehousing extends PagePoJo implements Serializable {
    private Integer pkWarehousing;

    private Integer materialQc;

    private String process;

    private Integer wState;

    private String filefullnam;

    private String filename;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfWarehousing(Integer pkWarehousing, Integer materialQc, String process, Integer wState, String filefullnam, String filename, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkWarehousing = pkWarehousing;
        this.materialQc = materialQc;
        this.process = process;
        this.wState = wState;
        this.filefullnam = filefullnam;
        this.filename = filename;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfWarehousing() {
        super();
    }

    public Integer getPkWarehousing() {
        return pkWarehousing;
    }

    public void setPkWarehousing(Integer pkWarehousing) {
        this.pkWarehousing = pkWarehousing;
    }

    public Integer getMaterialQc() {
        return materialQc;
    }

    public void setMaterialQc(Integer materialQc) {
        this.materialQc = materialQc;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public Integer getwState() {
        return wState;
    }

    public void setwState(Integer wState) {
        this.wState = wState;
    }

    public String getFilefullnam() {
        return filefullnam;
    }

    public void setFilefullnam(String filefullnam) {
        this.filefullnam = filefullnam == null ? null : filefullnam.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
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