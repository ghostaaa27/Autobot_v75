package com.example.test2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.io.DataOutputStream;
import java.io.IOException;
import java.security.Provider;
import java.util.concurrent.Semaphore;

public class autobot_background extends Service {

    private static final int delay = 3000;
    Process process;
    DataOutputStream os;

    final class TheThread  implements Runnable{
        int  serviceID;
        TheThread(int serviceID){
            this.serviceID = serviceID;
        }

        @Override
        public void run() {

            try{
                process = Runtime.getRuntime().exec("su");
                os = new DataOutputStream(process.getOutputStream());

                for(int i=0;i<3;i++){
                    DeviceIdCHanger();
                    Thread.sleep(3000);
                    ChamelPhon();
                    Thread.sleep(3000);
//                Ghost_Phone();
//                Thread.sleep(3000);
                }

                os.writeBytes("exit\n");
                os.flush();
                os.close();
                Thread.sleep(delay);

                try {
                    process.waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } catch (IOException | InterruptedException e){
                e.printStackTrace();
            }
            stopSelf(this.serviceID);

        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Thread thread = new Thread(new TheThread(startId));
        thread.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        process.destroy();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    public  void Ghost_Phone(){
        try {


            Thread.sleep(3000);

            String cmd = "/system/bin/monkey -p com.rungetel.ghostphone 1\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

//            gfs ID
            cmd = "/system/bin/input tap 343 183\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 386 620\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 206 630\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 310 634\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 304 630\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 380 490\n";
            os.writeBytes(cmd);
            Thread.sleep(20000);

//            mac change
            cmd = "/system/bin/input tap 242 182\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 237 380\n";
            os.writeBytes(cmd);
            Thread.sleep(2000);

            cmd = "/system/bin/input tap 312 384\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 393 502\n";
            os.writeBytes(cmd);
            Thread.sleep(20000);

            cmd = "/system/bin/am force-stop com.rungetel.ghostphone\n";
            os.writeBytes(cmd);

            Thread.sleep(4000);

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }




    }


    public void ChamelPhon(){

        try {

            Thread.sleep(3000);
            String cmd = "/system/bin/monkey -p com.cryptotel.chamelephon 1\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 282 557\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 262 636\n";
            os.writeBytes(cmd);
            Thread.sleep(delay);

            cmd = "/system/bin/input tap 177 490\n";
            os.writeBytes(cmd);
            Thread.sleep(10000);


            cmd = "/system/bin/am force-stop com.cryptotel.chamelephon\n";
            os.writeBytes(cmd);

            Thread.sleep(delay);

        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }

    }



    public void DeviceIdCHanger(){


        try {
        Thread.sleep(3000);


        String cmd = "/system/bin/monkey -p com.makeinfo.androididchanger 1\n";
        os.writeBytes(cmd);
        Thread.sleep(delay);



        cmd = "/system/bin/input tap 377 452\n";
        os.writeBytes(cmd);
        Thread.sleep(delay);


        cmd = "/system/bin/input tap 157 751\n";
        os.writeBytes(cmd);
        Thread.sleep(delay);


        cmd = "/system/bin/am force-stop com.makeinfo.androididchanger\n";
        os.writeBytes(cmd);

        Thread.sleep(delay);


        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }

    }





    public  void Force_Stop(){

    }









//    adb shell monkey -p com.makeinfo.androididchanger 1
//adb shell monkey -p com.cryptotel.chamelephon 1
//adb shell am force-stop com.cryptotel.chamelephon

//    adb shell su -c 'svc wifi enable/disable'






//    public void _Action(){
//
//        int delay = 3000;
//        try {
////            //Runtime.getRuntime().exec("/system/bin/am start -a com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
//            Process process = Runtime.getRuntime().exec("su");
//            DataOutputStream os = new DataOutputStream(process.getOutputStream());
////            String cmd = "/system/bin/input tap 100 200\n";
//            //String cmd = "/system/bin/am start -a android.settings.SETTINGS\n";
//            Thread.sleep(3000);
//            String cmd = "/system/bin/input keyevent KEYCODE_HOME\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 737 1777\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//            //telegram
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 737 1777\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 322 612\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 326 2250\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 868 2028\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 425 1820\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//            process = Runtime.getRuntime().exec("su");
//            os = new DataOutputStream(process.getOutputStream());
//            cmd = "/system/bin/input tap 1010 1156\n";
//            os.writeBytes(cmd);
//            os.writeBytes("exit\n");
//            os.flush();
//            os.close();
//            Thread.sleep(delay);
//
//
//            try {
//                process.waitFor();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }catch (IOException | InterruptedException e){
//            e.printStackTrace();
//        }
//    }









//    int delay = 2000;
//        try {
//
//        Process process = Runtime.getRuntime().exec("su");
//        DataOutputStream os = new DataOutputStream(process.getOutputStream());
//        Thread.sleep(1000);
//        String cmd = "/system/bin/input keyevent KEYCODE_HOME\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//        //telegram
//
//
//        cmd = "/system/bin/input tap 737 1777\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//
//
//
//
//        cmd = "/system/bin/input tap 322 575\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//
//
//
//        cmd = "/system/bin/input tap 326 2250\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//
//
//
//        cmd = "/system/bin/input tap 856 2009\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//
//        cmd = "/system/bin/input tap 445 1831\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//
//        cmd = "/system/bin/input tap 1010 1174\n";
//        os.writeBytes(cmd);
//        Thread.sleep(delay);
//
//
//        os.writeBytes("exit\n");
//        os.flush();
//        os.close();
//
//
//
//        try {
//            process.waitFor();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }catch (IOException | InterruptedException e){
//        e.printStackTrace();
//    }












}
