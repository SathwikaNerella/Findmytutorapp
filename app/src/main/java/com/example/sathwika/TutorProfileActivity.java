package com.example.sathwika;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TutorProfileActivity extends AppCompatActivity {

    private EditText etTutorName, etTutorSubject, etTutorExperience, etTutorLocation, etTutorFee;
    @SuppressWarnings("FieldCanBeLocal")
    private Button btnUploadImage, btnSaveProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);

        // Initialize UI elements
        etTutorName = findViewById(R.id.etTutorName);
        etTutorSubject = findViewById(R.id.etTutorSubject);
        etTutorExperience = findViewById(R.id.etTutorExperience);
        etTutorLocation = findViewById(R.id.etTutorLocation);
        etTutorFee = findViewById(R.id.etTutorFee);
        btnUploadImage = findViewById(R.id.btnUploadImage);
        btnSaveProfile = findViewById(R.id.btnSaveProfile);

        // Upload image button using lambda
        btnUploadImage.setOnClickListener(v ->
                Toast.makeText(TutorProfileActivity.this, "Upload Image Clicked", Toast.LENGTH_SHORT).show()
        );

        // Save profile button using lambda
        btnSaveProfile.setOnClickListener(v -> {
            String name = etTutorName.getText().toString().trim();
            String subject = etTutorSubject.getText().toString().trim();
            String experience = etTutorExperience.getText().toString().trim();
            String location = etTutorLocation.getText().toString().trim();
            String fee = etTutorFee.getText().toString().trim();

            if (name.isEmpty() || subject.isEmpty() || experience.isEmpty() || location.isEmpty() || fee.isEmpty()) {
                Toast.makeText(TutorProfileActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(TutorProfileActivity.this, "Profile Saved Successfully!", Toast.LENGTH_SHORT).show();
                // You can store this data in Firebase or SQLite
            }
        });
    }
}
