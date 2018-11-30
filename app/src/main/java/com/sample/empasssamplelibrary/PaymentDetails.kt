package com.sample.empasssamplelibrary

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Sagar on 11/30/2018.
 */
@Parcelize
data class PaymentDetails(var transactionId:Long = 0,val amount:String,
                          val time:String,var status:Boolean = false,
                          val productName:String,val productId:String):Parcelable{
     operator fun invoke(f:PaymentDetails.() -> Unit) = f()
}