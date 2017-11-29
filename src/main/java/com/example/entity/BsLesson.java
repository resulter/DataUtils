package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Lesson", schema = "dbo", catalog = "BJ20140915")
public class BsLesson {
    private int id;
    private int nSchoolId;
    private String sClassCode;
    private int nLessonNo;
    private Integer nLessonNo1;
    private String sRoomCode;
    private String sTeacherCode;
    private String sCourseCode;
    private Timestamp dtDate;
    private Double dRoomCost;
    private Double dTeacherCost;
    private String sMemo;
    private Timestamp sectBegin;
    private Timestamp sectEnd;
    private String lectureCode;
    private Integer lessonType;
    private Integer nMinute;
    private String sTeacherCode2;
    private String sTeacherCode3;
    private String sLessonMemo;
    private Integer nLessonNoCourse;
    private int nAudit;
    private String auditorCode;
    private Timestamp auditDate;
    private String sOperatorCode;
    private Timestamp sOperateDate;
    private String sWeek;
    private Integer cardPush;
    private Boolean bIfPublish;
    private Integer cardPushStudent;
    private Integer cardPushTeacher;
    private Timestamp dtHbDate;
    private Timestamp dtHbSectBegin;
    private Timestamp dtHbSectEnd;
    private String sHbTeacherCode;
    private String sHbTeacherCode2;
    private String sHbTeacherCode3;
    private String sHbCourseCode;
    private String sHbRoomCode;
    private String sHbManagementCode;
    private Boolean nHbFlag;
    private String sMergeRemark;
    private Integer cardPushTeacher2;
    private Integer cardPushTeacher3;
    private int nIsVideoLesson;

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
    @Column(name = "sClassCode", nullable = true, length = 30)
    public String getsClassCode() {
        return sClassCode;
    }

    public void setsClassCode(String sClassCode) {
        this.sClassCode = sClassCode;
    }

    @Basic
    @Column(name = "nLessonNo", nullable = false)
    public int getnLessonNo() {
        return nLessonNo;
    }

    public void setnLessonNo(int nLessonNo) {
        this.nLessonNo = nLessonNo;
    }

    @Basic
    @Column(name = "nLessonNo1", nullable = true)
    public Integer getnLessonNo1() {
        return nLessonNo1;
    }

    public void setnLessonNo1(Integer nLessonNo1) {
        this.nLessonNo1 = nLessonNo1;
    }

    @Basic
    @Column(name = "sRoomCode", nullable = true, length = 30)
    public String getsRoomCode() {
        return sRoomCode;
    }

    public void setsRoomCode(String sRoomCode) {
        this.sRoomCode = sRoomCode;
    }

    @Basic
    @Column(name = "sTeacherCode", nullable = true, length = 30)
    public String getsTeacherCode() {
        return sTeacherCode;
    }

    public void setsTeacherCode(String sTeacherCode) {
        this.sTeacherCode = sTeacherCode;
    }

    @Basic
    @Column(name = "sCourseCode", nullable = true, length = 30)
    public String getsCourseCode() {
        return sCourseCode;
    }

    public void setsCourseCode(String sCourseCode) {
        this.sCourseCode = sCourseCode;
    }

    @Basic
    @Column(name = "dtDate", nullable = true)
    public Timestamp getDtDate() {
        return dtDate;
    }

    public void setDtDate(Timestamp dtDate) {
        this.dtDate = dtDate;
    }

    @Basic
    @Column(name = "dRoomCost", nullable = true, precision = 0)
    public Double getdRoomCost() {
        return dRoomCost;
    }

    public void setdRoomCost(Double dRoomCost) {
        this.dRoomCost = dRoomCost;
    }

    @Basic
    @Column(name = "dTeacherCost", nullable = true, precision = 0)
    public Double getdTeacherCost() {
        return dTeacherCost;
    }

    public void setdTeacherCost(Double dTeacherCost) {
        this.dTeacherCost = dTeacherCost;
    }

    @Basic
    @Column(name = "sMemo", nullable = true, length = 500)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    @Basic
    @Column(name = "SectBegin", nullable = true)
    public Timestamp getSectBegin() {
        return sectBegin;
    }

    public void setSectBegin(Timestamp sectBegin) {
        this.sectBegin = sectBegin;
    }

    @Basic
    @Column(name = "SectEnd", nullable = true)
    public Timestamp getSectEnd() {
        return sectEnd;
    }

    public void setSectEnd(Timestamp sectEnd) {
        this.sectEnd = sectEnd;
    }

    @Basic
    @Column(name = "LectureCode", nullable = true, length = 30)
    public String getLectureCode() {
        return lectureCode;
    }

