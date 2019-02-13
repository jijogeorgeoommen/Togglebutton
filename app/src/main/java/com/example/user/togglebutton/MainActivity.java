package com.example.user.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton togglebtn1,togglebtn2;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButtonClick();   // for the working of submit button this step is mandatory (in thebegining it will be error. the error will change later.
    }
    public void addListnerOnButtonClick(){
        togglebtn1=findViewById(R.id.toggle10);
        togglebtn2=findViewById(R.id.toggle20);
        submit=findViewById(R.id.sbt);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                result.append("Toggle Button1: ").append(togglebtn1.getText());
                result.append("Toggle Button2: ").append(togglebtn2.getText());
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
