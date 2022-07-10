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

public class BecomeDoner extends AppCompatActivity {
    private ImageButton requestD,homeD,viewD;
    Button submitD;


    private  static  final String [] districts = new String[]{
            "Bhojpur", "Dhankuta","Ilam","Jhapa","Khotang","Morang","Okhaldhunga","Panchthar","Sankhuwasabha","Solukhumbu","Sunsari","Taplejung","Udayapur","Terhathum","Bara","Dhanusa","Mahottari","Parsa","Rautahat","Saptari","Sarlahi","Siraha","Bhaktapur","Chitwan","Dhading","Dolakha","Kathmandu","Kavrepalanchok","Lalitpur","Makawanpur","Nuwakot","Ramechhap","Rasuwa","Sindhuli","Sindhupalchok","Baglung","Gorkha","Kaski","Lamjung","Manang","Mustang","Myagdi","Nawalpur","Parbat","Syangja","Tanahu","Arghakhanchi","Banke","Bardiya","Dang","Gulmi","Kapilvastu","Parasi","Palpa","Pyuthan","Rolpa","Rukum","Rupandehi","Dailekh","Dolpa","Humla","Jajarkot","Jumla","Kalikot","Mugu","Rukum Paschim","Salyan","Surkhet","Achham","Baitadi","Bajhang","Bajura","Dadeldhura","Darchula","Doti","Kailali","Kanchanpur"
    };
    private  static  final String [] bloodtype = new String[]{
            "A","B","AB","O","O negative","O positive","A negative","A positive"
            ,"B negative","B positive","AB negative","AB positive"
    };
    private  static  final String [] gender = new String[]{
            "MALE","FEMALE"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_become_doner);
        requestD = findViewById(R.id.makerequest_btnD);
        homeD = findViewById(R.id.home_btn);
        viewD =findViewById(R.id.viewrequest_btnD);
        submitD = findViewById(R.id.submit_btn);

        //** when make request btn is clicked***//
        requestD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),RequestBlood.class);
                startActivity(intent);
            }
        });
        //* when home btn is clicked**//
        homeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        //* when view btn is clicked**//
        viewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),ViewRequest.class);
                startActivity(intent);
            }
        });
        //* when submit btn is clicked*//
        submitD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


        //**To suggest District****///////
        AutoCompleteTextView edittext2 = findViewById(R.id.Select_District2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,districts);
        edittext2.setAdapter(adapter2);

        /////***To suggest blood type***//////
        AutoCompleteTextView edittext3 = findViewById(R.id.Blood_Type2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bloodtype);
        edittext3.setAdapter(adapter3);

        //////****TO SUGGEST GENDER****/////
        AutoCompleteTextView edittext4 = findViewById(R.id.donor_Gender);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,gender);
        edittext4.setAdapter(adapter4);
    }
}