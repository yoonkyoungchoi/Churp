package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoseDRActivity extends AppCompatActivity implements View.OnClickListener {

    private Button dutch_pay;
    private Button random_money;
    private Button btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_d_r);

        dutch_pay=findViewById(R.id.dutch_pay);
        random_money=findViewById(R.id.random_money_page);
        btn_back = findViewById(R.id.btn_back);

        dutch_pay.setOnClickListener(this);
        random_money.setOnClickListener(this);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dutch_pay:
                startActivity(new Intent(this, DutchActivity.class));
                break;
            case R.id.random_money_page:
                startActivity(new Intent(this, RandomMoneyActivity.class));
                break;
        }
    }
}