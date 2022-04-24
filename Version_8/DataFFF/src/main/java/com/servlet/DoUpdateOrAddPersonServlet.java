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

        String strPid = req.getParameter("pid");

        String psex = req.getParameter("psex" );

        String pname = req.getParameter("pname") ;

        String strBir = req.getParameter("pbirth") ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pbir = null;
        try{
            pbir = new Date(sdf.parse(strBir).getTime()) ;
            System.out.println(pbir);
        }catch (ParseException e){
            e.printStackTrace();
        }

        String pnational = req.getParameter("pnational");

        String pnativeplace = req.getParameter("pnativeplace") ;

        String ppoliticalstatus = req.getParameter("ppoliticalstatus") ;

        String pworkplace = req.getParameter("pworkplace") ;

        String pxueli = req.getParameter("pxueli") ;

        String pxuewei = req.getParameter("pxuewei") ;

        String pzhicheng = req.getParameter("pzhicheng");

        String pcurrentposition = req.getParameter("pcurrentposition") ;

        String strTenureOfTheSameRank = req.getParameter("pTenureOfTheSameRank") ;
        System.out.println(strTenureOfTheSameRank);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pTenureOfTheSameRank = null;

        try{
            pTenureOfTheSameRank = new Date(sdf1.parse(strTenureOfTheSameRank).getTime()) ;
            System.out.println(pTenureOfTheSameRank);
        }catch (ParseException e){
            e.printStackTrace();
        }

        String LengthOfTenure  = req.getParameter("pLengthOfTenure") ;
        System.out.println(LengthOfTenure);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pLengthOfTenure  = null;
        try{
            pLengthOfTenure  = new Date(sdf2.parse(LengthOfTenure).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }
        String psocialwork = req.getParameter("psocialwork") ;

        String strworktime = req.getParameter("pjoinworktime") ;
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pjoinworktime = null;
        try{
            pjoinworktime = new Date(sdf3.parse(strworktime).getTime()) ;
        }catch (ParseException e){
            e.printStackTrace();
        }

        String strpartytime = req.getParameter("pjoinpartytime") ;
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd") ;
        Date pjoinpartytime = null;
        try{
            pjoinpartytime = new Date(sdf4.parse(strpartytime).getTime()) ;
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
            if(ps.UpdatePersonById(new PersonInfor(pid,pname,psex,pbir,pnational,pnativeplace,ppoliticalstatus,pworkplace,pxueli,pxuewei,pzhicheng,pcurrentposition,pTenureOfTheSameRank,pLengthOfTenure,psocialwork,pjoinworktime,pjoinpartytime,phonor,ptraining,pcanzhengyizheng,pcontactnum,pinfor))==1) {
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }else{
            if(ps.AddPerson(new PersonInfor(pname,psex,pbir,pnational,pnativeplace,ppoliticalstatus,pworkplace,pxueli,pxuewei,pzhicheng,pcurrentposition,pTenureOfTheSameRank,pLengthOfTenure,psocialwork,pjoinworktime,pjoinpartytime,phonor,ptraining,pcanzhengyizheng,pcontactnum,pinfor)) == 1){
                resp.sendRedirect("/GetAllPersonServlet");
            }
        }
    }
}