    public void setLectureCode(String lectureCode) {
        this.lectureCode = lectureCode;
    }

    @Basic
    @Column(name = "LessonType", nullable = true)
    public Integer getLessonType() {
        return lessonType;
    }

    public void setLessonType(Integer lessonType) {
        this.lessonType = lessonType;
    }

    @Basic
    @Column(name = "nMinute", nullable = true)
    public Integer getnMinute() {
        return nMinute;
    }

    public void setnMinute(Integer nMinute) {
        this.nMinute = nMinute;
    }

    @Basic
    @Column(name = "sTeacherCode2", nullable = true, length = 30)
    public String getsTeacherCode2() {
        return sTeacherCode2;
    }

    public void setsTeacherCode2(String sTeacherCode2) {
        this.sTeacherCode2 = sTeacherCode2;
    }

    @Basic
    @Column(name = "sTeacherCode3", nullable = true, length = 30)
    public String getsTeacherCode3() {
        return sTeacherCode3;
    }

    public void setsTeacherCode3(String sTeacherCode3) {
        this.sTeacherCode3 = sTeacherCode3;
    }

    @Basic
    @Column(name = "sLessonMemo", nullable = true, length = 100)
    public String getsLessonMemo() {
        return sLessonMemo;
    }

    public void setsLessonMemo(String sLessonMemo) {
        this.sLessonMemo = sLessonMemo;
    }

    @Basic
    @Column(name = "nLessonNoCourse", nullable = true)
    public Integer getnLessonNoCourse() {
        return nLessonNoCourse;
    }

    public void setnLessonNoCourse(Integer nLessonNoCourse) {
        this.nLessonNoCourse = nLessonNoCourse;
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
    @Column(name = "AuditorCode", nullable = true, length = 50)
    public String getAuditorCode() {
        return auditorCode;
    }

    public void setAuditorCode(String auditorCode) {
        this.auditorCode = auditorCode;
    }

    @Basic
    @Column(name = "AuditDate", nullable = true)
    public Timestamp getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Timestamp auditDate) {
        this.auditDate = auditDate;
    }

    @Basic
    @Column(name = "sOperatorCode", nullable = true, length = 100)
    public String getsOperatorCode() {
        return sOperatorCode;
    }

    public void setsOperatorCode(String sOperatorCode) {
        this.sOperatorCode = sOperatorCode;
    }

    @Basic
    @Column(name = "sOperateDate", nullable = true)
    public Timestamp getsOperateDate() {
        return sOperateDate;
    }

    public void setsOperateDate(Timestamp sOperateDate) {
        this.sOperateDate = sOperateDate;
    }

    @Basic
    @Column(name = "sWeek", nullable = true, length = 30)
    public String getsWeek() {
        return sWeek;
    }

    public void setsWeek(String sWeek) {
        this.sWeek = sWeek;
    }

    @Basic
    @Column(name = "CardPush", nullable = true)
    public Integer getCardPush() {
        return cardPush;
    }

    public void setCardPush(Integer cardPush) {
        this.cardPush = cardPush;
    }

    @Basic
    @Column(name = "bIfPublish", nullable = true)
    public Boolean getbIfPublish() {
        return bIfPublish;
    }

    public void setbIfPublish(Boolean bIfPublish) {
        this.bIfPublish = bIfPublish;
    }

    @Basic
    @Column(name = "CardPushStudent", nullable = true)
    public Integer getCardPushStudent() {
        return cardPushStudent;
    }

    public void setCardPushStudent(Integer cardPushStudent) {
        this.cardPushStudent = cardPushStudent;
    }

    @Basic
    @Column(name = "CardPushTeacher", nullable = true)
    public Integer getCardPushTeacher() {
        return cardPushTeacher;
    }

    public void setCardPushTeacher(Integer cardPushTeacher) {
        this.cardPushTeacher = cardPushTeacher;
    }

    @Basic
    @Column(name = "dt_hb_Date", nullable = true)
    public Timestamp getDtHbDate() {
        return dtHbDate;
    }

    public void setDtHbDate(Timestamp dtHbDate) {
        this.dtHbDate = dtHbDate;
    }

    @Basic
    @Column(name = "dt_hb_SectBegin", nullable = true)
    public Timestamp getDtHbSectBegin() {
        return dtHbSectBegin;
    }

    public void setDtHbSectBegin(Timestamp dtHbSectBegin) {
        this.dtHbSectBegin = dtHbSectBegin;
    }

    @Basic
    @Column(name = "dt_hb_SectEnd", nullable = true)
    public Timestamp getDtHbSectEnd() {
        return dtHbSectEnd;
    }

