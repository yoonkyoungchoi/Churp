package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import kr.hs.emirim.julianneyi.shining.Food_list.AloneActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.AlssaActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.AnjuActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.BackfutureActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.BeefActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.BornKoreanActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.CheeseActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.ChildActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.CleanActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.FamilyActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.GirlActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.HotwaterActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.NospicyActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.OneatonedrinkActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.SnackActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.TosweatActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.TteokbokkiActivity;
import kr.hs.emirim.julianneyi.shining.Food_list.WorkmanActivity;

public class ChoseCateActivity extends AppCompatActivity implements View.OnClickListener {

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

        workman = findViewById(R.id.workman);
        family = findViewById(R.id.family);
        beef = findViewById(R.id.beef);
        tosweat = findViewById(R.id.tosweat);
        sweet = findViewById(R.id.sweet);
        child = findViewById(R.id.child);
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

        workman.setOnClickListener(this);
        family.setOnClickListener(this);
        beef.setOnClickListener(this);
        tosweat.setOnClickListener(this);
        sweet.setOnClickListener(this);
        child.setOnClickListener(this);
        alone.setOnClickListener(this);
        cheese.setOnClickListener(this);
        clean.setOnClickListener(this);
        tteokbokki.setOnClickListener(this);
        alssa.setOnClickListener(this);
        snack.setOnClickListener(this);
        hotwater.setOnClickListener(this);
        anju.setOnClickListener(this);
        bornkorean.setOnClickListener(this);
        nospicy.setOnClickListener(this);
        backfuture.setOnClickListener(this);
        oneeatonedrink.setOnClickListener(this);
        girl.setOnClickListener(this);
    }

    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {
            case R.id.workman :
                intent = new Intent(this, WorkmanActivity.class);
                startActivity(intent);
                break;

            case R.id.family :
                intent = new Intent(this, FamilyActivity.class);
                startActivity(intent);
                break;

            case R.id.beef :
                intent = new Intent(this, BeefActivity.class);
                startActivity(intent);
                break;

            case R.id.tosweat :
                intent = new Intent(this, TosweatActivity.class);
                startActivity(intent);
                break;

            case R.id.child :
                intent = new Intent(this, ChildActivity.class);
                startActivity(intent);
                break;

            case R.id.alone :
                intent = new Intent(this, AloneActivity.class);
                startActivity(intent);
                break;

            case R.id.cheese :
                intent = new Intent(this, CheeseActivity.class);
                startActivity(intent);
                break;

            case R.id.clean :
                intent = new Intent(this, CleanActivity.class);
                startActivity(intent);
                break;

            case R.id.tteokbokki :
                intent = new Intent(this, TteokbokkiActivity.class);
                startActivity(intent);
                break;

            case R.id.alssa :
                intent = new Intent(this, AlssaActivity.class);
                startActivity(intent);
                break;

            case R.id.snack :
                intent = new Intent(this, SnackActivity.class);
                startActivity(intent);
                break;

            case R.id.hotwater :
                intent = new Intent(this, HotwaterActivity.class);
                startActivity(intent);
                break;

            case R.id.anju :
                intent = new Intent(this, AnjuActivity.class);
                startActivity(intent);
                break;

            case R.id.bornkorean :
                intent = new Intent(this, BornKoreanActivity.class);
                startActivity(intent);
                break;

            case R.id.nospicy :
                intent = new Intent(this, NospicyActivity.class);
                startActivity(intent);
                break;

            case R.id.backfuture :
                intent = new Intent(this, BackfutureActivity.class);
                startActivity(intent);
                break;

            case R.id.oneatonedrink :
                intent = new Intent(this, OneatonedrinkActivity.class);
                startActivity(intent);
                break;

            case R.id.girl :
                intent = new Intent(this, GirlActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}