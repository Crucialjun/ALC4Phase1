package tk.crucial.alc4phase1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Objects;

@SuppressLint("Registered")
public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ImageView profilePhoto = findViewById(R.id.imageview_profile_photo);

        Picasso.get().load("https://i.imgur.com/jYkz8Ms.jpg").placeholder(R.drawable.avatar).into(profilePhoto);
    }

}
