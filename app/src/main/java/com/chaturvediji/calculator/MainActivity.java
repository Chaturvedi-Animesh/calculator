package com.chaturvediji.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button calbut;
    TextView ansview;
    EditText num1,num2,oper;
    int n1,n2;
    double ans;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        oper=findViewById(R.id.operator);
        calbut=findViewById(R.id.calcbut);
        ansview=findViewById(R.id.ansview);

        calbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nu1,nu2,o;
                nu1=num1.getText().toString();
                nu2=num2.getText().toString();
                o=oper.getText().toString();
                if(TextUtils.isEmpty(nu1)||TextUtils.isEmpty(nu2)||TextUtils.isEmpty(o)){
                    Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_LONG).show();
                }else{
                n1= Integer.parseInt(nu1);
                n2=Integer.parseInt(nu2);
                op=o.charAt(0);
                    switch(op){
                        case '+':ans=n1+n2;break;
                        case '-':ans=n1-n2;break;
                        case '*':ans=n1*n2;break;
                        case '/':ans=(double)n1/n2;break;
                        default:Toast.makeText(MainActivity.this,"Invalid Operator",Toast.LENGTH_LONG).show();
                    }
                    ansview.setText(Double.toString(ans));

            }}
        });
    }
}
