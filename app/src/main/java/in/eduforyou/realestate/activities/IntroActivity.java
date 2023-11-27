package in.eduforyou.realestate.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import in.eduforyou.realestate.R;

public class IntroActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        intiViews();
    }

    private void intiViews() {

        btnStart = findViewById(R.id.startBtn);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(IntroActivity.this,MainActivity.class));
            }
        });
    }
}