/*
Navicat SQL Server Data Transfer

Source Server         : util
Source Server Version : 105000
Source Host           : 192.168.25.98:1433
Source Database       : BJ20140915
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 105000
File Encoding         : 65001

Date: 2017-11-29 16:27:55
*/


-- ----------------------------
-- Table structure for BS_Area
-- ----------------------------
DROP TABLE [BS_Area]
GO
CREATE TABLE [BS_Area] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NULL ,
[sName] varchar(200) NULL ,
[sLongName] varchar(50) NULL ,
[sDescription] varchar(200) NULL ,
[sPostCode] varchar(10) NULL ,
[sRoute] varchar(1000) NULL ,
[sAddress] varchar(500) NULL ,
[sMemo] varchar(200) NULL ,
[bValid] bit NOT NULL ,
[nAudit] int NOT NULL ,
[dtModify] datetime NULL ,
[sEnglishAreaName] nvarchar(200) NULL ,
[nGrossArea] float(53) NULL ,
[sMainAreaCode] varchar(50) NULL ,
[bAccommodationBase] bit NULL ,
[bTemproray] bit NULL ,
[bFormal] bit NULL ,
[nOtherArea] float(53) NULL ,
[nWorkIndoorArea] float(53) NULL ,
[nTeachIndoorArea] float(53) NULL ,
[nPoolRatio] float(53) NULL ,
[nTeachArea] float(53) NULL ,
[nWorkArea] float(53) NULL ,
[sOperatorCode] varchar(50) NULL ,
[sAuditCode] varchar(50) NULL ,
[dtAuditDate] datetime NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Area]', RESEED, 102)
GO

-- ----------------------------
-- Table structure for BS_AreaNew
-- ----------------------------
DROP TABLE [BS_AreaNew]
GO
CREATE TABLE [BS_AreaNew] (
[ID] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[sCode] nvarchar(50) NULL ,
[sName] nvarchar(50) NULL ,
[sFatherCode] nvarchar(50) NULL ,
[bValid] bit NOT NULL 
)


GO
DBCC CHECKIDENT(N'[BS_AreaNew]', RESEED, 3525)
GO

