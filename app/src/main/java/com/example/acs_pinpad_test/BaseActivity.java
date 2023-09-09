package com.example.acs_pinpad_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
    public void pinpadClick(View view){

        UsbManager mManager;
        mManager = (UsbManager) getSystemService(Context.USB_SERVICE);
       if(!mManager.getDeviceList().values().isEmpty()) {
           Intent intent = new Intent(getApplicationContext(), MainActivity.class);
           startActivity(intent);
       }else{
           Toast.makeText(this, "Lütfen pin pad cihazını takıp tekrar deneyin!..", Toast.LENGTH_LONG).show();
       }


    }
}