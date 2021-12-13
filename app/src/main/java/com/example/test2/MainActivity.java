package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    private CardView guide_to_use_cv;
    private CardView my_auto_tast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_auto_tast = (CardView) findViewById(R.id.my_auto_tast_id);

        my_auto_tast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getApplication(), autobot_background.class));
            }
        });

    }




}











//        try {
//            //Process process = Runtime.getRuntime().exec("am start -a com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
//            //Process process = Runtime.getRuntime().exec("sh path/to/shellScript.sh");
//            Process process = Runtime.getRuntime().exec("adb shell am start -a com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS");
//
//            BufferedReader bufferedReader = new BufferedReader(
//                    new InputStreamReader(process.getInputStream()));
//            action_text_view.setText("_Action Function");
//        }catch (IOException e){
//            action_text_view.setText(e.toString());
//        }


//        AssetManager amngr = getAssets();
//        Process p=null;
//        try {
//            p = new ProcessBuilder()
//                    .command("am start -a com.android.settings.APPLICATION_DEVELOPMENT_SETTINGS")
//                    .start();
//            action_text_view.setText("_Action");
//        } catch (IOException e) {
//            action_text_view.setText(e.toString());
//        } finally {
//            if(p!=null) p.destroy();
//        }
