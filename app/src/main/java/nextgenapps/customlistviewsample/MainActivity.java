package nextgenapps.customlistviewsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private List<Apps> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customList);
        //I am populating with dummy data
        data.add(new Apps("Facebook", "social networking app", R.mipmap.ic_launcher));
        data.add(new Apps("WhatsApp", "Messaging App", R.mipmap.ic_launcher));
        data.add(new Apps("Facebook", "social networking app", R.mipmap.ic_launcher));
        data.add(new Apps("WhatsApp", "Messaging App", R.mipmap.ic_launcher));

        data.add(new Apps("Facebook", "social networking app", R.mipmap.ic_launcher));
        data.add(new Apps("WhatsApp", "Messaging App", R.mipmap.ic_launcher));

        data.add(new Apps("Facebook", "social networking app", R.mipmap.ic_launcher));
        data.add(new Apps("WhatsApp", "Messaging App", R.mipmap.ic_launcher));

        data.add(new Apps("Facebook", "social networking app", R.mipmap.ic_launcher));
        data.add(new Apps("WhatsApp", "Messaging App", R.mipmap.ic_launcher));


        listView.setAdapter(new CustomAdapter(this, R.layout.single_row, data));


    }
}
