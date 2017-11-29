package com.example.entity;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@IdClass(DtpropertiesPK.class)
public class Dtproperties {
    private int id;
    private Integer objectid;
    private String property;
    private String value;
    private String uvalue;
    private byte[] lvalue;
    private int version;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "objectid", nullable = true)
    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    @Id
    @Column(name = "property", nullable = false, length = 64)
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Basic
    @Column(name = "value", nullable = true, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "uvalue", nullable = true, length = 255)
    public String getUvalue() {
        return uvalue;
    }

    public void setUvalue(String uvalue) {
        this.uvalue = uvalue;
    }

    @Basic
    @Column(name = "lvalue", nullable = true)
    public byte[] getLvalue() {
        return lvalue;
    }

    public void setLvalue(byte[] lvalue) {
        this.lvalue = lvalue;
    }

    @Basic
    @Column(name = "version", nullable = false)
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dtproperties that = (Dtproperties) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (objectid != null ? !objectid.equals(that.objectid) : that.objectid != null) return false;
        if (property != null ? !property.equals(that.property) : that.property != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (uvalue != null ? !uvalue.equals(that.uvalue) : that.uvalue != null) return false;
        if (!Arrays.equals(lvalue, that.lvalue)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (objectid != null ? objectid.hashCode() : 0);
        result = 31 * result + (property != null ? property.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (uvalue != null ? uvalue.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(lvalue);
        result = 31 * result + version;
        return result;
    }
}
