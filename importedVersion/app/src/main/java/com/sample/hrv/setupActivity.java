package com.sample.hrv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.sample.hrv.DeviceScanActivity;
import com.sample.hrv.adapters.BleDevicesAdapter;




public class setupActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setTitle(R.string.title_devices);
        setContentView(R.layout.activity_setup);
        final Button blesetup = (Button) findViewById(R.id.but_menu_ble);
        blesetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(setupActivity.this, DeviceScanActivity.class);
                startActivity(intent);
            }
        });

    }

    protected void onResume() {
        super.onResume();
    }


}
