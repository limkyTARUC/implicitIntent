package com.example.taruc.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonHome, buttonView, buttonSend, buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall=findViewById(R.id.buttonCall);
        buttonHome=findViewById(R.id.buttonHome);
        buttonSend=findViewById(R.id.buttonSend);
        buttonView=findViewById(R.id.buttonView);



    }

    public void viewTARUC(View v)
    {
        String url="http://tarc.edu.my";
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void callNum(View v)
    {
        String number = "23454568678";
        Intent intent=new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + number));
        startActivity(intent);
    }

    public void sendEmail(View v)
    {
        String emailadd = "ekylim83@gmail.com";
        Intent intent=new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + emailadd));
        startActivity(intent);
    }
}
