package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "BS_AreaNew", schema = "dbo", catalog = "BJ20140915")
public class BsAreaNew {
    private int id;
    private String sCode;
    private String sName;
    private String sFatherCode;
    private boolean bValid;

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sCode", nullable = true, length = 50)
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
    @Column(name = "sFatherCode", nullable = true, length = 50)
    public String getsFatherCode() {
        return sFatherCode;
    }

    public void setsFatherCode(String sFatherCode) {
        this.sFatherCode = sFatherCode;
    }

    @Basic
    @Column(name = "bValid", nullable = false)
    public boolean isbValid() {
        return bValid;
    }

    public void setbValid(boolean bValid) {
        this.bValid = bValid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsAreaNew bsAreaNew = (BsAreaNew) o;

        if (id != bsAreaNew.id) return false;
        if (bValid != bsAreaNew.bValid) return false;
        if (sCode != null ? !sCode.equals(bsAreaNew.sCode) : bsAreaNew.sCode != null) return false;
        if (sName != null ? !sName.equals(bsAreaNew.sName) : bsAreaNew.sName != null) return false;
        if (sFatherCode != null ? !sFatherCode.equals(bsAreaNew.sFatherCode) : bsAreaNew.sFatherCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (sFatherCode != null ? sFatherCode.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        return result;
    }
}