-- ----------------------------
-- Table structure for BS_Class
-- ----------------------------
DROP TABLE [BS_Class]
GO
CREATE TABLE [BS_Class] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(20) NULL ,
[sFCode] varchar(30) NULL ,
[sName] varchar(50) NULL ,
[sDescription] varchar(60) NULL ,
[nState] int NOT NULL ,
[bCanRegister] bit NOT NULL ,
[bIsEnd] bit NOT NULL ,
[bIsResideClass] bit NOT NULL ,
[sAttribute] varchar(150) NULL ,
[sClassTypeCode] varchar(30) NOT NULL ,
[sPrintAddress] varchar(1000) NULL ,
[sLocation] varchar(200) NULL ,
[sRoomCode] varchar(20) NULL ,
[dtRegister1stDate] datetime NULL ,
[sRegisterTime] varchar(1000) NULL ,
[dtBeginDate] datetime NULL ,
[dtEndDate] datetime NULL ,
[nHoliday] int NULL ,
[sPrintTime] varchar(1000) NULL ,
[nLesson] int NULL ,
[nTryLesson] int NULL ,
[nFreeLesson] int NULL ,
[nInsertLesson] int NULL ,
[sMemo] varchar(1000) NULL ,
[nNormalCount] int NULL ,
[nMaxCount] int NULL ,
[dFee] float(53) NULL ,
[dBookFee] float(53) NULL ,
[dBookCost] float(53) NULL ,
[dTryFee] float(53) NULL ,
[dInsertFee] float(53) NULL ,
[nCurrentCount] int NULL ,
[nSeqNumber] int NULL ,
[nPostTranCount] int NULL ,
[nSystemTag] int NOT NULL ,
[bVirtual] bit NULL ,
[sPrintMemo] varchar(1000) NULL ,
[nAudit] int NULL ,
[nReservedSeats] int NULL ,
[dtSetupDate] datetime NULL ,
[sOperatorCode] varchar(50) NULL ,
[sOperatorName] varchar(50) NULL ,
[bPrintSeatNo] bit NOT NULL ,
[nMaleMaxCount] int NULL ,
[nFemaleMaxCount] int NULL ,
[dtModify] datetime NULL ,
[bIsNet] bit NOT NULL ,
[sAuditCode] varchar(50) NULL ,
[dtAuditDate] datetime NULL ,
[sModifyCode] varchar(50) NULL ,
[dtModifyDate] datetime NULL ,
[nFYear] int NULL ,
[sClassAttribute] varchar(200) NULL ,
[nPlanMinutes] int NULL ,
[nRealMinutes] int NULL ,
[sClassSize] varchar(200) NULL ,
[bVIP] bit NOT NULL ,
[sNameBefore] varchar(10) NULL ,
[sNameAfter] varchar(30) NULL ,
[sNameDecorate] varchar(24) NULL ,
[sManagementCode] varchar(50) NULL ,
[bSouke] bit NOT NULL ,
[dtProperty] datetime NULL ,
[bPublishTeacher] bit NOT NULL ,
[nGradualType] int NOT NULL ,
[AccommodationType] int NULL ,
[XunChengType1] varchar(500) NULL ,
[XunChengType2] varchar(500) NULL ,
[ClassScaleType] varchar(500) NULL ,
[bIsVideoClass] bit NULL ,
[CourseCode] nvarchar(50) NULL ,
[bMainArrangeClass] bit NULL ,
[bHasTeachingMaterial] bit NULL ,
[nSetClassType] int NULL ,
[sOrderCode] nvarchar(50) NULL ,
[sCourseProductName] varchar(128) NULL ,
[sClassCapacityCode] varchar(64) NULL ,
[sClassCapacityName] varchar(64) NULL ,
[ClassBookDeliveryType] int NULL ,
[bLock] bit NULL ,
[sMemoLesson] varchar(500) NULL ,
[nUseCard] int NULL ,
[sClassMode] varchar(50) NULL ,
[sClassTime] varchar(50) NULL ,
[sBookVersion] varchar(100) NULL ,
[sTeachingContent] varchar(100) NULL ,
[bInsurance] bit NULL ,
[sProductTypeCode] varchar(50) NULL ,
[dtCancelDate] datetime NULL ,
[sCancelReason] varchar(50) NULL ,
[nMakePoint] int NOT NULL ,
[sTeacher] varchar(50) NULL ,
[nMergeState] int NULL ,
[sMergeRemark] nvarchar(1000) NULL ,
[bOnlineLive] bit NULL ,
[sClassSubject] varchar(200) NULL ,
[sQuarter] varchar(200) NULL ,
[bContinuedClass] bit NULL ,
[sCourseConsultant] varchar(50) NULL ,
[sStudyManager] varchar(50) NULL ,
[sOriginalClassCode] varchar(20) NULL ,
[sTown] varchar(50) NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Class]', RESEED, 251259)
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'nInsertLesson')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'为空的时候意味着没有插班课时限制'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nInsertLesson'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'为空的时候意味着没有插班课时限制'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nInsertLesson'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'dBookFee')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'教材可退款'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dBookFee'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'教材可退款'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dBookFee'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'dBookCost')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'教材成本'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dBookCost'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'教材成本'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dBookCost'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'nReservedSeats')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'预留座位数，供排座用，在排座表读写'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nReservedSeats'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'预留座位数，供排座用，在排座表读写'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nReservedSeats'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'dtSetupDate')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'设班日期'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dtSetupDate'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'设班日期'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'dtSetupDate'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'sOperatorCode')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'设班操作员编码'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'sOperatorCode'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'设班操作员编码'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'sOperatorCode'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'sOperatorName')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'设班操作员姓名'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'sOperatorName'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'设班操作员姓名'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'sOperatorName'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'nMaleMaxCount')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'住宿班，男生最大人数'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nMaleMaxCount'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'住宿班，男生最大人数'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nMaleMaxCount'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Class', 
'COLUMN', N'nFemaleMaxCount')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'住宿班，女生最大人数'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nFemaleMaxCount'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'住宿班，女生最大人数'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Class'
, @level2type = 'COLUMN', @level2name = N'nFemaleMaxCount'
GO

-- ----------------------------
-- Table structure for BS_ClassType
-- ----------------------------
DROP TABLE [BS_ClassType]
GO
CREATE TABLE [BS_ClassType] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NOT NULL ,
[sFCode] varchar(30) NULL ,
[sName] varchar(100) NULL ,
[sProjectCode] varchar(20) NOT NULL ,
[sDescription] varchar(200) NULL ,
[sMemo] varchar(200) NULL ,
[nAudit] int NOT NULL ,
[nSystemTag] int NOT NULL ,
[dtModify] datetime NULL ,
[dtEndDate] date NULL 
)


GO
DBCC CHECKIDENT(N'[BS_ClassType]', RESEED, 2340)
GO

-- ----------------------------
-- Table structure for BS_Course
-- ----------------------------
DROP TABLE [BS_Course]
GO
CREATE TABLE [BS_Course] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NULL ,
[sDeptCode] varchar(20) NULL ,
[sName] varchar(200) NULL ,
[sDescription] varchar(200) NULL ,
[sMemo] varchar(200) NULL ,
[bValid] bit NOT NULL ,
[nAudit] int NULL ,
[dtModify] datetime NULL ,
[sCourseEngLishName] varchar(200) NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Course]', RESEED, 3852)
GO

