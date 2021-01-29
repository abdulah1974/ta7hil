package com.example.ta7hil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class c extends AppCompatActivity {
    TextView ed1;
    TextView lblinfo;
    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;
    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_Add,btn_Sub,btn_clear;
    Button button,go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c);
        ed1 = findViewById(R.id.edtPhoneNumber);
        btn_1 = (Button) findViewById(R.id.btnOne);
        btn_2 = (Button) findViewById(R.id.btnTwo);
        btn_3 = (Button) findViewById(R.id.btnThree);
        btn_4 = (Button) findViewById(R.id.btnFour);
        btn_5 = (Button) findViewById(R.id.btnFive);
        btn_6 = (Button) findViewById(R.id.btnSix);
        btn_7 = (Button) findViewById(R.id.btnSeven);
        btn_8 = (Button) findViewById(R.id.btnEight);
        btn_9 = (Button) findViewById(R.id.btnNine);
        btn_0 = (Button) findViewById(R.id.btnZero);
        btn_clear =findViewById(R.id.btndel);
        button=findViewById(R.id.iraq);
        btn_Add=findViewById(R.id.btnAterisk);
        btn_Sub=findViewById(R.id.btnHash);
        go=findViewById(R.id.btnCall);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }


        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNo = ed1.getText().toString();

                if (phoneNo != null && phoneNo.length() > 0) {
                    phoneNo = phoneNo.substring(0, phoneNo.length() - 1);
                }

                ed1.setText(phoneNo);

            }
        });
        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "*");

            }
        });
        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "#");
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().isEmpty()){

                    Toast.makeText(c.this, "الرجاء ادخل رقم", Toast.LENGTH_SHORT).show();



                }else {
                  //  String s=ed1.getText().toString();
                  //  Intent intent=new Intent(sing.this,hom.class);

                  //  intent.putExtra("EXTRA_SESSION_ID",s);
                  //  startActivity(intent);


                }



            }
        });
    }
}
