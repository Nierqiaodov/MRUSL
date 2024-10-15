package gg.nierqiaodov.util;

import java.text.SimpleDateFormat;
import java.util.Date;

//be used to push out log

public class Logger {

    public static void logOut(String log) {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH-mm-ss");
        String time = dateFormat.format(date);//get format time
        System.out.println("[" + time + "]" + log);

    }

}
