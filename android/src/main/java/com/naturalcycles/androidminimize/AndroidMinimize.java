package com.naturalcycles.androidminimize;

import android.content.Intent;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class AndroidMinimize extends Plugin {

    @PluginMethod()
    public void minimizeApp(PluginCall call) {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory( Intent.CATEGORY_HOME );
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        getContext().startActivity(homeIntent);
        call.success();
    }
}
