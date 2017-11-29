package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Course", schema = "dbo", catalog = "BJ20140915")
public class BsCourse {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sDeptCode;
    private String sName;
    private String sDescription;
    private String sMemo;
    private boolean bValid;
    private Integer nAudit;
    private Timestamp dtModify;
    private String sCourseEngLishName;

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
    @Column(name = "sDeptCode", nullable = true, length = 20)
    public String getsDeptCode() {
        return sDeptCode;
    }

    public void setsDeptCode(String sDeptCode) {
        this.sDeptCode = sDeptCode;
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
    @Column(name = "bValid", nullable = false)
    public boolean isbValid() {
        return bValid;
    }

    public void setbValid(boolean bValid) {
        this.bValid = bValid;
    }

    @Basic
    @Column(name = "nAudit", nullable = true)
    public Integer getnAudit() {
        return nAudit;
    }

    public void setnAudit(Integer nAudit) {
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
    @Column(name = "sCourseEngLishName", nullable = true, length = 200)
    public String getsCourseEngLishName() {
        return sCourseEngLishName;
    }

    public void setsCourseEngLishName(String sCourseEngLishName) {
        this.sCourseEngLishName = sCourseEngLishName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsCourse bsCourse = (BsCourse) o;

        if (id != bsCourse.id) return false;
        if (nSchoolId != bsCourse.nSchoolId) return false;
        if (bValid != bsCourse.bValid) return false;
        if (sCode != null ? !sCode.equals(bsCourse.sCode) : bsCourse.sCode != null) return false;
        if (sDeptCode != null ? !sDeptCode.equals(bsCourse.sDeptCode) : bsCourse.sDeptCode != null) return false;
        if (sName != null ? !sName.equals(bsCourse.sName) : bsCourse.sName != null) return false;
        if (sDescription != null ? !sDescription.equals(bsCourse.sDescription) : bsCourse.sDescription != null)
            return false;
        if (sMemo != null ? !sMemo.equals(bsCourse.sMemo) : bsCourse.sMemo != null) return false;
        if (nAudit != null ? !nAudit.equals(bsCourse.nAudit) : bsCourse.nAudit != null) return false;
        if (dtModify != null ? !dtModify.equals(bsCourse.dtModify) : bsCourse.dtModify != null) return false;
        if (sCourseEngLishName != null ? !sCourseEngLishName.equals(bsCourse.sCourseEngLishName) : bsCourse.sCourseEngLishName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sDeptCode != null ? sDeptCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + (nAudit != null ? nAudit.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sCourseEngLishName != null ? sCourseEngLishName.hashCode() : 0);
        return result;
    }
}
