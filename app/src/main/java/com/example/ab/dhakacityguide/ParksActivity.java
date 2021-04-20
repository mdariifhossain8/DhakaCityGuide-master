package com.example.ab.dhakacityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.park1, R.string.park_one, R.string.info_park_one,
                R.string.address_park_one, R.string.web_park_one,
                "https://www.google.com.bd/maps/place/Chandrima+Udyan/@23.7666915,90.3759511,17z/data=!4m12!1m6!3m5!1s0x3755c7543a947b03:0xd75e6a88605a6663!2sChandrima+Udyan!8m2!3d23.7666866!4d90.3781398!3m4!1s0x3755c7543a947b03:0xd75e6a88605a6663!8m2!3d23.7666866!4d90.3781398?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));
        places.add(new Place(R.drawable.park2, R.string.park_two, R.string.info_park_two,
                R.string.address_park_two, R.string.web_park_two,
                "https://www.google.com.bd/maps/place/Bangladesh+National+Zoo/@23.8124851,90.3450035,17z/data=!4m12!1m6!3m5!1s0x3755c102e2ece5bb:0x446e9dc895326a70!2sBangladesh+National+Zoo!8m2!3d23.8124802!4d90.3471922!3m4!1s0x3755c102e2ece5bb:0x446e9dc895326a70!8m2!3d23.8124802!4d90.3471922?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park3, R.string.park_three, R.string.info_park_three,
                R.string.address_park_three, R.string.web_park_three,
                "https://www.google.com.bd/maps/place/Dhanmondi+Lake/@23.7462971,90.3668476,15z/data=!4m13!1m7!3m6!1s0x3755b8b346e82523:0x7a53eb89f2c8fddd!2sDhanmondi+Lake!3b1!8m2!3d23.7455317!4d90.377631!3m4!1s0x3755b8b346e82523:0x7a53eb89f2c8fddd!8m2!3d23.7455317!4d90.377631?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park4, R.string.park_four, R.string.info_park_four,
                R.string.address_park_four, R.string.web_park_four,
                "https://www.google.com.bd/maps/place/Mirpur+Botanic+Garden/@23.8128802,90.3455196,17z/data=!4m12!1m6!3m5!1s0x3755c11b9b0adbd9:0x6f5e38cb8c69d719!2sMirpur+Botanic+Garden!8m2!3d23.8128753!4d90.3477083!3m4!1s0x3755c11b9b0adbd9:0x6f5e38cb8c69d719!8m2!3d23.8128753!4d90.3477083?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park5, R.string.park_five, R.string.info_park_five,
                R.string.address_park_five, R.string.web_park_two,
                "https://www.google.com.bd/maps/place/Ramna+Park/@23.7375929,90.3991013,17z/data=!4m12!1m6!3m5!1s0x3755b84e57e7da4f:0x74e25e8dd9557872!2sRamna+Park!8m2!3d23.737588!4d90.40129!3m4!1s0x3755b84e57e7da4f:0x74e25e8dd9557872!8m2!3d23.737588!4d90.40129?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park6, R.string.park_six, R.string.info_park_six,
                R.string.address_park_six, R.string.web_park_six,
                "https://www.google.com.bd/maps/search/94+Bir+Uttam+C+R+Dutta+Road,+Dhaka/@23.7459763,90.3903673,17z/data=!3m1!4b1?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park7, R.string.park_seven, R.string.info_park_seven,
                R.string.address_park_seven, R.string.web_park_seven,
                "https://www.google.com.bd/maps/place/Rose+Garden/@23.7222416,90.4046987,17z/data=!4m12!1m6!3m5!1s0x3755b8fbebf9fa27:0x6635589f019d5873!2sRose+Garden!8m2!3d23.7222367!4d90.4068874!3m4!1s0x3755b8fbebf9fa27:0x6635589f019d5873!8m2!3d23.7222367!4d90.4068874?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park8, R.string.park_eight, R.string.info_park_eight,
                R.string.address_park_eight, R.string.web_park_eight,
                "https://www.google.com.bd/maps/place/Sonargaon/@23.6448761,90.5797003,14z/data=!3m1!4b1!4m5!3m4!1s0x3755b34a23050595:0xe92de4bde15fc703!8m2!3d23.6460948!4d90.5991042?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park9, R.string.park_nine, R.string.info_park_nine,
                R.string.address_park_nine, R.string.web_park_nine,
                "https://www.google.com.bd/maps/place/Bahadur+Shah+Park/@23.7093748,90.4101821,17z/data=!3m1!4b1!4m5!3m4!1s0x3755b900ab111249:0x4bbfb2b42ee0f824!8m2!3d23.7093699!4d90.4123708?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.park10, R.string.park_ten, R.string.info_park_ten,
                R.string.address_park_ten, R.string.web_park_ten,
                "https://www.google.com.bd/maps/place/Baldha+Garden+Water+Pump/@23.7177996,90.4170486,17z/data=!4m12!1m6!3m5!1s0x3755b85306beb571:0xf5ad89e269808a1a!2sBaldha+Garden+Water+Pump!8m2!3d23.7177947!4d90.4192373!3m4!1s0x3755b85306beb571:0xf5ad89e269808a1a!8m2!3d23.7177947!4d90.4192373?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));



        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorHome);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // get the place map id an launch a google map view of the place
                Place place = places.get(i);

                Intent mapIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(place.getPlaceMapID()));

                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(getApplicationContext(), "No App to Handle Intent", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
