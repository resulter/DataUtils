package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Lesson_Trg", schema = "dbo", catalog = "BJ20140915")
public class BsLessonTrg {
    private int mid;
    private Integer nLessonId;
    private Timestamp dtModify;

    @Id
    @Column(name = "MID", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "nLessonID", nullable = true)
    public Integer getnLessonId() {
        return nLessonId;
    }

    public void setnLessonId(Integer nLessonId) {
        this.nLessonId = nLessonId;
    }

    @Basic
    @Column(name = "dtModify", nullable = true)
    public Timestamp getDtModify() {
        return dtModify;
    }

    public void setDtModify(Timestamp dtModify) {
        this.dtModify = dtModify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsLessonTrg that = (BsLessonTrg) o;

        if (mid != that.mid) return false;
        if (nLessonId != null ? !nLessonId.equals(that.nLessonId) : that.nLessonId != null) return false;
        if (dtModify != null ? !dtModify.equals(that.dtModify) : that.dtModify != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (nLessonId != null ? nLessonId.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        return result;
    }
}
