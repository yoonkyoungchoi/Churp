package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChoseDRActivity extends AppCompatActivity implements View.OnClickListener {

    private Button dutch_pay;
    private Button random_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_d_r);

        dutch_pay=findViewById(R.id.dutch_pay);
        random_money=findViewById(R.id.random_money);

        dutch_pay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.dutch_pay:
                startActivity(new Intent(this, DutchActivity.class));
                break;
            case R.id.random_money:
                startActivity(new Intent(this, RandomMoneyActivity.class));
                break;
        }
    }
}