    public void setDtHbSectEnd(Timestamp dtHbSectEnd) {
        this.dtHbSectEnd = dtHbSectEnd;
    }

    @Basic
    @Column(name = "s_hb_TeacherCode", nullable = true, length = 30)
    public String getsHbTeacherCode() {
        return sHbTeacherCode;
    }

    public void setsHbTeacherCode(String sHbTeacherCode) {
        this.sHbTeacherCode = sHbTeacherCode;
    }

    @Basic
    @Column(name = "s_hb_TeacherCode2", nullable = true, length = 30)
    public String getsHbTeacherCode2() {
        return sHbTeacherCode2;
    }

    public void setsHbTeacherCode2(String sHbTeacherCode2) {
        this.sHbTeacherCode2 = sHbTeacherCode2;
    }

    @Basic
    @Column(name = "s_hb_TeacherCode3", nullable = true, length = 30)
    public String getsHbTeacherCode3() {
        return sHbTeacherCode3;
    }

    public void setsHbTeacherCode3(String sHbTeacherCode3) {
        this.sHbTeacherCode3 = sHbTeacherCode3;
    }

    @Basic
    @Column(name = "s_hb_CourseCode", nullable = true, length = 30)
    public String getsHbCourseCode() {
        return sHbCourseCode;
    }

    public void setsHbCourseCode(String sHbCourseCode) {
        this.sHbCourseCode = sHbCourseCode;
    }

    @Basic
    @Column(name = "s_hb_RoomCode", nullable = true, length = 30)
    public String getsHbRoomCode() {
        return sHbRoomCode;
    }

    public void setsHbRoomCode(String sHbRoomCode) {
        this.sHbRoomCode = sHbRoomCode;
    }

    @Basic
    @Column(name = "s_hb_ManagementCode", nullable = true, length = 50)
    public String getsHbManagementCode() {
        return sHbManagementCode;
    }

    public void setsHbManagementCode(String sHbManagementCode) {
        this.sHbManagementCode = sHbManagementCode;
    }

    @Basic
    @Column(name = "n_hb_Flag", nullable = true)
    public Boolean getnHbFlag() {
        return nHbFlag;
    }

    public void setnHbFlag(Boolean nHbFlag) {
        this.nHbFlag = nHbFlag;
    }

    @Basic
    @Column(name = "sMergeRemark", nullable = true, length = 1000)
    public String getsMergeRemark() {
        return sMergeRemark;
    }

    public void setsMergeRemark(String sMergeRemark) {
        this.sMergeRemark = sMergeRemark;
    }

    @Basic
    @Column(name = "CardPushTeacher2", nullable = true)
    public Integer getCardPushTeacher2() {
        return cardPushTeacher2;
    }

    public void setCardPushTeacher2(Integer cardPushTeacher2) {
        this.cardPushTeacher2 = cardPushTeacher2;
    }

    @Basic
    @Column(name = "CardPushTeacher3", nullable = true)
    public Integer getCardPushTeacher3() {
        return cardPushTeacher3;
    }

    public void setCardPushTeacher3(Integer cardPushTeacher3) {
        this.cardPushTeacher3 = cardPushTeacher3;
    }

    @Basic
    @Column(name = "nIsVideoLesson", nullable = false)
    public int getnIsVideoLesson() {
        return nIsVideoLesson;
    }

