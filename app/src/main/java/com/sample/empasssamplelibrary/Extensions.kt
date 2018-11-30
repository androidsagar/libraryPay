package com.sample.empasssamplelibrary

import android.content.Intent
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Created by Sagar on 11/30/2018.
 */
fun Intent.setDetails(details: PaymentDetails):Intent{
    this.putExtra(Constants.DETAILS,details)
    return this
}

fun <T: Parcelable>AppCompatActivity.getParcelable(key:String):T{
    return intent.getParcelableExtra(key)
}
