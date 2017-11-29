package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Project", schema = "dbo", catalog = "BJ20140915")
public class BsProject {
    private int id;
    private int nSchoolId;
    private String sFCode;
    private String sCode;
    private String sName;
    private String sDeptCode;
    private String sDescription;
    private int nAudit;
    private int nSystemTag;
    private Timestamp dtModify;
    private String sManagementCode;

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
    @Column(name = "sFCode", nullable = true, length = 20)
    public String getsFCode() {
        return sFCode;
    }

    public void setsFCode(String sFCode) {
        this.sFCode = sFCode;
    }

    @Basic
    @Column(name = "sCode", nullable = true, length = 20)
    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    @Basic
    @Column(name = "sName", nullable = true, length = 50)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "sDeptCode", nullable = false, length = 30)
    public String getsDeptCode() {
        return sDeptCode;
    }

    public void setsDeptCode(String sDeptCode) {
        this.sDeptCode = sDeptCode;
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
    @Column(name = "sManagementCode", nullable = true, length = 50)
    public String getsManagementCode() {
        return sManagementCode;
    }

    public void setsManagementCode(String sManagementCode) {
        this.sManagementCode = sManagementCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsProject bsProject = (BsProject) o;

        if (id != bsProject.id) return false;
        if (nSchoolId != bsProject.nSchoolId) return false;
        if (nAudit != bsProject.nAudit) return false;
        if (nSystemTag != bsProject.nSystemTag) return false;
        if (sFCode != null ? !sFCode.equals(bsProject.sFCode) : bsProject.sFCode != null) return false;
        if (sCode != null ? !sCode.equals(bsProject.sCode) : bsProject.sCode != null) return false;
        if (sName != null ? !sName.equals(bsProject.sName) : bsProject.sName != null) return false;
        if (sDeptCode != null ? !sDeptCode.equals(bsProject.sDeptCode) : bsProject.sDeptCode != null) return false;
        if (sDescription != null ? !sDescription.equals(bsProject.sDescription) : bsProject.sDescription != null)
            return false;
        if (dtModify != null ? !dtModify.equals(bsProject.dtModify) : bsProject.dtModify != null) return false;
        if (sManagementCode != null ? !sManagementCode.equals(bsProject.sManagementCode) : bsProject.sManagementCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sFCode != null ? sFCode.hashCode() : 0);
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sDeptCode != null ? sDeptCode.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + nAudit;
        result = 31 * result + nSystemTag;
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sManagementCode != null ? sManagementCode.hashCode() : 0);
        return result;
    }
}
