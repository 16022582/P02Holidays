package rp.p02holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class Adapter2 extends ArrayAdapter<HolidayDetails>{
    private ArrayList<HolidayDetails> holidays;
    private Context context;
    private TextView name;
    private TextView date;
    private ImageView image;

    public Adapter2(Context context, int resource, ArrayList<HolidayDetails> objects){
        super(context, resource, objects);
        holidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);


        name = rowView.findViewById(R.id.name);
        date = rowView.findViewById(R.id.date);
        image = rowView.findViewById(R.id.imageView);

        HolidayDetails currentHoliday = holidays.get(position);

        name.setText(currentHoliday.getName());
        date.setText(currentHoliday.getDate());

        if(currentHoliday.getImage() == "christmas") {
            image.setImageResource(R.drawable.christmas);
        }

        else if (currentHoliday.getImage() == "cny") {
            image.setImageResource(R.drawable.cny);
        }

        else if (currentHoliday.getImage() == "deepavali") {
            image.setImageResource(R.drawable.deepavali);
        }

        else if (currentHoliday.getImage() == "good-friday") {
            image.setImageResource(R.drawable.good_friday);
        }

        else if (currentHoliday.getImage() == "hari-raya-haji") {
            image.setImageResource(R.drawable.hari_raya_haji);
        }

        else if (currentHoliday.getImage() == "hari-raya-puasa") {
            image.setImageResource(R.drawable.hari_raya_puasa);
        }

        else if (currentHoliday.getImage() == "labour-day") {
            image.setImageResource(R.drawable.labour_day);
        }

        else if (currentHoliday.getImage() == "national-day") {
            image.setImageResource(R.drawable.national_day);
        }

        else if (currentHoliday.getImage() == "new-year") {
            image.setImageResource(R.drawable.new_year);
        }

        else {
            image.setImageResource(R.drawable.vesak_day);
        }

        return rowView;
    }
}
