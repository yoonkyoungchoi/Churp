package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DutchActivity extends AppCompatActivity {

    private EditText et_people_num;
    private EditText et_total_money;
    private Button goDutch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch);

        et_people_num=(EditText)findViewById(R.id.et_people_num);
        et_total_money=(EditText)findViewById(R.id.et_total_money);
        goDutch=findViewById(R.id.goDutch);

        goDutch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }
}