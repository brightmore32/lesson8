package com.brightmore.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.SQLTransactionRollbackException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Account<String> account = new Account<>();
        //account.setId(12);
        //account.setSum(5544);
        //account.setId("12");
        String string = "My best string from GitHub.";
    }

    public void print() {
        String string = "abraca446tuy";
    }
}

