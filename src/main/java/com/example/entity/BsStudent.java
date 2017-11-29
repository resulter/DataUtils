package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Student", schema = "dbo", catalog = "BJ20140915")
public class BsStudent {
    private int id;
    private Integer nSchoolId;
    private String sCode;
    private String sIdCard;
    private Timestamp dtBirthday;
    private String sName;
    private Integer nGender;
    private String sPhone;
    private String sMobile;
    private String sEmail;
    private String sAddress;
    private String sPostCode;
    private String sMemo;
    private BigDecimal dAccount;
    private Timestamp dtCreateTime;
    private Timestamp dtModify;
    private Integer nIncrement;
    private BigDecimal dForeGroundBalance;
    private BigDecimal dRemitBalance;
    private BigDecimal dWebBalance;
    private BigDecimal dTelBalance;
    private String sFirstContactMobile;
    private String sOtherContact;
    private String qq;
    private String msn;
    private Boolean bAdult;
    private Integer nStudyGrade;
    private Integer nAge;
    private String sMasterCode;
    private Integer nCertificateType;
    private String sConsultant;
    private Integer nGrade;
    private String sGuid;
    private String sCallInMobile;
    private String sCallInPhone;
    private String sMobile4;
    private String sMobile5;
    private String weChat;
    private Integer studentLevel;
    private Integer studentLevelSys;
    private Integer annualRevenue;
    private Integer studentAttr;
    private Boolean blacklist;
    private Boolean doNotCall;
    private Boolean isComplaintAccount;
    private Integer duplicateReasonPicklist;
    private String duplicateReason;
    private String careMailingAddress;
    private String careMailingPostCode;
    private Integer countryLookup;
    private Integer provinceLookup;
    private Integer citylookup;
    private Integer areaLookup;
    private String studySchoolId;
    private String college;
    private String major;
    private Integer wlke;
    private String compyName;
    private String oneCardNo;
    private String membership;
    private String greenChannelNo;
    private Boolean idVerified;
    private Boolean mobileChecked;
    private Boolean emailChecked;
    private String callsTo;
    private Integer crmState;
    private String contactMobile1;
    private String contactMobile2;
    private String contactMobile3;
    private String contactMobile4;
    private String phoneArea;
    private String phoneExtension;
    private BigDecimal userLevel;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nSchoolId", nullable = true)
    public Integer getnSchoolId() {
        return nSchoolId;
    }

