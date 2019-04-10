package com.example.typerun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1,num2,num3,num4,num5;
    private TextView txtoutput;
    private Button btn1;

    public boolean validate(){
        boolean checkvalidate=true;
        if (TextUtils.isEmpty(num1.getText().toString())) {
            num1.setError("Make is required");
            num1.requestFocus();
            checkvalidate = false;

        }
        if (TextUtils.isEmpty(num2.getText().toString())) {
            num2.setError("Year is required");
            num2.requestFocus();
            checkvalidate = false;

        }
        if (TextUtils.isEmpty(num3.getText().toString())) {
            num3.setError("Color  is required");
            num3.requestFocus();
            checkvalidate = false;

        }
        if (TextUtils.isEmpty(num4.getText().toString())) {
            num4.setError("Purchase Price is required");
            num4.requestFocus();
            checkvalidate = false;

        }
        if (TextUtils.isEmpty(num5.getText().toString())) {
            num5.setError("Engine Size is required");
            num5.requestFocus();
            checkvalidate = false;

        }


        return  checkvalidate;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        txtoutput=findViewById(R.id.txtoutput);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validate()){
                    String make=num1.getText().toString();
                    int year=Integer.parseInt(num2.getText().toString());
                    String color=num3.getText().toString();
                    float price=Float.parseFloat(num4.getText().toString());
                    float size=Float.parseFloat(num5.getText().toString());

                    txtoutput.setText("This is Vehicle manufactued by"+make +" on year"+year +" in "+color
                    +" color"+" with the purchase value :"+price+ " and its engine size is "+size +"l");


                }

            }
        });
    }
}