-- ----------------------------
-- Table structure for BS_Lesson
-- ----------------------------
DROP TABLE [BS_Lesson]
GO
CREATE TABLE [BS_Lesson] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sClassCode] varchar(30) NULL ,
[nLessonNo] int NOT NULL ,
[nLessonNo1] int NULL ,
[sRoomCode] varchar(30) NULL ,
[sTeacherCode] varchar(30) NULL ,
[sCourseCode] varchar(30) NULL ,
[dtDate] datetime NULL ,
[dRoomCost] float(53) NULL ,
[dTeacherCost] float(53) NULL ,
[sMemo] varchar(500) NULL ,
[SectBegin] datetime NULL ,
[SectEnd] datetime NULL ,
[LectureCode] varchar(30) NULL ,
[LessonType] int NULL ,
[nMinute] AS  ,
[sTeacherCode2] varchar(30) NULL ,
[sTeacherCode3] varchar(30) NULL ,
[sLessonMemo] varchar(100) NULL ,
[nLessonNoCourse] int NULL ,
[nAudit] int NOT NULL ,
[AuditorCode] varchar(50) NULL ,
[AuditDate] datetime NULL ,
[sOperatorCode] varchar(100) NULL ,
[sOperateDate] datetime NULL ,
[sWeek] AS  ,
[CardPush] int NULL ,
[bIfPublish] bit NULL ,
[CardPushStudent] int NULL ,
[CardPushTeacher] int NULL ,
[dt_hb_Date] datetime NULL ,
[dt_hb_SectBegin] datetime NULL ,
[dt_hb_SectEnd] datetime NULL ,
[s_hb_TeacherCode] varchar(30) NULL ,
[s_hb_TeacherCode2] varchar(30) NULL ,
[s_hb_TeacherCode3] varchar(30) NULL ,
[s_hb_CourseCode] varchar(30) NULL ,
[s_hb_RoomCode] varchar(30) NULL ,
[s_hb_ManagementCode] varchar(50) NULL ,
[n_hb_Flag] bit NULL ,
[sMergeRemark] nvarchar(1000) NULL ,
[CardPushTeacher2] int NULL ,
[CardPushTeacher3] int NULL ,
[nIsVideoLesson] int NOT NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Lesson]', RESEED, 16725374)
GO

-- ----------------------------
-- Table structure for BS_Lesson_Trg
-- ----------------------------
DROP TABLE [BS_Lesson_Trg]
GO
CREATE TABLE [BS_Lesson_Trg] (
[MID] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nLessonID] int NULL ,
[dtModify] datetime NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Lesson_Trg]', RESEED, 2643544)
GO

-- ----------------------------
-- Table structure for BS_Project
-- ----------------------------
DROP TABLE [BS_Project]
GO
CREATE TABLE [BS_Project] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sFCode] varchar(20) NULL ,
[sCode] varchar(20) NULL ,
[sName] varchar(50) NULL ,
[sDeptCode] varchar(30) NOT NULL ,
[sDescription] varchar(200) NULL ,
[nAudit] int NOT NULL ,
[nSystemTag] int NOT NULL ,
[dtModify] datetime NULL ,
[sManagementCode] varchar(50) NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Project]', RESEED, 463)
GO

-- ----------------------------
-- Table structure for BS_Room
-- ----------------------------
DROP TABLE [BS_Room]
GO
CREATE TABLE [BS_Room] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NOT NULL ,
[sAreaCode] varchar(20) NULL ,
[sName] varchar(100) NULL ,
[sDeptCode] varchar(20) NULL ,
[sDescription] varchar(200) NULL ,
[sAddress] varchar(200) NULL ,
[sPostCode] varchar(10) NULL ,
[sRoute] varchar(500) NULL ,
[nNormalNum] int NULL ,
[nMaxNum] int NULL ,
[nArea] float(53) NULL ,
[nAreaPercent] float(53) NULL ,
[sAdmin] varchar(30) NULL ,
[sMemo] varchar(200) NULL ,
[sPhone] varchar(50) NULL ,
[bValid] bit NOT NULL ,
[nAudit] int NOT NULL ,
[dtModify] datetime NULL ,
[sRoomEngLishName] varchar(200) NULL ,
[bVIPRoom] bit NULL ,
[sRoomDepts] varchar(1000) NULL ,
[sOperatorCode] varchar(50) NULL ,
[sAuditCode] varchar(50) NULL ,
[dtAuditDate] datetime NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Room]', RESEED, 5119)
GO

