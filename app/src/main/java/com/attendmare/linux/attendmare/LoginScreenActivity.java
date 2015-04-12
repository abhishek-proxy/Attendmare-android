package com.attendmare.linux.attendmare;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;


public class LoginScreenActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new LoginScreenPresenter(loginScreenModel(),loginScreenView());
    }

    private LoginScreenView loginScreenView(){
        return (LoginScreenFragment) getSupportFragmentManager().findFragmentById(R.id.log_in_fragment);
    }


    private LoginScreenModel loginScreenModel() {
        return new LoginScreenModelImpl(service());
    }

    private AttendmareService service() {
        AttendmareService iwagservice = restAdapterBuilder().setEndpoint(Constants.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL).build().create(AttendmareService.class);
        return iwagservice;
    }

    private RestAdapter.Builder restAdapterBuilder() {
        return new RestAdapter.Builder().setConverter(new GsonConverter(new GsonBuilder().create()));
    }


}
