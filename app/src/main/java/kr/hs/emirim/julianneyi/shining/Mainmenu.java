package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        Button koreafood = (Button)findViewById(R.id.한식);
        koreafood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 분식 = (Button)findViewById(R.id.분식);
        분식.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 매운 = (Button)findViewById(R.id.매운);
        매운.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 안주 = (Button)findViewById(R.id.안주);
        안주.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 간식 = (Button)findViewById(R.id.간식);
        간식.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 반주 = (Button)findViewById(R.id.반주);
        반주.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });

        Button 해장 = (Button)findViewById(R.id.해장);
        해장.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Choice_people.class);
                startActivity(intent);
            }
        });
    }
}