package com.sdkhaptiklib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ai.haptik.android.wrapper.sdk.HaptikSDK;
import ai.haptik.android.wrapper.sdk.model.InitData;
import ai.haptik.android.wrapper.sdk.model.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;


public class sdkInterface extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        InitData initData = new InitData();//3rd step
        initData.setPrimaryColor("#420420");
        initData.setComposerPlaceholder("Type Message....");
        initData.setNoHeader(true);
        initData.setInitializeLanguage("en");
        HaptikSDK.INSTANCE.init(this, initData);
        HaptikSDK.INSTANCE.init(this, initData);//2nd Step
        //HaptikSDK.INSTANCE.loadGuestConversation();
        //final Button button = (Button) findViewById(R.id.button);
        //button.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {
                //launchGuestConversation();
            //} //4th step
        //});
        launchGuestConversation();
    }

    public void launchGuestConversation(){
        HaptikSDK.INSTANCE.loadGuestConversation(new Function1<Response, Unit>() {
            @Override
            public Unit invoke(Response response) {
                return null;
            }
        });
    }
}
