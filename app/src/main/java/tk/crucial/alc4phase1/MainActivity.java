package tk.crucial.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAboutAlc = findViewById(R.id.button_about_alc);
        Button buttonMyProfile = findViewById(R.id.button_my_profile);

        buttonAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutAlcActivity.class);
                startActivity(intent);
            }
        });

        buttonMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
