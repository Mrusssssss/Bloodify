package com.example.blooddon;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button find, donor;
    private ImageButton request,home,view;
    TextView district , blood;
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
        setContentView(R.layout.activity_main);

        find = findViewById(R.id.find_btn1);
        donor = findViewById(R.id.becomedoner_btn);
        district = findViewById(R.id.Select_district);
        blood = findViewById(R.id.select_Blood);
        request =findViewById(R.id.makerequest_btn);
        home = findViewById(R.id.home_btn);
        view = findViewById(R.id.viewrequest_btnH);
;
        //**To suggest District****///////
        AutoCompleteTextView edittext = findViewById(R.id.Select_district);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,districts);
        edittext.setAdapter(adapter);

        /////***To suggest blood type***//////
        AutoCompleteTextView edittext1 = findViewById(R.id.select_Blood);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bloodtype);
        edittext1.setAdapter(adapter1);



        //**when make request btn is clicked**//
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RequestBlood.class);
                startActivity(intent);
            }
        });
        //**when Become Donor btn is clicked**//
        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),BecomeDoner.class);
                startActivity(i);
            }
        });
        //*when home btn is clicked**//
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i2);
            }
        });
        //**when view request btn is clicked**//
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),ViewRequest.class);
                startActivity(i2);
            }
        });



        //*******If District and Blood Type Empty******//////

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (district.getText().toString().isEmpty()){
                    district.setError("District cannot be empty");
                }
                if (blood.getText().toString().isEmpty()){
                    blood.setError("Please select the blood type");
                }

            }
        });


    }


}