package com.example.blooddon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ViewRequest extends AppCompatActivity {
    private ImageButton homeV,viewV,requestV;
    //private TextView Cname,Pname;
   // private String pname,cname;


   /* public static final String CONTACTNAME = "CONTACTNAME";
    public static final String PATIENTNAME = "PATIENTNAME";
    //public static final String AGE = "AGE";
    //public static final String DISTRICT = "DISTRICT";
    //public static final String HOSPITALNAME = "HOSPITALNAME";
    //public static final String REQUIREDUNIT = "REQUIREDUNIT";
    //public static final String PHONENO = "PHONENO";
    //public static final String DETAILS = "DETAILS";
    //public static final String BLOODTYPE = "BLOODTYPE";*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_request);
        homeV = findViewById(R.id.home_btnV);
        viewV = findViewById(R.id.viewrequest_btnV);
        requestV = findViewById(R.id.makerequest_btnV);
        //Cname = findViewById(R.id.Vcontactname);
        //Pname = findViewById(R.id.Vpatientname);

        //**to get data from Request blood activity**//

        /*Intent intent = getIntent();

        cname = intent.getStringExtra(CONTACTNAME);
        pname = intent.getStringExtra(PATIENTNAME);
        Cname.setText("HI"+cname);
        Pname.setText(pname);*/



        //**when view request btn is clicked**//

        viewV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),ViewRequest.class);
                startActivity(i2);
            }
        });
        //*when home btn is clicked**//
        homeV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i2);
            }
        });
        //**when make request btn is clicked**//
        requestV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RequestBlood.class);
                startActivity(intent);
            }
        });
    }
}