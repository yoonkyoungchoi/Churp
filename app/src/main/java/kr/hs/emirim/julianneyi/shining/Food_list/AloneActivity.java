package kr.hs.emirim.julianneyi.shining.Food_list;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.widget.ImageView;

import kr.hs.emirim.julianneyi.shining.R;

public class AloneActivity extends AppCompatActivity {

    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alone);

        logo = findViewById(R.id.kingkong_logo);
        logo.setBackground(new ShapeDrawable(new OvalShape()));
        logo.setClipToOutline(true);

    }
}