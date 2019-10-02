package com.example.testradiobuttoncheckboximagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvName;
    private RadioButton rbtnGay;
    private RadioButton rbtnGay2;
    private CheckBox cbTim;
    private CheckBox cbHong;
    private CheckBox cbNoiTam;
    private CheckBox cbKhocTham;
    private ImageButton ibtnImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();

        ibtnImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = tvName.getText().toString() + " ";
                if (cbTim.isChecked()) {
                    temp = temp + cbTim.getText() + ", ";
                }
                if (cbHong.isChecked()) {
                    temp = temp + cbHong.getText() + ", ";
                }
                if (cbNoiTam.isChecked()) {
                    temp = temp + cbNoiTam.getText() + ", ";
                }
                if (cbKhocTham.isChecked()) {
                    temp = temp + cbKhocTham.getText() + ", ";
                }
                if (rbtnGay2.isChecked()) {
                    temp = temp + rbtnGay2.getText();
                } else {
                    temp = temp + rbtnGay.getText();
                }
                Toast.makeText(MainActivity.this, temp, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initWidgets() {
        tvName = findViewById(R.id.tv_name);
        rbtnGay = findViewById(R.id.rbtn_gay);
        rbtnGay2 = findViewById(R.id.rbtn_gay2);
        cbTim = findViewById(R.id.cb_tim);
        cbHong = findViewById(R.id.cb_hong);
        cbNoiTam = findViewById(R.id.cb_noitam);
        cbKhocTham = findViewById(R.id.cb_khoctham);
        ibtnImg = findViewById(R.id.ibtn_img);
    }
}