    public void setnSchoolId(Integer nSchoolId) {
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
    @Column(name = "sIdCard", nullable = true, length = 30)
    public String getsIdCard() {
        return sIdCard;
    }

    public void setsIdCard(String sIdCard) {
        this.sIdCard = sIdCard;
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
    @Column(name = "sName", nullable = true, length = 30)
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "nGender", nullable = true)
    public Integer getnGender() {
        return nGender;
    }

    public void setnGender(Integer nGender) {
        this.nGender = nGender;
    }

    @Basic
    @Column(name = "sPhone", nullable = true, length = 100)
    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    @Basic
    @Column(name = "sMobile", nullable = true, length = 100)
    public String getsMobile() {
        return sMobile;
    }

    public void setsMobile(String sMobile) {
        this.sMobile = sMobile;
    }

    @Basic
    @Column(name = "sEmail", nullable = true, length = 40)
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    @Basic
    @Column(name = "sAddress", nullable = true, length = 300)
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
    @Column(name = "sMemo", nullable = true, length = 2147483647)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    @Basic
    @Column(name = "dAccount", nullable = false, precision = 2)
    public BigDecimal getdAccount() {
        return dAccount;
    }

    public void setdAccount(BigDecimal dAccount) {
        this.dAccount = dAccount;
    }

    @Basic
    @Column(name = "dtCreateTime", nullable = true)
    public Timestamp getDtCreateTime() {
        return dtCreateTime;
    }

    public void setDtCreateTime(Timestamp dtCreateTime) {
        this.dtCreateTime = dtCreateTime;
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
    @Column(name = "nIncrement", nullable = true)
    public Integer getnIncrement() {
        return nIncrement;
    }

    public void setnIncrement(Integer nIncrement) {
        this.nIncrement = nIncrement;
    }

    @Basic
    @Column(name = "dForeGroundBalance", nullable = false, precision = 2)
    public BigDecimal getdForeGroundBalance() {
        return dForeGroundBalance;
    }

    public void setdForeGroundBalance(BigDecimal dForeGroundBalance) {
        this.dForeGroundBalance = dForeGroundBalance;
    }

    @Basic
    @Column(name = "dRemitBalance", nullable = false, precision = 2)
    public BigDecimal getdRemitBalance() {
        return dRemitBalance;
    }

    public void setdRemitBalance(BigDecimal dRemitBalance) {
        this.dRemitBalance = dRemitBalance;
    }

    @Basic
    @Column(name = "dWebBalance", nullable = false, precision = 2)
    public BigDecimal getdWebBalance() {
        return dWebBalance;
    }

    public void setdWebBalance(BigDecimal dWebBalance) {
        this.dWebBalance = dWebBalance;
    }

    @Basic
    @Column(name = "dTelBalance", nullable = false, precision = 2)
    public BigDecimal getdTelBalance() {
        return dTelBalance;
    }

    public void setdTelBalance(BigDecimal dTelBalance) {
        this.dTelBalance = dTelBalance;
    }

    @Basic
    @Column(name = "sFirstContactMobile", nullable = true, length = 100)
    public String getsFirstContactMobile() {
        return sFirstContactMobile;
    }

    public void setsFirstContactMobile(String sFirstContactMobile) {
        this.sFirstContactMobile = sFirstContactMobile;
    }

    @Basic
    @Column(name = "sOtherContact", nullable = true, length = 500)
    public String getsOtherContact() {
        return sOtherContact;
    }

    public void setsOtherContact(String sOtherContact) {
        this.sOtherContact = sOtherContact;
    }

    @Basic
    @Column(name = "QQ", nullable = true, length = 50)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "MSN", nullable = true, length = 500)
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Basic
    @Column(name = "bAdult", nullable = true)
    public Boolean getbAdult() {
        return bAdult;
    }

    public void setbAdult(Boolean bAdult) {
        this.bAdult = bAdult;
    }

    @Basic
    @Column(name = "nStudyGrade", nullable = true)
    public Integer getnStudyGrade() {
        return nStudyGrade;
    }

    public void setnStudyGrade(Integer nStudyGrade) {
        this.nStudyGrade = nStudyGrade;
    }

    @Basic
    @Column(name = "nAge", nullable = true)
    public Integer getnAge() {
        return nAge;
    }

    public void setnAge(Integer nAge) {
        this.nAge = nAge;
    }

    @Basic
    @Column(name = "sMasterCode", nullable = true, length = 500)
    public String getsMasterCode() {
        return sMasterCode;
    }

    public void setsMasterCode(String sMasterCode) {
        this.sMasterCode = sMasterCode;
    }

    @Basic
    @Column(name = "nCertificateType", nullable = true)
    public Integer getnCertificateType() {
        return nCertificateType;
    }

    public void setnCertificateType(Integer nCertificateType) {
        this.nCertificateType = nCertificateType;
    }

    @Basic
    @Column(name = "sConsultant", nullable = true, length = 100)
    public String getsConsultant() {
        return sConsultant;
    }

    public void setsConsultant(String sConsultant) {
        this.sConsultant = sConsultant;
    }

    @Basic
    @Column(name = "nGrade", nullable = true)
    public Integer getnGrade() {
        return nGrade;
    }

    public void setnGrade(Integer nGrade) {
        this.nGrade = nGrade;
    }

    @Basic
    @Column(name = "sGUID", nullable = true, length = 80)
    public String getsGuid() {
        return sGuid;
    }

    public void setsGuid(String sGuid) {
        this.sGuid = sGuid;
    }

    @Basic
    @Column(name = "sCallInMobile", nullable = true, length = 11)
    public String getsCallInMobile() {
        return sCallInMobile;
    }

    public void setsCallInMobile(String sCallInMobile) {
        this.sCallInMobile = sCallInMobile;
    }

    @Basic
    @Column(name = "sCallInPhone", nullable = true, length = 100)
    public String getsCallInPhone() {
        return sCallInPhone;
    }

    public void setsCallInPhone(String sCallInPhone) {
        this.sCallInPhone = sCallInPhone;
    }

    @Basic
    @Column(name = "sMobile4", nullable = true, length = 11)
    public String getsMobile4() {
        return sMobile4;
    }

    public void setsMobile4(String sMobile4) {
        this.sMobile4 = sMobile4;
    }

    @Basic
    @Column(name = "sMobile5", nullable = true, length = 11)
    public String getsMobile5() {
        return sMobile5;
    }

    public void setsMobile5(String sMobile5) {
        this.sMobile5 = sMobile5;
    }

    @Basic
    @Column(name = "weChat", nullable = true, length = 30)
    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    @Basic
    @Column(name = "student_Level", nullable = true)
    public Integer getStudentLevel() {
        return studentLevel;
    }

    public void setStudentLevel(Integer studentLevel) {
        this.studentLevel = studentLevel;
    }

    @Basic
    @Column(name = "student_LevelSys", nullable = true)
    public Integer getStudentLevelSys() {
        return studentLevelSys;
    }

    public void setStudentLevelSys(Integer studentLevelSys) {
        this.studentLevelSys = studentLevelSys;
    }

    @Basic
    @Column(name = "annual_Revenue", nullable = true)
    public Integer getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Integer annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    @Basic
    @Column(name = "studentAttr", nullable = true)
    public Integer getStudentAttr() {
        return studentAttr;
    }

    public void setStudentAttr(Integer studentAttr) {
        this.studentAttr = studentAttr;
    }

    @Basic
    @Column(name = "blacklist", nullable = true)
    public Boolean getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Boolean blacklist) {
        this.blacklist = blacklist;
    }

