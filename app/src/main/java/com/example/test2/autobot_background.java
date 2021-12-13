package com.example.test2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.io.DataOutputStream;
import java.io.IOException;
import java.security.Provider;

public class autobot_background extends Service {


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        int delay = 2000;
        try {

            Process process = Runtime.getRuntime().exec("su");
            DataOutputStream os = new DataOutputStream(process.getOutputStream());
            Thread.sleep(1000);
            String cmd = "/system/bin/input keyevent KEYCODE_HOME\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            //telegram


            cmd = "/system/bin/input tap 737 1777\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);






            cmd = "/system/bin/input tap 322 575\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);





            cmd = "/system/bin/input tap 326 2250\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);





            cmd = "/system/bin/input tap 856 2009\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);



            cmd = "/system/bin/input tap 445 1831\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);



            cmd = "/system/bin/input tap 1010 1174\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);


            os.writeBytes("exit\n");
            os.flush();
            os.close();



            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }

        return  START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }








    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }










    public void _Action(){

        int delay = 6000;
        try {
//            //Runtime.getRuntime().exec("/system/bin/am start -a com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
            Process process = Runtime.getRuntime().exec("su");
            DataOutputStream os = new DataOutputStream(process.getOutputStream());
//            String cmd = "/system/bin/input tap 100 200\n";
            //String cmd = "/system/bin/am start -a android.settings.SETTINGS\n";
            Thread.sleep(3000);
            String cmd = "/system/bin/input keyevent KEYCODE_HOME\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);


            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 737 1777\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);

            //telegram
            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 737 1777\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);


            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 322 612\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);




            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 326 2250\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);




            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 868 2028\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);


            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 425 1820\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);


            process = Runtime.getRuntime().exec("su");
            os = new DataOutputStream(process.getOutputStream());
            cmd = "/system/bin/input tap 1010 1156\n";
            os.writeBytes(cmd);
            os.writeBytes("exit\n");
            os.flush();
            os.close();
            Thread.sleep(delay);


            try {
                process.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }








}
