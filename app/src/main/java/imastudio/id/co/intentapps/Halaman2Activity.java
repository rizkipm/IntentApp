package imastudio.id.co.intentapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Halaman2Activity extends AppCompatActivity {

    ListView lsData;

    String[] data = {"Android", "iPhone", "WindowsMobile", "Blackberry","WebOS", "Ubuntu", "Windows 7", "Mac OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        lsData = (ListView)findViewById(R.id.listData);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_list, data);
        lsData.setAdapter(adapter);


    }
}
