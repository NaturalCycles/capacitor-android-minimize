package com.naturalcycles.androidminimize;

import android.content.Intent
import com.getcapacitor.NativePlugin
import com.getcapacitor.PluginCall
import com.getcapacitor.PluginMethod

@NativePlugin
class AndroidMinimize : com.getcapacitor.Plugin() {
    @PluginMethod
    fun minimizeApp(call: PluginCall) {
        val homeIntent = Intent(Intent.ACTION_MAIN)
        homeIntent.addCategory(Intent.CATEGORY_HOME)
        homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        context.startActivity(homeIntent)
        call.success()
    }
}
