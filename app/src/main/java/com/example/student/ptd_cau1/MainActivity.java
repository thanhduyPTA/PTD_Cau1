package com.example.student.ptd_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView thongbao;
    EditText edit1, edit2;
    Button btnDN;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        thongbao = findViewById(R.id.thongbao);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btnDN = findViewById(R.id.btnDN);
        check = findViewById(R.id.check);

        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tb = "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu";
                if(check.isChecked())
                    tb = "Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu";

                thongbao.setText(tb);
            }
        });
    }
}
