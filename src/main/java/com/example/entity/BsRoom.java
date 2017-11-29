package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Room", schema = "dbo", catalog = "BJ20140915")
public class BsRoom {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sAreaCode;
    private String sName;
    private String sDeptCode;
    private String sDescription;
    private String sAddress;
    private String sPostCode;
    private String sRoute;
    private Integer nNormalNum;
    private Integer nMaxNum;
    private Double nArea;
    private Double nAreaPercent;
    private String sAdmin;
    private String sMemo;
    private String sPhone;
    private boolean bValid;
    private int nAudit;
    private Timestamp dtModify;
    private String sRoomEngLishName;
    private Boolean bVipRoom;
    private String sRoomDepts;
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
    @Column(name = "sCode", nullable = false, length = 30)
    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    @Basic
    @Column(name = "sAreaCode", nullable = true, length = 20)
    public String getsAreaCode() {
        return sAreaCode;
    }

    public void setsAreaCode(String sAreaCode) {
        this.sAreaCode = sAreaCode;
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
    @Column(name = "sDeptCode", nullable = true, length = 20)
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
    @Column(name = "sAddress", nullable = true, length = 200)
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
    @Column(name = "sRoute", nullable = true, length = 500)
    public String getsRoute() {
        return sRoute;
    }

    public void setsRoute(String sRoute) {
        this.sRoute = sRoute;
    }

    @Basic
    @Column(name = "nNormalNum", nullable = true)
    public Integer getnNormalNum() {
        return nNormalNum;
    }

    public void setnNormalNum(Integer nNormalNum) {
        this.nNormalNum = nNormalNum;
    }

    @Basic
    @Column(name = "nMaxNum", nullable = true)
    public Integer getnMaxNum() {
        return nMaxNum;
    }

    public void setnMaxNum(Integer nMaxNum) {
        this.nMaxNum = nMaxNum;
    }

    @Basic
    @Column(name = "nArea", nullable = true, precision = 0)
    public Double getnArea() {
        return nArea;
    }

    public void setnArea(Double nArea) {
        this.nArea = nArea;
    }

    @Basic
    @Column(name = "nAreaPercent", nullable = true, precision = 0)
    public Double getnAreaPercent() {
        return nAreaPercent;
    }

    public void setnAreaPercent(Double nAreaPercent) {
        this.nAreaPercent = nAreaPercent;
    }

    @Basic
    @Column(name = "sAdmin", nullable = true, length = 30)
    public String getsAdmin() {
        return sAdmin;
    }

    public void setsAdmin(String sAdmin) {
        this.sAdmin = sAdmin;
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
    @Column(name = "sPhone", nullable = true, length = 50)
    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
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
    @Column(name = "sRoomEngLishName", nullable = true, length = 200)
    public String getsRoomEngLishName() {
        return sRoomEngLishName;
    }

    public void setsRoomEngLishName(String sRoomEngLishName) {
        this.sRoomEngLishName = sRoomEngLishName;
    }

    @Basic
    @Column(name = "bVIPRoom", nullable = true)
    public Boolean getbVipRoom() {
        return bVipRoom;
    }

    public void setbVipRoom(Boolean bVipRoom) {
        this.bVipRoom = bVipRoom;
    }

    @Basic
    @Column(name = "sRoomDepts", nullable = true, length = 1000)
    public String getsRoomDepts() {
        return sRoomDepts;
    }

    public void setsRoomDepts(String sRoomDepts) {
        this.sRoomDepts = sRoomDepts;
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

        BsRoom bsRoom = (BsRoom) o;

        if (id != bsRoom.id) return false;
        if (nSchoolId != bsRoom.nSchoolId) return false;
        if (bValid != bsRoom.bValid) return false;
        if (nAudit != bsRoom.nAudit) return false;
        if (sCode != null ? !sCode.equals(bsRoom.sCode) : bsRoom.sCode != null) return false;
        if (sAreaCode != null ? !sAreaCode.equals(bsRoom.sAreaCode) : bsRoom.sAreaCode != null) return false;
        if (sName != null ? !sName.equals(bsRoom.sName) : bsRoom.sName != null) return false;
        if (sDeptCode != null ? !sDeptCode.equals(bsRoom.sDeptCode) : bsRoom.sDeptCode != null) return false;
        if (sDescription != null ? !sDescription.equals(bsRoom.sDescription) : bsRoom.sDescription != null)
            return false;
        if (sAddress != null ? !sAddress.equals(bsRoom.sAddress) : bsRoom.sAddress != null) return false;
        if (sPostCode != null ? !sPostCode.equals(bsRoom.sPostCode) : bsRoom.sPostCode != null) return false;
        if (sRoute != null ? !sRoute.equals(bsRoom.sRoute) : bsRoom.sRoute != null) return false;
        if (nNormalNum != null ? !nNormalNum.equals(bsRoom.nNormalNum) : bsRoom.nNormalNum != null) return false;
        if (nMaxNum != null ? !nMaxNum.equals(bsRoom.nMaxNum) : bsRoom.nMaxNum != null) return false;
        if (nArea != null ? !nArea.equals(bsRoom.nArea) : bsRoom.nArea != null) return false;
        if (nAreaPercent != null ? !nAreaPercent.equals(bsRoom.nAreaPercent) : bsRoom.nAreaPercent != null)
            return false;
        if (sAdmin != null ? !sAdmin.equals(bsRoom.sAdmin) : bsRoom.sAdmin != null) return false;
        if (sMemo != null ? !sMemo.equals(bsRoom.sMemo) : bsRoom.sMemo != null) return false;
        if (sPhone != null ? !sPhone.equals(bsRoom.sPhone) : bsRoom.sPhone != null) return false;
        if (dtModify != null ? !dtModify.equals(bsRoom.dtModify) : bsRoom.dtModify != null) return false;
        if (sRoomEngLishName != null ? !sRoomEngLishName.equals(bsRoom.sRoomEngLishName) : bsRoom.sRoomEngLishName != null)
            return false;
        if (bVipRoom != null ? !bVipRoom.equals(bsRoom.bVipRoom) : bsRoom.bVipRoom != null) return false;
        if (sRoomDepts != null ? !sRoomDepts.equals(bsRoom.sRoomDepts) : bsRoom.sRoomDepts != null) return false;
        if (sOperatorCode != null ? !sOperatorCode.equals(bsRoom.sOperatorCode) : bsRoom.sOperatorCode != null)
            return false;
        if (sAuditCode != null ? !sAuditCode.equals(bsRoom.sAuditCode) : bsRoom.sAuditCode != null) return false;
        if (dtAuditDate != null ? !dtAuditDate.equals(bsRoom.dtAuditDate) : bsRoom.dtAuditDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sAreaCode != null ? sAreaCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sDeptCode != null ? sDeptCode.hashCode() : 0);
        result = 31 * result + (sDescription != null ? sDescription.hashCode() : 0);
        result = 31 * result + (sAddress != null ? sAddress.hashCode() : 0);
        result = 31 * result + (sPostCode != null ? sPostCode.hashCode() : 0);
        result = 31 * result + (sRoute != null ? sRoute.hashCode() : 0);
        result = 31 * result + (nNormalNum != null ? nNormalNum.hashCode() : 0);
        result = 31 * result + (nMaxNum != null ? nMaxNum.hashCode() : 0);
        result = 31 * result + (nArea != null ? nArea.hashCode() : 0);
        result = 31 * result + (nAreaPercent != null ? nAreaPercent.hashCode() : 0);
        result = 31 * result + (sAdmin != null ? sAdmin.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (sPhone != null ? sPhone.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + nAudit;
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (sRoomEngLishName != null ? sRoomEngLishName.hashCode() : 0);
        result = 31 * result + (bVipRoom != null ? bVipRoom.hashCode() : 0);
        result = 31 * result + (sRoomDepts != null ? sRoomDepts.hashCode() : 0);
        result = 31 * result + (sOperatorCode != null ? sOperatorCode.hashCode() : 0);
        result = 31 * result + (sAuditCode != null ? sAuditCode.hashCode() : 0);
        result = 31 * result + (dtAuditDate != null ? dtAuditDate.hashCode() : 0);
        return result;
    }
}
