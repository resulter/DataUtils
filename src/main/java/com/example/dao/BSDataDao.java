package com.example.dao;

import com.example.entity.*;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BSDataDao {
    /**
     * SessionFactory
     */
    @Autowired
    SessionFactory sessionFactory;

    /**
     * 获取 Session
     */
    public Session getSession() {
        return sessionFactory.openSession();
//        return sessionFactory.getCurrentSession();
    }

    /**-------------------------------------------------------------------------------------------------------------------
     * 第1个表
     * @param schoolCode
     * @param schoolName
     * @return
     */
    public List<BsArea> getBSArea(String schoolCode, String schoolName,String modify, int currentPage, int pageSize) {
        String sql = "SELECT * FROM BS_Area WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like  N'%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like N'%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsArea.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSArea(String schoolCode, String schoolName,String modify) {
        String sql = "SELECT count(*) FROM BS_Area WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like  N'%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like N'%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
    /**-------------------------------------------------------------------------------------------------------------------
     * 第2个表

     * @return
     */
    public List<BsAreaNew> getBSAreaNew(String areaCode,String areaName, int currentPage, int pageSize) {
        String sql = "SELECT * FROM BS_AreaNew WHERE id > 0";
        if (StringUtils.isNotBlank(areaCode)) {
            sql += " and sCode like  '%" + areaCode + "%' ";
        }
        if (StringUtils.isNotBlank(areaName)) {
            sql += " and sName like '%" + areaName + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsAreaNew.class).setFirstResult(currentPage-1).setMaxResults(pageSize);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSAreaNew(String areaCode,String areaName) {
        String sql = "SELECT count(*) FROM BS_AreaNew WHERE id > 0";
        if (StringUtils.isNotBlank(areaCode)) {
            sql += " and sCode like '%" + areaCode + "%' ";
        }
        if (StringUtils.isNotBlank(areaName)) {
            sql += " and sName like  '%" + areaName + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        } finally {
            session.close();
        }

    }
    /**-------------------------------------------------------------------------------------------------------------------
     * 第3个表
     * @param schoolCode
     * @param schoolName
     * @return
     */
    public List<BsClass> getBSClass(String schoolCode, String schoolName,String from,String to,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Class WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(from)) {
            String begin = from + " 00:00:00.000";
            sql += " and dtBeginDate > '" + begin + "' ";
        }
        if (StringUtils.isNotBlank(to)) {
            String end = to + " 00:00:00.000";

            sql += " and sName < '" + end + "' ";
        }
        Session session = getSession();

        try {
            Query query = session.createSQLQuery(sql).addEntity(BsClass.class).setMaxResults(pageSize).setFirstResult(currentPage -1);
            return query.list();

        }finally {
            session.close();
        }

    }


    public Integer getCountBSClass(String schoolCode, String schoolName,String from,String to) {
        String sql = "SELECT count(*) FROM BS_Class WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(from)) {
            String begin = from + " 00:00:00.000";
            sql += " and dtBeginDate > '" + begin + "' ";
        }
        if (StringUtils.isNotBlank(to)) {
            String end = to + " 00:00:00.000";

            sql += " and sName < '" + end + "' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }
        finally {
            session.close();
        }

    }
    /**-------------------------------------------------------------------------------------------------------------------
     * 第4个表

     * @return
     */
    public List<BsClassType> getBSClassType(String sName, String sProjectCode, int currentPage, int pageSize) {
        String sql = "SELECT * FROM BS_ClassType WHERE id > 0";
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(sProjectCode)) {
            sql += " and sProjectCode like '%" + sProjectCode + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsClassType.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
            return query.list();
        }
        finally {
            session.close();
        }
       
    }

    public Integer getCountBSClassType(String sName, String sProjectCode) {
        String sql = "SELECT count(*) FROM BS_ClassType WHERE id > 0";
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(sProjectCode)) {
            sql += " and sProjectCode like '%" + sProjectCode + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        } finally {
            session.close();
        }

    }
    /**-------------------------------------------------------------------------------------------------------------------
     * 第5个表
     * @param schoolCode
     * @param schoolName
     * @return
     */
    public List<BsCourse> getBSCourse(String schoolCode,String sDeptCode, String schoolName, int currentPage, int pageSize) {
        String sql = "SELECT * FROM BS_Course WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(sDeptCode)) {
            sql += " and sDeptCode like '%" + sDeptCode + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsCourse.class).setFirstResult(currentPage-1).setMaxResults(pageSize);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSCourse(String schoolCode,String sDeptCode, String schoolName) {
        String sql = "SELECT count(*) FROM BS_Course WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(sDeptCode)) {
            sql += " and sDeptCode like '%" + sDeptCode + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }
        finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第6个表

     * @return
     */
    public List<BsLesson> getBSLesson(String classCode,String startTime,String endTime,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Lesson WHERE id > 0";
        if (StringUtils.isNotBlank(classCode)) {
            sql += " and sClassCode like '%" + classCode + "%' ";
        }
        if (StringUtils.isNotBlank(startTime)) {
            String s = startTime + " 00:00:00.000";
            sql += " and SectBegin > '" + s + "' ";
        }
        if (StringUtils.isNotBlank(endTime)) {
            String s = endTime + " 00:00:00.000";

            sql += " and SectEnd < '" + s + "' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsLesson.class).setMaxResults(pageSize).setFirstResult(currentPage - 1);
            return query.list();
        }
        finally {
            session.close();
        }

    }


    public Integer getCountBSLesson(String classCode,String startTime,String endTime) {
        String sql = "SELECT count(*) FROM BS_Lesson WHERE id > 0";
        if (StringUtils.isNotBlank(classCode)) {
            sql += " and sClassCode like '%" + classCode + "%' ";
        }
        if (StringUtils.isNotBlank(startTime)) {
            String s = startTime + " 00:00:00.000";
            sql += " and SectBegin > '" + s + "' ";
        }
        if (StringUtils.isNotBlank(endTime)) {
            String s = endTime + " 00:00:00.000";

            sql += " and SectEnd < '" + s + "' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第7个表
     * @return
     */
    public List<BsLessonTrg> getBSLessonTrg(String lessonId,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Lesson_Trg WHERE MID > 0";
        if (StringUtils.isNotBlank(lessonId)) {
            sql += " and nLessonID like '%" + lessonId + "%' ";
        }

        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsLessonTrg.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSLessonTrg(String lessonId) {
        String sql = "SELECT count(*) FROM BS_Lesson_Trg WHERE MID > 0";
        if (StringUtils.isNotBlank(lessonId)) {
            sql += " and nLessonID like '%" + lessonId + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第8个表
     * @param schoolCode
     * @param schoolName
     * @return
     */
    public List<BsProject> getBSProject(String schoolCode, String schoolName,String description,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Project WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(description)) {
            sql += " and sDescription like '%" + description + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsProject.class).setFirstResult(currentPage-1).setMaxResults(pageSize);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSProject(String schoolCode, String schoolName,String description) {
        String sql = "SELECT count(*) FROM BS_Project WHERE id > 0";
        if (StringUtils.isNotBlank(schoolCode)) {
            sql += " and sCode like '%" + schoolCode + "%' ";
        }
        if (StringUtils.isNotBlank(schoolName)) {
            sql += " and sName like '%" + schoolName + "%' ";
        }
        if (StringUtils.isNotBlank(description)) {
            sql += " and sDescription like '%" + description + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第9个表
     * @return
     */
    public List<BsRoom> getBSRoom(String sName, String sAddress,String modify,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Room WHERE id > 0";
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(sAddress)) {
            sql += " and sAddress like '%" + sAddress + "%' ";
        }

        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsRoom.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
            return query.list();
        }
        finally {
            session.close();
        }

    }


    public Integer getCountBSRoom(String sName, String sAddress,String modify) {
        String sql = "SELECT count(*) FROM BS_Room WHERE id > 0";
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(sAddress)) {
            sql += " and sAddress like '%" + sAddress + "%' ";
        }

        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第10个表
     * @return
     */
    public List<BsRoster> getBSRoster(String sCardCode, String sClassCode,String sStudentCode,String modify,int currentPage,int pageSize) {
        String sql = "SELECT * FROM BS_Roster WHERE id > 0";
        if (StringUtils.isNotBlank(sCardCode)) {
            sql += " and sCardCode like '%" + sCardCode + "%' ";
        }
        if (StringUtils.isNotBlank(sClassCode)) {
            sql += " and sClassCode like '%" + sClassCode + "%' ";
        }
        if (StringUtils.isNotBlank(sStudentCode)) {
            sql += " and sStudentCode like '%" + sStudentCode + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsRoster.class).setFirstResult(currentPage-1).setMaxResults(pageSize);
            return query.list();
        }
        finally {
            session.close();
        }

    }


    public Integer getCountBSRoster(String sCardCode, String sClassCode,String sStudentCode,String modify) {
        String sql = "SELECT count(*) FROM BS_Roster WHERE id > 0";
        if (StringUtils.isNotBlank(sCardCode)) {
            sql += " and sCardCode like '%" + sCardCode + "%' ";
        }
        if (StringUtils.isNotBlank(sClassCode)) {
            sql += " and sClassCode like '%" + sClassCode + "%' ";
        }
        if (StringUtils.isNotBlank(sStudentCode)) {
            sql += " and sStudentCode like '%" + sStudentCode + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }finally {
            session.close();
        }

    }
 /**-------------------------------------------------------------------------------------------------------------------
     * 第11个表

     * @return
     */
 public List<BsStudent> getBSStudent(String sCode,String sName,String create,String modify,int currentPage,int pageSize) {
     String sql = "SELECT * FROM BS_Student WHERE id > 0";
     if (StringUtils.isNotBlank(sCode)) {
         sql += " and sCode like '%" + sCode + "%' ";
     }
     if (StringUtils.isNotBlank(sName)) {
         sql += " and sName like '%" + sName + "%' ";
     }
     if (StringUtils.isNotBlank(create)) {
         sql += " and convert(varchar,dtCreateTime,120) like N'%" + create + "%' ";
     }
     if (StringUtils.isNotBlank(modify)) {
         sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
     }
     Session session = getSession();
     try {
         Query query = session.createSQLQuery(sql).addEntity(BsStudent.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
         return query.list();
     } finally {
         session.close();
     }

 }


    public Integer getCountBSStudent(String sCode,String sName,String create,String modify) {
        String sql = "SELECT count(*) FROM BS_Student WHERE id > 0";
        if (StringUtils.isNotBlank(sCode)) {
            sql += " and sCode like '%" + sCode + "%' ";
        }
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(create)) {
            sql += " and convert(varchar,dtCreateTime,120) like N'%" + create + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        } finally {
            session.close();
        }

    }

/**-------------------------------------------------------------------------------------------------------------------
     * 第12个表

     * @return
     */
    public List<BsTeacher> getBSTeacher(String sCode,String sName,String modify,int currentPage,int pageSize) {


        String sql = "SELECT * FROM BS_Teacher WHERE id > 0";
        if (StringUtils.isNotBlank(sCode)) {
            sql += " and sCode like '%" + sCode + "%' ";
        }
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql).addEntity(BsTeacher.class).setFirstResult(currentPage-1).setMaxResults(pageSize);
            return query.list();
        }finally {
            session.close();
        }

    }


    public Integer getCountBSTeacher(String sCode,String sName,String modify) {
        String sql = "SELECT count(*) FROM BS_Teacher WHERE id > 0";
        if (StringUtils.isNotBlank(sCode)) {
            sql += " and sCode like '%" + sCode + "%' ";
        }
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        if (StringUtils.isNotBlank(modify)) {
            sql += " and convert(varchar,dtModify,120) like N'%" + modify + "%' ";
        }
//        SQLQuery query = getSession().createSQLQuery(sql).setFirstResult(1).setMaxResults(6);
        Session session = getSession();
        try {
            Query query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        }
        finally {
            session.close();
        }

    }

/**-------------------------------------------------------------------------------------------------------------------
     * 第13个表

     * @return
     */
public List<Dtproperties> getDtproperties(String objectId,int currentPage, int pageSize) {
    String sql = "SELECT * FROM dtproperties WHERE id > 0";
    if (StringUtils.isNotBlank(objectId)) {
        sql += " and objectd like '%" + objectId + "%' ";
    }
    Session session = getSession();
    try {
        Query query = session.createSQLQuery(sql).addEntity(Dtproperties.class).setFirstResult(currentPage - 1).setMaxResults(pageSize);
        return query.list();
    } finally {
        session.close();
    }
}


    public Integer getCountDtproperties(String objectId) {
        String sql = "SELECT count(*) FROM dtproperties WHERE id > 0";
        if (StringUtils.isNotBlank(objectId)) {
            sql += " and objectd like '%" + objectId + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = session.createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        } finally {
            session.close();
        }

    }

/**-------------------------------------------------------------------------------------------------------------------
     * 第14个表

     * @return
     */
public List<SDept> getSDept(String sCode, String sName, int currentPage, int pageSize) {
    String sql = "SELECT * FROM S_Dept WHERE id > 0";
    if (StringUtils.isNotBlank(sCode)) {
        sql += " and sCode like '%" + sCode + "%' ";
    }
    if (StringUtils.isNotBlank(sName)) {
        sql += " and sName like '%" + sName + "%' ";
    }
    Session session = getSession();
    try {
        Query query = session.createSQLQuery(sql).addEntity(SDept.class).setMaxResults(pageSize).setFirstResult(currentPage-1);
        return query.list();
    } finally {
        session.close();
    }

}


    public Integer getCountSDept(String sCode, String sName) {
        String sql = "SELECT count(*) FROM S_Dept WHERE id > 0";
        if (StringUtils.isNotBlank(sCode)) {
            sql += " and sCode like '%" + sCode + "%' ";
        }
        if (StringUtils.isNotBlank(sName)) {
            sql += " and sName like '%" + sName + "%' ";
        }
        Session session = getSession();
        try {
            SQLQuery query = getSession().createSQLQuery(sql);
            List list = query.list();
            if (list != null && list.size() > 0) {
                if (list.get(0) == null) {
                    return 0;
                }
                return ((Integer) list.get(0)).intValue();
            }
            return 0;
        } finally {
            session.close();
        }

    }



}
