package com.chachaup.ivarsities.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.chachaup.ivarsities.R;
import com.chachaup.ivarsities.models.UniversitiesListResponse;
import com.chachaup.ivarsities.network.HipolabsAPI;
import com.chachaup.ivarsities.network.HipolabsClient;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResponseActivity extends AppCompatActivity {
    @BindView(R.id.textViewError)
    TextView mError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_response);

        String query = getIntent().getStringExtra("query");

        HipolabsAPI client = HipolabsClient.getClient();
        Call<UniversitiesListResponse> call = client.getSchools(query);
        call.enqueue(new Callback<UniversitiesListResponse>() {
            @Override
            public void onResponse(Call<UniversitiesListResponse> call, Response<UniversitiesListResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<UniversitiesListResponse> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
//                mError.setVisibility(View.VISIBLE);
            }
        });
    }
}
