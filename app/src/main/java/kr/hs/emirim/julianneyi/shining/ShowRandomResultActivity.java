package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ShowRandomResultActivity extends AppCompatActivity {

    private ArrayList<String> strList;
    private TextView result_person_name;
    private ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_random_result);

        strList = new ArrayList<>();
        result_person_name = findViewById(R.id.result_person_name);
        back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        strList = getIntent().getStringArrayListExtra("strList");
        int num = getIntent().getIntExtra("num",0);

        Random random = new Random();
        int result_index = random.nextInt(num);
        String result = strList.get(result_index);

        result_person_name.setText(result);
    }
}