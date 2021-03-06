package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;

public class WfWarehouse extends PagePoJo implements Serializable {
    private Integer pkWarehouse;

    private Integer pkProduction;

    private Integer whState;

    private String arrivaltime;

    private String mprAffirmtime;

    private String filename;

    private String filefullnam;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiedtime;

    private Integer onOffState;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfWarehouse(Integer pkWarehouse, Integer onOffState, Integer pkProduction, Integer whState, String arrivaltime, String mprAffirmtime, String filename, String filefullnam, Integer creator, String creationtime, Integer modifier, String modifiedtime, Integer dr, String ts) {
        this.pkWarehouse = pkWarehouse;
        this.pkProduction = pkProduction;
        this.whState = whState;
        this.arrivaltime = arrivaltime;
        this.mprAffirmtime = mprAffirmtime;
        this.filename = filename;
        this.filefullnam = filefullnam;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiedtime = modifiedtime;
        this.onOffState = onOffState;
        this.dr = dr;
        this.ts = ts;
    }

    public Integer getOnOffState() {
        return onOffState;
    }

    public void setOnOffState(Integer onOffState) {
        this.onOffState = onOffState;
    }

    public WfWarehouse() {
        super();
    }

    public Integer getPkWarehouse() {
        return pkWarehouse;
    }

    public void setPkWarehouse(Integer pkWarehouse) {
        this.pkWarehouse = pkWarehouse;
    }

    public Integer getPkProduction() {
        return pkProduction;
    }

    public void setPkProduction(Integer pkProduction) {
        this.pkProduction = pkProduction;
    }

    public Integer getWhState() {
        return whState;
    }

    public void setWhState(Integer whState) {
        this.whState = whState;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime == null ? null : arrivaltime.trim();
    }

    public String getMprAffirmtime() {
        return mprAffirmtime;
    }

    public void setMprAffirmtime(String mprAffirmtime) {
        this.mprAffirmtime = mprAffirmtime == null ? null : mprAffirmtime.trim();
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

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime == null ? null : modifiedtime.trim();
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