package com.sample.empasssamplelibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_payment.*


class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        val details = getParcelable<PaymentDetails>(Constants.DETAILS)
        details{
            transactionId = System.currentTimeMillis()
            status = true
        }
        initView(details)
        btnPay.setOnClickListener {
            setResult(Constants.INTENT_PAY,intent.setDetails(details))
            finish()
        }
    }

    private fun initView(details: PaymentDetails){
        textTransactionIdValue.text = details.transactionId.toString()
        textProductNameValue.text = details.productName
        textAmount.text=details.amount
        textTime.text=details.time
    }

}
