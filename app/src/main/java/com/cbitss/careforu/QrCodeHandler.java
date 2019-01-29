package com.cbitss.careforu;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class QrCodeHandler extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    public static final int REQUEST_CAMERA = 1;
    private ZXingScannerView scannerView;

//    protected void onCreate(Bundle saveInstanceState) {
//        super.onCreate(Bundle saveInstanceState);
//        scannerView = new ZXingScannerView(this);
//        setContentView(scannerView);
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (checkPermission()) {
//                Toast.makeText(this, "Granted!", Toast.LENGTH_SHORT).show();
//            }
//            else {requestPermissions();}
//        }
//    }


    //private boolean checkPermission() {
    //    return (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED);
    //}

    @Override
    public void handleResult(Result result) {

    }
}
