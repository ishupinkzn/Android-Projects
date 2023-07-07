package com.example.autopurchase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoanSummaryActivity extends AppCompatActivity {

    TextView monthlyPayET;
    TextView loanReportET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loansummary_layout);

        monthlyPayET = (TextView) findViewById(R.id.textView2);
        loanReportET = (TextView) findViewById(R.id.textView3);

        // RETRIEVE PASSED DATA
        // gets a reference to the Intent that starts this activity
        // NOTE: we should check if the Intent is null
        Intent intent = getIntent(); // gets a reference to the Intent that starts this activity


        // Pull the data (Extras) out of the Intent
        String report;
        report = intent.getStringExtra("LoanReport");

        String monthlyPay;
        monthlyPay = intent.getStringExtra("MonthlyPayment");

        // display the results on the screen's TextViews
        monthlyPayET.setText(monthlyPay);
        loanReportET.setText(report);

    }

    public void goDataEntry(View view) {

        // this will end / quit this activity
        // and fall back to the Parent Activity in the Activity Stack
        finish();
    }

}