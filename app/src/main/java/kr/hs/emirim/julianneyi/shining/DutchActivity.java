package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DutchActivity extends AppCompatActivity {

    private EditText et_people_num;
    private EditText et_total_money;
    private Button goDutch;
    private int people_num;
    private int total_money;
    private TextView tv_money;
    private LinearLayout result;
    private CustomDialog customDialog;
    private int one_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dutch);

        et_people_num=(EditText)findViewById(R.id.et_people_num);
        et_total_money=(EditText)findViewById(R.id.et_total_money);
        goDutch=findViewById(R.id.goDutch);
        result=findViewById(R.id.result);

        result.setVisibility(View.INVISIBLE);

        //final Handler timer = new Handler(); //Handler 생성
        customDialog = new CustomDialog(DutchActivity.this);
        goDutch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                timer.postDelayed(new Runnable(){ //2초후 쓰레드를 생성하는 postDelayed 메소드
//                    public void run(){
//
//                    }
//
//                }, 2000); //

                //customDialog.show();
                ShowResult();
            }
        });

    }

    private void ShowResult() {
        people_num = Integer.parseInt(et_people_num.getText().toString());
        total_money = Integer.parseInt(et_total_money.getText().toString());
        //customDialog.dismiss();

        one_money=total_money/people_num;
        Log.d("one_money====>", String.valueOf(one_money));
        tv_money=findViewById(R.id.tv_money);
        tv_money.setText(one_money+"원");

        result.setVisibility(View.VISIBLE);
    }
}