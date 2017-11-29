package com.example.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_ClassType", schema = "dbo", catalog = "BJ20140915")
public class BsClassType {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sFCode;
    private String sName;
    private String sProjectCode;
    private String sDescription;
    private String sMemo;
    private int nAudit;
    private int nSystemTag;
    private Timestamp dtModify;
    private Date dtEndDate;

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
    @Column(name = "sCode", nullable = false, length = 30)
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
    @Column(name = "sName", nullable = true, length = 100)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "sProjectCode", nullable = false, length = 20)
    public String getsProjectCode() {
        return sProjectCode;
    }

    public void setsProjectCode(String sProjectCode) {
        this.sProjectCode = sProjectCode;
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
    @Column(name = "sMemo", nullable = true, length = 200)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
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
    @Column(name = "nSystemTag", nullable = false)
    public int getnSystemTag() {
        return nSystemTag;
    }

    public void setnSystemTag(int nSystemTag) {
        this.nSystemTag = nSystemTag;
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
    @Column(name = "dtEndDate", nullable = true)
    public Date getDtEndDate() {
        return dtEndDate;
    }

    public void setDtEndDate(Date dtEndDate) {
        this.dtEndDate = dtEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsClassType that = (BsClassType) o;

        if (id != that.id) return false;
        if (nSchoolId != that.nSchoolId) return false;
        if (nAudit != that.nAudit) return false;
        if (nSystemTag != that.nSystemTag) return false;
        if (sCode != null ? !sCode.equals(that.sCode) : that.sCode != null) return false;
        if (sFCode != null ? !sFCode.equals(that.sFCode) : that.sFCode != null) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;
        if (sProjectCode != null ? !sProjectCode.equals(that.sProjectCode) : that.sProjectCode != null) return false;
        if (sDescription != null ? !sDescription.equals(that.sDescription) : that.sDescription != null) return false;
        if (sMemo != null ? !sMemo.equals(that.sMemo) : that.sMemo != null) return false;
        if (dtModify != null ? !dtModify.equals(that.dtModify) : that.dtModify != null) return false;
        if (dtEndDate != null ? !dtEndDate.equals(that.dtEndDate) : that.dtEndDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sFCode != null ? sFCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sProjectCode != null ? sProjectCode.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + nAudit;
        result = 31 * result + nSystemTag;
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (dtEndDate != null ? dtEndDate.hashCode() : 0);
        return result;
    }
}
