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


public class TouristsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.drawable.place1,R.string.tourist_one,R.string.info_tourist_one,
                R.string.address_tourist_one,R.string.web_tourist_one,
                "https://www.google.com.bd/maps/place/Ahsan+Manzil/@23.7086038,90.4049077,18z/data=!4m12!1m6!3m5!1s0x3755b9047a855555:0xdb6be1e307885b57!2sAhsan+Manzil!8m2!3d23.7085964!4d90.406002!3m4!1s0x3755b9047a855555:0xdb6be1e307885b57!8m2!3d23.7085964!4d90.406002?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));
        places.add(new Place(R.drawable.place2,R.string.tourist_two,R.string.info_tourist_two,
                R.string.address_tourist_two,R.string.web_tourist_two,
                "https://www.google.com.bd/maps/place/Armenian+Church/@23.7124763,90.4000049,17z/data=!4m12!1m6!3m5!1s0x3755b91d2d670b07:0x5d29eaeb6be69c5a!2sArmenian+Church!8m2!3d23.7124714!4d90.4021936!3m4!1s0x3755b91d2d670b07:0x5d29eaeb6be69c5a!8m2!3d23.7124714!4d90.4021936?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));
        places.add(new Place(R.drawable.place3,R.string.tourist_three,R.string.info_tourist_three,
                R.string.address_tourist_three,R.string.web_tourist_three,
                "https://www.google.com.bd/maps/place/%E0%A5%90+Dhakeshwari+Mondir+(%E0%A6%A2%E0%A6%BE%E0%A6%95%E0%A7%87%E0%A6%B6%E0%A7%8D%E0%A6%AC%E0%A6%B0%E0%A7%80+%E0%A6%AE%E0%A6%A8%E0%A7%8D%E0%A6%A6%E0%A6%BF%E0%A6%B0)/@23.7231059,90.3879178,17z/data=!3m1!4b1!4m5!3m4!1s0x3755b8db7e0a04a9:0x8ee3fcfa629897e9!8m2!3d23.723101!4d90.3901065?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));
        places.add(new Place(R.drawable.place4,R.string.tourist_four,R.string.info_tourist_four,
                R.string.address_tourist_four,R.string.web_tourist_four,
                "https://www.google.com.bd/maps/place/Lalbagh+Fort/@23.719546,90.38591,17z/data=!3m1!4b1!4m5!3m4!1s0x3755b8d900000001:0x4e16316ffc66e862!8m2!3d23.7195411!4d90.3880987?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place5,R.string.tourist_five,R.string.info_tourist_five,
                R.string.address_tourist_five,R.string.web_tourist_five,
                "https://www.google.com.bd/maps/place/Liberation+War+Museum,+Bangladesh/@23.7755701,90.3674861,17z/data=!4m12!1m6!3m5!1s0x3755c0b1f0611acb:0xc87148859788d9c6!2sLiberation+War+Museum,+Bangladesh!8m2!3d23.7755652!4d90.3696748!3m4!1s0x3755c0b1f0611acb:0xc87148859788d9c6!8m2!3d23.7755652!4d90.3696748?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place6,R.string.tourist_six,R.string.info_tourist_six,
                R.string.address_tourist_six,R.string.web_tourist_six,
                "https://www.google.com.bd/maps/place/National+Museum+of+Bangladesh/@23.7374852,90.392261,17z/data=!3m1!4b1!4m5!3m4!1s0x3755b8eabd8931e1:0x65b3d31b26bf2e5!8m2!3d23.7374803!4d90.3944497?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place7,R.string.tourist_seven,R.string.info_tourist_seven,
                R.string.address_tourist_seven,R.string.web_tourist_seven,
                "https://www.google.com.bd/maps/place/National+Museum+of+Science+%26+Technology/@23.7789602,90.3703443,17.75z/data=!4m12!1m6!3m5!1s0x3755c0b3be011ebb:0xda6a9f1450877013!2sNational+Museum+of+Science+%26+Technology!8m2!3d23.7789414!4d90.3716283!3m4!1s0x3755c0b3be011ebb:0xda6a9f1450877013!8m2!3d23.7789414!4d90.3716283?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place8,R.string.tourist_eight,R.string.info_tourist_eight,
                R.string.address_tourist_eight,R.string.web_tourist_eight,
                "https://www.google.com.bd/maps/place/Central+Shaheed+Minar/@23.7272475,90.3944389,17z/data=!4m12!1m6!3m5!1s0x3755b8e89cbec039:0xe403f93b9b07d016!2sCentral+Shaheed+Minar!8m2!3d23.7272426!4d90.3966276!3m4!1s0x3755b8e89cbec039:0xe403f93b9b07d016!8m2!3d23.7272426!4d90.3966276?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place9,R.string.tourist_nine,R.string.info_tourist_nine,
                R.string.address_tourist_nine,R.string.web_tourist_nine,
                "https://www.google.com.bd/maps/place/National+Martyr's+Monument/@23.9112209,90.252531,17z/data=!4m12!1m6!3m5!1s0x3755e8fb9aa0707f:0x7f247dcf3afffae9!2sNational+Martyr's+Monument!8m2!3d23.911216!4d90.2547197!3m4!1s0x3755e8fb9aa0707f:0x7f247dcf3afffae9!8m2!3d23.911216!4d90.2547197?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));

        places.add(new Place(R.drawable.place10,R.string.tourist_ten,R.string.info_tourist_ten,
                R.string.address_tourist_ten,R.string.web_tourist_ten,
                "https://www.google.com.bd/maps/place/Star+Mosque/@23.7156613,90.3994818,17z/data=!4m12!1m6!3m5!1s0x3755b8e2996c625d:0x717e9830f56c1480!2sStar+Mosque!8m2!3d23.7156272!4d90.4016953!3m4!1s0x3755b8e2996c625d:0x717e9830f56c1480!8m2!3d23.7156272!4d90.4016953?hl=en;ved=AIzaSyD0I5I5UIJ43K9QURlZF1XIUc1GYvDFdkU"));


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
