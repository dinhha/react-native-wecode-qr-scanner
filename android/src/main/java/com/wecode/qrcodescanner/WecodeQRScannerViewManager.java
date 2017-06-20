package com.wecode.qrcodescanner;

import android.view.View;

import javax.annotation.Nullable;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public class WecodeQRScannerViewManager extends ViewGroupManager<WecodeQRScannerView>{
    @Override
    public String getName() {
        return "RNWecodeQRScannerView";
    }

    @Override
    public WecodeQRScannerView createViewInstance(ThemedReactContext context){
        return new WecodeQRScannerView(context);
    }
}