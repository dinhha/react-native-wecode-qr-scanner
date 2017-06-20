package com.wecode.qrcodescanner;

import android.content.Context;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View;
import android.widget.FrameLayout;


import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class WecodeQRScannerView extends FrameLayout implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;

    public WecodeQRScannerView(Context context){
        super(context);

        mScannerView = new ZXingScannerView(context);   // Programmatically initialize the scanner view
        this.addView(mScannerView);

        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();
    }

    @Override
    public void handleResult(Result rawResult) {

    }

}