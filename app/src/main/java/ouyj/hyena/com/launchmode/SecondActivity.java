package ouyj.hyena.com.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnThird=findViewById(R.id.btn_third);
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        SecondActivity.this,
                        ThirdActivity.class
                );
                startActivity(intent);
            }
        });

        Button btnFourth=findViewById(R.id.btn_fourth);
        btnFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        SecondActivity.this,
                        FourthActivity.class
                );
                startActivity(intent);
            }
        });
    }
}
