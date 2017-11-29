package com.example.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "BS_Roster", schema = "dbo", catalog = "BJ20140915")
public class BsRoster {
    private int id;
    private int nSchoolId;
    private String sCardCode;
    private String sClassCode;
    private String sStudentCode;
    private boolean bValid;
    private boolean bInsert;
    private boolean bCanCancel;
    private boolean bCanTrans;
    private boolean bCanPostTrans;
    private Timestamp dtInDate;
    private String sFromClassCode;
    private Timestamp dtOutDate;
    private String sToClassCode;
    private int nSeatNo;
    private int nStartLesson;
    private int nEndLesson;
    private Integer nInType;
    private Integer nOutType;
    private int nInBiz;
    private int nOutBiz;
    private double dPay;
    private double dMaxNonCheque;
    private double dMaxCheque;
    private double dVoucher;
    private int nVoucherId;
    private double dReservedBookFee;
    private String sMemo;
    private Timestamp dtArrangeSeat;
    private Boolean bNotGetBook;
    private Boolean bGiveUpLeftFee;
    private Timestamp dtGiveUpLeftFee;
    private int nHasBizTimes;
    private Integer nFinanceAudit;
    private String sRcvRemitCode;
    private String sWebRegBillCode;
    private String sInTime;
    private String sOutTime;
    private String sNewCardCode;
    private BigDecimal dOldStudentVoucher;
    private String sAgentName;
    private String sAgentIdCard;
    private Integer nChannel;
    private String sBizMemo;
    private Timestamp dtModify;
    private Double dVoucherTransFee;
    private String sRegZoneCode;
    private Double dPointPay;
    private Integer invoicePinted;
    private String sOrderCode;
    private String sTranCancelReasonType;
    private String sTranCancelReasonItem;
    private String oldRecommendStudentCode;
    private Double nIntegralMultiple;
    private Double nIntegralOldStudent;
    private Double nIntegralGift;
    private Double nIntegralRecommendMultiple;
    private Integer nSubChannel;
    private String sSystemSource;
    private String sMarketingSources;

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
    @Column(name = "sCardCode", nullable = true, length = 30)
    public String getsCardCode() {
        return sCardCode;
    }

    public void setsCardCode(String sCardCode) {
        this.sCardCode = sCardCode;
    }

    @Basic
    @Column(name = "sClassCode", nullable = true, length = 20)
    public String getsClassCode() {
        return sClassCode;
    }

    public void setsClassCode(String sClassCode) {
        this.sClassCode = sClassCode;
    }

    @Basic
    @Column(name = "sStudentCode", nullable = true, length = 30)
    public String getsStudentCode() {
        return sStudentCode;
    }

