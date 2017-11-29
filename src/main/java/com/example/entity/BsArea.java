package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Area", schema = "dbo", catalog = "BJ20140915")
public class BsArea {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sName;
    private String sLongName;
    private String sDescription;
    private String sPostCode;
    private String sRoute;
    private String sAddress;
    private String sMemo;
    private boolean bValid;
    private int nAudit;
    private Timestamp dtModify;
    private String sEnglishAreaName;
    private Double nGrossArea;
    private String sMainAreaCode;
    private Boolean bAccommodationBase;
    private Boolean bTemproray;
    private Boolean bFormal;
    private Double nOtherArea;
    private Double nWorkIndoorArea;
    private Double nTeachIndoorArea;
    private Double nPoolRatio;
    private Double nTeachArea;
    private Double nWorkArea;
    private String sOperatorCode;
    private String sAuditCode;
    private Timestamp dtAuditDate;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nSchoolId", nullable = false)
    public int getnSchoolId() {
        return nSchoolId;
    }

    public void setnSchoolId(int nSchoolId) {
        this.nSchoolId = nSchoolId;
    }

    @Basic
    @Column(name = "sCode", nullable = true, length = 30)
    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    @Basic
    @Column(name = "sName", nullable = true, length = 200)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "sLongName", nullable = true, length = 50)
    public String getsLongName() {
        return sLongName;
    }

    public void setsLongName(String sLongName) {
        this.sLongName = sLongName;
    }

    @Basic
    @Column(name = "sDescription", nullable = true, length = 200)
    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    @Basic
    @Column(name = "sPostCode", nullable = true, length = 10)
    public String getsPostCode() {
        return sPostCode;
    }

    public void setsPostCode(String sPostCode) {
        this.sPostCode = sPostCode;
    }

    @Basic
    @Column(name = "sRoute", nullable = true, length = 1000)
    public String getsRoute() {
        return sRoute;
    }

    public void setsRoute(String sRoute) {
        this.sRoute = sRoute;
    }

    @Basic
    @Column(name = "sAddress", nullable = true, length = 500)
    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    @Basic
    @Column(name = "sMemo", nullable = true, length = 200)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    @Basic
    @Column(name = "bValid", nullable = false)
    public boolean isbValid() {
        return bValid;
    }

    public void setbValid(boolean bValid) {
        this.bValid = bValid;
    }

    @Basic
    @Column(name = "nAudit", nullable = false)
    public int getnAudit() {
        return nAudit;
    }

    public void setnAudit(int nAudit) {
        this.nAudit = nAudit;
    }

    @Basic
    @Column(name = "dtModify", nullable = true)
    public Timestamp getDtModify() {
        return dtModify;
    }

    public void setDtModify(Timestamp dtModify) {
        this.dtModify = dtModify;
    }

    @Basic
    @Column(name = "sEnglishAreaName", nullable = true, length = 200)
    public String getsEnglishAreaName() {
        return sEnglishAreaName;
    }

    public void setsEnglishAreaName(String sEnglishAreaName) {
        this.sEnglishAreaName = sEnglishAreaName;
    }

    @Basic
    @Column(name = "nGrossArea", nullable = true, precision = 0)
    public Double getnGrossArea() {
        return nGrossArea;
    }

    public void setnGrossArea(Double nGrossArea) {
        this.nGrossArea = nGrossArea;
    }

    @Basic
    @Column(name = "sMainAreaCode", nullable = true, length = 50)
    public String getsMainAreaCode() {
        return sMainAreaCode;
    }

    public void setsMainAreaCode(String sMainAreaCode) {
        this.sMainAreaCode = sMainAreaCode;
    }

    @Basic
    @Column(name = "bAccommodationBase", nullable = true)
    public Boolean getbAccommodationBase() {
        return bAccommodationBase;
    }

    public void setbAccommodationBase(Boolean bAccommodationBase) {
        this.bAccommodationBase = bAccommodationBase;
    }

    @Basic
    @Column(name = "bTemproray", nullable = true)
    public Boolean getbTemproray() {
        return bTemproray;
    }

    public void setbTemproray(Boolean bTemproray) {
        this.bTemproray = bTemproray;
    }

    @Basic
    @Column(name = "bFormal", nullable = true)
    public Boolean getbFormal() {
        return bFormal;
    }

    public void setbFormal(Boolean bFormal) {
        this.bFormal = bFormal;
    }

    @Basic
    @Column(name = "nOtherArea", nullable = true, precision = 0)
    public Double getnOtherArea() {
        return nOtherArea;
    }

    public void setnOtherArea(Double nOtherArea) {
        this.nOtherArea = nOtherArea;
    }

    @Basic
    @Column(name = "nWorkIndoorArea", nullable = true, precision = 0)
    public Double getnWorkIndoorArea() {
        return nWorkIndoorArea;
    }

    public void setnWorkIndoorArea(Double nWorkIndoorArea) {
        this.nWorkIndoorArea = nWorkIndoorArea;
    }

    @Basic
    @Column(name = "nTeachIndoorArea", nullable = true, precision = 0)
    public Double getnTeachIndoorArea() {
        return nTeachIndoorArea;
    }

    public void setnTeachIndoorArea(Double nTeachIndoorArea) {
        this.nTeachIndoorArea = nTeachIndoorArea;
    }

    @Basic
    @Column(name = "nPoolRatio", nullable = true, precision = 0)
    public Double getnPoolRatio() {
        return nPoolRatio;
    }

    public void setnPoolRatio(Double nPoolRatio) {
        this.nPoolRatio = nPoolRatio;
    }

    @Basic
    @Column(name = "nTeachArea", nullable = true, precision = 0)
    public Double getnTeachArea() {
        return nTeachArea;
    }

    public void setnTeachArea(Double nTeachArea) {
        this.nTeachArea = nTeachArea;
    }

    @Basic
    @Column(name = "nWorkArea", nullable = true, precision = 0)
    public Double getnWorkArea() {
        return nWorkArea;
    }

    public void setnWorkArea(Double nWorkArea) {
        this.nWorkArea = nWorkArea;
    }

    @Basic
    @Column(name = "sOperatorCode", nullable = true, length = 50)
    public String getsOperatorCode() {
        return sOperatorCode;
    }

    public void setsOperatorCode(String sOperatorCode) {
        this.sOperatorCode = sOperatorCode;
    }

    @Basic
    @Column(name = "sAuditCode", nullable = true, length = 50)
    public String getsAuditCode() {
        return sAuditCode;
    }

    public void setsAuditCode(String sAuditCode) {
        this.sAuditCode = sAuditCode;
    }

    @Basic
    @Column(name = "dtAuditDate", nullable = true)
    public Timestamp getDtAuditDate() {
        return dtAuditDate;
    }

    public void setDtAuditDate(Timestamp dtAuditDate) {
        this.dtAuditDate = dtAuditDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsArea bsArea = (BsArea) o;

        if (id != bsArea.id) return false;
        if (nSchoolId != bsArea.nSchoolId) return false;
        if (bValid != bsArea.bValid) return false;
        if (nAudit != bsArea.nAudit) return false;
        if (sCode != null ? !sCode.equals(bsArea.sCode) : bsArea.sCode != null) return false;
        if (sName != null ? !sName.equals(bsArea.sName) : bsArea.sName != null) return false;
        if (sLongName != null ? !sLongName.equals(bsArea.sLongName) : bsArea.sLongName != null) return false;
        if (sDescription != null ? !sDescription.equals(bsArea.sDescription) : bsArea.sDescription != null)
            return false;
        if (sPostCode != null ? !sPostCode.equals(bsArea.sPostCode) : bsArea.sPostCode != null) return false;
        if (sRoute != null ? !sRoute.equals(bsArea.sRoute) : bsArea.sRoute != null) return false;
        if (sAddress != null ? !sAddress.equals(bsArea.sAddress) : bsArea.sAddress != null) return false;
        if (sMemo != null ? !sMemo.equals(bsArea.sMemo) : bsArea.sMemo != null) return false;
        if (dtModify != null ? !dtModify.equals(bsArea.dtModify) : bsArea.dtModify != null) return false;
        if (sEnglishAreaName != null ? !sEnglishAreaName.equals(bsArea.sEnglishAreaName) : bsArea.sEnglishAreaName != null)
            return false;
        if (nGrossArea != null ? !nGrossArea.equals(bsArea.nGrossArea) : bsArea.nGrossArea != null) return false;
        if (sMainAreaCode != null ? !sMainAreaCode.equals(bsArea.sMainAreaCode) : bsArea.sMainAreaCode != null)
            return false;
        if (bAccommodationBase != null ? !bAccommodationBase.equals(bsArea.bAccommodationBase) : bsArea.bAccommodationBase != null)
            return false;
        if (bTemproray != null ? !bTemproray.equals(bsArea.bTemproray) : bsArea.bTemproray != null) return false;
        if (bFormal != null ? !bFormal.equals(bsArea.bFormal) : bsArea.bFormal != null) return false;
        if (nOtherArea != null ? !nOtherArea.equals(bsArea.nOtherArea) : bsArea.nOtherArea != null) return false;
        if (nWorkIndoorArea != null ? !nWorkIndoorArea.equals(bsArea.nWorkIndoorArea) : bsArea.nWorkIndoorArea != null)
            return false;
        if (nTeachIndoorArea != null ? !nTeachIndoorArea.equals(bsArea.nTeachIndoorArea) : bsArea.nTeachIndoorArea != null)
            return false;
        if (nPoolRatio != null ? !nPoolRatio.equals(bsArea.nPoolRatio) : bsArea.nPoolRatio != null) return false;
        if (nTeachArea != null ? !nTeachArea.equals(bsArea.nTeachArea) : bsArea.nTeachArea != null) return false;
        if (nWorkArea != null ? !nWorkArea.equals(bsArea.nWorkArea) : bsArea.nWorkArea != null) return false;
        if (sOperatorCode != null ? !sOperatorCode.equals(bsArea.sOperatorCode) : bsArea.sOperatorCode != null)
            return false;
        if (sAuditCode != null ? !sAuditCode.equals(bsArea.sAuditCode) : bsArea.sAuditCode != null) return false;
        if (dtAuditDate != null ? !dtAuditDate.equals(bsArea.dtAuditDate) : bsArea.dtAuditDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sLongName != null ? sLongName.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (sPostCode != null ? sPostCode.hashCode() : 0);
        result = 31 * result + (sRoute != null ? sRoute.hashCode() : 0);
        result = 31 * result + (sAddress != null ? sAddress.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + nAudit;
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sEnglishAreaName != null ? sEnglishAreaName.hashCode() : 0);
        result = 31 * result + (nGrossArea != null ? nGrossArea.hashCode() : 0);
        result = 31 * result + (sMainAreaCode != null ? sMainAreaCode.hashCode() : 0);
        result = 31 * result + (bAccommodationBase != null ? bAccommodationBase.hashCode() : 0);
        result = 31 * result + (bTemproray != null ? bTemproray.hashCode() : 0);
        result = 31 * result + (bFormal != null ? bFormal.hashCode() : 0);
        result = 31 * result + (nOtherArea != null ? nOtherArea.hashCode() : 0);
        result = 31 * result + (nWorkIndoorArea != null ? nWorkIndoorArea.hashCode() : 0);
        result = 31 * result + (nTeachIndoorArea != null ? nTeachIndoorArea.hashCode() : 0);
        result = 31 * result + (nPoolRatio != null ? nPoolRatio.hashCode() : 0);
        result = 31 * result + (nTeachArea != null ? nTeachArea.hashCode() : 0);
        result = 31 * result + (nWorkArea != null ? nWorkArea.hashCode() : 0);
        result = 31 * result + (sOperatorCode != null ? sOperatorCode.hashCode() : 0);
        result = 31 * result + (sAuditCode != null ? sAuditCode.hashCode() : 0);
        result = 31 * result + (dtAuditDate != null ? dtAuditDate.hashCode() : 0);
        return result;
    }
}
