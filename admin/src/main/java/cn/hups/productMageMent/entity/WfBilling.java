package cn.hups.productMageMent.entity;

import cn.hups.common.po.PagePoJo;

import java.io.Serializable;
import java.math.BigDecimal;

public class WfBilling extends PagePoJo implements Serializable {
    private Integer pkBilling;

    private Integer pkFinished;

    private String invoiceNo;

    private Integer billNumber;

    private BigDecimal billMoney;

    private String filename;

    private String filefullnam;

    private Integer billState;

    private Integer creator;

    private String creationtime;

    private Integer modifier;

    private String modifiertime;

    private Integer dr;

    private String ts;

    private static final long serialVersionUID = 1L;

    public WfBilling(Integer pkBilling, Integer pkFinished, String invoiceNo, Integer billNumber, BigDecimal billMoney, String filename, String filefullnam, Integer billState, Integer creator, String creationtime, Integer modifier, String modifiertime, Integer dr, String ts) {
        this.pkBilling = pkBilling;
        this.pkFinished = pkFinished;
        this.invoiceNo = invoiceNo;
        this.billNumber = billNumber;
        this.billMoney = billMoney;
        this.filename = filename;
        this.filefullnam = filefullnam;
        this.billState = billState;
        this.creator = creator;
        this.creationtime = creationtime;
        this.modifier = modifier;
        this.modifiertime = modifiertime;
        this.dr = dr;
        this.ts = ts;
    }

    public WfBilling() {
        super();
    }

    public Integer getPkBilling() {
        return pkBilling;
    }

    public void setPkBilling(Integer pkBilling) {
        this.pkBilling = pkBilling;
    }

    public Integer getPkFinished() {
        return pkFinished;
    }

    public void setPkFinished(Integer pkFinished) {
        this.pkFinished = pkFinished;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Integer getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Integer billNumber) {
        this.billNumber = billNumber;
    }

    public BigDecimal getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(BigDecimal billMoney) {
        this.billMoney = billMoney;
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

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
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