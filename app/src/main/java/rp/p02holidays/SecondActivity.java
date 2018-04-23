package rp.p02holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter aa;
    ArrayList<HolidayDetails> hols;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentReceived = getIntent();
        int type = intentReceived.getIntExtra("type",9);
        TextView textView = findViewById(R.id.textView);
        if (type == 0){
            textView.setText("Secular");
            listView = findViewById(R.id.listView);

            hols = new ArrayList<>();
            hols.add(new HolidayDetails("New Year's Day", "1 January 2018","new-year", "First day of the year"));
            hols.add(new HolidayDetails("Labour Day", "1 May 2018","labour-day", "Day to celebrate labour"));
            hols.add(new HolidayDetails("National Day", "9 August 2018","national-day", "Singapore roars to life on National Day, as it remembers its colourful rise to independence and beyond."));

            aa = new Adapter2(this, R.layout.row, hols);
            listView.setAdapter(aa);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    HolidayDetails selectedHoliday = hols.get(position);
                    Toast.makeText(SecondActivity.this, selectedHoliday.getName()
                                    + " Date: " + selectedHoliday.getDate() + " \n" + selectedHoliday.getDescription(),
                            Toast.LENGTH_LONG).show();
                }
            });
        }

        else{
            textView.setText("Ethnic and Religion");

            listView = findViewById(R.id.listView);
            hols = new ArrayList<>();
            hols.add(new HolidayDetails("Chinese New Year", "16 February 2018, 17 February 2018","cny", "With bright colours, non-stop revelry and sheer exuberance, Chinese New Year is one festival that demands all of your attention and energy."));
            hols.add(new HolidayDetails("Good Friday", "30 March 2018","good-friday", "Day celebrating the death of Jesus, who was born again 3 days later"));
            hols.add(new HolidayDetails("Vesak Day", "29 May 2018","vesak-day", "Buddhists in Singapore and the world over celebrate the birth, enlightenment and death of Buddha on Vesak Day, a time of joy, peace and reflection."));
            hols.add(new HolidayDetails("Hari Raya Puasa", "15 June 2018","hari-raya-puasa", "On Hari Raya Aidilfitri, Muslims in Singapore end their time of fasting with a joyous celebration of forgiveness, fellowship and food."));
            hols.add(new HolidayDetails("Hari Raya Haji", "22 August 2018","hari-raya-haji" , "Muslims in Singapore remember their faith with prayer and reflection during Hari Raya Haji, also known as the Festival of Sacrifice."));
            hols.add(new HolidayDetails("Deepavali", "6 November 2018","deepavali", "The annual Hindu celebration of the triumph of light over darkness\n" +
                    "Bright colours, tantalising aromas and the light of a thousand oil lamps fill the streets of Little India during Deepavali."));
            hols.add(new HolidayDetails("Christmas", "25 December 2018","christmas", "You might not get real snow or reindeers, but Christmas in Singapore is as big as any other celebration during the year."));

            aa = new Adapter2(this, R.layout.ro2, hols);
            listView.setAdapter(aa);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    HolidayDetails chosenHoliday = hols.get(position);
                    Toast.makeText(SecondActivity.this, chosenHoliday.getName()
                                    + " Date: " + chosenHoliday.getDate() + " \n" + chosenHoliday.getDescription(),
                            Toast.LENGTH_LONG).show();
                }
            });

        }
    }
}