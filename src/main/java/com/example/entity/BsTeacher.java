package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "BS_Teacher", schema = "dbo", catalog = "BJ20140915")
public class BsTeacher {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sName;
    private Integer nDegree;
    private String sDeptCode;
    private String sMajor;
    private String sIdCard;
    private String sPhone;
    private String sEmail;
    private Timestamp dtJoinDate;
    private Timestamp dtBirthday;
    private Integer nType;
    private String sMemo;
    private Timestamp dtOutDate;
    private boolean bValid;
    private byte[] oImage;
    private int nAudit;
    private String sEmployeeId;
    private Integer nFeeCycle;
    private Timestamp dtModify;
    private String sEhrName;
    private String sEhrDeptCode;
    private String sPassWord;
    private Integer nCredentialType;
    private Boolean bRowClass;

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
    @Column(name = "sName", nullable = true, length = 100)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "nDegree", nullable = true)
    public Integer getnDegree() {
        return nDegree;
    }

    public void setnDegree(Integer nDegree) {
        this.nDegree = nDegree;
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
    @Column(name = "sMajor", nullable = true, length = 200)
    public String getsMajor() {
        return sMajor;
    }

    public void setsMajor(String sMajor) {
        this.sMajor = sMajor;
    }

    @Basic
    @Column(name = "sIdCard", nullable = true, length = 30)
    public String getsIdCard() {
        return sIdCard;
    }

    public void setsIdCard(String sIdCard) {
        this.sIdCard = sIdCard;
    }

    @Basic
    @Column(name = "sPhone", nullable = true, length = 30)
    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    @Basic
    @Column(name = "sEmail", nullable = false, length = 50)
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    @Basic
    @Column(name = "dtJoinDate", nullable = true)
    public Timestamp getDtJoinDate() {
        return dtJoinDate;
    }

    public void setDtJoinDate(Timestamp dtJoinDate) {
        this.dtJoinDate = dtJoinDate;
    }

    @Basic
    @Column(name = "dtBirthday", nullable = true)
    public Timestamp getDtBirthday() {
        return dtBirthday;
    }

    public void setDtBirthday(Timestamp dtBirthday) {
        this.dtBirthday = dtBirthday;
    }

    @Basic
    @Column(name = "nType", nullable = true)
    public Integer getnType() {
        return nType;
    }

    public void setnType(Integer nType) {
        this.nType = nType;
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
    @Column(name = "dtOutDate", nullable = true)
    public Timestamp getDtOutDate() {
        return dtOutDate;
    }

    public void setDtOutDate(Timestamp dtOutDate) {
        this.dtOutDate = dtOutDate;
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
    @Column(name = "oImage", nullable = true)
    public byte[] getoImage() {
        return oImage;
    }

    public void setoImage(byte[] oImage) {
        this.oImage = oImage;
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
    @Column(name = "sEmployeeID", nullable = true, length = 100)
    public String getsEmployeeId() {
        return sEmployeeId;
    }

    public void setsEmployeeId(String sEmployeeId) {
        this.sEmployeeId = sEmployeeId;
    }

    @Basic
    @Column(name = "nFeeCycle", nullable = true)
    public Integer getnFeeCycle() {
        return nFeeCycle;
    }

    public void setnFeeCycle(Integer nFeeCycle) {
        this.nFeeCycle = nFeeCycle;
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
    @Column(name = "sEhrName", nullable = true, length = 200)
    public String getsEhrName() {
        return sEhrName;
    }

    public void setsEhrName(String sEhrName) {
        this.sEhrName = sEhrName;
    }

    @Basic
    @Column(name = "sEhrDeptCode", nullable = true, length = 50)
    public String getsEhrDeptCode() {
        return sEhrDeptCode;
    }

    public void setsEhrDeptCode(String sEhrDeptCode) {
        this.sEhrDeptCode = sEhrDeptCode;
    }

    @Basic
    @Column(name = "sPassWord", nullable = true, length = 100)
    public String getsPassWord() {
        return sPassWord;
    }

    public void setsPassWord(String sPassWord) {
        this.sPassWord = sPassWord;
    }

    @Basic
    @Column(name = "nCredentialType", nullable = true)
    public Integer getnCredentialType() {
        return nCredentialType;
    }

    public void setnCredentialType(Integer nCredentialType) {
        this.nCredentialType = nCredentialType;
    }

    @Basic
    @Column(name = "bRowClass", nullable = true)
    public Boolean getbRowClass() {
        return bRowClass;
    }

    public void setbRowClass(Boolean bRowClass) {
        this.bRowClass = bRowClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsTeacher bsTeacher = (BsTeacher) o;

        if (id != bsTeacher.id) return false;
        if (nSchoolId != bsTeacher.nSchoolId) return false;
        if (bValid != bsTeacher.bValid) return false;
        if (nAudit != bsTeacher.nAudit) return false;
        if (sCode != null ? !sCode.equals(bsTeacher.sCode) : bsTeacher.sCode != null) return false;
        if (sName != null ? !sName.equals(bsTeacher.sName) : bsTeacher.sName != null) return false;
        if (nDegree != null ? !nDegree.equals(bsTeacher.nDegree) : bsTeacher.nDegree != null) return false;
        if (sDeptCode != null ? !sDeptCode.equals(bsTeacher.sDeptCode) : bsTeacher.sDeptCode != null) return false;
        if (sMajor != null ? !sMajor.equals(bsTeacher.sMajor) : bsTeacher.sMajor != null) return false;
        if (sIdCard != null ? !sIdCard.equals(bsTeacher.sIdCard) : bsTeacher.sIdCard != null) return false;
        if (sPhone != null ? !sPhone.equals(bsTeacher.sPhone) : bsTeacher.sPhone != null) return false;
        if (sEmail != null ? !sEmail.equals(bsTeacher.sEmail) : bsTeacher.sEmail != null) return false;
        if (dtJoinDate != null ? !dtJoinDate.equals(bsTeacher.dtJoinDate) : bsTeacher.dtJoinDate != null) return false;
        if (dtBirthday != null ? !dtBirthday.equals(bsTeacher.dtBirthday) : bsTeacher.dtBirthday != null) return false;
        if (nType != null ? !nType.equals(bsTeacher.nType) : bsTeacher.nType != null) return false;
        if (sMemo != null ? !sMemo.equals(bsTeacher.sMemo) : bsTeacher.sMemo != null) return false;
        if (dtOutDate != null ? !dtOutDate.equals(bsTeacher.dtOutDate) : bsTeacher.dtOutDate != null) return false;
        if (!Arrays.equals(oImage, bsTeacher.oImage)) return false;
        if (sEmployeeId != null ? !sEmployeeId.equals(bsTeacher.sEmployeeId) : bsTeacher.sEmployeeId != null)
            return false;
        if (nFeeCycle != null ? !nFeeCycle.equals(bsTeacher.nFeeCycle) : bsTeacher.nFeeCycle != null) return false;
        if (dtModify != null ? !dtModify.equals(bsTeacher.dtModify) : bsTeacher.dtModify != null) return false;
        if (sEhrName != null ? !sEhrName.equals(bsTeacher.sEhrName) : bsTeacher.sEhrName != null) return false;
        if (sEhrDeptCode != null ? !sEhrDeptCode.equals(bsTeacher.sEhrDeptCode) : bsTeacher.sEhrDeptCode != null)
            return false;
        if (sPassWord != null ? !sPassWord.equals(bsTeacher.sPassWord) : bsTeacher.sPassWord != null) return false;
        if (nCredentialType != null ? !nCredentialType.equals(bsTeacher.nCredentialType) : bsTeacher.nCredentialType != null)
            return false;
        if (bRowClass != null ? !bRowClass.equals(bsTeacher.bRowClass) : bsTeacher.bRowClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (nDegree != null ? nDegree.hashCode() : 0);
        result = 31 * result + (sDeptCode != null ? sDeptCode.hashCode() : 0);
        result = 31 * result + (sMajor != null ? sMajor.hashCode() : 0);
        result = 31 * result + (sIdCard != null ? sIdCard.hashCode() : 0);
        result = 31 * result + (sPhone != null ? sPhone.hashCode() : 0);
        result = 31 * result + (sEmail != null ? sEmail.hashCode() : 0);
        result = 31 * result + (dtJoinDate != null ? dtJoinDate.hashCode() : 0);
        result = 31 * result + (dtBirthday != null ? dtBirthday.hashCode() : 0);
        result = 31 * result + (nType != null ? nType.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (dtOutDate != null ? dtOutDate.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + Arrays.hashCode(oImage);
        result = 31 * result + nAudit;
        result = 31 * result + (sEmployeeId != null ? sEmployeeId.hashCode() : 0);
        result = 31 * result + (nFeeCycle != null ? nFeeCycle.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sEhrName != null ? sEhrName.hashCode() : 0);
        result = 31 * result + (sEhrDeptCode != null ? sEhrDeptCode.hashCode() : 0);
        result = 31 * result + (sPassWord != null ? sPassWord.hashCode() : 0);
        result = 31 * result + (nCredentialType != null ? nCredentialType.hashCode() : 0);
        result = 31 * result + (bRowClass != null ? bRowClass.hashCode() : 0);
        return result;
    }
}
