package com.example.ab.dhakacityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(R.drawable.fars_hotel, R.string.hotel_one,
                R.string.decription_hotel_one, R.string.location_hotel_one,
                R.string.web_hotel_one,
                "https://www.google.com.bd/maps/place/FARS+Hotel+%26+Resorts/@23.7316419,90.4077133,17z/data=!4m12!1m6!3m5!1s0x3755b8f68b88702b:0xadeae2b143bef043!2sFARS+Hotel+%26+Resorts!8m2!3d23.731637!4d90.409902!3m4!1s0x3755b8f68b88702b:0xadeae2b143bef043!8m2!3d23.731637!4d90.409902?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.marino_hotel, R.string.hotel_two,
                R.string.decription_hotel_two, R.string.location_hotel_two,
                R.string.web_hotel_two,
                "https://www.google.com.bd/maps/place/Marino+Hotel+Banani/@23.7993349,90.4051385,17z/data=!4m12!1m6!3m5!1s0x3755c705e50502a1:0x75ccabeb380ee580!2sMarino+Hotel+Banani!8m2!3d23.79933!4d90.4073272!3m4!1s0x3755c705e50502a1:0x75ccabeb380ee580!8m2!3d23.79933!4d90.4073272?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.westin_hotel, R.string.hotel_three,
                R.string.decription_hotel_three, R.string.location_hotel_three,
                R.string.web_hotel_three,
                "https://www.google.com.bd/maps/place/The+Westin+Dhaka/@23.7933176,90.4124613,17z/data=!4m12!1m6!3m5!1s0x3755c7a72f17bb83:0x57188ff62fd95026!2sThe+Westin+Dhaka!8m2!3d23.7933127!4d90.41465!3m4!1s0x3755c7a72f17bb83:0x57188ff62fd95026!8m2!3d23.7933127!4d90.41465?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.amari_hotel, R.string.hotel_four,
                R.string.decription_hotel_four, R.string.location_hotel_four,
                R.string.web_hotel_four,
                "https://www.google.com.bd/maps/place/Amari+Dhaka/@23.790561,90.4100836,17z/data=!4m12!1m6!3m5!1s0x3755c70a7610d4f1:0x73d8f4d04735bc67!2sAmari+Dhaka!8m2!3d23.7905561!4d90.4122723!3m4!1s0x3755c70a7610d4f1:0x73d8f4d04735bc67!8m2!3d23.7905561!4d90.4122723?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.way_dhaka_hotel, R.string.hotel_five,
                R.string.decription_hotel_five, R.string.location_hotel_five,
                R.string.web_hotel_five,
                "https://www.google.com.bd/maps/place/THE+WAY+Dhaka/@23.7968169,90.4094213,17z/data=!4m12!1m6!3m5!1s0x3755c708157b63fd:0x6b3426096debb534!2sTHE+WAY+Dhaka!8m2!3d23.796812!4d90.41161!3m4!1s0x3755c708157b63fd:0x6b3426096debb534!8m2!3d23.796812!4d90.41161?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.innotel_hotel, R.string.hotel_six,
                R.string.decription_hotel_six, R.string.location_hotel_six,
                R.string.web_hotel_six,
                "https://www.google.com.bd/maps/place/Innotel+Business+Boutique+Hotel/@23.7922638,90.4044251,17z/data=!4m12!1m6!3m5!1s0x3755c70c21083d3f:0x9d49e5ea17536055!2sInnotel+Business+Boutique+Hotel!8m2!3d23.7922589!4d90.4066138!3m4!1s0x3755c70c21083d3f:0x9d49e5ea17536055!8m2!3d23.7922589!4d90.4066138?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.redisun_hotel, R.string.hotel_seven,
                        R.string.decription_hotel_seven, R.string.location_hotel_seven,
                        R.string.web_hotel_seven,
                "https://www.google.com.bd/maps/place/Radisson+Blu+Dhaka+Water+Garden/@23.8160459,90.4065313,17z/data=!4m12!1m6!3m5!1s0x3755c6feb6c1b7b1:0x76350c55ebc50c34!2sRadisson+Blu+Dhaka+Water+Garden!8m2!3d23.816041!4d90.40872!3m4!1s0x3755c6feb6c1b7b1:0x76350c55ebc50c34!8m2!3d23.816041!4d90.40872?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.sonargaon_hotel, R.string.hotel_eight,
                                R.string.decription_hotel_eight, R.string.location_hotel_eight,
                                R.string.web_hotel_eight,
                "https://www.google.com.bd/maps/place/Pan+Pacific+Sonargaon+Dhaka+Hotel/@23.7495859,90.3923203,17z/data=!4m12!1m6!3m5!1s0x3755b897e97a02b9:0x27f34ccd83ba6ede!2sPan+Pacific+Sonargaon+Dhaka+Hotel!8m2!3d23.749581!4d90.394509!3m4!1s0x3755b897e97a02b9:0x27f34ccd83ba6ede!8m2!3d23.749581!4d90.394509?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.six_sisons_hotel, R.string.hotel_nine,
                                        R.string.decription_hotel_nine, R.string.location_hotel_nine,
                                        R.string.web_hotel_nine,
                "https://www.google.com.bd/maps/place/Six+Seasons+Hotel/@23.7945282,90.4174264,17z/data=!4m12!1m6!3m5!1s0x3755c7a4f705a4b1:0xe0b5315081473ad!2sSix+Seasons+Hotel!8m2!3d23.7945233!4d90.4196151!3m4!1s0x3755c7a4f705a4b1:0xe0b5315081473ad!8m2!3d23.7945233!4d90.4196151?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.regency_hotel, R.string.hotel_ten,
                                                R.string.decription_hotel_ten, R.string.location_hotel_ten,
                                                R.string.web_hotel_ten,
                "https://www.google.com.bd/maps/place/Dhaka+Regency+Hotel+%26+Resort/@23.8293852,90.4172452,17z/data=!4m12!1m6!3m5!1s0x3755c65c605d0e0b:0xe91272e017ec415f!2sDhaka+Regency+Hotel+%26+Resort!8m2!3d23.829449!4d90.419273!3m4!1s0x3755c65c605d0e0b:0xe91272e017ec415f!8m2!3d23.829449!4d90.419273?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.colorHome);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        //Launch google maps for a place when click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // Set animation effect when view is clicked
                Animation animation = new AlphaAnimation(0.3f,1.0f);
                animation.setDuration(2000);
                view.startAnimation(animation);

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