    public void setsStudentCode(String sStudentCode) {
        this.sStudentCode = sStudentCode;
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
    @Column(name = "bInsert", nullable = false)
    public boolean isbInsert() {
        return bInsert;
    }

    public void setbInsert(boolean bInsert) {
        this.bInsert = bInsert;
    }

    @Basic
    @Column(name = "bCanCancel", nullable = false)
    public boolean isbCanCancel() {
        return bCanCancel;
    }

    public void setbCanCancel(boolean bCanCancel) {
        this.bCanCancel = bCanCancel;
    }

    @Basic
    @Column(name = "bCanTrans", nullable = false)
    public boolean isbCanTrans() {
        return bCanTrans;
    }

    public void setbCanTrans(boolean bCanTrans) {
        this.bCanTrans = bCanTrans;
    }

    @Basic
    @Column(name = "bCanPostTrans", nullable = false)
    public boolean isbCanPostTrans() {
        return bCanPostTrans;
    }

    public void setbCanPostTrans(boolean bCanPostTrans) {
        this.bCanPostTrans = bCanPostTrans;
    }

    @Basic
    @Column(name = "dtInDate", nullable = true)
    public Timestamp getDtInDate() {
        return dtInDate;
    }

    public void setDtInDate(Timestamp dtInDate) {
        this.dtInDate = dtInDate;
    }

    @Basic
    @Column(name = "sFromClassCode", nullable = true, length = 20)
    public String getsFromClassCode() {
        return sFromClassCode;
    }

    public void setsFromClassCode(String sFromClassCode) {
        this.sFromClassCode = sFromClassCode;
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
    @Column(name = "sToClassCode", nullable = true, length = 20)
    public String getsToClassCode() {
        return sToClassCode;
    }

    public void setsToClassCode(String sToClassCode) {
        this.sToClassCode = sToClassCode;
    }

    @Basic
    @Column(name = "nSeatNo", nullable = false)
    public int getnSeatNo() {
        return nSeatNo;
    }

    public void setnSeatNo(int nSeatNo) {
        this.nSeatNo = nSeatNo;
    }

    @Basic
    @Column(name = "nStartLesson", nullable = false)
    public int getnStartLesson() {
        return nStartLesson;
    }

    public void setnStartLesson(int nStartLesson) {
        this.nStartLesson = nStartLesson;
    }

    @Basic
    @Column(name = "nEndLesson", nullable = false)
    public int getnEndLesson() {
        return nEndLesson;
    }

    public void setnEndLesson(int nEndLesson) {
        this.nEndLesson = nEndLesson;
    }

    @Basic
    @Column(name = "nInType", nullable = true)
    public Integer getnInType() {
        return nInType;
    }

    public void setnInType(Integer nInType) {
        this.nInType = nInType;
    }

    @Basic
    @Column(name = "nOutType", nullable = true)
    public Integer getnOutType() {
        return nOutType;
    }

    public void setnOutType(Integer nOutType) {
        this.nOutType = nOutType;
    }

    @Basic
    @Column(name = "nInBiz", nullable = false)
    public int getnInBiz() {
        return nInBiz;
    }

    public void setnInBiz(int nInBiz) {
        this.nInBiz = nInBiz;
    }

    @Basic
    @Column(name = "nOutBiz", nullable = false)
    public int getnOutBiz() {
        return nOutBiz;
    }

    public void setnOutBiz(int nOutBiz) {
        this.nOutBiz = nOutBiz;
    }

    @Basic
    @Column(name = "dPay", nullable = false, precision = 0)
    public double getdPay() {
        return dPay;
    }

    public void setdPay(double dPay) {
        this.dPay = dPay;
    }

    @Basic
    @Column(name = "dMaxNonCheque", nullable = false, precision = 0)
    public double getdMaxNonCheque() {
        return dMaxNonCheque;
    }

    public void setdMaxNonCheque(double dMaxNonCheque) {
        this.dMaxNonCheque = dMaxNonCheque;
    }

    @Basic
    @Column(name = "dMaxCheque", nullable = false, precision = 0)
    public double getdMaxCheque() {
        return dMaxCheque;
    }

    public void setdMaxCheque(double dMaxCheque) {
        this.dMaxCheque = dMaxCheque;
    }

    @Basic
    @Column(name = "dVoucher", nullable = false, precision = 0)
    public double getdVoucher() {
        return dVoucher;
    }

    public void setdVoucher(double dVoucher) {
        this.dVoucher = dVoucher;
    }

    @Basic
    @Column(name = "nVoucherId", nullable = false)
    public int getnVoucherId() {
        return nVoucherId;
    }

    public void setnVoucherId(int nVoucherId) {
        this.nVoucherId = nVoucherId;
    }

    @Basic
    @Column(name = "dReservedBookFee", nullable = false, precision = 0)
    public double getdReservedBookFee() {
        return dReservedBookFee;
    }

    public void setdReservedBookFee(double dReservedBookFee) {
        this.dReservedBookFee = dReservedBookFee;
    }

    @Basic
    @Column(name = "sMemo", nullable = true, length = 100)
    public String getsMemo() {
        return sMemo;
    }

    public void setsMemo(String sMemo) {
        this.sMemo = sMemo;
    }

    @Basic
    @Column(name = "dtArrangeSeat", nullable = true)
    public Timestamp getDtArrangeSeat() {
        return dtArrangeSeat;
    }

    public void setDtArrangeSeat(Timestamp dtArrangeSeat) {
        this.dtArrangeSeat = dtArrangeSeat;
    }

    @Basic
    @Column(name = "bNotGetBook", nullable = true)
    public Boolean getbNotGetBook() {
        return bNotGetBook;
    }

    public void setbNotGetBook(Boolean bNotGetBook) {
        this.bNotGetBook = bNotGetBook;
    }

    @Basic
    @Column(name = "bGiveUpLeftFee", nullable = true)
    public Boolean getbGiveUpLeftFee() {
        return bGiveUpLeftFee;
    }

    public void setbGiveUpLeftFee(Boolean bGiveUpLeftFee) {
        this.bGiveUpLeftFee = bGiveUpLeftFee;
    }

    @Basic
    @Column(name = "dtGiveUpLeftFee", nullable = true)
    public Timestamp getDtGiveUpLeftFee() {
        return dtGiveUpLeftFee;
    }

    public void setDtGiveUpLeftFee(Timestamp dtGiveUpLeftFee) {
        this.dtGiveUpLeftFee = dtGiveUpLeftFee;
    }

    @Basic
    @Column(name = "nHasBizTimes", nullable = false)
    public int getnHasBizTimes() {
        return nHasBizTimes;
    }

    public void setnHasBizTimes(int nHasBizTimes) {
        this.nHasBizTimes = nHasBizTimes;
    }

    @Basic
    @Column(name = "nFinanceAudit", nullable = true)
    public Integer getnFinanceAudit() {
        return nFinanceAudit;
    }

    public void setnFinanceAudit(Integer nFinanceAudit) {
        this.nFinanceAudit = nFinanceAudit;
    }

    @Basic
    @Column(name = "sRcvRemitCode", nullable = true, length = 50)
    public String getsRcvRemitCode() {
        return sRcvRemitCode;
    }

    public void setsRcvRemitCode(String sRcvRemitCode) {
        this.sRcvRemitCode = sRcvRemitCode;
    }

    @Basic
    @Column(name = "sWebRegBillCode", nullable = true, length = 50)
    public String getsWebRegBillCode() {
        return sWebRegBillCode;
    }

    public void setsWebRegBillCode(String sWebRegBillCode) {
        this.sWebRegBillCode = sWebRegBillCode;
    }

    @Basic
    @Column(name = "sInTime", nullable = true, length = 50)
    public String getsInTime() {
        return sInTime;
    }

    public void setsInTime(String sInTime) {
        this.sInTime = sInTime;
    }

    @Basic
    @Column(name = "sOutTime", nullable = true, length = 50)
    public String getsOutTime() {
        return sOutTime;
    }

    public void setsOutTime(String sOutTime) {
        this.sOutTime = sOutTime;
    }

    @Basic
    @Column(name = "sNewCardCode", nullable = true, length = 50)
    public String getsNewCardCode() {
        return sNewCardCode;
    }

    public void setsNewCardCode(String sNewCardCode) {
        this.sNewCardCode = sNewCardCode;
    }

    @Basic
    @Column(name = "dOldStudentVoucher", nullable = true)
    public BigDecimal getdOldStudentVoucher() {
        return dOldStudentVoucher;
    }

    public void setdOldStudentVoucher(BigDecimal dOldStudentVoucher) {
        this.dOldStudentVoucher = dOldStudentVoucher;
    }

    @Basic
    @Column(name = "sAgentName", nullable = true, length = 50)
    public String getsAgentName() {
        return sAgentName;
    }

    public void setsAgentName(String sAgentName) {
        this.sAgentName = sAgentName;
    }

    @Basic
    @Column(name = "sAgentIdCard", nullable = true, length = 50)
    public String getsAgentIdCard() {
        return sAgentIdCard;
    }

    public void setsAgentIdCard(String sAgentIdCard) {
        this.sAgentIdCard = sAgentIdCard;
    }

    @Basic
    @Column(name = "nChannel", nullable = true)
    public Integer getnChannel() {
        return nChannel;
    }

    public void setnChannel(Integer nChannel) {
        this.nChannel = nChannel;
    }

    @Basic
    @Column(name = "sBizMemo", nullable = true, length = 1000)
    public String getsBizMemo() {
        return sBizMemo;
    }

    public void setsBizMemo(String sBizMemo) {
        this.sBizMemo = sBizMemo;
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
    @Column(name = "dVoucherTransFee", nullable = true, precision = 0)
    public Double getdVoucherTransFee() {
        return dVoucherTransFee;
    }

    public void setdVoucherTransFee(Double dVoucherTransFee) {
        this.dVoucherTransFee = dVoucherTransFee;
    }

    @Basic
    @Column(name = "sRegZoneCode", nullable = true, length = 20)
    public String getsRegZoneCode() {
        return sRegZoneCode;
    }

    public void setsRegZoneCode(String sRegZoneCode) {
        this.sRegZoneCode = sRegZoneCode;
    }

    @Basic
    @Column(name = "dPointPay", nullable = true, precision = 0)
    public Double getdPointPay() {
        return dPointPay;
    }

    public void setdPointPay(Double dPointPay) {
        this.dPointPay = dPointPay;
    }

    @Basic
    @Column(name = "InvoicePinted", nullable = true)
    public Integer getInvoicePinted() {
        return invoicePinted;
    }

    public void setInvoicePinted(Integer invoicePinted) {
        this.invoicePinted = invoicePinted;
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
    @Column(name = "sTranCancelReasonType", nullable = true, length = 80)
    public String getsTranCancelReasonType() {
        return sTranCancelReasonType;
    }

    public void setsTranCancelReasonType(String sTranCancelReasonType) {
        this.sTranCancelReasonType = sTranCancelReasonType;
    }

    @Basic
    @Column(name = "sTranCancelReasonItem", nullable = true, length = 80)
    public String getsTranCancelReasonItem() {
        return sTranCancelReasonItem;
    }

    public void setsTranCancelReasonItem(String sTranCancelReasonItem) {
        this.sTranCancelReasonItem = sTranCancelReasonItem;
    }

    @Basic
    @Column(name = "OldRecommendStudentCode", nullable = true, length = 30)
    public String getOldRecommendStudentCode() {
        return oldRecommendStudentCode;
    }

    public void setOldRecommendStudentCode(String oldRecommendStudentCode) {
        this.oldRecommendStudentCode = oldRecommendStudentCode;
    }

    @Basic
    @Column(name = "nIntegralMultiple", nullable = true, precision = 0)
    public Double getnIntegralMultiple() {
        return nIntegralMultiple;
    }

    public void setnIntegralMultiple(Double nIntegralMultiple) {
        this.nIntegralMultiple = nIntegralMultiple;
    }

    @Basic
    @Column(name = "nIntegralOldStudent", nullable = true, precision = 0)
    public Double getnIntegralOldStudent() {
        return nIntegralOldStudent;
    }

    public void setnIntegralOldStudent(Double nIntegralOldStudent) {
        this.nIntegralOldStudent = nIntegralOldStudent;
    }

    @Basic
    @Column(name = "nIntegralGift", nullable = true, precision = 0)
    public Double getnIntegralGift() {
        return nIntegralGift;
    }

    public void setnIntegralGift(Double nIntegralGift) {
        this.nIntegralGift = nIntegralGift;
    }

    @Basic
    @Column(name = "nIntegralRecommendMultiple", nullable = true, precision = 0)
    public Double getnIntegralRecommendMultiple() {
        return nIntegralRecommendMultiple;
    }

    public void setnIntegralRecommendMultiple(Double nIntegralRecommendMultiple) {
        this.nIntegralRecommendMultiple = nIntegralRecommendMultiple;
    }

    @Basic
    @Column(name = "nSubChannel", nullable = true)
    public Integer getnSubChannel() {
        return nSubChannel;
    }

    public void setnSubChannel(Integer nSubChannel) {
        this.nSubChannel = nSubChannel;
    }

    @Basic
    @Column(name = "sSystemSource", nullable = true, length = 50)
    public String getsSystemSource() {
        return sSystemSource;
    }

    public void setsSystemSource(String sSystemSource) {
        this.sSystemSource = sSystemSource;
    }

    @Basic
    @Column(name = "sMarketingSources", nullable = true, length = 50)
    public String getsMarketingSources() {
        return sMarketingSources;
    }

    public void setsMarketingSources(String sMarketingSources) {
        this.sMarketingSources = sMarketingSources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BsRoster bsRoster = (BsRoster) o;

        if (id != bsRoster.id) return false;
        if (nSchoolId != bsRoster.nSchoolId) return false;
        if (bValid != bsRoster.bValid) return false;
        if (bInsert != bsRoster.bInsert) return false;
        if (bCanCancel != bsRoster.bCanCancel) return false;
        if (bCanTrans != bsRoster.bCanTrans) return false;
        if (bCanPostTrans != bsRoster.bCanPostTrans) return false;
        if (nSeatNo != bsRoster.nSeatNo) return false;
        if (nStartLesson != bsRoster.nStartLesson) return false;
        if (nEndLesson != bsRoster.nEndLesson) return false;
        if (nInBiz != bsRoster.nInBiz) return false;
        if (nOutBiz != bsRoster.nOutBiz) return false;
        if (Double.compare(bsRoster.dPay, dPay) != 0) return false;
        if (Double.compare(bsRoster.dMaxNonCheque, dMaxNonCheque) != 0) return false;
        if (Double.compare(bsRoster.dMaxCheque, dMaxCheque) != 0) return false;
        if (Double.compare(bsRoster.dVoucher, dVoucher) != 0) return false;
        if (nVoucherId != bsRoster.nVoucherId) return false;
        if (Double.compare(bsRoster.dReservedBookFee, dReservedBookFee) != 0) return false;
        if (nHasBizTimes != bsRoster.nHasBizTimes) return false;
        if (sCardCode != null ? !sCardCode.equals(bsRoster.sCardCode) : bsRoster.sCardCode != null) return false;
        if (sClassCode != null ? !sClassCode.equals(bsRoster.sClassCode) : bsRoster.sClassCode != null) return false;
        if (sStudentCode != null ? !sStudentCode.equals(bsRoster.sStudentCode) : bsRoster.sStudentCode != null)
            return false;
        if (dtInDate != null ? !dtInDate.equals(bsRoster.dtInDate) : bsRoster.dtInDate != null) return false;
        if (sFromClassCode != null ? !sFromClassCode.equals(bsRoster.sFromClassCode) : bsRoster.sFromClassCode != null)
            return false;
        if (dtOutDate != null ? !dtOutDate.equals(bsRoster.dtOutDate) : bsRoster.dtOutDate != null) return false;
        if (sToClassCode != null ? !sToClassCode.equals(bsRoster.sToClassCode) : bsRoster.sToClassCode != null)
            return false;
        if (nInType != null ? !nInType.equals(bsRoster.nInType) : bsRoster.nInType != null) return false;
        if (nOutType != null ? !nOutType.equals(bsRoster.nOutType) : bsRoster.nOutType != null) return false;
        if (sMemo != null ? !sMemo.equals(bsRoster.sMemo) : bsRoster.sMemo != null) return false;
        if (dtArrangeSeat != null ? !dtArrangeSeat.equals(bsRoster.dtArrangeSeat) : bsRoster.dtArrangeSeat != null)
            return false;
        if (bNotGetBook != null ? !bNotGetBook.equals(bsRoster.bNotGetBook) : bsRoster.bNotGetBook != null)
            return false;
        if (bGiveUpLeftFee != null ? !bGiveUpLeftFee.equals(bsRoster.bGiveUpLeftFee) : bsRoster.bGiveUpLeftFee != null)
            return false;
        if (dtGiveUpLeftFee != null ? !dtGiveUpLeftFee.equals(bsRoster.dtGiveUpLeftFee) : bsRoster.dtGiveUpLeftFee != null)
            return false;
        if (nFinanceAudit != null ? !nFinanceAudit.equals(bsRoster.nFinanceAudit) : bsRoster.nFinanceAudit != null)
            return false;
        if (sRcvRemitCode != null ? !sRcvRemitCode.equals(bsRoster.sRcvRemitCode) : bsRoster.sRcvRemitCode != null)
            return false;
        if (sWebRegBillCode != null ? !sWebRegBillCode.equals(bsRoster.sWebRegBillCode) : bsRoster.sWebRegBillCode != null)
            return false;
        if (sInTime != null ? !sInTime.equals(bsRoster.sInTime) : bsRoster.sInTime != null) return false;
        if (sOutTime != null ? !sOutTime.equals(bsRoster.sOutTime) : bsRoster.sOutTime != null) return false;
        if (sNewCardCode != null ? !sNewCardCode.equals(bsRoster.sNewCardCode) : bsRoster.sNewCardCode != null)
            return false;
        if (dOldStudentVoucher != null ? !dOldStudentVoucher.equals(bsRoster.dOldStudentVoucher) : bsRoster.dOldStudentVoucher != null)
            return false;
        if (sAgentName != null ? !sAgentName.equals(bsRoster.sAgentName) : bsRoster.sAgentName != null) return false;
        if (sAgentIdCard != null ? !sAgentIdCard.equals(bsRoster.sAgentIdCard) : bsRoster.sAgentIdCard != null)
            return false;
        if (nChannel != null ? !nChannel.equals(bsRoster.nChannel) : bsRoster.nChannel != null) return false;
        if (sBizMemo != null ? !sBizMemo.equals(bsRoster.sBizMemo) : bsRoster.sBizMemo != null) return false;
        if (dtModify != null ? !dtModify.equals(bsRoster.dtModify) : bsRoster.dtModify != null) return false;
        if (dVoucherTransFee != null ? !dVoucherTransFee.equals(bsRoster.dVoucherTransFee) : bsRoster.dVoucherTransFee != null)
            return false;
        if (sRegZoneCode != null ? !sRegZoneCode.equals(bsRoster.sRegZoneCode) : bsRoster.sRegZoneCode != null)
            return false;
        if (dPointPay != null ? !dPointPay.equals(bsRoster.dPointPay) : bsRoster.dPointPay != null) return false;
        if (invoicePinted != null ? !invoicePinted.equals(bsRoster.invoicePinted) : bsRoster.invoicePinted != null)
            return false;
        if (sOrderCode != null ? !sOrderCode.equals(bsRoster.sOrderCode) : bsRoster.sOrderCode != null) return false;
        if (sTranCancelReasonType != null ? !sTranCancelReasonType.equals(bsRoster.sTranCancelReasonType) : bsRoster.sTranCancelReasonType != null)
            return false;
        if (sTranCancelReasonItem != null ? !sTranCancelReasonItem.equals(bsRoster.sTranCancelReasonItem) : bsRoster.sTranCancelReasonItem != null)
            return false;
        if (oldRecommendStudentCode != null ? !oldRecommendStudentCode.equals(bsRoster.oldRecommendStudentCode) : bsRoster.oldRecommendStudentCode != null)
            return false;
        if (nIntegralMultiple != null ? !nIntegralMultiple.equals(bsRoster.nIntegralMultiple) : bsRoster.nIntegralMultiple != null)
            return false;
        if (nIntegralOldStudent != null ? !nIntegralOldStudent.equals(bsRoster.nIntegralOldStudent) : bsRoster.nIntegralOldStudent != null)
            return false;
        if (nIntegralGift != null ? !nIntegralGift.equals(bsRoster.nIntegralGift) : bsRoster.nIntegralGift != null)
            return false;
        if (nIntegralRecommendMultiple != null ? !nIntegralRecommendMultiple.equals(bsRoster.nIntegralRecommendMultiple) : bsRoster.nIntegralRecommendMultiple != null)
            return false;
        if (nSubChannel != null ? !nSubChannel.equals(bsRoster.nSubChannel) : bsRoster.nSubChannel != null)
            return false;
        if (sSystemSource != null ? !sSystemSource.equals(bsRoster.sSystemSource) : bsRoster.sSystemSource != null)
            return false;
        if (sMarketingSources != null ? !sMarketingSources.equals(bsRoster.sMarketingSources) : bsRoster.sMarketingSources != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + nSchoolId;
        result = 31 * result + (sCardCode != null ? sCardCode.hashCode() : 0);
        result = 31 * result + (sClassCode != null ? sClassCode.hashCode() : 0);
        result = 31 * result + (sStudentCode != null ? sStudentCode.hashCode() : 0);
        result = 31 * result + (bValid ? 1 : 0);
        result = 31 * result + (bInsert ? 1 : 0);
        result = 31 * result + (bCanCancel ? 1 : 0);
        result = 31 * result + (bCanTrans ? 1 : 0);
        result = 31 * result + (bCanPostTrans ? 1 : 0);
        result = 31 * result + (dtInDate != null ? dtInDate.hashCode() : 0);
        result = 31 * result + (sFromClassCode != null ? sFromClassCode.hashCode() : 0);
        result = 31 * result + (dtOutDate != null ? dtOutDate.hashCode() : 0);
        result = 31 * result + (sToClassCode != null ? sToClassCode.hashCode() : 0);
        result = 31 * result + nSeatNo;
        result = 31 * result + nStartLesson;
        result = 31 * result + nEndLesson;
        result = 31 * result + (nInType != null ? nInType.hashCode() : 0);
        result = 31 * result + (nOutType != null ? nOutType.hashCode() : 0);
        result = 31 * result + nInBiz;
        result = 31 * result + nOutBiz;
        temp = Double.doubleToLongBits(dPay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dMaxNonCheque);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dMaxCheque);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(dVoucher);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + nVoucherId;
        temp = Double.doubleToLongBits(dReservedBookFee);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (sMemo != null ? sMemo.hashCode() : 0);
        result = 31 * result + (dtArrangeSeat != null ? dtArrangeSeat.hashCode() : 0);
        result = 31 * result + (bNotGetBook != null ? bNotGetBook.hashCode() : 0);
        result = 31 * result + (bGiveUpLeftFee != null ? bGiveUpLeftFee.hashCode() : 0);
        result = 31 * result + (dtGiveUpLeftFee != null ? dtGiveUpLeftFee.hashCode() : 0);
        result = 31 * result + nHasBizTimes;
        result = 31 * result + (nFinanceAudit != null ? nFinanceAudit.hashCode() : 0);
        result = 31 * result + (sRcvRemitCode != null ? sRcvRemitCode.hashCode() : 0);
        result = 31 * result + (sWebRegBillCode != null ? sWebRegBillCode.hashCode() : 0);
        result = 31 * result + (sInTime != null ? sInTime.hashCode() : 0);
        result = 31 * result + (sOutTime != null ? sOutTime.hashCode() : 0);
        result = 31 * result + (sNewCardCode != null ? sNewCardCode.hashCode() : 0);
        result = 31 * result + (dOldStudentVoucher != null ? dOldStudentVoucher.hashCode() : 0);
        result = 31 * result + (sAgentName != null ? sAgentName.hashCode() : 0);
        result = 31 * result + (sAgentIdCard != null ? sAgentIdCard.hashCode() : 0);
        result = 31 * result + (nChannel != null ? nChannel.hashCode() : 0);
        result = 31 * result + (sBizMemo != null ? sBizMemo.hashCode() : 0);
        result = 31 * result + (dtModify != null ? dtModify.hashCode() : 0);
        result = 31 * result + (dVoucherTransFee != null ? dVoucherTransFee.hashCode() : 0);
        result = 31 * result + (sRegZoneCode != null ? sRegZoneCode.hashCode() : 0);
        result = 31 * result + (dPointPay != null ? dPointPay.hashCode() : 0);
        result = 31 * result + (invoicePinted != null ? invoicePinted.hashCode() : 0);
        result = 31 * result + (sOrderCode != null ? sOrderCode.hashCode() : 0);
        result = 31 * result + (sTranCancelReasonType != null ? sTranCancelReasonType.hashCode() : 0);
        result = 31 * result + (sTranCancelReasonItem != null ? sTranCancelReasonItem.hashCode() : 0);
        result = 31 * result + (oldRecommendStudentCode != null ? oldRecommendStudentCode.hashCode() : 0);
        result = 31 * result + (nIntegralMultiple != null ? nIntegralMultiple.hashCode() : 0);
        result = 31 * result + (nIntegralOldStudent != null ? nIntegralOldStudent.hashCode() : 0);
        result = 31 * result + (nIntegralGift != null ? nIntegralGift.hashCode() : 0);
        result = 31 * result + (nIntegralRecommendMultiple != null ? nIntegralRecommendMultiple.hashCode() : 0);
        result = 31 * result + (nSubChannel != null ? nSubChannel.hashCode() : 0);
        result = 31 * result + (sSystemSource != null ? sSystemSource.hashCode() : 0);
        result = 31 * result + (sMarketingSources != null ? sMarketingSources.hashCode() : 0);
        return result;
    }
}
