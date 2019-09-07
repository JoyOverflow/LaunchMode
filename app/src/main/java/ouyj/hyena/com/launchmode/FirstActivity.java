package ouyj.hyena.com.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "First onNewIntent！");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "First onStart！");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "First onResume！");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "First onRestart！");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Log.d(TAG, "First onCreate！");


        Button btnFirst=findViewById(R.id.btn_first);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        FirstActivity.this,
                        FirstActivity.class
                );
                //intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        Button btnSecond=findViewById(R.id.btn_second);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        FirstActivity.this,
                        SecondActivity.class
                );
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });







    }
}
