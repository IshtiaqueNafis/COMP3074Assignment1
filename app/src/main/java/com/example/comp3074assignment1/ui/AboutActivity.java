package com.example.comp3074assignment1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.comp3074assignment1.R;
import com.example.comp3074assignment1.models.About;

public class AboutActivity extends AppCompatActivity {

    private About about;
    private ImageView profileView;
    private TextView studentName;
    private TextView studentId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("About");

        about = new About(R.drawable.profile, R.string.user_name, R.string.student_number);
        initializePage();
        LoadPage(about);

    }

    private void initializePage() {
        profileView = findViewById(R.id.profileImage);
        studentName = findViewById(R.id.profile_name);
        studentId = findViewById(R.id.student_id);
    }


    private void LoadPage(About about) {
        Drawable imageView = ContextCompat.getDrawable(this, about.getImageId());
        profileView.setImageDrawable(imageView);
        studentName.setText(about.getStudentNameId());

        studentId.setText(about.getStudentId());


    }

}
