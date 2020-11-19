package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoseCateActivity extends AppCompatActivity {

    private Button workman;
    private Button family;
    private Button beef;
    private Button tosweat;
    private Button sweet;
    private Button child;
    private Button alone;
    private Button cheese;
    private Button clean;
    private Button tteokbokki;
    private Button alssa;
    private Button snack;
    private Button hotwater;
    private Button anju;
    private Button bornkorean;
    private Button nospicy;
    private Button backfuture;
    private Button oneeatonedrink;
    private Button girl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_cate);
    }

    private void findId() {
        workman = findViewById(R.id.workman);
        family = findViewById(R.id.family);
        beef = findViewById(R.id.beef);
        tosweat = findViewById(R.id.tosweat);
        sweet = findViewById(R.id.sweet);
        child = findViewById(R.id.chain);
        alone = findViewById(R.id.alone);
        cheese = findViewById(R.id.cheese);
        clean = findViewById(R.id.clean);
        tteokbokki = findViewById(R.id.tteokbokki);
        alssa = findViewById(R.id.alssa);
        snack = findViewById(R.id.snack);
        hotwater = findViewById(R.id.hotwater);
        anju = findViewById(R.id.anju);
        bornkorean = findViewById(R.id.bornkorean);
        nospicy = findViewById(R.id.nospicy);
        backfuture = findViewById(R.id.backfuture);
        oneeatonedrink = findViewById(R.id.oneatonedrink);
        girl = findViewById(R.id.girl);
    }

    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {
            case R.id.workman :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.family :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.beef :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.tosweat :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.child :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.alone :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);
            case R.id.cheese :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.clean :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.tteokbokki :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.alssa :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.snack :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.hotwater :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.anju :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.bornkorean :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.nospicy :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.backfuture :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.oneatonedrink :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.girl :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);
        }
    }
}