    @Basic
    @Column(name = "do_not_call", nullable = true)
    public Boolean getDoNotCall() {
        return doNotCall;
    }

    public void setDoNotCall(Boolean doNotCall) {
        this.doNotCall = doNotCall;
    }

    @Basic
    @Column(name = "isComplaintAccount", nullable = true)
    public Boolean getComplaintAccount() {
        return isComplaintAccount;
    }

    public void setComplaintAccount(Boolean complaintAccount) {
        isComplaintAccount = complaintAccount;
    }

    @Basic
    @Column(name = "duplicate_Reason_Picklist", nullable = true)
    public Integer getDuplicateReasonPicklist() {
        return duplicateReasonPicklist;
    }

    public void setDuplicateReasonPicklist(Integer duplicateReasonPicklist) {
        this.duplicateReasonPicklist = duplicateReasonPicklist;
    }

    @Basic
    @Column(name = "duplicate_Reason", nullable = true, length = 200)
    public String getDuplicateReason() {
        return duplicateReason;
    }

    public void setDuplicateReason(String duplicateReason) {
        this.duplicateReason = duplicateReason;
    }

    @Basic
    @Column(name = "care_Mailing_Address", nullable = true, length = 200)
    public String getCareMailingAddress() {
        return careMailingAddress;
    }

    public void setCareMailingAddress(String careMailingAddress) {
        this.careMailingAddress = careMailingAddress;
    }

    @Basic
    @Column(name = "care_Mailing_Post_Code", nullable = true, length = 10)
    public String getCareMailingPostCode() {
        return careMailingPostCode;
    }

    public void setCareMailingPostCode(String careMailingPostCode) {
        this.careMailingPostCode = careMailingPostCode;
    }

    @Basic
    @Column(name = "countryLookup", nullable = true)
    public Integer getCountryLookup() {
        return countryLookup;
    }

    public void setCountryLookup(Integer countryLookup) {
        this.countryLookup = countryLookup;
    }

    @Basic
    @Column(name = "provinceLookup", nullable = true)
    public Integer getProvinceLookup() {
        return provinceLookup;
    }

    public void setProvinceLookup(Integer provinceLookup) {
        this.provinceLookup = provinceLookup;
    }

