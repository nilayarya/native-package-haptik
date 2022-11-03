package com.sdkhaptiklib

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class sdkManager internal constructor(context: ReactApplicationContext?) :
        ReactContextBaseJavaModule(context) {
    override fun getName(): String {
        return "sdkManager"
    }

    @ReactMethod
    open fun navigateToExample() {
        val context = reactApplicationContext
        val intent = Intent(context, sdkInterface::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent)
    }
}