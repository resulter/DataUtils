package com.example.controller;

import com.example.entity.*;
import com.example.service.BSDataService;
import com.example.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/a")
public class BSDataController {
    public  static  int PAGESIZE = 10;//分页页面默认大小


    @Autowired
    private BSDataService bsDataService;

    @RequestMapping("/getBSArea")
    public String getBSArea( HttpServletResponse response,HttpServletRequest request, Model model) {
        String schoolCode = request.getParameter("schoolCode");
        String schoolName = request.getParameter("schoolName");
        String modify = request.getParameter("modify");
        Map<String,String> searchMap = getSearchMap(request);
//        System.out.println("---->" + modify);
        String to = request.getParameter("to");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }
            pageNo = pageNo.trim();
            Page<BsArea> page = bsDataService.getBSArea(schoolCode, schoolName,modify,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("schoolCode",schoolCode);
            model.addAttribute("schoolName",schoolName);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",searchMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsArea";
    }

    @RequestMapping("/getBSAreaNew")
    public String getBSAreaNew( HttpServletResponse response,HttpServletRequest request, Model model) {
        String areaCode = request.getParameter("areaCode");
        String areaName = request.getParameter("areaName");
        Map<String,String> searchMap = getSearchMap(request);
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }
            pageNo = pageNo.trim();
//            pageNo = pageNo.substring(0,1);
            Page<BsAreaNew> page = bsDataService.getBSAreaNew(areaCode, areaName, Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",searchMap);
            model.addAttribute("areaCode",areaCode);
            model.addAttribute("areaName",areaName);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsAreaNew";
    }

