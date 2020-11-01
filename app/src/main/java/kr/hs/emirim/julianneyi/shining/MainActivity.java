package kr.hs.emirim.julianneyi.shining;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button choicebtn = (Button)findViewById(R.id.choicebtn);
        choicebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Mainmenu.class);
                startActivity(intent);
                startActivity(new Intent(MainActivity.this, Mainmenu.class));
                overridePendingTransition(R.anim.action_left, R.anim.action_left);
            }
        });
    }
}