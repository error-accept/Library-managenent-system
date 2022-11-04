package com.lixiaoxin.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.logging.SimpleFormatter;
@Service
public class IDGenerate {
    @Autowired
    RedisUtil redisUtil;
    public int getTime(){
        Calendar curDate = Calendar.getInstance();
        Calendar tomorrowDate = new GregorianCalendar(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH), curDate.get(Calendar.DATE) + 1, 0, 0, 0);
        return (int)(tomorrowDate.getTimeInMillis() - curDate.getTimeInMillis()) / 1000;
    }
    public  String generationID(){
        Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern("yyyyMMdd");
        String d=sdf.format(date);
        int px1=1;
        try {
//            System.out.println(redisUtil.get("px"));
            px1 = Integer.parseInt((String) redisUtil.get("px")) ;
        }catch (Exception ignored){
            System.out.println("没有");
            System.out.println(ignored);
        }
        String four=String.format("%04d",px1);
        String Id=d+four;
        px1++;
        System.out.println(px1);
        redisUtil.set("px", String.valueOf(px1),getTime());
        return Id;
    }
}
