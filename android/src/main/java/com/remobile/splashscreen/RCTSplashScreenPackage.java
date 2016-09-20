package com.remobile.splashscreen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;


public class RCTSplashScreenPackage implements ReactPackage {
    private RCTSplashScreen mModuleInstance;

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        mModuleInstance = new RCTSplashScreen(reactContext);
        modules.add(mModuleInstance);

        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
