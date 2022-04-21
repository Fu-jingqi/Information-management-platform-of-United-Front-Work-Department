package com.servlet;

import com.entity.PersonInfor;
import com.entity.person;
import com.service.PersonInforService;
import com.service.PersonService;
import com.service.impl.PersonInforServiceImpl;
import com.service.impl.PersonServiceImpl;

import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@WebServlet("/DoUpdateOrAddPersonServlet")
public class DoUpdateOrAddPersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        // 1. pid
        String strPid = req.getParameter("pid");
        // 2. psex
        String psex = req.getParameter("psex" );
        // 3. pname
        String pname = req.getParameter("pname") ;
        // 4. pbirth
        String strBir = req.getParameter("pbirth") ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pbir = null;
        try{
            pbir = new Date(sdf.parse(strBir).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }
        // 5. pnational
        String pnational = req.getParameter("pnational");
        // 6. pnativeplace
        String pnativeplace = req.getParameter("pnativeplace") ;

        String ppoliticalstatus = req.getParameter("ppoliticalstatus") ;

        String pworkplace = req.getParameter("pworkplace") ;

        String pzhicheng = req.getParameter("pzhicheng");

        String pxueli = req.getParameter("pxueli") ;

        String pcurrentposition = req.getParameter("pcurrentposition") ;

        String psocialwork = req.getParameter("psocialwork") ;

        String strworktime = req.getParameter("pjoinworktime") ;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pjoinworktime = null;
        try{
            pjoinworktime = new Date(sdf1.parse(strworktime).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }

        String strpartytime = req.getParameter("pjoinworktime") ;
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pjoinpartytime = null;
        try{
            pjoinpartytime = new Date(sdf2.parse(strpartytime).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }

        String phonor = req.getParameter("phonor") ;

        String ptraining = req.getParameter("ptraining") ;

        String pcanzhengyizheng = req.getParameter("pcanzhengyizheng") ;

        String pcontactnum = req.getParameter("pcontactnum") ;

        String pinfor = req.getParameter("pinfor") ;

        PersonInforService ps = new PersonInforServiceImpl() ;
        if( strPid != null && !(strPid.equals("")) ){
            int pid = Integer.parseInt(strPid) ;
            if(ps.UpdatePersonById(new PersonInfor(pid,pname,psex,pbir,pnational,pnativeplace,ppoliticalstatus,pworkplace,pzhicheng,pxueli,pcurrentposition,psocialwork,pjoinworktime,pjoinpartytime,phonor,ptraining,pcanzhengyizheng,pcontactnum,pinfor))==1) {
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }else{
            if(ps.AddPerson(new PersonInfor(pname,psex,pbir,pnational,pnativeplace,ppoliticalstatus,pworkplace,pzhicheng,pxueli,pcurrentposition,psocialwork,pjoinworktime,pjoinpartytime,phonor,ptraining,pcanzhengyizheng,pcontactnum,pinfor)) == 1){
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }
    }
}