    public void setnIsVideoLesson(int nIsVideoLesson) {
        this.nIsVideoLesson = nIsVideoLesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsLesson bsLesson = (BsLesson) o;

        if (id != bsLesson.id) return false;
        if (nSchoolId != bsLesson.nSchoolId) return false;
        if (nLessonNo != bsLesson.nLessonNo) return false;
        if (nAudit != bsLesson.nAudit) return false;
        if (nIsVideoLesson != bsLesson.nIsVideoLesson) return false;
        if (sClassCode != null ? !sClassCode.equals(bsLesson.sClassCode) : bsLesson.sClassCode != null) return false;
        if (nLessonNo1 != null ? !nLessonNo1.equals(bsLesson.nLessonNo1) : bsLesson.nLessonNo1 != null) return false;
        if (sRoomCode != null ? !sRoomCode.equals(bsLesson.sRoomCode) : bsLesson.sRoomCode != null) return false;
        if (sTeacherCode != null ? !sTeacherCode.equals(bsLesson.sTeacherCode) : bsLesson.sTeacherCode != null)
            return false;
        if (sCourseCode != null ? !sCourseCode.equals(bsLesson.sCourseCode) : bsLesson.sCourseCode != null)
            return false;
        if (dtDate != null ? !dtDate.equals(bsLesson.dtDate) : bsLesson.dtDate != null) return false;
        if (dRoomCost != null ? !dRoomCost.equals(bsLesson.dRoomCost) : bsLesson.dRoomCost != null) return false;
        if (dTeacherCost != null ? !dTeacherCost.equals(bsLesson.dTeacherCost) : bsLesson.dTeacherCost != null)
            return false;
        if (sMemo != null ? !sMemo.equals(bsLesson.sMemo) : bsLesson.sMemo != null) return false;
        if (sectBegin != null ? !sectBegin.equals(bsLesson.sectBegin) : bsLesson.sectBegin != null) return false;
        if (sectEnd != null ? !sectEnd.equals(bsLesson.sectEnd) : bsLesson.sectEnd != null) return false;
        if (lectureCode != null ? !lectureCode.equals(bsLesson.lectureCode) : bsLesson.lectureCode != null)
            return false;
        if (lessonType != null ? !lessonType.equals(bsLesson.lessonType) : bsLesson.lessonType != null) return false;
        if (nMinute != null ? !nMinute.equals(bsLesson.nMinute) : bsLesson.nMinute != null) return false;
        if (sTeacherCode2 != null ? !sTeacherCode2.equals(bsLesson.sTeacherCode2) : bsLesson.sTeacherCode2 != null)
            return false;
        if (sTeacherCode3 != null ? !sTeacherCode3.equals(bsLesson.sTeacherCode3) : bsLesson.sTeacherCode3 != null)
            return false;
        if (sLessonMemo != null ? !sLessonMemo.equals(bsLesson.sLessonMemo) : bsLesson.sLessonMemo != null)
            return false;
        if (nLessonNoCourse != null ? !nLessonNoCourse.equals(bsLesson.nLessonNoCourse) : bsLesson.nLessonNoCourse != null)
            return false;
        if (auditorCode != null ? !auditorCode.equals(bsLesson.auditorCode) : bsLesson.auditorCode != null)
            return false;
        if (auditDate != null ? !auditDate.equals(bsLesson.auditDate) : bsLesson.auditDate != null) return false;
        if (sOperatorCode != null ? !sOperatorCode.equals(bsLesson.sOperatorCode) : bsLesson.sOperatorCode != null)
            return false;
        if (sOperateDate != null ? !sOperateDate.equals(bsLesson.sOperateDate) : bsLesson.sOperateDate != null)
            return false;
        if (sWeek != null ? !sWeek.equals(bsLesson.sWeek) : bsLesson.sWeek != null) return false;
        if (cardPush != null ? !cardPush.equals(bsLesson.cardPush) : bsLesson.cardPush != null) return false;
        if (bIfPublish != null ? !bIfPublish.equals(bsLesson.bIfPublish) : bsLesson.bIfPublish != null) return false;
        if (cardPushStudent != null ? !cardPushStudent.equals(bsLesson.cardPushStudent) : bsLesson.cardPushStudent != null)
            return false;
        if (cardPushTeacher != null ? !cardPushTeacher.equals(bsLesson.cardPushTeacher) : bsLesson.cardPushTeacher != null)
            return false;
        if (dtHbDate != null ? !dtHbDate.equals(bsLesson.dtHbDate) : bsLesson.dtHbDate != null) return false;
        if (dtHbSectBegin != null ? !dtHbSectBegin.equals(bsLesson.dtHbSectBegin) : bsLesson.dtHbSectBegin != null)
            return false;
        if (dtHbSectEnd != null ? !dtHbSectEnd.equals(bsLesson.dtHbSectEnd) : bsLesson.dtHbSectEnd != null)
            return false;
        if (sHbTeacherCode != null ? !sHbTeacherCode.equals(bsLesson.sHbTeacherCode) : bsLesson.sHbTeacherCode != null)
            return false;
        if (sHbTeacherCode2 != null ? !sHbTeacherCode2.equals(bsLesson.sHbTeacherCode2) : bsLesson.sHbTeacherCode2 != null)
            return false;
        if (sHbTeacherCode3 != null ? !sHbTeacherCode3.equals(bsLesson.sHbTeacherCode3) : bsLesson.sHbTeacherCode3 != null)
            return false;
        if (sHbCourseCode != null ? !sHbCourseCode.equals(bsLesson.sHbCourseCode) : bsLesson.sHbCourseCode != null)
            return false;
        if (sHbRoomCode != null ? !sHbRoomCode.equals(bsLesson.sHbRoomCode) : bsLesson.sHbRoomCode != null)
            return false;
        if (sHbManagementCode != null ? !sHbManagementCode.equals(bsLesson.sHbManagementCode) : bsLesson.sHbManagementCode != null)
            return false;
        if (nHbFlag != null ? !nHbFlag.equals(bsLesson.nHbFlag) : bsLesson.nHbFlag != null) return false;
        if (sMergeRemark != null ? !sMergeRemark.equals(bsLesson.sMergeRemark) : bsLesson.sMergeRemark != null)
            return false;
        if (cardPushTeacher2 != null ? !cardPushTeacher2.equals(bsLesson.cardPushTeacher2) : bsLesson.cardPushTeacher2 != null)
            return false;
        if (cardPushTeacher3 != null ? !cardPushTeacher3.equals(bsLesson.cardPushTeacher3) : bsLesson.cardPushTeacher3 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sClassCode != null ? sClassCode.hashCode() : 0);
        result = 31 * result + nLessonNo;
        result = 31 * result + (nLessonNo1 != null ? nLessonNo1.hashCode() : 0);
        result = 31 * result + (sRoomCode != null ? sRoomCode.hashCode() : 0);
        result = 31 * result + (sTeacherCode != null ? sTeacherCode.hashCode() : 0);
        result = 31 * result + (sCourseCode != null ? sCourseCode.hashCode() : 0);
        result = 31 * result + (dtDate != null ? dtDate.hashCode() : 0);
        result = 31 * result + (dRoomCost != null ? dRoomCost.hashCode() : 0);
        result = 31 * result + (dTeacherCost != null ? dTeacherCost.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (sectBegin != null ? sectBegin.hashCode() : 0);
        result = 31 * result + (sectEnd != null ? sectEnd.hashCode() : 0);
        result = 31 * result + (lectureCode != null ? lectureCode.hashCode() : 0);
        result = 31 * result + (lessonType != null ? lessonType.hashCode() : 0);
        result = 31 * result + (nMinute != null ? nMinute.hashCode() : 0);
        result = 31 * result + (sTeacherCode2 != null ? sTeacherCode2.hashCode() : 0);
        result = 31 * result + (sTeacherCode3 != null ? sTeacherCode3.hashCode() : 0);
        result = 31 * result + (sLessonMemo != null ? sLessonMemo.hashCode() : 0);
        result = 31 * result + (nLessonNoCourse != null ? nLessonNoCourse.hashCode() : 0);
        result = 31 * result + nAudit;
        result = 31 * result + (auditorCode != null ? auditorCode.hashCode() : 0);
        result = 31 * result + (auditDate != null ? auditDate.hashCode() : 0);
        result = 31 * result + (sOperatorCode != null ? sOperatorCode.hashCode() : 0);
        result = 31 * result + (sOperateDate != null ? sOperateDate.hashCode() : 0);
        result = 31 * result + (sWeek != null ? sWeek.hashCode() : 0);
        result = 31 * result + (cardPush != null ? cardPush.hashCode() : 0);
        result = 31 * result + (bIfPublish != null ? bIfPublish.hashCode() : 0);
        result = 31 * result + (cardPushStudent != null ? cardPushStudent.hashCode() : 0);
        result = 31 * result + (cardPushTeacher != null ? cardPushTeacher.hashCode() : 0);
        result = 31 * result + (dtHbDate != null ? dtHbDate.hashCode() : 0);
        result = 31 * result + (dtHbSectBegin != null ? dtHbSectBegin.hashCode() : 0);
        result = 31 * result + (dtHbSectEnd != null ? dtHbSectEnd.hashCode() : 0);
        result = 31 * result + (sHbTeacherCode != null ? sHbTeacherCode.hashCode() : 0);
        result = 31 * result + (sHbTeacherCode2 != null ? sHbTeacherCode2.hashCode() : 0);
        result = 31 * result + (sHbTeacherCode3 != null ? sHbTeacherCode3.hashCode() : 0);
        result = 31 * result + (sHbCourseCode != null ? sHbCourseCode.hashCode() : 0);
        result = 31 * result + (sHbRoomCode != null ? sHbRoomCode.hashCode() : 0);
        result = 31 * result + (sHbManagementCode != null ? sHbManagementCode.hashCode() : 0);
        result = 31 * result + (nHbFlag != null ? nHbFlag.hashCode() : 0);
        result = 31 * result + (sMergeRemark != null ? sMergeRemark.hashCode() : 0);
        result = 31 * result + (cardPushTeacher2 != null ? cardPushTeacher2.hashCode() : 0);
        result = 31 * result + (cardPushTeacher3 != null ? cardPushTeacher3.hashCode() : 0);
        result = 31 * result + nIsVideoLesson;
        return result;
    }
}