    @Basic
    @Column(name = "citylookup", nullable = true)
    public Integer getCitylookup() {
        return citylookup;
    }

    public void setCitylookup(Integer citylookup) {
        this.citylookup = citylookup;
    }

    @Basic
    @Column(name = "areaLookup", nullable = true)
    public Integer getAreaLookup() {
        return areaLookup;
    }

    public void setAreaLookup(Integer areaLookup) {
        this.areaLookup = areaLookup;
    }

    @Basic
    @Column(name = "studySchoolId", nullable = true, length = 200)
    public String getStudySchoolId() {
        return studySchoolId;
    }

    public void setStudySchoolId(String studySchoolId) {
        this.studySchoolId = studySchoolId;
    }

    @Basic
    @Column(name = "college", nullable = true, length = 200)
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Basic
    @Column(name = "major", nullable = true, length = 200)
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "wlke", nullable = true)
    public Integer getWlke() {
        return wlke;
    }

    public void setWlke(Integer wlke) {
        this.wlke = wlke;
    }

    @Basic
    @Column(name = "CompyName", nullable = true, length = 200)
    public String getCompyName() {
        return compyName;
    }

    public void setCompyName(String compyName) {
        this.compyName = compyName;
    }

    @Basic
    @Column(name = "One_Card_No", nullable = true, length = 50)
    public String getOneCardNo() {
        return oneCardNo;
    }

    public void setOneCardNo(String oneCardNo) {
        this.oneCardNo = oneCardNo;
    }

    @Basic
    @Column(name = "Membership", nullable = true, length = 50)
    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    @Basic
    @Column(name = "Green_Channel_No", nullable = true, length = 50)
    public String getGreenChannelNo() {
        return greenChannelNo;
    }

    public void setGreenChannelNo(String greenChannelNo) {
        this.greenChannelNo = greenChannelNo;
    }

    @Basic
    @Column(name = "ID_Verified", nullable = true)
    public Boolean getIdVerified() {
        return idVerified;
    }

    public void setIdVerified(Boolean idVerified) {
        this.idVerified = idVerified;
    }

    @Basic
    @Column(name = "Mobile_Checked", nullable = true)
    public Boolean getMobileChecked() {
        return mobileChecked;
    }

    public void setMobileChecked(Boolean mobileChecked) {
        this.mobileChecked = mobileChecked;
    }

    @Basic
    @Column(name = "Email_Checked", nullable = true)
    public Boolean getEmailChecked() {
        return emailChecked;
    }

    public void setEmailChecked(Boolean emailChecked) {
        this.emailChecked = emailChecked;
    }

    @Basic
    @Column(name = "Calls_To", nullable = true, length = 50)
    public String getCallsTo() {
        return callsTo;
    }

    public void setCallsTo(String callsTo) {
        this.callsTo = callsTo;
    }

    @Basic
    @Column(name = "CRMState", nullable = true)
    public Integer getCrmState() {
        return crmState;
    }

    public void setCrmState(Integer crmState) {
        this.crmState = crmState;
    }

    @Basic
    @Column(name = "ContactMobile1", nullable = true, length = 20)
    public String getContactMobile1() {
        return contactMobile1;
    }

    public void setContactMobile1(String contactMobile1) {
        this.contactMobile1 = contactMobile1;
    }

    @Basic
    @Column(name = "ContactMobile2", nullable = true, length = 20)
    public String getContactMobile2() {
        return contactMobile2;
    }

    public void setContactMobile2(String contactMobile2) {
        this.contactMobile2 = contactMobile2;
    }

    @Basic
    @Column(name = "ContactMobile3", nullable = true, length = 20)
    public String getContactMobile3() {
        return contactMobile3;
    }

    public void setContactMobile3(String contactMobile3) {
        this.contactMobile3 = contactMobile3;
    }

    @Basic
    @Column(name = "ContactMobile4", nullable = true, length = 20)
    public String getContactMobile4() {
        return contactMobile4;
    }

    public void setContactMobile4(String contactMobile4) {
        this.contactMobile4 = contactMobile4;
    }

    @Basic
    @Column(name = "PhoneArea", nullable = true, length = 10)
    public String getPhoneArea() {
        return phoneArea;
    }

    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    @Basic
    @Column(name = "PhoneExtension", nullable = true, length = 50)
    public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    @Basic
    @Column(name = "UserLevel", nullable = true, precision = 2)
    public BigDecimal getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(BigDecimal userLevel) {
        this.userLevel = userLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsStudent bsStudent = (BsStudent) o;

        if (id != bsStudent.id) return false;
        if (nSchoolId != null ? !nSchoolId.equals(bsStudent.nSchoolId) : bsStudent.nSchoolId != null) return false;
        if (sCode != null ? !sCode.equals(bsStudent.sCode) : bsStudent.sCode != null) return false;
        if (sIdCard != null ? !sIdCard.equals(bsStudent.sIdCard) : bsStudent.sIdCard != null) return false;
        if (dtBirthday != null ? !dtBirthday.equals(bsStudent.dtBirthday) : bsStudent.dtBirthday != null) return false;
        if (sName != null ? !sName.equals(bsStudent.sName) : bsStudent.sName != null) return false;
        if (nGender != null ? !nGender.equals(bsStudent.nGender) : bsStudent.nGender != null) return false;
        if (sPhone != null ? !sPhone.equals(bsStudent.sPhone) : bsStudent.sPhone != null) return false;
        if (sMobile != null ? !sMobile.equals(bsStudent.sMobile) : bsStudent.sMobile != null) return false;
        if (sEmail != null ? !sEmail.equals(bsStudent.sEmail) : bsStudent.sEmail != null) return false;
        if (sAddress != null ? !sAddress.equals(bsStudent.sAddress) : bsStudent.sAddress != null) return false;
        if (sPostCode != null ? !sPostCode.equals(bsStudent.sPostCode) : bsStudent.sPostCode != null) return false;
        if (sMemo != null ? !sMemo.equals(bsStudent.sMemo) : bsStudent.sMemo != null) return false;
        if (dAccount != null ? !dAccount.equals(bsStudent.dAccount) : bsStudent.dAccount != null) return false;
        if (dtCreateTime != null ? !dtCreateTime.equals(bsStudent.dtCreateTime) : bsStudent.dtCreateTime != null)
            return false;
        if (dtModify != null ? !dtModify.equals(bsStudent.dtModify) : bsStudent.dtModify != null) return false;
        if (nIncrement != null ? !nIncrement.equals(bsStudent.nIncrement) : bsStudent.nIncrement != null) return false;
        if (dForeGroundBalance != null ? !dForeGroundBalance.equals(bsStudent.dForeGroundBalance) : bsStudent.dForeGroundBalance != null)
            return false;
        if (dRemitBalance != null ? !dRemitBalance.equals(bsStudent.dRemitBalance) : bsStudent.dRemitBalance != null)
            return false;
        if (dWebBalance != null ? !dWebBalance.equals(bsStudent.dWebBalance) : bsStudent.dWebBalance != null)
            return false;
        if (dTelBalance != null ? !dTelBalance.equals(bsStudent.dTelBalance) : bsStudent.dTelBalance != null)
            return false;
        if (sFirstContactMobile != null ? !sFirstContactMobile.equals(bsStudent.sFirstContactMobile) : bsStudent.sFirstContactMobile != null)
            return false;
        if (sOtherContact != null ? !sOtherContact.equals(bsStudent.sOtherContact) : bsStudent.sOtherContact != null)
            return false;
        if (qq != null ? !qq.equals(bsStudent.qq) : bsStudent.qq != null) return false;
        if (msn != null ? !msn.equals(bsStudent.msn) : bsStudent.msn != null) return false;
        if (bAdult != null ? !bAdult.equals(bsStudent.bAdult) : bsStudent.bAdult != null) return false;
        if (nStudyGrade != null ? !nStudyGrade.equals(bsStudent.nStudyGrade) : bsStudent.nStudyGrade != null)
            return false;
        if (nAge != null ? !nAge.equals(bsStudent.nAge) : bsStudent.nAge != null) return false;
        if (sMasterCode != null ? !sMasterCode.equals(bsStudent.sMasterCode) : bsStudent.sMasterCode != null)
            return false;
        if (nCertificateType != null ? !nCertificateType.equals(bsStudent.nCertificateType) : bsStudent.nCertificateType != null)
            return false;
        if (sConsultant != null ? !sConsultant.equals(bsStudent.sConsultant) : bsStudent.sConsultant != null)
            return false;
        if (nGrade != null ? !nGrade.equals(bsStudent.nGrade) : bsStudent.nGrade != null) return false;
        if (sGuid != null ? !sGuid.equals(bsStudent.sGuid) : bsStudent.sGuid != null) return false;
        if (sCallInMobile != null ? !sCallInMobile.equals(bsStudent.sCallInMobile) : bsStudent.sCallInMobile != null)
            return false;
        if (sCallInPhone != null ? !sCallInPhone.equals(bsStudent.sCallInPhone) : bsStudent.sCallInPhone != null)
            return false;
        if (sMobile4 != null ? !sMobile4.equals(bsStudent.sMobile4) : bsStudent.sMobile4 != null) return false;
        if (sMobile5 != null ? !sMobile5.equals(bsStudent.sMobile5) : bsStudent.sMobile5 != null) return false;
        if (weChat != null ? !weChat.equals(bsStudent.weChat) : bsStudent.weChat != null) return false;
        if (studentLevel != null ? !studentLevel.equals(bsStudent.studentLevel) : bsStudent.studentLevel != null)
            return false;
        if (studentLevelSys != null ? !studentLevelSys.equals(bsStudent.studentLevelSys) : bsStudent.studentLevelSys != null)
            return false;
        if (annualRevenue != null ? !annualRevenue.equals(bsStudent.annualRevenue) : bsStudent.annualRevenue != null)
            return false;
        if (studentAttr != null ? !studentAttr.equals(bsStudent.studentAttr) : bsStudent.studentAttr != null)
            return false;
        if (blacklist != null ? !blacklist.equals(bsStudent.blacklist) : bsStudent.blacklist != null) return false;
        if (doNotCall != null ? !doNotCall.equals(bsStudent.doNotCall) : bsStudent.doNotCall != null) return false;
        if (isComplaintAccount != null ? !isComplaintAccount.equals(bsStudent.isComplaintAccount) : bsStudent.isComplaintAccount != null)
            return false;
        if (duplicateReasonPicklist != null ? !duplicateReasonPicklist.equals(bsStudent.duplicateReasonPicklist) : bsStudent.duplicateReasonPicklist != null)
            return false;
        if (duplicateReason != null ? !duplicateReason.equals(bsStudent.duplicateReason) : bsStudent.duplicateReason != null)
            return false;
        if (careMailingAddress != null ? !careMailingAddress.equals(bsStudent.careMailingAddress) : bsStudent.careMailingAddress != null)
            return false;
        if (careMailingPostCode != null ? !careMailingPostCode.equals(bsStudent.careMailingPostCode) : bsStudent.careMailingPostCode != null)
            return false;
        if (countryLookup != null ? !countryLookup.equals(bsStudent.countryLookup) : bsStudent.countryLookup != null)
            return false;
        if (provinceLookup != null ? !provinceLookup.equals(bsStudent.provinceLookup) : bsStudent.provinceLookup != null)
            return false;
        if (citylookup != null ? !citylookup.equals(bsStudent.citylookup) : bsStudent.citylookup != null) return false;
        if (areaLookup != null ? !areaLookup.equals(bsStudent.areaLookup) : bsStudent.areaLookup != null) return false;
        if (studySchoolId != null ? !studySchoolId.equals(bsStudent.studySchoolId) : bsStudent.studySchoolId != null)
            return false;
        if (college != null ? !college.equals(bsStudent.college) : bsStudent.college != null) return false;
        if (major != null ? !major.equals(bsStudent.major) : bsStudent.major != null) return false;
        if (wlke != null ? !wlke.equals(bsStudent.wlke) : bsStudent.wlke != null) return false;
        if (compyName != null ? !compyName.equals(bsStudent.compyName) : bsStudent.compyName != null) return false;
        if (oneCardNo != null ? !oneCardNo.equals(bsStudent.oneCardNo) : bsStudent.oneCardNo != null) return false;
        if (membership != null ? !membership.equals(bsStudent.membership) : bsStudent.membership != null) return false;
        if (greenChannelNo != null ? !greenChannelNo.equals(bsStudent.greenChannelNo) : bsStudent.greenChannelNo != null)
            return false;
        if (idVerified != null ? !idVerified.equals(bsStudent.idVerified) : bsStudent.idVerified != null) return false;
        if (mobileChecked != null ? !mobileChecked.equals(bsStudent.mobileChecked) : bsStudent.mobileChecked != null)
            return false;
        if (emailChecked != null ? !emailChecked.equals(bsStudent.emailChecked) : bsStudent.emailChecked != null)
            return false;
        if (callsTo != null ? !callsTo.equals(bsStudent.callsTo) : bsStudent.callsTo != null) return false;
        if (crmState != null ? !crmState.equals(bsStudent.crmState) : bsStudent.crmState != null) return false;
        if (contactMobile1 != null ? !contactMobile1.equals(bsStudent.contactMobile1) : bsStudent.contactMobile1 != null)
            return false;
        if (contactMobile2 != null ? !contactMobile2.equals(bsStudent.contactMobile2) : bsStudent.contactMobile2 != null)
            return false;
        if (contactMobile3 != null ? !contactMobile3.equals(bsStudent.contactMobile3) : bsStudent.contactMobile3 != null)
            return false;
        if (contactMobile4 != null ? !contactMobile4.equals(bsStudent.contactMobile4) : bsStudent.contactMobile4 != null)
            return false;
        if (phoneArea != null ? !phoneArea.equals(bsStudent.phoneArea) : bsStudent.phoneArea != null) return false;
        if (phoneExtension != null ? !phoneExtension.equals(bsStudent.phoneExtension) : bsStudent.phoneExtension != null)
            return false;
        if (userLevel != null ? !userLevel.equals(bsStudent.userLevel) : bsStudent.userLevel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nSchoolId != null ? nSchoolId.hashCode() : 0);
        result = 31 * result + (sCode != null ? sCode.hashCode() : 0);
        result = 31 * result + (sIdCard != null ? sIdCard.hashCode() : 0);
        result = 31 * result + (dtBirthday != null ? dtBirthday.hashCode() : 0);
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        result = 31 * result + (nGender != null ? nGender.hashCode() : 0);
        result = 31 * result + (sPhone != null ? sPhone.hashCode() : 0);
        result = 31 * result + (sMobile != null ? sMobile.hashCode() : 0);
        result = 31 * result + (sEmail != null ? sEmail.hashCode() : 0);
        result = 31 * result + (sAddress != null ? sAddress.hashCode() : 0);
        result = 31 * result + (sPostCode != null ? sPostCode.hashCode() : 0);
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (dAccount != null ? dAccount.hashCode() : 0);
        result = 31 * result + (dtCreateTime != null ? dtCreateTime.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (nIncrement != null ? nIncrement.hashCode() : 0);
        result = 31 * result + (dForeGroundBalance != null ? dForeGroundBalance.hashCode() : 0);
        result = 31 * result + (dRemitBalance != null ? dRemitBalance.hashCode() : 0);
        result = 31 * result + (dWebBalance != null ? dWebBalance.hashCode() : 0);
        result = 31 * result + (dTelBalance != null ? dTelBalance.hashCode() : 0);
        result = 31 * result + (sFirstContactMobile != null ? sFirstContactMobile.hashCode() : 0);
        result = 31 * result + (sOtherContact != null ? sOtherContact.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (msn != null ? msn.hashCode() : 0);
        result = 31 * result + (bAdult != null ? bAdult.hashCode() : 0);
        result = 31 * result + (nStudyGrade != null ? nStudyGrade.hashCode() : 0);
        result = 31 * result + (nAge != null ? nAge.hashCode() : 0);
        result = 31 * result + (sMasterCode != null ? sMasterCode.hashCode() : 0);
        result = 31 * result + (nCertificateType != null ? nCertificateType.hashCode() : 0);
        result = 31 * result + (sConsultant != null ? sConsultant.hashCode() : 0);
        result = 31 * result + (nGrade != null ? nGrade.hashCode() : 0);
        result = 31 * result + (sGuid != null ? sGuid.hashCode() : 0);
        result = 31 * result + (sCallInMobile != null ? sCallInMobile.hashCode() : 0);
        result = 31 * result + (sCallInPhone != null ? sCallInPhone.hashCode() : 0);
        result = 31 * result + (sMobile4 != null ? sMobile4.hashCode() : 0);
        result = 31 * result + (sMobile5 != null ? sMobile5.hashCode() : 0);
        result = 31 * result + (weChat != null ? weChat.hashCode() : 0);
        result = 31 * result + (studentLevel != null ? studentLevel.hashCode() : 0);
        result = 31 * result + (studentLevelSys != null ? studentLevelSys.hashCode() : 0);
        result = 31 * result + (annualRevenue != null ? annualRevenue.hashCode() : 0);
        result = 31 * result + (studentAttr != null ? studentAttr.hashCode() : 0);
        result = 31 * result + (blacklist != null ? blacklist.hashCode() : 0);
        result = 31 * result + (doNotCall != null ? doNotCall.hashCode() : 0);
        result = 31 * result + (isComplaintAccount != null ? isComplaintAccount.hashCode() : 0);
        result = 31 * result + (duplicateReasonPicklist != null ? duplicateReasonPicklist.hashCode() : 0);
        result = 31 * result + (duplicateReason != null ? duplicateReason.hashCode() : 0);
        result = 31 * result + (careMailingAddress != null ? careMailingAddress.hashCode() : 0);
        result = 31 * result + (careMailingPostCode != null ? careMailingPostCode.hashCode() : 0);
        result = 31 * result + (countryLookup != null ? countryLookup.hashCode() : 0);
        result = 31 * result + (provinceLookup != null ? provinceLookup.hashCode() : 0);
        result = 31 * result + (citylookup != null ? citylookup.hashCode() : 0);
        result = 31 * result + (areaLookup != null ? areaLookup.hashCode() : 0);
        result = 31 * result + (studySchoolId != null ? studySchoolId.hashCode() : 0);
        result = 31 * result + (college != null ? college.hashCode() : 0);
        result = 31 * result + (major != null ? major.hashCode() : 0);
        result = 31 * result + (wlke != null ? wlke.hashCode() : 0);
        result = 31 * result + (compyName != null ? compyName.hashCode() : 0);
        result = 31 * result + (oneCardNo != null ? oneCardNo.hashCode() : 0);
        result = 31 * result + (membership != null ? membership.hashCode() : 0);
        result = 31 * result + (greenChannelNo != null ? greenChannelNo.hashCode() : 0);
        result = 31 * result + (idVerified != null ? idVerified.hashCode() : 0);
        result = 31 * result + (mobileChecked != null ? mobileChecked.hashCode() : 0);
        result = 31 * result + (emailChecked != null ? emailChecked.hashCode() : 0);
        result = 31 * result + (callsTo != null ? callsTo.hashCode() : 0);
        result = 31 * result + (crmState != null ? crmState.hashCode() : 0);
        result = 31 * result + (contactMobile1 != null ? contactMobile1.hashCode() : 0);
        result = 31 * result + (contactMobile2 != null ? contactMobile2.hashCode() : 0);
        result = 31 * result + (contactMobile3 != null ? contactMobile3.hashCode() : 0);
        result = 31 * result + (contactMobile4 != null ? contactMobile4.hashCode() : 0);
        result = 31 * result + (phoneArea != null ? phoneArea.hashCode() : 0);
        result = 31 * result + (phoneExtension != null ? phoneExtension.hashCode() : 0);
        result = 31 * result + (userLevel != null ? userLevel.hashCode() : 0);
        return result;
    }
}
