package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button choice_people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();
        choice_people.setOnClickListener(this);



    }

    private void findId() {
        choice_people = findViewById(R.id.choicebtn);
    }

    @Override
    public void onClick(View v) {

        Intent intent = null;
        switch (v.getId()) {
            case R.id.choicebtn :
                intent = new Intent(this, ChoicePeopleActivity.class);
                startActivity(intent);
        }
    }
}