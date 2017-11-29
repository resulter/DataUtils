package com.example.service;

import com.example.dao.BSDataDao;
import com.example.entity.*;
import com.example.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("bSDataService")
public class BSDataService {

    @Autowired
    private BSDataDao bsDataDao;

    public Page<BsArea> getBSArea(String schoolCode,String schoolName,String modify, int currentPage, int pageSize) {
        Page<BsArea> page = new Page<BsArea>();
        int count = bsDataDao.getCountBSArea(schoolCode,schoolName,modify);
//        int offset = page.countOffset(currentPage, pageSize);
        List<BsArea> list = bsDataDao.getBSArea(schoolCode, schoolName,modify, currentPage,  pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;
    }

    public int getCountBSArea(String schoolCode, String schoolName,String modify) {
        return bsDataDao.getCountBSArea(schoolCode,schoolName,modify);

    }

    public Page<BsAreaNew> getBSAreaNew(String areaCode,String areaName, int currentPage, int pageSize) {
        Page<BsAreaNew> page = new Page<BsAreaNew>();
        int count = bsDataDao.getCountBSAreaNew(areaCode,areaName);
        List<BsAreaNew> list = bsDataDao.getBSAreaNew(areaCode,areaName,currentPage,pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;

    }

    public Page<BsClass> getBSClass(String schoolCode, String schoolName,String from,String to, int currentPage, int pageSize) {
        Page<BsClass> page = new Page<BsClass>();

        int count = bsDataDao.getCountBSClass(schoolCode, schoolName,from,to);
        List<BsClass> list = bsDataDao.getBSClass(schoolCode, schoolName,from,to, currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);

        return page;

    }

    public int getCountBSClass(String schoolCode,String schoolName,String beginTime,String endTime) {
        return bsDataDao.getCountBSClass(schoolCode,schoolName,beginTime,endTime);

    }

    public Page<BsClassType> getBSClassType(String sName,String sProjectCode, int currentPage, int pageSize) {
        Page<BsClassType> page = new Page<BsClassType>();

        int count = bsDataDao.getCountBSClassType(sName, sProjectCode);
        List<BsClassType> list = bsDataDao.getBSClassType(sName, sProjectCode, currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;

    }

    public Page<BsCourse> getBSCourse(String schoolCode ,String sDeptCode,String schoolName, int currentPage, int pageSize) {
        Page<BsCourse> page = new Page<BsCourse>();

        int count = bsDataDao.getCountBSCourse(schoolCode,sDeptCode, schoolName);
        List<BsCourse> list = bsDataDao.getBSCourse(schoolCode, schoolName,sDeptCode, currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;

    }

    public int getCountBSCourse(String schoolCode,String sDeptCode,String schoolName) {
        return bsDataDao.getCountBSCourse(schoolCode,sDeptCode,schoolName);

    }

    public int getCountBSLessonTrg(String lessonId) {
        return bsDataDao.getCountBSLessonTrg(lessonId);

    }

    public Page<BsLesson> getBSLesson(String classCode,String startTime,String endTime,int currentPage,int pageSize) {
        Page<BsLesson> page = new Page<BsLesson>();

        int count = bsDataDao.getCountBSLesson( classCode,startTime,endTime);
        List<BsLesson> list = bsDataDao.getBSLesson( classCode,startTime,endTime, currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;

    }

    public int getCountBSLesson(String className,String startTime,String endTime) {
        return bsDataDao.getCountBSLesson(className, startTime, endTime);

    }

    public Page<BsLessonTrg> getBSLessonTrg(String lessonId,int currentPage,int pageSize) {
        Page<BsLessonTrg> page = new Page<BsLessonTrg>();

        int count = bsDataDao.getCountBSLessonTrg(lessonId);
        List<BsLessonTrg> list = bsDataDao.getBSLessonTrg(lessonId, currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;
    }

    public Page<BsProject> getBSProject(String schoolCode,String schoolName,String description,int currentPage,int pageSize) {
        Page<BsProject> page = new Page<BsProject>();

        int count = bsDataDao.getCountBSProject(schoolCode,schoolName,description);
        List<BsProject> list = bsDataDao.getBSProject(schoolCode,schoolName,description,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;
    }

    public Page<BsRoom> getBSRoom(String sName ,String sAddress,String modify,int currentPage,int pageSize) {
        Page<BsRoom> page = new Page<BsRoom>();

        int count = bsDataDao.getCountBSRoom(sName,sAddress,modify);
        List<BsRoom> list = bsDataDao.getBSRoom(sName,sAddress,modify,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return page;

    }

    public int getCountBSRoom(String sName ,String sAddress,String modify) {
        return bsDataDao.getCountBSRoom(sName, sAddress, modify);

    }

    public Page<BsRoster> getBSRoster(String sCardCode ,String sClassCode,String sStudentCode,String modify,int currentPage,int pageSize) {
        Page<BsRoster> page = new Page<BsRoster>();

        int count = bsDataDao.getCountBSRoster(sCardCode,sClassCode,sStudentCode,modify);
        List<BsRoster> list = bsDataDao.getBSRoster(sCardCode,sClassCode,sStudentCode,modify,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return  page;

    }

    public int getCountBSRoster(String sCardCode ,String sClassCode,String sStudentCode,String modify) {
        return bsDataDao.getCountBSRoster(sCardCode, sClassCode, sStudentCode, modify);

    }

    public Page<BsStudent> getBSStudent(String sCode ,String sName,String create,String modify,int currentPage,int pageSize) {
        Page<BsStudent> page = new Page<BsStudent>();

        int count = bsDataDao.getCountBSStudent(sCode,sName,create,modify);
        List<BsStudent> list = bsDataDao.getBSStudent(sCode,sName,create,modify,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return  page;

    }

    public Page<BsTeacher> getBSTeacher(String sCode ,String sName,String modify,int currentPage,int pageSize) {
        Page<BsTeacher> page = new Page<BsTeacher>();

        int count = bsDataDao.getCountBSTeacher(sCode,sName,modify);
        List<BsTeacher> list = bsDataDao.getBSTeacher(sCode,sName,modify,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return  page;
    }

    public Page<Dtproperties> getDtproperties(String objectId,int currentPage,int pageSize) {
        Page<Dtproperties> page = new Page<Dtproperties>();

        int count = bsDataDao.getCountDtproperties(objectId);
        List<Dtproperties> list = bsDataDao.getDtproperties(objectId,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return  page;
    }

    public Page<SDept> getSDept(String sCode ,String sName,int currentPage,int pageSize) {
        Page<SDept> page = new Page<SDept>();

        int count = bsDataDao.getCountSDept(sCode,sName);
        List<SDept> list = bsDataDao.getSDept(sCode,sName,currentPage, pageSize);
        page.setPageNo(currentPage);
        page.setPageSize(pageSize);
        page.setList(list);
        page.setTotalRecords(count);
        return  page;
    }

    public int getCountSDept(String sCode,String sname) {
        return bsDataDao.getCountSDept(sCode, sname);

    }

    public int getCountBSAreaNew(String schoolCode ,String schoolName) {
        return bsDataDao.getCountBSAreaNew(schoolCode, schoolName);

    }

    public int getCountBSClassType(String schoolCode ,String schoolName) {
        return bsDataDao.getCountBSClassType(schoolCode, schoolName);

    }

    public int getCountBSProject(String schoolCode ,String schoolName,String descriptioon) {
        return bsDataDao.getCountBSProject(schoolCode,schoolName,descriptioon);

    }

    public int getCountBSStudent(String sCode,String sName,String create,String modify) {
        return bsDataDao.getCountBSStudent(sCode,sName,create,modify);

    }

    public int getCountBSTeacher(String sCode,String sname,String modify) {
        return bsDataDao.getCountBSTeacher(sCode, sname,modify);

    }

    public int getCountDtproperties(String objectId) {
        return bsDataDao.getCountDtproperties(objectId);

    }
}
