package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button before_meal;
    private Button after_meal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

       before_meal=findViewById(R.id.before_meal);
       after_meal=findViewById(R.id.after_meal);
       before_meal.setOnClickListener(this);
        after_meal.setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.after_meal:
                startActivity(new Intent(this, ChoseDRActivity.class));
                break;
            case R.id.before_meal:
                startActivity(new Intent(this, ChoseCateActivity.class));
        }
    }
}