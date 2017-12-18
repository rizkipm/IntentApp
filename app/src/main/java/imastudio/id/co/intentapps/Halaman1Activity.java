package imastudio.id.co.intentapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Halaman1Activity extends AppCompatActivity {

    Button btnLoginSubmit;
    TextView txtUsername, txtPassword;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);


        btnLoginSubmit = (Button)findViewById(R.id.btnLoginSubmit);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etUsername = (EditText) findViewById(R.id.etUsername);
        txtPassword = (TextView) findViewById(R.id.txtPassword);
        txtUsername = (TextView) findViewById(R.id.txtUsername);


        btnLoginSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //mengecek apakah username aatau password kosong

                //ngambil nila dari edittext
                String nUsername = etUsername.getText().toString();
                String nPass = etPassword.getText().toString();

                //kondisi nilai kosong
                if (nUsername.isEmpty()){
                    etUsername.setError("Username is required");
                }else if (nPass.isEmpty()){
                    etPassword.setError("Password is required");
                }else{
                    //apbila nilai tidak kosong
                    txtUsername.setText("Username Anda :" + nUsername);
                    txtPassword.setText("Password Anda : " + nPass);
                }
            }
        });
    }
}
