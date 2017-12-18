package imastudio.id.co.intentapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnHal1, btnHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHal1 = (Button)findViewById(R.id.btnHal1);
        btnHal2 = (Button)findViewById(R.id.btnHal2);

        //mengaktifkan tombol agar bisa d klik
        btnHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pindah ke acticity halaman1activity.java
                Intent a1 = new Intent(getApplicationContext(), Halaman1Activity.class);
                startActivity(a1);
            }
        });

        btnHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pindah ke acticity halaman1activity.java
                Intent a1 = new Intent(getApplicationContext(), Halaman2Activity.class);
                startActivity(a1);
            }
        });


    }
}
