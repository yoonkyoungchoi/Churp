package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button spicy;
    private Button snack;
    private Button half_alcohol;
    private Button alcohol;
    private Button bunsik;
    private Button clean_alcohol;
    private Button korea_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        findId();
        spicy.setOnClickListener(this);
        findId();
        snack.setOnClickListener(this);
        findId();
        half_alcohol.setOnClickListener(this);
        findId();
        alcohol.setOnClickListener(this);
        findId();
        bunsik.setOnClickListener(this);
        findId();
        clean_alcohol.setOnClickListener(this);
        findId();
        korea_food.setOnClickListener(this);

    }

    private void findId() {
        spicy = findViewById(R.id.spicy);
        snack = findViewById(R.id.snack);
        half_alcohol = findViewById(R.id.half_alcohol);
        alcohol = findViewById(R.id.alcohol);
        bunsik = findViewById(R.id.bunsik);
        clean_alcohol = findViewById(R.id.clean_alcohlol);
        korea_food = findViewById(R.id.korea_food);

    }

    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {
            case R.id.spicy :
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.snack:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.half_alcohol:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.alcohol:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.bunsik:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.clean_alcohlol:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

            case R.id.korea_food:
                intent = new Intent(this, MainMenuActivity.class);
                startActivity(intent);

        }
    }

//        Button koreafood = (Button)findViewById(R.id.한식);
//        koreafood.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 분식 = (Button)findViewById(R.id.분식);
//        분식.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 매운 = (Button)findViewById(R.id.매운);
//        매운.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 안주 = (Button)findViewById(R.id.안주);
//        안주.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 간식 = (Button)findViewById(R.id.간식);
//        간식.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 반주 = (Button)findViewById(R.id.반주);
//        반주.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        Button 해장 = (Button)findViewById(R.id.해장);
//        해장.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ChoicePeopleActivity.class);
//                startActivity(intent);
//            }
//        });
//    }
}