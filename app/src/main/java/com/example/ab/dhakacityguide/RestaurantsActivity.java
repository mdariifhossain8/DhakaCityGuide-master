package com.example.ab.dhakacityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.restaurants_one, R.string.address_restaurants_one,
                R.string.web_restaurants_one,
                "https://www.google.com.bd/maps/place/Tokyo+Express/@23.7904713,90.416942,17z/data=!4m12!1m6!3m5!1s0x3755c7a309f421eb:0x7a811e6c233465fc!2sTokyo+Express!8m2!3d23.7904664!4d90.4191307!3m4!1s0x3755c7a309f421eb:0x7a811e6c233465fc!8m2!3d23.7904664!4d90.4191307?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_two, R.string.address_restaurants_two,
                R.string.web_restaurants_two,
                "https://www.google.com.bd/maps/place/Voot+Restaurant/@23.7902621,90.4059161,17z/data=!4m12!1m6!3m5!1s0x3755c70b85ebe4fb:0xb7e6b1493e1d7056!2sVoot+Restaurant!8m2!3d23.7902572!4d90.4081048!3m4!1s0x3755c70b85ebe4fb:0xb7e6b1493e1d7056!8m2!3d23.7902572!4d90.4081048?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_three, R.string.address_restaurants_three,
                R.string.web_restaurants_three,
                "https://www.google.com.bd/maps/place/Saltz/@23.7993914,90.4099471,17z/data=!4m12!1m6!3m5!1s0x3755c707f11eb56d:0xd7e653c167e937da!2sSaltz!8m2!3d23.7993865!4d90.4121358!3m4!1s0x3755c707f11eb56d:0xd7e653c167e937da!8m2!3d23.7993865!4d90.4121358?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_four, R.string.address_restaurants_four,
                R.string.web_restaurants_four,
                "https://www.google.com.bd/maps/place/Aaheli+Kabab+%26+Restaurant/@23.7929409,90.4046238,17z/data=!4m12!1m6!3m5!1s0x3755c70e991c0c77:0x9fa67b93281f7043!2sAaheli+Kabab+%26+Restaurant!8m2!3d23.792936!4d90.4068125!3m4!1s0x3755c70e991c0c77:0x9fa67b93281f7043!8m2!3d23.792936!4d90.4068125?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_five, R.string.address_restaurants_five,
                R.string.web_restaurants_five,
                "https://www.google.com.bd/maps/place/Attin/@23.7959866,90.4058075,17z/data=!4m12!1m6!3m5!1s0x3755c708d3b077d5:0x7731234835fecc22!2sAttin!8m2!3d23.7959817!4d90.4079962!3m4!1s0x3755c708d3b077d5:0x7731234835fecc22!8m2!3d23.7959817!4d90.4079962?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_six, R.string.address_restaurants_six,
                R.string.web_restaurants_six,
                "https://www.google.com.bd/maps/place/Eat+%26+Enjoy/@23.750451,90.4140308,17z/data=!4m12!1m6!3m5!1s0x3755b86340950487:0xe713c2b9f207e164!2sEat+%26+Enjoy!8m2!3d23.7504461!4d90.4162195!3m4!1s0x3755b86340950487:0xe713c2b9f207e164!8m2!3d23.7504461!4d90.4162195?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_seven, R.string.address_restaurants_seven,
                R.string.web_restaurants_seven,
                "https://www.google.com.bd/maps/place/Eat+n+Pay/@23.7525279,90.438686,17z/data=!4m12!1m6!3m5!1s0x3755c76c2eaf0a35:0xc8bf448982d34d1!2sEat+n+Pay!8m2!3d23.752523!4d90.4408747!3m4!1s0x3755c76c2eaf0a35:0xc8bf448982d34d1!8m2!3d23.752523!4d90.4408747?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_eight, R.string.address_restaurants_eight,
                R.string.web_restaurants_eight,
                "https://www.google.com.bd/maps/place/Re-Eat+Dhaba+-+Malibagh+Branch/@23.74418,90.4126538,17z/data=!4m12!1m6!3m5!1s0x3755b86182afbf73:0x6f52679dd1b03938!2sRe-Eat+Dhaba+-+Malibagh+Branch!8m2!3d23.7441751!4d90.4148425!3m4!1s0x3755b86182afbf73:0x6f52679dd1b03938!8m2!3d23.7441751!4d90.4148425?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_nine, R.string.address_restaurants_nine,
                R.string.web_restaurants_nine,
                "https://www.google.com.bd/maps/place/Boomers+Cafe+Banani+Branch/@23.7937918,90.4022628,17z/data=!4m12!1m6!3m5!1s0x3755c70e66eeb1a5:0x465ded5d37842779!2sBoomers+Cafe+Banani+Branch!8m2!3d23.7937869!4d90.4044515!3m4!1s0x3755c70e66eeb1a5:0x465ded5d37842779!8m2!3d23.7937869!4d90.4044515?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.string.restaurants_ten, R.string.address_restaurants_ten,
                R.string.web_restaurants_ten,
                "https://www.google.com.bd/maps/place/KFC+Restaurant/@23.7937362,90.4031708,17z/data=!4m12!1m6!3m5!1s0x3755c70e61cfd2dd:0x93d98de48f5cbdc5!2sKFC+Restaurant!8m2!3d23.7937313!4d90.4053595!3m4!1s0x3755c70e61cfd2dd:0x93d98de48f5cbdc5!8m2!3d23.7937313!4d90.4053595?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));


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