-- ----------------------------
-- Table structure for BS_Roster
-- ----------------------------
DROP TABLE [BS_Roster]
GO
CREATE TABLE [BS_Roster] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCardCode] varchar(30) NULL ,
[sClassCode] varchar(20) NULL ,
[sStudentCode] varchar(30) NULL ,
[bValid] bit NOT NULL ,
[bInsert] bit NOT NULL ,
[bCanCancel] bit NOT NULL ,
[bCanTrans] bit NOT NULL ,
[bCanPostTrans] bit NOT NULL ,
[dtInDate] datetime NULL ,
[sFromClassCode] varchar(20) NULL ,
[dtOutDate] datetime NULL ,
[sToClassCode] varchar(20) NULL ,
[nSeatNo] int NOT NULL ,
[nStartLesson] int NOT NULL ,
[nEndLesson] int NOT NULL ,
[nInType] int NULL ,
[nOutType] int NULL ,
[nInBiz] int NOT NULL ,
[nOutBiz] int NOT NULL ,
[dPay] float(53) NOT NULL ,
[dMaxNonCheque] float(53) NOT NULL ,
[dMaxCheque] float(53) NOT NULL ,
[dVoucher] float(53) NOT NULL ,
[nVoucherId] int NOT NULL ,
[dReservedBookFee] float(53) NOT NULL ,
[sMemo] varchar(100) NULL ,
[dtArrangeSeat] datetime NULL ,
[bNotGetBook] bit NULL ,
[bGiveUpLeftFee] bit NULL ,
[dtGiveUpLeftFee] datetime NULL ,
[nHasBizTimes] int NOT NULL ,
[nFinanceAudit] int NULL ,
[sRcvRemitCode] varchar(50) NULL ,
[sWebRegBillCode] varchar(50) NULL ,
[sInTime] varchar(50) NULL ,
[sOutTime] varchar(50) NULL ,
[sNewCardCode] varchar(50) NULL ,
[dOldStudentVoucher] money NULL ,
[sAgentName] varchar(50) NULL ,
[sAgentIdCard] varchar(50) NULL ,
[nChannel] int NULL ,
[sBizMemo] varchar(1000) NULL ,
[dtModify] datetime NULL ,
[dVoucherTransFee] float(53) NULL ,
[sRegZoneCode] varchar(20) NULL ,
[dPointPay] float(53) NULL ,
[InvoicePinted] int NULL ,
[sOrderCode] varchar(50) NULL ,
[sTranCancelReasonType] varchar(80) NULL ,
[sTranCancelReasonItem] varchar(80) NULL ,
[OldRecommendStudentCode] varchar(30) NULL ,
[nIntegralMultiple] float(53) NULL ,
[nIntegralOldStudent] float(53) NULL ,
[nIntegralGift] float(53) NULL ,
[nIntegralRecommendMultiple] float(53) NULL ,
[nSubChannel] int NULL ,
[sSystemSource] varchar(50) NULL ,
[sMarketingSources] varchar(50) NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Roster]', RESEED, 3950668)
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Roster', 
'COLUMN', N'dReservedBookFee')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'未归还的教材费'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Roster'
, @level2type = 'COLUMN', @level2name = N'dReservedBookFee'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'未归还的教材费'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Roster'
, @level2type = 'COLUMN', @level2name = N'dReservedBookFee'
GO
IF ((SELECT COUNT(*) from fn_listextendedproperty('MS_Description', 
'SCHEMA', N'dbo', 
'TABLE', N'BS_Roster', 
'COLUMN', N'bNotGetBook')) > 0) 
EXEC sp_updateextendedproperty @name = N'MS_Description', @value = N'退转时未领教材'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Roster'
, @level2type = 'COLUMN', @level2name = N'bNotGetBook'
ELSE
EXEC sp_addextendedproperty @name = N'MS_Description', @value = N'退转时未领教材'
, @level0type = 'SCHEMA', @level0name = N'dbo'
, @level1type = 'TABLE', @level1name = N'BS_Roster'
, @level2type = 'COLUMN', @level2name = N'bNotGetBook'
GO

