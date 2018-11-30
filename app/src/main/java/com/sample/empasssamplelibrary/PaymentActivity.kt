package com.sample.empasssamplelibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val details = getParcelable<PaymentDetails>(Constants.DETAILS)
        initView(details)
        btnPay.setOnClickListener {
            details{
                transactionId = System.currentTimeMillis()
                status = true
            }
            setResult(Constants.INTENT_PAY,intent.setDetails(details))
            finish()
        }
    }

    fun initView(details: PaymentDetails){
        textTransactionIdValue.text = details.transactionId.toString()
        textProductNameValue.text = details.productName
        textAmount.text=details.amount
        textTime.text=details.time
    }

}
