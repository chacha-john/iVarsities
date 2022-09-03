package com.chachaup.ivarsities.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.chachaup.ivarsities.R;
import com.chachaup.ivarsities.models.UniversitiesListResponse;
import com.chachaup.ivarsities.network.HipolabsAPI;
import com.chachaup.ivarsities.network.HipolabsClient;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.buttonSearch)
    Button mSearch;
    @BindView(R.id.editTextCountry)
    EditText mCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this);

        mSearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mSearch){
            Intent intent = new Intent(SearchActivity.this, ResponseActivity.class);
            intent.putExtra("query",mCountry.getText().toString().trim());
            startActivity(intent);
        }
    }
}