-- ----------------------------
-- Table structure for BS_Student
-- ----------------------------
DROP TABLE [BS_Student]
GO
CREATE TABLE [BS_Student] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NULL ,
[sCode] varchar(30) NULL ,
[sIdCard] varchar(30) NULL ,
[dtBirthday] datetime NULL ,
[sName] varchar(30) NULL ,
[nGender] int NULL ,
[sPhone] varchar(100) NULL ,
[sMobile] varchar(100) NULL ,
[sEmail] varchar(40) NULL ,
[sAddress] varchar(300) NULL ,
[sPostCode] varchar(10) NULL ,
[sMemo] varchar(MAX) NULL ,
[dAccount] numeric(19,2) NOT NULL ,
[dtCreateTime] datetime NULL ,
[dtModify] datetime NULL ,
[nIncrement] int NULL ,
[dForeGroundBalance] numeric(19,2) NOT NULL ,
[dRemitBalance] numeric(19,2) NOT NULL ,
[dWebBalance] numeric(19,2) NOT NULL ,
[dTelBalance] numeric(19,2) NOT NULL ,
[sFirstContactMobile] varchar(100) NULL ,
[sOtherContact] varchar(500) NULL ,
[QQ] varchar(50) NULL ,
[MSN] varchar(500) NULL ,
[bAdult] bit NULL ,
[nStudyGrade] int NULL ,
[nAge] int NULL ,
[sMasterCode] varchar(500) NULL ,
[nCertificateType] int NULL ,
[sConsultant] varchar(100) NULL ,
[nGrade] int NULL ,
[sGUID] varchar(80) NULL ,
[sCallInMobile] varchar(11) NULL ,
[sCallInPhone] varchar(100) NULL ,
[sMobile4] varchar(11) NULL ,
[sMobile5] varchar(11) NULL ,
[weChat] varchar(30) NULL ,
[student_Level] int NULL ,
[student_LevelSys] int NULL ,
[annual_Revenue] int NULL ,
[studentAttr] int NULL ,
[blacklist] bit NULL ,
[do_not_call] bit NULL ,
[isComplaintAccount] bit NULL ,
[duplicate_Reason_Picklist] int NULL ,
[duplicate_Reason] varchar(200) NULL ,
[care_Mailing_Address] varchar(200) NULL ,
[care_Mailing_Post_Code] varchar(10) NULL ,
[countryLookup] int NULL ,
[provinceLookup] int NULL ,
[citylookup] int NULL ,
[areaLookup] int NULL ,
[studySchoolId] varchar(200) NULL ,
[college] varchar(200) NULL ,
[major] varchar(200) NULL ,
[wlke] int NULL ,
[CompyName] varchar(200) NULL ,
[One_Card_No] varchar(50) NULL ,
[Membership] varchar(50) NULL ,
[Green_Channel_No] varchar(50) NULL ,
[ID_Verified] bit NULL ,
[Mobile_Checked] bit NULL ,
[Email_Checked] bit NULL ,
[Calls_To] varchar(50) NULL ,
[CRMState] int NULL ,
[ContactMobile1] varchar(20) NULL ,
[ContactMobile2] varchar(20) NULL ,
[ContactMobile3] varchar(20) NULL ,
[ContactMobile4] varchar(20) NULL ,
[PhoneArea] varchar(10) NULL ,
[PhoneExtension] varchar(50) NULL ,
[UserLevel] decimal(18,2) NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Student]', RESEED, 2249233)
GO

-- ----------------------------
-- Table structure for BS_Teacher
-- ----------------------------
DROP TABLE [BS_Teacher]
GO
CREATE TABLE [BS_Teacher] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NULL ,
[sName] varchar(100) NULL ,
[nGender] int NULL ,
[nDegree] int NULL ,
[sDeptCode] varchar(20) NULL ,
[sMajor] varchar(200) NULL ,
[sIdCard] varchar(30) NULL ,
[sPhone] varchar(30) NULL ,
[sEmail] varchar(50) NOT NULL ,
[dtJoinDate] datetime NULL ,
[dtBirthday] datetime NULL ,
[nType] int NULL ,
[sMemo] varchar(200) NULL ,
[dtOutDate] datetime NULL ,
[bValid] bit NOT NULL ,
[oImage] image NULL ,
[nAudit] int NOT NULL ,
[sEmployeeID] varchar(100) NULL ,
[nFeeCycle] int NULL ,
[dtModify] datetime NULL ,
[sEhrName] varchar(200) NULL ,
[sEhrDeptCode] varchar(50) NULL ,
[sPassWord] varchar(100) NULL ,
[nCredentialType] int NULL ,
[bRowClass] bit NULL 
)


GO
DBCC CHECKIDENT(N'[BS_Teacher]', RESEED, 12805)
GO

-- ----------------------------
-- Table structure for dtproperties
-- ----------------------------
DROP TABLE [dtproperties]
GO
CREATE TABLE [dtproperties] (
[id] int NOT NULL IDENTITY(1,1) ,
[objectid] int NULL ,
[property] varchar(64) NOT NULL ,
[value] varchar(255) NULL ,
[uvalue] nvarchar(255) NULL ,
[lvalue] image NULL ,
[version] int NOT NULL 
)


GO

-- ----------------------------
-- Table structure for S_Dept
-- ----------------------------
DROP TABLE [S_Dept]
GO
CREATE TABLE [S_Dept] (
[id] int NOT NULL IDENTITY(1,1) NOT FOR REPLICATION ,
[nSchoolId] int NOT NULL ,
[sCode] varchar(30) NULL ,
[sFCode] varchar(30) NULL ,
[sName] varchar(30) NULL ,
[sDescription] varchar(200) NULL ,
[bTeachingDept] bit NOT NULL ,
[sAddress] varchar(100) NULL ,
[sPostCode] varchar(10) NULL ,
[sPhone] varchar(100) NULL ,
[sFax] varchar(100) NULL ,
[sHomePage] varchar(100) NULL ,
[sEmail] varchar(100) NULL ,
[nHoliday] int NULL ,
[sMemo] varchar(200) NULL ,
[bValid] bit NOT NULL ,
[nAudit] int NOT NULL ,
[dtModify] datetime NULL ,
[sDeptEnglishName] varchar(30) NULL 
)


