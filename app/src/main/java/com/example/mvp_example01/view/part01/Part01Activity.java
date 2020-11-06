package com.example.mvp_example01.view.part01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp_example01.R;

import javax.inject.Inject;

public class Part01Activity extends AppCompatActivity implements LoginMVP.View {

    /**
     * WARNING: to run this Activity you have to add android:name=".view.part01.App" in manifest
     */

    @Inject
    LoginMVP.Presenter presenter;


    private EditText firstName;
    private EditText lastName;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part01);

        ((App) getApplication()).getComponent().inject(this);

        login = findViewById(R.id.login);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });


    }

    @Override
    protected void onResume() {/**We create a lifeCycle callback on Resume where we can set the presenter to this view.*/
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return firstName.getText().toString().trim();
    }

    @Override
    public String getLastName() {
        return lastName.getText().toString().trim();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "Error User is not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "First name or Last name cannot be empty!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User saved!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String fname) {
        firstName.setText(fname);
    }

    @Override
    public void setLastName(String lname) {
        lastName.setText(lname);
    }
}