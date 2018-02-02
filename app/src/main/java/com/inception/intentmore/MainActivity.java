package com.inception.intentmore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_dialer(View view) {

        Intent i = new Intent(Intent.ACTION_DIAL);

        i.setData(Uri.parse("tel:7837313134"));

        startActivity(i);
    }

    public void open_browser(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW , Uri.parse("http://www.facebook.com"));

        startActivity(i);

    }


    public void open_third_party_app(View view) {

        Intent intent = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");

        startActivity( intent );
    }

    public void send_message(View view) {

        Intent i = new Intent(Intent.ACTION_VIEW);

        i.setData(Uri.parse("sms:"));

        i.putExtra("address" , "7837313134");

        i.putExtra("sms_body", "hello hi bye");

        startActivity(i);
    }
}