GO
DBCC CHECKIDENT(N'[S_Dept]', RESEED, 40)
GO

-- ----------------------------
-- Indexes structure for table BS_Area
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_Area
-- ----------------------------
ALTER TABLE [BS_Area] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Area
-- ----------------------------
ALTER TABLE [BS_Area] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Area
-- ----------------------------
DROP TRIGGER [trg_BS_Area_delete]
GO
CREATE TRIGGER [trg_BS_Area_delete]
ON [BS_Area]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Area_insert]
GO
CREATE TRIGGER [trg_BS_Area_insert]
ON [BS_Area]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Area_update]
GO
CREATE TRIGGER [trg_BS_Area_update]
ON [BS_Area]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_AreaNew
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_AreaNew
-- ----------------------------
ALTER TABLE [BS_AreaNew] ADD PRIMARY KEY ([ID])
GO

-- ----------------------------
-- Indexes structure for table BS_Class
-- ----------------------------
CREATE INDEX [IX_BS_Class_1] ON [BS_Class]
([sClassTypeCode] ASC) 
GO
CREATE INDEX [IX_BS_Class_2] ON [BS_Class]
([dtBeginDate] ASC) 
GO
CREATE INDEX [IX_BS_Class_3] ON [BS_Class]
([dtEndDate] ASC) 
GO
CREATE INDEX [BS_Class_Prefer] ON [BS_Class]
([sCode] ASC, [id] ASC, [sClassTypeCode] ASC, [sRoomCode] ASC) 
INCLUDE ([sName], [bIsResideClass], [dtBeginDate], [dtEndDate], [nNormalCount], [dFee], [sManagementCode], [CourseCode], [sProductTypeCode]) 
GO

-- ----------------------------
-- Primary Key structure for table BS_Class
-- ----------------------------
ALTER TABLE [BS_Class] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Class
-- ----------------------------
ALTER TABLE [BS_Class] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Class
-- ----------------------------
DROP TRIGGER [tgr_BS_Class_Mapping]
GO
CREATE TRIGGER [tgr_BS_Class_Mapping]
ON [BS_Class]
AFTER INSERT, UPDATE
AS

GO
DROP TRIGGER [trg_BS_Class_delete]
GO
CREATE TRIGGER [trg_BS_Class_delete]
ON [BS_Class]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Class_insert]
GO
CREATE TRIGGER [trg_BS_Class_insert]
ON [BS_Class]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Class_update]
GO
CREATE TRIGGER [trg_BS_Class_update]
ON [BS_Class]
AFTER UPDATE
AS

GO
DROP TRIGGER [trg_BS_ClassFYear_INSERT]
GO
CREATE TRIGGER [trg_BS_ClassFYear_INSERT]
ON [BS_Class]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_ClassFYear_Update]
GO
CREATE TRIGGER [trg_BS_ClassFYear_Update]
ON [BS_Class]
AFTER UPDATE
AS

GO
DROP TRIGGER [trg_BS_ClassSize_INSERT]
GO
CREATE TRIGGER [trg_BS_ClassSize_INSERT]
ON [BS_Class]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_ClassSize_UPDATE]
GO
CREATE TRIGGER [trg_BS_ClassSize_UPDATE]
ON [BS_Class]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_ClassType
-- ----------------------------
CREATE INDEX [BS_ClassType_Prefer] ON [BS_ClassType]
([sCode] ASC, [id] ASC, [sProjectCode] ASC) 
GO

-- ----------------------------
-- Primary Key structure for table BS_ClassType
-- ----------------------------
ALTER TABLE [BS_ClassType] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_ClassType
-- ----------------------------
ALTER TABLE [BS_ClassType] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_ClassType
-- ----------------------------
DROP TRIGGER [trg_BS_ClassType_delete]
GO
CREATE TRIGGER [trg_BS_ClassType_delete]
ON [BS_ClassType]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_ClassType_insert]
GO
CREATE TRIGGER [trg_BS_ClassType_insert]
ON [BS_ClassType]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_ClassType_update]
GO
CREATE TRIGGER [trg_BS_ClassType_update]
ON [BS_ClassType]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Course
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_Course
-- ----------------------------
ALTER TABLE [BS_Course] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Course
-- ----------------------------
ALTER TABLE [BS_Course] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Course
-- ----------------------------
DROP TRIGGER [trg_BS_Course_delete]
GO
CREATE TRIGGER [trg_BS_Course_delete]
ON [BS_Course]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Course_insert]
GO
CREATE TRIGGER [trg_BS_Course_insert]
ON [BS_Course]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Course_update]
GO
CREATE TRIGGER [trg_BS_Course_update]
ON [BS_Course]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Lesson
-- ----------------------------
CREATE INDEX [IX_BS_Lesson_dtDate] ON [BS_Lesson]
([dtDate] ASC) 
GO
CREATE INDEX [IX_BS_Lesson] ON [BS_Lesson]
([sClassCode] ASC) 
INCLUDE ([nLessonNo]) 
GO
CREATE INDEX [IX_BS_Lesson_1] ON [BS_Lesson]
([SectBegin] ASC) 
GO
CREATE INDEX [IX_BS_Lesson_2] ON [BS_Lesson]
([SectEnd] ASC) 
GO
CREATE INDEX [<IX_Bs_Lesson_SectBegin>] ON [BS_Lesson]
([SectBegin] ASC) 
INCLUDE ([sClassCode], [nLessonNo1]) 
GO
CREATE INDEX [<IX_Bs_Lesson_SectEnd>] ON [BS_Lesson]
([SectEnd] ASC) 
INCLUDE ([sClassCode], [nLessonNo1]) 
GO

