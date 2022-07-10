package com.example.blooddon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RequestBlood extends AppCompatActivity {
    private ImageButton homeR,requestR,viewR;

    private Button submitR;

    public EditText contactnameR,patientnameR,districtR,bloodtypeR,ageR,hospitalnameR,requirsedunitR,phonenoR,detailsR;

    private  static  final String [] districts = new String[]{

            "Bhojpur", "Dhankuta","Ilam","Jhapa","Khotang","Morang","Okhaldhunga","Panchthar","Sankhuwasabha","Solukhumbu","Sunsari","Taplejung","Udayapur","Terhathum","Bara","Dhanusa","Mahottari","Parsa","Rautahat","Saptari","Sarlahi","Siraha","Bhaktapur","Chitwan","Dhading","Dolakha","Kathmandu","Kavrepalanchok","Lalitpur","Makawanpur","Nuwakot","Ramechhap","Rasuwa","Sindhuli","Sindhupalchok","Baglung","Gorkha","Kaski","Lamjung","Manang","Mustang","Myagdi","Nawalpur","Parbat","Syangja","Tanahu","Arghakhanchi","Banke","Bardiya","Dang","Gulmi","Kapilvastu","Parasi","Palpa","Pyuthan","Rolpa","Rukum","Rupandehi","Dailekh","Dolpa","Humla","Jajarkot","Jumla","Kalikot","Mugu","Rukum Paschim","Salyan","Surkhet","Achham","Baitadi","Bajhang","Bajura","Dadeldhura","Darchula","Doti","Kailali","Kanchanpur"

    };
    private  static  final String [] bloodtype = new String[]{

            "A","B","AB","O","O negative","O positive","A negative","A positive"
            ,"B negative","B positive","AB negative","AB positive"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_blood);
        homeR = findViewById(R.id.home_btnR);
        requestR = findViewById(R.id.makerequest_btnR);
        viewR = findViewById(R.id.viewrequest_btnR);
        submitR =findViewById(R.id.submit_btn);


        //**To suggest District****///////
        AutoCompleteTextView edittext2 = findViewById(R.id.Select_District2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,districts);
        edittext2.setAdapter(adapter2);

        /////***To suggest blood type***//////
        AutoCompleteTextView edittext3 = findViewById(R.id.Blood_Type2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bloodtype);
        edittext3.setAdapter(adapter3);

        ///**When home btn is clicked***////
        homeR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });
        ///**When view btn is clicked***////
        viewR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ViewRequest.class);
                startActivity(intent);

            }
        });

        //**When make request btn is clicked**//
        requestR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RequestBlood.class);
                startActivity(intent);

            }
        });
        //*When submit button is clicked*//
        submitR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contactname = contactnameR.getText().toString();
                String patientname = patientnameR.getText().toString().trim();
                String district    = districtR.getText().toString();
                String bloodtype = bloodtypeR.getText().toString();
                String age = ageR.getText().toString();
                String hospitalname = hospitalnameR.getText().toString();
                String requirsedunit = requirsedunitR.getText().toString();
                String phoneno = phonenoR.getText().toString();
                String details = detailsR.getText().toString();
            }
        });

    }

    //**To pass data from make request to view request activity**//
    /*public void sendData()
    {
          String contactname = contactnameR.getText().toString().trim();
          String patientname = patientnameR.getText().toString().trim();
        //String district    = districtR.getText().toString();
        //String bloodtype = bloodtypeR.getText().toString();
        //String age = ageR.getText().toString();
        //String hospitalname = hospitalnameR.getText().toString();
        //String requirsedunit = requirsedunitR.getText().toString();
        //String phoneno = phonenoR.getText().toString();
        //String details = detailsR.getText().toString();



        Intent intent = new Intent(getApplicationContext(),ViewRequest.class);
        intent.putExtra(ViewRequest.CONTACTNAME,contactname);
        intent.putExtra(ViewRequest.PATIENTNAME,patientname);
        //intent.putExtra(ViewRequest.DISTRICT,district);
        //intent.putExtra(ViewRequest.BLOODTYPE,bloodtype);
        //intent.putExtra(ViewRequest.AGE,age);
        //intent.putExtra(ViewRequest.HOSPITALNAME,hospitalname);
        //intent.putExtra(ViewRequest.REQUIREDUNIT,requirsedunit);
        //intent.putExtra(ViewRequest.DETAILS,details);
        //intent.putExtra(ViewRequest.PHONENO,phoneno);

        startActivity(intent);

    }*/
}