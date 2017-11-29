package com.example.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Class", schema = "dbo", catalog = "BJ20140915")
public class BsClass {
    private int id;
    private int nSchoolId;
    private String sCode;
    private String sFCode;
    private String sName;
    private String sDescription;
    private int nState;
    private boolean bCanRegister;
    private boolean bIsEnd;
    private boolean bIsResideClass;
    private String sAttribute;
    private String sClassTypeCode;
    private String sPrintAddress;
    private String sLocation;
    private String sRoomCode;
    private Timestamp dtRegister1StDate;
    private String sRegisterTime;
    private Timestamp dtBeginDate;
    private Timestamp dtEndDate;
    private Integer nHoliday;
    private String sPrintTime;
    private Integer nLesson;
    private Integer nTryLesson;
    private Integer nFreeLesson;
    private Integer nInsertLesson;
    private String sMemo;
    private Integer nNormalCount;
    private Integer nMaxCount;
    private Double dFee;
    private Double dBookFee;
    private Double dBookCost;
    private Double dTryFee;
    private Double dInsertFee;
    private Integer nCurrentCount;
    private Integer nSeqNumber;
    private Integer nPostTranCount;
    private int nSystemTag;
    private Boolean bVirtual;
    private String sPrintMemo;
    private Integer nAudit;
    private Integer nReservedSeats;
    private Timestamp dtSetupDate;
    private String sOperatorCode;
    private String sOperatorName;
    private boolean bPrintSeatNo;
    private Integer nMaleMaxCount;
    private Integer nFemaleMaxCount;
    private Timestamp dtModify;
    private boolean bIsNet;
    private String sAuditCode;
    private Timestamp dtAuditDate;
    private String sModifyCode;
    private Timestamp dtModifyDate;
    private Integer nFYear;
    private String sClassAttribute;
    private Integer nPlanMinutes;
    private Integer nRealMinutes;
    private String sClassSize;
    private boolean bVip;
    private String sNameBefore;
    private String sNameAfter;
    private String sNameDecorate;
    private String sManagementCode;
    private boolean bSouke;
    private Timestamp dtProperty;
    private boolean bPublishTeacher;
    private int nGradualType;
    private Integer accommodationType;
    private String xunChengType1;
    private String xunChengType2;
    private String classScaleType;
    private Boolean bIsVideoClass;
    private String courseCode;
    private Boolean bMainArrangeClass;
    private Boolean bHasTeachingMaterial;
    private Integer nSetClassType;
    private String sOrderCode;
    private String sCourseProductName;
    private String sClassCapacityCode;
    private String sClassCapacityName;
    private Integer classBookDeliveryType;
    private Boolean bLock;
    private String sMemoLesson;
    private Integer nUseCard;
    private String sClassMode;
    private String sClassTime;
    private String sBookVersion;
    private String sTeachingContent;
    private Boolean bInsurance;
    private String sProductTypeCode;
    private Timestamp dtCancelDate;
    private String sCancelReason;
    private int nMakePoint;
    private String sTeacher;
    private Integer nMergeState;
    private String sMergeRemark;
    private Boolean bOnlineLive;
    private String sClassSubject;
    private String sQuarter;
    private Boolean bContinuedClass;
    private String sCourseConsultant;
    private String sStudyManager;
    private String sOriginalClassCode;
    private String sTown;

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
    @Column(name = "sCode", nullable = true, length = 20)
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
    @Column(name = "sName", nullable = true, length = 50)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "sDescription", nullable = true, length = 60)
    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    @Basic
    @Column(name = "nState", nullable = false)
    public int getnState() {
        return nState;
    }

    public void setnState(int nState) {
        this.nState = nState;
    }

    @Basic
    @Column(name = "bCanRegister", nullable = false)
    public boolean isbCanRegister() {
        return bCanRegister;
    }

    public void setbCanRegister(boolean bCanRegister) {
        this.bCanRegister = bCanRegister;
    }

    @Basic
    @Column(name = "bIsEnd", nullable = false)
    public boolean isbIsEnd() {
        return bIsEnd;
    }

    public void setbIsEnd(boolean bIsEnd) {
        this.bIsEnd = bIsEnd;
    }

    @Basic
    @Column(name = "bIsResideClass", nullable = false)
    public boolean isbIsResideClass() {
        return bIsResideClass;
    }

    public void setbIsResideClass(boolean bIsResideClass) {
        this.bIsResideClass = bIsResideClass;
    }

    @Basic
    @Column(name = "sAttribute", nullable = true, length = 150)
    public String getsAttribute() {
        return sAttribute;
    }

    public void setsAttribute(String sAttribute) {
        this.sAttribute = sAttribute;
    }

    @Basic
    @Column(name = "sClassTypeCode", nullable = false, length = 30)
    public String getsClassTypeCode() {
        return sClassTypeCode;
    }

    public void setsClassTypeCode(String sClassTypeCode) {
        this.sClassTypeCode = sClassTypeCode;
    }

    @Basic
    @Column(name = "sPrintAddress", nullable = true, length = 1000)
    public String getsPrintAddress() {
        return sPrintAddress;
    }

    public void setsPrintAddress(String sPrintAddress) {
        this.sPrintAddress = sPrintAddress;
    }

    @Basic
    @Column(name = "sLocation", nullable = true, length = 200)
    public String getsLocation() {
        return sLocation;
    }

    public void setsLocation(String sLocation) {
        this.sLocation = sLocation;
    }

    @Basic
    @Column(name = "sRoomCode", nullable = true, length = 20)
    public String getsRoomCode() {
        return sRoomCode;
    }

    public void setsRoomCode(String sRoomCode) {
        this.sRoomCode = sRoomCode;
    }

    @Basic
    @Column(name = "dtRegister1stDate", nullable = true)
    public Timestamp getDtRegister1StDate() {
        return dtRegister1StDate;
    }

    public void setDtRegister1StDate(Timestamp dtRegister1StDate) {
        this.dtRegister1StDate = dtRegister1StDate;
    }

    @Basic
    @Column(name = "sRegisterTime", nullable = true, length = 1000)
    public String getsRegisterTime() {
        return sRegisterTime;
    }

    public void setsRegisterTime(String sRegisterTime) {
        this.sRegisterTime = sRegisterTime;
    }

    @Basic
    @Column(name = "dtBeginDate", nullable = true)
    public Timestamp getDtBeginDate() {
        return dtBeginDate;
    }

    public void setDtBeginDate(Timestamp dtBeginDate) {
        this.dtBeginDate = dtBeginDate;
    }

    @Basic
    @Column(name = "dtEndDate", nullable = true)
    public Timestamp getDtEndDate() {
        return dtEndDate;
    }

    public void setDtEndDate(Timestamp dtEndDate) {
        this.dtEndDate = dtEndDate;
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
    @Column(name = "sPrintTime", nullable = true, length = 1000)
    public String getsPrintTime() {
        return sPrintTime;
    }

    public void setsPrintTime(String sPrintTime) {
        this.sPrintTime = sPrintTime;
    }

    @Basic
    @Column(name = "nLesson", nullable = true)
    public Integer getnLesson() {
        return nLesson;
    }

    public void setnLesson(Integer nLesson) {
        this.nLesson = nLesson;
    }

    @Basic
    @Column(name = "nTryLesson", nullable = true)
    public Integer getnTryLesson() {
        return nTryLesson;
    }

    public void setnTryLesson(Integer nTryLesson) {
        this.nTryLesson = nTryLesson;
    }

    @Basic
    @Column(name = "nFreeLesson", nullable = true)
    public Integer getnFreeLesson() {
        return nFreeLesson;
    }

    public void setnFreeLesson(Integer nFreeLesson) {
        this.nFreeLesson = nFreeLesson;
    }

    @Basic
    @Column(name = "nInsertLesson", nullable = true)
    public Integer getnInsertLesson() {
        return nInsertLesson;
    }

    public void setnInsertLesson(Integer nInsertLesson) {
        this.nInsertLesson = nInsertLesson;
    }

    @Basic
    @Column(name = "sMemo", nullable = true, length = 1000)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    @Basic
    @Column(name = "nNormalCount", nullable = true)
    public Integer getnNormalCount() {
        return nNormalCount;
    }

    public void setnNormalCount(Integer nNormalCount) {
        this.nNormalCount = nNormalCount;
    }

    @Basic
    @Column(name = "nMaxCount", nullable = true)
    public Integer getnMaxCount() {
        return nMaxCount;
    }

    public void setnMaxCount(Integer nMaxCount) {
        this.nMaxCount = nMaxCount;
    }

    @Basic
    @Column(name = "dFee", nullable = true, precision = 0)
    public Double getdFee() {
        return dFee;
    }

    public void setdFee(Double dFee) {
        this.dFee = dFee;
    }

    @Basic
    @Column(name = "dBookFee", nullable = true, precision = 0)
    public Double getdBookFee() {
        return dBookFee;
    }

    public void setdBookFee(Double dBookFee) {
        this.dBookFee = dBookFee;
    }

    @Basic
    @Column(name = "dBookCost", nullable = true, precision = 0)
    public Double getdBookCost() {
        return dBookCost;
    }

    public void setdBookCost(Double dBookCost) {
        this.dBookCost = dBookCost;
    }

    @Basic
    @Column(name = "dTryFee", nullable = true, precision = 0)
    public Double getdTryFee() {
        return dTryFee;
    }

    public void setdTryFee(Double dTryFee) {
        this.dTryFee = dTryFee;
    }

    @Basic
    @Column(name = "dInsertFee", nullable = true, precision = 0)
    public Double getdInsertFee() {
        return dInsertFee;
    }

    public void setdInsertFee(Double dInsertFee) {
        this.dInsertFee = dInsertFee;
    }

    @Basic
    @Column(name = "nCurrentCount", nullable = true)
    public Integer getnCurrentCount() {
        return nCurrentCount;
    }

    public void setnCurrentCount(Integer nCurrentCount) {
        this.nCurrentCount = nCurrentCount;
    }

    @Basic
    @Column(name = "nSeqNumber", nullable = true)
    public Integer getnSeqNumber() {
        return nSeqNumber;
    }

    public void setnSeqNumber(Integer nSeqNumber) {
        this.nSeqNumber = nSeqNumber;
    }

    @Basic
    @Column(name = "nPostTranCount", nullable = true)
    public Integer getnPostTranCount() {
        return nPostTranCount;
    }

    public void setnPostTranCount(Integer nPostTranCount) {
        this.nPostTranCount = nPostTranCount;
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
    @Column(name = "bVirtual", nullable = true)
    public Boolean getbVirtual() {
        return bVirtual;
    }

    public void setbVirtual(Boolean bVirtual) {
        this.bVirtual = bVirtual;
    }

    @Basic
    @Column(name = "sPrintMemo", nullable = true, length = 1000)
    public String getsPrintMemo() {
        return sPrintMemo;
    }

    public void setsPrintMemo(String sPrintMemo) {
        this.sPrintMemo = sPrintMemo;
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
    @Column(name = "nReservedSeats", nullable = true)
    public Integer getnReservedSeats() {
        return nReservedSeats;
    }

    public void setnReservedSeats(Integer nReservedSeats) {
        this.nReservedSeats = nReservedSeats;
    }

    @Basic
    @Column(name = "dtSetupDate", nullable = true)
    public Timestamp getDtSetupDate() {
        return dtSetupDate;
    }

    public void setDtSetupDate(Timestamp dtSetupDate) {
        this.dtSetupDate = dtSetupDate;
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
    @Column(name = "sOperatorName", nullable = true, length = 50)
    public String getsOperatorName() {
        return sOperatorName;
    }

    public void setsOperatorName(String sOperatorName) {
        this.sOperatorName = sOperatorName;
    }

    @Basic
    @Column(name = "bPrintSeatNo", nullable = false)
    public boolean isbPrintSeatNo() {
        return bPrintSeatNo;
    }

    public void setbPrintSeatNo(boolean bPrintSeatNo) {
        this.bPrintSeatNo = bPrintSeatNo;
    }

    @Basic
    @Column(name = "nMaleMaxCount", nullable = true)
    public Integer getnMaleMaxCount() {
        return nMaleMaxCount;
    }

    public void setnMaleMaxCount(Integer nMaleMaxCount) {
        this.nMaleMaxCount = nMaleMaxCount;
    }

    @Basic
    @Column(name = "nFemaleMaxCount", nullable = true)
    public Integer getnFemaleMaxCount() {
        return nFemaleMaxCount;
    }

    public void setnFemaleMaxCount(Integer nFemaleMaxCount) {
        this.nFemaleMaxCount = nFemaleMaxCount;
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
    @Column(name = "bIsNet", nullable = false)
    public boolean isbIsNet() {
        return bIsNet;
    }

    public void setbIsNet(boolean bIsNet) {
        this.bIsNet = bIsNet;
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

    @Basic
    @Column(name = "sModifyCode", nullable = true, length = 50)
    public String getsModifyCode() {
        return sModifyCode;
    }

    public void setsModifyCode(String sModifyCode) {
        this.sModifyCode = sModifyCode;
    }

    @Basic
    @Column(name = "dtModifyDate", nullable = true)
    public Timestamp getDtModifyDate() {
        return dtModifyDate;
    }

    public void setDtModifyDate(Timestamp dtModifyDate) {
        this.dtModifyDate = dtModifyDate;
    }

    @Basic
    @Column(name = "nFYear", nullable = true)
    public Integer getnFYear() {
        return nFYear;
    }

    public void setnFYear(Integer nFYear) {
        this.nFYear = nFYear;
    }

    @Basic
    @Column(name = "sClassAttribute", nullable = true, length = 200)
    public String getsClassAttribute() {
        return sClassAttribute;
    }

    public void setsClassAttribute(String sClassAttribute) {
        this.sClassAttribute = sClassAttribute;
    }

    @Basic
    @Column(name = "nPlanMinutes", nullable = true)
    public Integer getnPlanMinutes() {
        return nPlanMinutes;
    }

    public void setnPlanMinutes(Integer nPlanMinutes) {
        this.nPlanMinutes = nPlanMinutes;
    }

    @Basic
    @Column(name = "nRealMinutes", nullable = true)
    public Integer getnRealMinutes() {
        return nRealMinutes;
    }

    public void setnRealMinutes(Integer nRealMinutes) {
        this.nRealMinutes = nRealMinutes;
    }

    @Basic
    @Column(name = "sClassSize", nullable = true, length = 200)
    public String getsClassSize() {
        return sClassSize;
    }

    public void setsClassSize(String sClassSize) {
        this.sClassSize = sClassSize;
    }

    @Basic
    @Column(name = "bVIP", nullable = false)
    public boolean isbVip() {
        return bVip;
    }

    public void setbVip(boolean bVip) {
        this.bVip = bVip;
    }

    @Basic
    @Column(name = "sNameBefore", nullable = true, length = 10)
    public String getsNameBefore() {
        return sNameBefore;
    }

    public void setsNameBefore(String sNameBefore) {
        this.sNameBefore = sNameBefore;
    }

    @Basic
    @Column(name = "sNameAfter", nullable = true, length = 30)
    public String getsNameAfter() {
        return sNameAfter;
    }

    public void setsNameAfter(String sNameAfter) {
        this.sNameAfter = sNameAfter;
    }

    @Basic
    @Column(name = "sNameDecorate", nullable = true, length = 24)
    public String getsNameDecorate() {
        return sNameDecorate;
    }

    public void setsNameDecorate(String sNameDecorate) {
        this.sNameDecorate = sNameDecorate;
    }

    @Basic
    @Column(name = "sManagementCode", nullable = true, length = 50)
    public String getsManagementCode() {
        return sManagementCode;
    }

    public void setsManagementCode(String sManagementCode) {
        this.sManagementCode = sManagementCode;
    }

    @Basic
    @Column(name = "bSouke", nullable = false)
    public boolean isbSouke() {
        return bSouke;
    }

    public void setbSouke(boolean bSouke) {
        this.bSouke = bSouke;
    }

    @Basic
    @Column(name = "dtProperty", nullable = true)
    public Timestamp getDtProperty() {
        return dtProperty;
    }

    public void setDtProperty(Timestamp dtProperty) {
        this.dtProperty = dtProperty;
    }

    @Basic
    @Column(name = "bPublishTeacher", nullable = false)
    public boolean isbPublishTeacher() {
        return bPublishTeacher;
    }

    public void setbPublishTeacher(boolean bPublishTeacher) {
        this.bPublishTeacher = bPublishTeacher;
    }

    @Basic
    @Column(name = "nGradualType", nullable = false)
    public int getnGradualType() {
        return nGradualType;
    }

    public void setnGradualType(int nGradualType) {
        this.nGradualType = nGradualType;
    }

    @Basic
    @Column(name = "AccommodationType", nullable = true)
    public Integer getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(Integer accommodationType) {
        this.accommodationType = accommodationType;
    }

    @Basic
    @Column(name = "XunChengType1", nullable = true, length = 500)
    public String getXunChengType1() {
        return xunChengType1;
    }

    public void setXunChengType1(String xunChengType1) {
        this.xunChengType1 = xunChengType1;
    }

    @Basic
    @Column(name = "XunChengType2", nullable = true, length = 500)
    public String getXunChengType2() {
        return xunChengType2;
    }

    public void setXunChengType2(String xunChengType2) {
        this.xunChengType2 = xunChengType2;
    }

    @Basic
    @Column(name = "ClassScaleType", nullable = true, length = 500)
    public String getClassScaleType() {
        return classScaleType;
    }

    public void setClassScaleType(String classScaleType) {
        this.classScaleType = classScaleType;
    }

    @Basic
    @Column(name = "bIsVideoClass", nullable = true)
    public Boolean getbIsVideoClass() {
        return bIsVideoClass;
    }

    public void setbIsVideoClass(Boolean bIsVideoClass) {
        this.bIsVideoClass = bIsVideoClass;
    }

    @Basic
    @Column(name = "CourseCode", nullable = true, length = 50)
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @Basic
    @Column(name = "bMainArrangeClass", nullable = true)
    public Boolean getbMainArrangeClass() {
        return bMainArrangeClass;
    }

    public void setbMainArrangeClass(Boolean bMainArrangeClass) {
        this.bMainArrangeClass = bMainArrangeClass;
    }

    @Basic
    @Column(name = "bHasTeachingMaterial", nullable = true)
    public Boolean getbHasTeachingMaterial() {
        return bHasTeachingMaterial;
    }

    public void setbHasTeachingMaterial(Boolean bHasTeachingMaterial) {
        this.bHasTeachingMaterial = bHasTeachingMaterial;
    }

    @Basic
    @Column(name = "nSetClassType", nullable = true)
    public Integer getnSetClassType() {
        return nSetClassType;
    }

    public void setnSetClassType(Integer nSetClassType) {
        this.nSetClassType = nSetClassType;
    }

    @Basic
    @Column(name = "sOrderCode", nullable = true, length = 50)
    public String getsOrderCode() {
        return sOrderCode;
    }

    public void setsOrderCode(String sOrderCode) {
        this.sOrderCode = sOrderCode;
    }

    @Basic
    @Column(name = "sCourseProductName", nullable = true, length = 128)
    public String getsCourseProductName() {
        return sCourseProductName;
    }

    public void setsCourseProductName(String sCourseProductName) {
        this.sCourseProductName = sCourseProductName;
    }

    @Basic
    @Column(name = "sClassCapacityCode", nullable = true, length = 64)
    public String getsClassCapacityCode() {
        return sClassCapacityCode;
    }

    public void setsClassCapacityCode(String sClassCapacityCode) {
        this.sClassCapacityCode = sClassCapacityCode;
    }

    @Basic
    @Column(name = "sClassCapacityName", nullable = true, length = 64)
    public String getsClassCapacityName() {
        return sClassCapacityName;
    }

    public void setsClassCapacityName(String sClassCapacityName) {
        this.sClassCapacityName = sClassCapacityName;
    }

    @Basic
    @Column(name = "ClassBookDeliveryType", nullable = true)
    public Integer getClassBookDeliveryType() {
        return classBookDeliveryType;
    }

    public void setClassBookDeliveryType(Integer classBookDeliveryType) {
        this.classBookDeliveryType = classBookDeliveryType;
    }

    @Basic
    @Column(name = "bLock", nullable = true)
    public Boolean getbLock() {
        return bLock;
    }

    public void setbLock(Boolean bLock) {
        this.bLock = bLock;
    }

    @Basic
    @Column(name = "sMemoLesson", nullable = true, length = 500)
    public String getsMemoLesson() {
        return sMemoLesson;
    }

    public void setsMemoLesson(String sMemoLesson) {
        this.sMemoLesson = sMemoLesson;
    }

    @Basic
    @Column(name = "nUseCard", nullable = true)
    public Integer getnUseCard() {
        return nUseCard;
    }

    public void setnUseCard(Integer nUseCard) {
        this.nUseCard = nUseCard;
    }

    @Basic
    @Column(name = "sClassMode", nullable = true, length = 50)
    public String getsClassMode() {
        return sClassMode;
    }

    public void setsClassMode(String sClassMode) {
        this.sClassMode = sClassMode;
    }

    @Basic
    @Column(name = "sClassTime", nullable = true, length = 50)
    public String getsClassTime() {
        return sClassTime;
    }

    public void setsClassTime(String sClassTime) {
        this.sClassTime = sClassTime;
    }

    @Basic
    @Column(name = "sBookVersion", nullable = true, length = 100)
    public String getsBookVersion() {
        return sBookVersion;
    }

    public void setsBookVersion(String sBookVersion) {
        this.sBookVersion = sBookVersion;
    }

    @Basic
    @Column(name = "sTeachingContent", nullable = true, length = 100)
    public String getsTeachingContent() {
        return sTeachingContent;
    }

    public void setsTeachingContent(String sTeachingContent) {
        this.sTeachingContent = sTeachingContent;
    }

    @Basic
    @Column(name = "bInsurance", nullable = true)
    public Boolean getbInsurance() {
        return bInsurance;
    }

    public void setbInsurance(Boolean bInsurance) {
        this.bInsurance = bInsurance;
    }

    @Basic
    @Column(name = "sProductTypeCode", nullable = true, length = 50)
    public String getsProductTypeCode() {
        return sProductTypeCode;
    }

    public void setsProductTypeCode(String sProductTypeCode) {
        this.sProductTypeCode = sProductTypeCode;
    }

    @Basic
    @Column(name = "dtCancelDate", nullable = true)
    public Timestamp getDtCancelDate() {
        return dtCancelDate;
    }

    public void setDtCancelDate(Timestamp dtCancelDate) {
        this.dtCancelDate = dtCancelDate;
    }

    @Basic
    @Column(name = "sCancelReason", nullable = true, length = 50)
    public String getsCancelReason() {
        return sCancelReason;
    }

    public void setsCancelReason(String sCancelReason) {
        this.sCancelReason = sCancelReason;
    }

    @Basic
    @Column(name = "nMakePoint", nullable = false)
    public int getnMakePoint() {
        return nMakePoint;
    }

    public void setnMakePoint(int nMakePoint) {
        this.nMakePoint = nMakePoint;
    }

    @Basic
    @Column(name = "sTeacher", nullable = true, length = 50)
    public String getsTeacher() {
        return sTeacher;
    }

    public void setsTeacher(String sTeacher) {
        this.sTeacher = sTeacher;
    }

    @Basic
    @Column(name = "nMergeState", nullable = true)
    public Integer getnMergeState() {
        return nMergeState;
    }

    public void setnMergeState(Integer nMergeState) {
        this.nMergeState = nMergeState;
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
    @Column(name = "bOnlineLive", nullable = true)
    public Boolean getbOnlineLive() {
        return bOnlineLive;
    }

    public void setbOnlineLive(Boolean bOnlineLive) {
        this.bOnlineLive = bOnlineLive;
    }

    @Basic
    @Column(name = "sClassSubject", nullable = true, length = 200)
    public String getsClassSubject() {
        return sClassSubject;
    }

    public void setsClassSubject(String sClassSubject) {
        this.sClassSubject = sClassSubject;
    }

    @Basic
    @Column(name = "sQuarter", nullable = true, length = 200)
    public String getsQuarter() {
        return sQuarter;
    }

    public void setsQuarter(String sQuarter) {
        this.sQuarter = sQuarter;
    }

    @Basic
    @Column(name = "bContinuedClass", nullable = true)
    public Boolean getbContinuedClass() {
        return bContinuedClass;
    }

    public void setbContinuedClass(Boolean bContinuedClass) {
        this.bContinuedClass = bContinuedClass;
    }

    @Basic
    @Column(name = "sCourseConsultant", nullable = true, length = 50)
    public String getsCourseConsultant() {
        return sCourseConsultant;
    }

    public void setsCourseConsultant(String sCourseConsultant) {
        this.sCourseConsultant = sCourseConsultant;
    }

    @Basic
    @Column(name = "sStudyManager", nullable = true, length = 50)
    public String getsStudyManager() {
        return sStudyManager;
    }

    public void setsStudyManager(String sStudyManager) {
        this.sStudyManager = sStudyManager;
    }

    @Basic
    @Column(name = "sOriginalClassCode", nullable = true, length = 20)
    public String getsOriginalClassCode() {
        return sOriginalClassCode;
    }

    public void setsOriginalClassCode(String sOriginalClassCode) {
        this.sOriginalClassCode = sOriginalClassCode;
    }

    @Basic
    @Column(name = "sTown", nullable = true, length = 50)
    public String getsTown() {
        return sTown;
    }

    public void setsTown(String sTown) {
        this.sTown = sTown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsClass bsClass = (BsClass) o;

        if (id != bsClass.id) return false;
        if (nSchoolId != bsClass.nSchoolId) return false;
        if (nState != bsClass.nState) return false;
        if (bCanRegister != bsClass.bCanRegister) return false;
        if (bIsEnd != bsClass.bIsEnd) return false;
        if (bIsResideClass != bsClass.bIsResideClass) return false;
        if (nSystemTag != bsClass.nSystemTag) return false;
        if (bPrintSeatNo != bsClass.bPrintSeatNo) return false;
        if (bIsNet != bsClass.bIsNet) return false;
        if (bVip != bsClass.bVip) return false;
        if (bSouke != bsClass.bSouke) return false;
        if (bPublishTeacher != bsClass.bPublishTeacher) return false;
        if (nGradualType != bsClass.nGradualType) return false;
        if (nMakePoint != bsClass.nMakePoint) return false;
        if (sCode != null ? !sCode.equals(bsClass.sCode) : bsClass.sCode != null) return false;
        if (sFCode != null ? !sFCode.equals(bsClass.sFCode) : bsClass.sFCode != null) return false;
        if (sName != null ? !sName.equals(bsClass.sName) : bsClass.sName != null) return false;
        if (sDescription != null ? !sDescription.equals(bsClass.sDescription) : bsClass.sDescription != null)
            return false;
        if (sAttribute != null ? !sAttribute.equals(bsClass.sAttribute) : bsClass.sAttribute != null) return false;
        if (sClassTypeCode != null ? !sClassTypeCode.equals(bsClass.sClassTypeCode) : bsClass.sClassTypeCode != null)
            return false;
        if (sPrintAddress != null ? !sPrintAddress.equals(bsClass.sPrintAddress) : bsClass.sPrintAddress != null)
            return false;
        if (sLocation != null ? !sLocation.equals(bsClass.sLocation) : bsClass.sLocation != null) return false;
        if (sRoomCode != null ? !sRoomCode.equals(bsClass.sRoomCode) : bsClass.sRoomCode != null) return false;
        if (dtRegister1StDate != null ? !dtRegister1StDate.equals(bsClass.dtRegister1StDate) : bsClass.dtRegister1StDate != null)
            return false;
        if (sRegisterTime != null ? !sRegisterTime.equals(bsClass.sRegisterTime) : bsClass.sRegisterTime != null)
            return false;
        if (dtBeginDate != null ? !dtBeginDate.equals(bsClass.dtBeginDate) : bsClass.dtBeginDate != null) return false;
        if (dtEndDate != null ? !dtEndDate.equals(bsClass.dtEndDate) : bsClass.dtEndDate != null) return false;
        if (nHoliday != null ? !nHoliday.equals(bsClass.nHoliday) : bsClass.nHoliday != null) return false;
        if (sPrintTime != null ? !sPrintTime.equals(bsClass.sPrintTime) : bsClass.sPrintTime != null) return false;
        if (nLesson != null ? !nLesson.equals(bsClass.nLesson) : bsClass.nLesson != null) return false;
        if (nTryLesson != null ? !nTryLesson.equals(bsClass.nTryLesson) : bsClass.nTryLesson != null) return false;
        if (nFreeLesson != null ? !nFreeLesson.equals(bsClass.nFreeLesson) : bsClass.nFreeLesson != null) return false;
        if (nInsertLesson != null ? !nInsertLesson.equals(bsClass.nInsertLesson) : bsClass.nInsertLesson != null)
            return false;
        if (sMemo != null ? !sMemo.equals(bsClass.sMemo) : bsClass.sMemo != null) return false;
        if (nNormalCount != null ? !nNormalCount.equals(bsClass.nNormalCount) : bsClass.nNormalCount != null)
            return false;
        if (nMaxCount != null ? !nMaxCount.equals(bsClass.nMaxCount) : bsClass.nMaxCount != null) return false;
        if (dFee != null ? !dFee.equals(bsClass.dFee) : bsClass.dFee != null) return false;
        if (dBookFee != null ? !dBookFee.equals(bsClass.dBookFee) : bsClass.dBookFee != null) return false;
        if (dBookCost != null ? !dBookCost.equals(bsClass.dBookCost) : bsClass.dBookCost != null) return false;
        if (dTryFee != null ? !dTryFee.equals(bsClass.dTryFee) : bsClass.dTryFee != null) return false;
        if (dInsertFee != null ? !dInsertFee.equals(bsClass.dInsertFee) : bsClass.dInsertFee != null) return false;
        if (nCurrentCount != null ? !nCurrentCount.equals(bsClass.nCurrentCount) : bsClass.nCurrentCount != null)
            return false;
        if (nSeqNumber != null ? !nSeqNumber.equals(bsClass.nSeqNumber) : bsClass.nSeqNumber != null) return false;
        if (nPostTranCount != null ? !nPostTranCount.equals(bsClass.nPostTranCount) : bsClass.nPostTranCount != null)
            return false;
        if (bVirtual != null ? !bVirtual.equals(bsClass.bVirtual) : bsClass.bVirtual != null) return false;
        if (sPrintMemo != null ? !sPrintMemo.equals(bsClass.sPrintMemo) : bsClass.sPrintMemo != null) return false;
        if (nAudit != null ? !nAudit.equals(bsClass.nAudit) : bsClass.nAudit != null) return false;
        if (nReservedSeats != null ? !nReservedSeats.equals(bsClass.nReservedSeats) : bsClass.nReservedSeats != null)
            return false;
        if (dtSetupDate != null ? !dtSetupDate.equals(bsClass.dtSetupDate) : bsClass.dtSetupDate != null) return false;
        if (sOperatorCode != null ? !sOperatorCode.equals(bsClass.sOperatorCode) : bsClass.sOperatorCode != null)
            return false;
        if (sOperatorName != null ? !sOperatorName.equals(bsClass.sOperatorName) : bsClass.sOperatorName != null)
            return false;
        if (nMaleMaxCount != null ? !nMaleMaxCount.equals(bsClass.nMaleMaxCount) : bsClass.nMaleMaxCount != null)
            return false;
        if (nFemaleMaxCount != null ? !nFemaleMaxCount.equals(bsClass.nFemaleMaxCount) : bsClass.nFemaleMaxCount != null)
            return false;
        if (dtModify != null ? !dtModify.equals(bsClass.dtModify) : bsClass.dtModify != null) return false;
        if (sAuditCode != null ? !sAuditCode.equals(bsClass.sAuditCode) : bsClass.sAuditCode != null) return false;
        if (dtAuditDate != null ? !dtAuditDate.equals(bsClass.dtAuditDate) : bsClass.dtAuditDate != null) return false;
        if (sModifyCode != null ? !sModifyCode.equals(bsClass.sModifyCode) : bsClass.sModifyCode != null) return false;
        if (dtModifyDate != null ? !dtModifyDate.equals(bsClass.dtModifyDate) : bsClass.dtModifyDate != null)
            return false;
        if (nFYear != null ? !nFYear.equals(bsClass.nFYear) : bsClass.nFYear != null) return false;
        if (sClassAttribute != null ? !sClassAttribute.equals(bsClass.sClassAttribute) : bsClass.sClassAttribute != null)
            return false;
        if (nPlanMinutes != null ? !nPlanMinutes.equals(bsClass.nPlanMinutes) : bsClass.nPlanMinutes != null)
            return false;
        if (nRealMinutes != null ? !nRealMinutes.equals(bsClass.nRealMinutes) : bsClass.nRealMinutes != null)
            return false;
        if (sClassSize != null ? !sClassSize.equals(bsClass.sClassSize) : bsClass.sClassSize != null) return false;
        if (sNameBefore != null ? !sNameBefore.equals(bsClass.sNameBefore) : bsClass.sNameBefore != null) return false;
        if (sNameAfter != null ? !sNameAfter.equals(bsClass.sNameAfter) : bsClass.sNameAfter != null) return false;
        if (sNameDecorate != null ? !sNameDecorate.equals(bsClass.sNameDecorate) : bsClass.sNameDecorate != null)
            return false;
        if (sManagementCode != null ? !sManagementCode.equals(bsClass.sManagementCode) : bsClass.sManagementCode != null)
            return false;
        if (dtProperty != null ? !dtProperty.equals(bsClass.dtProperty) : bsClass.dtProperty != null) return false;
        if (accommodationType != null ? !accommodationType.equals(bsClass.accommodationType) : bsClass.accommodationType != null)
            return false;
        if (xunChengType1 != null ? !xunChengType1.equals(bsClass.xunChengType1) : bsClass.xunChengType1 != null)
            return false;
        if (xunChengType2 != null ? !xunChengType2.equals(bsClass.xunChengType2) : bsClass.xunChengType2 != null)
            return false;
        if (classScaleType != null ? !classScaleType.equals(bsClass.classScaleType) : bsClass.classScaleType != null)
            return false;
        if (bIsVideoClass != null ? !bIsVideoClass.equals(bsClass.bIsVideoClass) : bsClass.bIsVideoClass != null)
            return false;
        if (courseCode != null ? !courseCode.equals(bsClass.courseCode) : bsClass.courseCode != null) return false;
        if (bMainArrangeClass != null ? !bMainArrangeClass.equals(bsClass.bMainArrangeClass) : bsClass.bMainArrangeClass != null)
            return false;
        if (bHasTeachingMaterial != null ? !bHasTeachingMaterial.equals(bsClass.bHasTeachingMaterial) : bsClass.bHasTeachingMaterial != null)
            return false;
        if (nSetClassType != null ? !nSetClassType.equals(bsClass.nSetClassType) : bsClass.nSetClassType != null)
            return false;
        if (sOrderCode != null ? !sOrderCode.equals(bsClass.sOrderCode) : bsClass.sOrderCode != null) return false;
        if (sCourseProductName != null ? !sCourseProductName.equals(bsClass.sCourseProductName) : bsClass.sCourseProductName != null)
            return false;
        if (sClassCapacityCode != null ? !sClassCapacityCode.equals(bsClass.sClassCapacityCode) : bsClass.sClassCapacityCode != null)
            return false;
        if (sClassCapacityName != null ? !sClassCapacityName.equals(bsClass.sClassCapacityName) : bsClass.sClassCapacityName != null)
            return false;
        if (classBookDeliveryType != null ? !classBookDeliveryType.equals(bsClass.classBookDeliveryType) : bsClass.classBookDeliveryType != null)
            return false;
        if (bLock != null ? !bLock.equals(bsClass.bLock) : bsClass.bLock != null) return false;
        if (sMemoLesson != null ? !sMemoLesson.equals(bsClass.sMemoLesson) : bsClass.sMemoLesson != null) return false;
        if (nUseCard != null ? !nUseCard.equals(bsClass.nUseCard) : bsClass.nUseCard != null) return false;
        if (sClassMode != null ? !sClassMode.equals(bsClass.sClassMode) : bsClass.sClassMode != null) return false;
        if (sClassTime != null ? !sClassTime.equals(bsClass.sClassTime) : bsClass.sClassTime != null) return false;
        if (sBookVersion != null ? !sBookVersion.equals(bsClass.sBookVersion) : bsClass.sBookVersion != null)
            return false;
        if (sTeachingContent != null ? !sTeachingContent.equals(bsClass.sTeachingContent) : bsClass.sTeachingContent != null)
            return false;
        if (bInsurance != null ? !bInsurance.equals(bsClass.bInsurance) : bsClass.bInsurance != null) return false;
        if (sProductTypeCode != null ? !sProductTypeCode.equals(bsClass.sProductTypeCode) : bsClass.sProductTypeCode != null)
            return false;
        if (dtCancelDate != null ? !dtCancelDate.equals(bsClass.dtCancelDate) : bsClass.dtCancelDate != null)
            return false;
        if (sCancelReason != null ? !sCancelReason.equals(bsClass.sCancelReason) : bsClass.sCancelReason != null)
            return false;
        if (sTeacher != null ? !sTeacher.equals(bsClass.sTeacher) : bsClass.sTeacher != null) return false;
        if (nMergeState != null ? !nMergeState.equals(bsClass.nMergeState) : bsClass.nMergeState != null) return false;
        if (sMergeRemark != null ? !sMergeRemark.equals(bsClass.sMergeRemark) : bsClass.sMergeRemark != null)
            return false;
        if (bOnlineLive != null ? !bOnlineLive.equals(bsClass.bOnlineLive) : bsClass.bOnlineLive != null) return false;
        if (sClassSubject != null ? !sClassSubject.equals(bsClass.sClassSubject) : bsClass.sClassSubject != null)
            return false;
        if (sQuarter != null ? !sQuarter.equals(bsClass.sQuarter) : bsClass.sQuarter != null) return false;
        if (bContinuedClass != null ? !bContinuedClass.equals(bsClass.bContinuedClass) : bsClass.bContinuedClass != null)
            return false;
        if (sCourseConsultant != null ? !sCourseConsultant.equals(bsClass.sCourseConsultant) : bsClass.sCourseConsultant != null)
            return false;
        if (sStudyManager != null ? !sStudyManager.equals(bsClass.sStudyManager) : bsClass.sStudyManager != null)
            return false;
        if (sOriginalClassCode != null ? !sOriginalClassCode.equals(bsClass.sOriginalClassCode) : bsClass.sOriginalClassCode != null)
            return false;
        if (sTown != null ? !sTown.equals(bsClass.sTown) : bsClass.sTown != null) return false;

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
        result = 31 * result + nState;
        result = 31 * result + (bCanRegister ? 1 : 0);
        result = 31 * result + (bIsEnd ? 1 : 0);
        result = 31 * result + (bIsResideClass ? 1 : 0);
        result = 31 * result + (sAttribute != null ? sAttribute.hashCode() : 0);
        result = 31 * result + (sClassTypeCode != null ? sClassTypeCode.hashCode() : 0);
        result = 31 * result + (sPrintAddress != null ? sPrintAddress.hashCode() : 0);
        result = 31 * result + (sLocation != null ? sLocation.hashCode() : 0);
        result = 31 * result + (sRoomCode != null ? sRoomCode.hashCode() : 0);
        result = 31 * result + (dtRegister1StDate != null ? dtRegister1StDate.hashCode() : 0);
        result = 31 * result + (sRegisterTime != null ? sRegisterTime.hashCode() : 0);
        result = 31 * result + (dtBeginDate != null ? dtBeginDate.hashCode() : 0);
        result = 31 * result + (dtEndDate != null ? dtEndDate.hashCode() : 0);
        result = 31 * result + (nHoliday != null ? nHoliday.hashCode() : 0);
        result = 31 * result + (sPrintTime != null ? sPrintTime.hashCode() : 0);
        result = 31 * result + (nLesson != null ? nLesson.hashCode() : 0);
        result = 31 * result + (nTryLesson != null ? nTryLesson.hashCode() : 0);
        result = 31 * result + (nFreeLesson != null ? nFreeLesson.hashCode() : 0);
        result = 31 * result + (nInsertLesson != null ? nInsertLesson.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (nNormalCount != null ? nNormalCount.hashCode() : 0);
        result = 31 * result + (nMaxCount != null ? nMaxCount.hashCode() : 0);
        result = 31 * result + (dFee != null ? dFee.hashCode() : 0);
        result = 31 * result + (dBookFee != null ? dBookFee.hashCode() : 0);
        result = 31 * result + (dBookCost != null ? dBookCost.hashCode() : 0);
        result = 31 * result + (dTryFee != null ? dTryFee.hashCode() : 0);
        result = 31 * result + (dInsertFee != null ? dInsertFee.hashCode() : 0);
        result = 31 * result + (nCurrentCount != null ? nCurrentCount.hashCode() : 0);
        result = 31 * result + (nSeqNumber != null ? nSeqNumber.hashCode() : 0);
        result = 31 * result + (nPostTranCount != null ? nPostTranCount.hashCode() : 0);
        result = 31 * result + nSystemTag;
        result = 31 * result + (bVirtual != null ? bVirtual.hashCode() : 0);
        result = 31 * result + (sPrintMemo != null ? sPrintMemo.hashCode() : 0);
        result = 31 * result + (nAudit != null ? nAudit.hashCode() : 0);
        result = 31 * result + (nReservedSeats != null ? nReservedSeats.hashCode() : 0);
        result = 31 * result + (dtSetupDate != null ? dtSetupDate.hashCode() : 0);
        result = 31 * result + (sOperatorCode != null ? sOperatorCode.hashCode() : 0);
        result = 31 * result + (sOperatorName != null ? sOperatorName.hashCode() : 0);
        result = 31 * result + (bPrintSeatNo ? 1 : 0);
        result = 31 * result + (nMaleMaxCount != null ? nMaleMaxCount.hashCode() : 0);
        result = 31 * result + (nFemaleMaxCount != null ? nFemaleMaxCount.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (bIsNet ? 1 : 0);
        result = 31 * result + (sAuditCode != null ? sAuditCode.hashCode() : 0);
        result = 31 * result + (dtAuditDate != null ? dtAuditDate.hashCode() : 0);
        result = 31 * result + (sModifyCode != null ? sModifyCode.hashCode() : 0);
        result = 31 * result + (dtModifyDate != null ? dtModifyDate.hashCode() : 0);
        result = 31 * result + (nFYear != null ? nFYear.hashCode() : 0);
        result = 31 * result + (sClassAttribute != null ? sClassAttribute.hashCode() : 0);
        result = 31 * result + (nPlanMinutes != null ? nPlanMinutes.hashCode() : 0);
        result = 31 * result + (nRealMinutes != null ? nRealMinutes.hashCode() : 0);
        result = 31 * result + (sClassSize != null ? sClassSize.hashCode() : 0);
        result = 31 * result + (bVip ? 1 : 0);
        result = 31 * result + (sNameBefore != null ? sNameBefore.hashCode() : 0);
        result = 31 * result + (sNameAfter != null ? sNameAfter.hashCode() : 0);
        result = 31 * result + (sNameDecorate != null ? sNameDecorate.hashCode() : 0);
        result = 31 * result + (sManagementCode != null ? sManagementCode.hashCode() : 0);
        result = 31 * result + (bSouke ? 1 : 0);
        result = 31 * result + (dtProperty != null ? dtProperty.hashCode() : 0);
        result = 31 * result + (bPublishTeacher ? 1 : 0);
        result = 31 * result + nGradualType;
        result = 31 * result + (accommodationType != null ? accommodationType.hashCode() : 0);
        result = 31 * result + (xunChengType1 != null ? xunChengType1.hashCode() : 0);
        result = 31 * result + (xunChengType2 != null ? xunChengType2.hashCode() : 0);
        result = 31 * result + (classScaleType != null ? classScaleType.hashCode() : 0);
        result = 31 * result + (bIsVideoClass != null ? bIsVideoClass.hashCode() : 0);
        result = 31 * result + (courseCode != null ? courseCode.hashCode() : 0);
        result = 31 * result + (bMainArrangeClass != null ? bMainArrangeClass.hashCode() : 0);
        result = 31 * result + (bHasTeachingMaterial != null ? bHasTeachingMaterial.hashCode() : 0);
        result = 31 * result + (nSetClassType != null ? nSetClassType.hashCode() : 0);
        result = 31 * result + (sOrderCode != null ? sOrderCode.hashCode() : 0);
        result = 31 * result + (sCourseProductName != null ? sCourseProductName.hashCode() : 0);
        result = 31 * result + (sClassCapacityCode != null ? sClassCapacityCode.hashCode() : 0);
        result = 31 * result + (sClassCapacityName != null ? sClassCapacityName.hashCode() : 0);
        result = 31 * result + (classBookDeliveryType != null ? classBookDeliveryType.hashCode() : 0);
        result = 31 * result + (bLock != null ? bLock.hashCode() : 0);
        result = 31 * result + (sMemoLesson != null ? sMemoLesson.hashCode() : 0);
        result = 31 * result + (nUseCard != null ? nUseCard.hashCode() : 0);
        result = 31 * result + (sClassMode != null ? sClassMode.hashCode() : 0);
        result = 31 * result + (sClassTime != null ? sClassTime.hashCode() : 0);
        result = 31 * result + (sBookVersion != null ? sBookVersion.hashCode() : 0);
        result = 31 * result + (sTeachingContent != null ? sTeachingContent.hashCode() : 0);
        result = 31 * result + (bInsurance != null ? bInsurance.hashCode() : 0);
        result = 31 * result + (sProductTypeCode != null ? sProductTypeCode.hashCode() : 0);
        result = 31 * result + (dtCancelDate != null ? dtCancelDate.hashCode() : 0);
        result = 31 * result + (sCancelReason != null ? sCancelReason.hashCode() : 0);
        result = 31 * result + nMakePoint;
        result = 31 * result + (sTeacher != null ? sTeacher.hashCode() : 0);
        result = 31 * result + (nMergeState != null ? nMergeState.hashCode() : 0);
        result = 31 * result + (sMergeRemark != null ? sMergeRemark.hashCode() : 0);
        result = 31 * result + (bOnlineLive != null ? bOnlineLive.hashCode() : 0);
        result = 31 * result + (sClassSubject != null ? sClassSubject.hashCode() : 0);
        result = 31 * result + (sQuarter != null ? sQuarter.hashCode() : 0);
        result = 31 * result + (bContinuedClass != null ? bContinuedClass.hashCode() : 0);
        result = 31 * result + (sCourseConsultant != null ? sCourseConsultant.hashCode() : 0);
        result = 31 * result + (sStudyManager != null ? sStudyManager.hashCode() : 0);
        result = 31 * result + (sOriginalClassCode != null ? sOriginalClassCode.hashCode() : 0);
        result = 31 * result + (sTown != null ? sTown.hashCode() : 0);
        return result;
    }
}