-- ----------------------------
-- Primary Key structure for table BS_Lesson
-- ----------------------------
ALTER TABLE [BS_Lesson] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Triggers structure for table BS_Lesson
-- ----------------------------
DROP TRIGGER [trg_BS_Lesson_delete]
GO
CREATE TRIGGER [trg_BS_Lesson_delete]
ON [BS_Lesson]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Lesson_DeleteForResource]
GO
CREATE TRIGGER [trg_BS_Lesson_DeleteForResource]
ON [BS_Lesson]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Lesson_UpdateForResource]
GO
CREATE TRIGGER [trg_BS_Lesson_UpdateForResource]
ON [BS_Lesson]
AFTER INSERT, UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Lesson_Trg
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_Lesson_Trg
-- ----------------------------
ALTER TABLE [BS_Lesson_Trg] ADD PRIMARY KEY ([MID])
GO

-- ----------------------------
-- Indexes structure for table BS_Project
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_Project
-- ----------------------------
ALTER TABLE [BS_Project] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Project
-- ----------------------------
ALTER TABLE [BS_Project] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Project
-- ----------------------------
DROP TRIGGER [trg_BS_Project_delete]
GO
CREATE TRIGGER [trg_BS_Project_delete]
ON [BS_Project]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Project_insert]
GO
CREATE TRIGGER [trg_BS_Project_insert]
ON [BS_Project]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Project_update]
GO
CREATE TRIGGER [trg_BS_Project_update]
ON [BS_Project]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Room
-- ----------------------------
CREATE INDEX [BS_Room_Prefer] ON [BS_Room]
([sCode] ASC, [id] ASC) 
INCLUDE ([sAreaCode]) 
GO

-- ----------------------------
-- Primary Key structure for table BS_Room
-- ----------------------------
ALTER TABLE [BS_Room] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Room
-- ----------------------------
ALTER TABLE [BS_Room] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Room
-- ----------------------------
DROP TRIGGER [trg_BS_Room_delete]
GO
CREATE TRIGGER [trg_BS_Room_delete]
ON [BS_Room]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Room_insert]
GO
CREATE TRIGGER [trg_BS_Room_insert]
ON [BS_Room]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Room_update]
GO
CREATE TRIGGER [trg_BS_Room_update]
ON [BS_Room]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Roster
-- ----------------------------
CREATE INDEX [IX_BS_Roster_sCardCode] ON [BS_Roster]
([sCardCode] ASC) 
GO
CREATE INDEX [IX_BS_Roster] ON [BS_Roster]
([sClassCode] ASC) 
GO
CREATE INDEX [IX_BS_Roster_1] ON [BS_Roster]
([sStudentCode] ASC) 
GO
CREATE INDEX [IX_BS_Roster_2] ON [BS_Roster]
([nInBiz] ASC) 
GO
CREATE INDEX [IX_BS_Roster_3] ON [BS_Roster]
([nOutBiz] ASC) 
GO
CREATE INDEX [IX_BS_Roster_4] ON [BS_Roster]
([dtOutDate] ASC) 
GO
CREATE INDEX [IX_BS_Roster_dtModify] ON [BS_Roster]
([dtModify] DESC) 
GO
CREATE INDEX [IX_BS_Roster_prefer] ON [BS_Roster]
([bValid] ASC, [sStudentCode] ASC) 
INCLUDE ([sCardCode], [sClassCode], [bInsert], [dtInDate], [dPay]) 
GO
CREATE INDEX [BS_Roster_Prefer] ON [BS_Roster]
([bValid] ASC, [sStudentCode] ASC, [dtInDate] ASC, [id] ASC, [sClassCode] ASC, [sCardCode] ASC, [bInsert] ASC, [dPay] ASC) 
GO

