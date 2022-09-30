package com.example.comp3074assignment1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.comp3074assignment1.R;
import com.example.comp3074assignment1.models.About;
import com.example.comp3074assignment1.models.Choice;

public class AboutActivity extends AppCompatActivity {

    //region *** properties ***
    private ImageView profileView;
    private TextView studentName;
    private TextView studentId;
    private Button githubBtn;
    private Button schoolWebsiteButton;
    private Button schoolMapButton;
    //endregion


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("About");

        About about = new About(
                R.drawable.profile, R.string.user_name, R.string.student_number,
                new Choice(R.string.github_btn_text, R.string.github_site),
                new Choice(R.string.school_site_text, R.string.school_site),
                new Choice(R.string.college_map_site_text, R.string.college_map)

        );
        initializePage();
        LoadPage(about);

    }

    //region ***Methods***
    private void initializePage() {
        profileView = findViewById(R.id.profileImage);
        studentName = findViewById(R.id.profile_name);
        studentId = findViewById(R.id.student_id);
        githubBtn = findViewById(R.id.gitHubButton);
        schoolWebsiteButton = findViewById(R.id.schoolButton);
        schoolMapButton = findViewById(R.id.schoolMapButton);
    }


    private void LoadPage(About about) {
        Drawable imageView = ContextCompat.getDrawable(this, about.getImageId());
        profileView.setImageDrawable(imageView);
        studentName.setText(about.getStudentNameId());
        studentId.setText(about.getStudentId());
        githubBtn.setText(about.getGithubChoice().getTextId());
        buttonOnclick(about.getGithubChoice(),githubBtn);
        schoolWebsiteButton.setText(about.getSchoolWebChoice().getTextId());
        buttonOnclick(about.getSchoolWebChoice(),schoolWebsiteButton);
        schoolMapButton.setText(about.getSchoolMapChoice().getTextId());
        buttonOnclick(about.getSchoolMapChoice(),schoolMapButton);

    }

    private void buttonOnclick(Choice choice,Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = (String) getText(choice.getActionId());
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(text));
                startActivity(browserIntent);
            }
        });
    }
    //endregion


}
