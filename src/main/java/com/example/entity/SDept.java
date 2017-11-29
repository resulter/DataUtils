package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "S_Dept", schema = "dbo", catalog = "BJ20140915")
public class SDept {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sFCode;
    private String sName;
    private String sDescription;
    private boolean bTeachingDept;
    private String sAddress;
    private String sPostCode;
    private String sPhone;
    private String sFax;
    private String sHomePage;
    private String sEmail;
    private Integer nHoliday;
    private String sMemo;
    private boolean bValid;
    private int nAudit;
    private Timestamp dtModify;
    private String sDeptEnglishName;

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
    @Column(name = "sFCode", nullable = true, length = 30)
    public String getsFCode() {
        return sFCode;
    }

    public void setsFCode(String sFCode) {
        this.sFCode = sFCode;
    }

    @Basic
    @Column(name = "sName", nullable = true, length = 30)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
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
    @Column(name = "bTeachingDept", nullable = false)
    public boolean isbTeachingDept() {
        return bTeachingDept;
    }

    public void setbTeachingDept(boolean bTeachingDept) {
        this.bTeachingDept = bTeachingDept;
    }

    @Basic
    @Column(name = "sAddress", nullable = true, length = 100)
    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
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
    @Column(name = "sPhone", nullable = true, length = 100)
    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    @Basic
    @Column(name = "sFax", nullable = true, length = 100)
    public String getsFax() {
        return sFax;
    }

    public void setsFax(String sFax) {
        this.sFax = sFax;
    }

    @Basic
    @Column(name = "sHomePage", nullable = true, length = 100)
    public String getsHomePage() {
        return sHomePage;
    }

    public void setsHomePage(String sHomePage) {
        this.sHomePage = sHomePage;
    }

    @Basic
    @Column(name = "sEmail", nullable = true, length = 100)
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    @Basic
    @Column(name = "nHoliday", nullable = true)
    public Integer getnHoliday() {
        return nHoliday;
    }

    public void setnHoliday(Integer nHoliday) {
        this.nHoliday = nHoliday;
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
    @Column(name = "sDeptEnglishName", nullable = true, length = 30)
    public String getsDeptEnglishName() {
        return sDeptEnglishName;
    }

    public void setsDeptEnglishName(String sDeptEnglishName) {
        this.sDeptEnglishName = sDeptEnglishName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SDept sDept = (SDept) o;

        if (id != sDept.id) return false;
        if (nSchoolId != sDept.nSchoolId) return false;
        if (bTeachingDept != sDept.bTeachingDept) return false;
        if (bValid != sDept.bValid) return false;
        if (nAudit != sDept.nAudit) return false;
        if (sCode != null ? !sCode.equals(sDept.sCode) : sDept.sCode != null) return false;
        if (sFCode != null ? !sFCode.equals(sDept.sFCode) : sDept.sFCode != null) return false;
        if (sName != null ? !sName.equals(sDept.sName) : sDept.sName != null) return false;
        if (sDescription != null ? !sDescription.equals(sDept.sDescription) : sDept.sDescription != null) return false;
        if (sAddress != null ? !sAddress.equals(sDept.sAddress) : sDept.sAddress != null) return false;
        if (sPostCode != null ? !sPostCode.equals(sDept.sPostCode) : sDept.sPostCode != null) return false;
        if (sPhone != null ? !sPhone.equals(sDept.sPhone) : sDept.sPhone != null) return false;
        if (sFax != null ? !sFax.equals(sDept.sFax) : sDept.sFax != null) return false;
        if (sHomePage != null ? !sHomePage.equals(sDept.sHomePage) : sDept.sHomePage != null) return false;
        if (sEmail != null ? !sEmail.equals(sDept.sEmail) : sDept.sEmail != null) return false;
        if (nHoliday != null ? !nHoliday.equals(sDept.nHoliday) : sDept.nHoliday != null) return false;
        if (sMemo != null ? !sMemo.equals(sDept.sMemo) : sDept.sMemo != null) return false;
        if (dtModify != null ? !dtModify.equals(sDept.dtModify) : sDept.dtModify != null) return false;
        if (sDeptEnglishName != null ? !sDeptEnglishName.equals(sDept.sDeptEnglishName) : sDept.sDeptEnglishName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sFCode != null ? sFCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (bTeachingDept ? 1 : 0);
        result = 31 * result + (sAddress != null ? sAddress.hashCode() : 0);
        result = 31 * result + (sPostCode != null ? sPostCode.hashCode() : 0);
        result = 31 * result + (sPhone != null ? sPhone.hashCode() : 0);
        result = 31 * result + (sFax != null ? sFax.hashCode() : 0);
        result = 31 * result + (sHomePage != null ? sHomePage.hashCode() : 0);
        result = 31 * result + (sEmail != null ? sEmail.hashCode() : 0);
        result = 31 * result + (nHoliday != null ? nHoliday.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + nAudit;
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sDeptEnglishName != null ? sDeptEnglishName.hashCode() : 0);
        return result;
    }
}