-- ----------------------------
-- Primary Key structure for table BS_Roster
-- ----------------------------
ALTER TABLE [BS_Roster] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Triggers structure for table BS_Roster
-- ----------------------------
DROP TRIGGER [trg_BS_Roster_insert]
GO
CREATE TRIGGER [trg_BS_Roster_insert]
ON [BS_Roster]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Roster_update]
GO
CREATE TRIGGER [trg_BS_Roster_update]
ON [BS_Roster]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Student
-- ----------------------------
CREATE INDEX [IX_BS_Student_1] ON [BS_Student]
([sPhone] ASC) 
GO
CREATE INDEX [IX_BS_Student_2] ON [BS_Student]
([sMobile] ASC) 
GO
CREATE INDEX [IX_BS_Student_3] ON [BS_Student]
([sName] ASC) 
GO

-- ----------------------------
-- Primary Key structure for table BS_Student
-- ----------------------------
ALTER TABLE [BS_Student] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Student
-- ----------------------------
ALTER TABLE [BS_Student] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Student
-- ----------------------------
DROP TRIGGER [tgr_BS_Student_backup]
GO
CREATE TRIGGER [tgr_BS_Student_backup]
ON [BS_Student]
AFTER UPDATE, DELETE
AS

GO
DROP TRIGGER [trg_BS_Student_insert]
GO
CREATE TRIGGER [trg_BS_Student_insert]
ON [BS_Student]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Student_update]
GO
CREATE TRIGGER [trg_BS_Student_update]
ON [BS_Student]
AFTER UPDATE
AS

GO
DROP TRIGGER [trg_BS_Student_updatemobile]
GO
CREATE TRIGGER [trg_BS_Student_updatemobile]
ON [BS_Student]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table BS_Teacher
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table BS_Teacher
-- ----------------------------
ALTER TABLE [BS_Teacher] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table BS_Teacher
-- ----------------------------
ALTER TABLE [BS_Teacher] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table BS_Teacher
-- ----------------------------
DROP TRIGGER [trg_BS_Teacher_delete]
GO
CREATE TRIGGER [trg_BS_Teacher_delete]
ON [BS_Teacher]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_BS_Teacher_insert]
GO
CREATE TRIGGER [trg_BS_Teacher_insert]
ON [BS_Teacher]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_BS_Teacher_update]
GO
CREATE TRIGGER [trg_BS_Teacher_update]
ON [BS_Teacher]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Indexes structure for table dtproperties
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table dtproperties
-- ----------------------------
ALTER TABLE [dtproperties] ADD PRIMARY KEY ([id], [property])
GO

-- ----------------------------
-- Indexes structure for table S_Dept
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table S_Dept
-- ----------------------------
ALTER TABLE [S_Dept] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Uniques structure for table S_Dept
-- ----------------------------
ALTER TABLE [S_Dept] ADD UNIQUE ([sCode] ASC)
GO

-- ----------------------------
-- Triggers structure for table S_Dept
-- ----------------------------
DROP TRIGGER [trg_S_Dept_delete]
GO
CREATE TRIGGER [trg_S_Dept_delete]
ON [S_Dept]
AFTER DELETE
AS

GO
DROP TRIGGER [trg_S_Dept_insert]
GO
CREATE TRIGGER [trg_S_Dept_insert]
ON [S_Dept]
AFTER INSERT
AS

GO
DROP TRIGGER [trg_S_Dept_update]
GO
CREATE TRIGGER [trg_S_Dept_update]
ON [S_Dept]
AFTER UPDATE
AS

GO

-- ----------------------------
-- Foreign Key structure for table [BS_Class]
-- ----------------------------
ALTER TABLE [BS_Class] ADD FOREIGN KEY ([sClassTypeCode]) REFERENCES [BS_ClassType] ([sCode]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [BS_ClassType]
-- ----------------------------
ALTER TABLE [BS_ClassType] ADD FOREIGN KEY ([sProjectCode]) REFERENCES [BS_Project] ([sCode]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [BS_Project]
-- ----------------------------
ALTER TABLE [BS_Project] ADD FOREIGN KEY ([sDeptCode]) REFERENCES [S_Dept] ([sCode]) ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [BS_Roster]
-- ----------------------------
ALTER TABLE [BS_Roster] ADD FOREIGN KEY ([nInType]) REFERENCES  () ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE [BS_Roster] ADD FOREIGN KEY ([nOutType]) REFERENCES  () ON DELETE NO ACTION ON UPDATE NO ACTION
GO

-- ----------------------------
-- Foreign Key structure for table [BS_Teacher]
-- ----------------------------
ALTER TABLE [BS_Teacher] ADD FOREIGN KEY ([nDegree]) REFERENCES  () ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE [BS_Teacher] ADD FOREIGN KEY ([nGender]) REFERENCES  () ON DELETE NO ACTION ON UPDATE NO ACTION
GO
ALTER TABLE [BS_Teacher] ADD FOREIGN KEY ([nType]) REFERENCES  () ON DELETE NO ACTION ON UPDATE NO ACTION
GO