    @RequestMapping("/getBSClass")
    public String getBSClass( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sCode = request.getParameter("sCode");
        String sName = request.getParameter("sName");
        String from = request.getParameter("from");
        Map<String, String> searchMap = getSearchMap(request);
        String to = request.getParameter("to");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsClass> page = bsDataService.getBSClass(sCode, sName, from,to,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",searchMap);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsClass";
    }

    @RequestMapping("/getBSClassType")
    public String getBSClassType( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sName = request.getParameter("sName");
        String sProjectCode = request.getParameter("sProjectCode");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsClassType> page = bsDataService.getBSClassType(sName, sProjectCode, Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsClassType";
    }

    @RequestMapping("/getBSCourse")
    public String getBSCourse( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sCode = request.getParameter("sCode");
        String sName = request.getParameter("sName");
        String sDeptCode = request.getParameter("sDeptCode");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsCourse> page = bsDataService.getBSCourse(sCode,sDeptCode, sName, Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsCourse";
    }

    @RequestMapping("/getBSLesson")
    public String getBSLesson( HttpServletResponse response,HttpServletRequest request, Model model) {
        String lessonNo = request.getParameter("lessonNo");
        String classCode = request.getParameter("classCode");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsLesson> page = bsDataService.getBSLesson(classCode, from,to,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsLesson";
    }

    @RequestMapping("/getBSLessonTrg")
    public String getBSLessonTrg( HttpServletResponse response,HttpServletRequest request, Model model) {
        String lessonId = request.getParameter("lessonId");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsLessonTrg> page = bsDataService.getBSLessonTrg(lessonId,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return "bsLessonTrg";
    }

    @RequestMapping("/getBSProject")
    public String getBSProject( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sCode = request.getParameter("sCode");
        String sName = request.getParameter("sName");
        String sDescription = request.getParameter("sDescription");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsProject> page = bsDataService.getBSProject(sCode,sName,sDescription,Integer.valueOf(pageNo), PAGESIZE);
            System.out.println("--------------------------------->>>>>>>>>>>>" + page.getList().size());
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsProject";
    }

    @RequestMapping("/getBSRoom")
    public String getBSRoom( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sAddress = request.getParameter("sAddress");
        String sName = request.getParameter("sName");
        String modify = request.getParameter("modify");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsRoom> page = bsDataService.getBSRoom(sName,sAddress,modify,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsRoom";
    }

    @RequestMapping("/getBSRoster")
    public String getBSRoster( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sCardCode = request.getParameter("sCardCode");
        String sClassCode = request.getParameter("sClassCode");
        String sStudentCode = request.getParameter("sStudentCode");
        String modify = request.getParameter("modify");

        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsRoster> page = bsDataService.getBSRoster(sCardCode,sClassCode,sStudentCode,modify,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsRoster";
    }

    @RequestMapping("/getBSStudent")
    public String getBSStudent( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sName = request.getParameter("sName");
        String sCode = request.getParameter("sCode");
        String create = request.getParameter("create");
        String modify = request.getParameter("modify");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsStudent> page = bsDataService.getBSStudent(sCode,sName,create,modify,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsStudent";
    }

    @RequestMapping("/getBSTeacher")
    public String getBSTeacher( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sName = request.getParameter("sName");
        String sCode = request.getParameter("sCode");
        String modify = request.getParameter("modify");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<BsTeacher> page = bsDataService.getBSTeacher(sCode,sName,modify,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "bsTeacher";
    }

    @RequestMapping("/getDtproperties")
    public String getDtproperties( HttpServletResponse response,HttpServletRequest request, Model model) {
        String objectId = request.getParameter("objectId");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<Dtproperties> page = bsDataService.getDtproperties(objectId,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "dtProperties";
    }

    @RequestMapping("/getSDept")
    public String getSDept( HttpServletResponse response,HttpServletRequest request, Model model) {
        String sName = request.getParameter("sName");
        String sCode = request.getParameter("sCode");
        try {
            String pageNo = request.getParameter("pageNo");
            if (pageNo == null) {
                pageNo = "1";
            }

            Page<SDept> page = bsDataService.getSDept(sCode,sName,Integer.valueOf(pageNo), PAGESIZE);
            model.addAttribute("page", page);
            model.addAttribute("searchMap",getSearchMap(request));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "sDept";
    }


    /**
     * 返回查询条件集合
     *
     * @param request
     * @return
     */
    private Map<String, String> getSearchMap(HttpServletRequest request) {
        Map<String, String> searchMap = new HashMap<String, String>();
        //校区编码
        String schoolCode = request.getParameter("schoolCode");
        schoolCode = schoolCode != null ? schoolCode : "";
        searchMap.put("schoolCode", schoolCode);
        //校区名字
        String schoolName = request.getParameter("schoolName");
        schoolName = schoolName != null ? schoolName : "";
        searchMap.put("schoolName", schoolName);
        //修改时间
        String modify = request.getParameter("modify");
        modify = modify != null ? modify : "";
        searchMap.put("modify", modify);
        //行政编码
        String areaCode = request.getParameter("areaCode");
        areaCode = areaCode != null ? areaCode : "";
        searchMap.put("areaCode", areaCode);
        //行政名称
        String areaName = request.getParameter("areaName");
        areaName = areaName != null ? areaName : "";
        searchMap.put("teacherName", areaName);
        //编码
        String sCode = request.getParameter("sCode");
        sCode = sCode != null ? sCode : "";
        searchMap.put("sCode", sCode);
        //姓名
        String sName = request.getParameter("sName");
        sName = sName != null ? sName : "";
        searchMap.put("sName", sName);
        //开始时间
        String from = request.getParameter("from");
        from = from != null ? from : "";
        searchMap.put("from", from);
       //结束时间
        String to = request.getParameter("to");
        to = to != null ? to : "";
        searchMap.put("to", to);
       //项目编码
        String sProjectCode = request.getParameter("sProjectCode");
        sProjectCode = sProjectCode != null ? sProjectCode : "";
        searchMap.put("sProjectCode", sProjectCode);
        //
        String sDeptCode = request.getParameter("sDeptCode");
        sDeptCode = sDeptCode != null ? sDeptCode : "";
        searchMap.put("sDeptCode", sDeptCode);
 //
        String classCode = request.getParameter("classCode");
        classCode = classCode != null ? classCode : "";
        searchMap.put("classCode", classCode);

        String lessonId = request.getParameter("lessonId");
        lessonId = lessonId != null ? lessonId : "";
        searchMap.put("lessonId", lessonId);

        String sDescription = request.getParameter("sDescription");
        sDescription = sDescription != null ? sDescription : "";
        searchMap.put("sDescription", sDescription);

        String sAddress = request.getParameter("sAddress");
        sAddress = sAddress != null ? sAddress : "";
        searchMap.put("sAddress", sAddress);
 String sCardCode = request.getParameter("sCardCode");
        sCardCode = sCardCode != null ? sCardCode : "";
        searchMap.put("sCardCode", sCardCode);
 String sClassCode = request.getParameter("sClassCode");
        sClassCode = sClassCode != null ? sClassCode : "";
        searchMap.put("sClassCode", sClassCode);

        String sStudentCode = request.getParameter("sStudentCode");
        sStudentCode = sStudentCode != null ? sStudentCode : "";
        searchMap.put("sStudentCode", sStudentCode);
 String create = request.getParameter("create");
        create = create != null ? create : "";
        searchMap.put("create", create);
String objectId = request.getParameter("objectId");
        objectId = objectId != null ? objectId : "";
        searchMap.put("objectId", objectId);

        return searchMap;
    }


}
