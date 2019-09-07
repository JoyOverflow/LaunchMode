package ouyj.hyena.com.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.d(TAG, "Third onCreate！");

        Button btnFirst=findViewById(R.id.btn_first);
        btnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        ThirdActivity.this,
                        FirstActivity.class
                );
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "Third onNewIntent！");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Third onStart！");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Third onResume！");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Third onRestart！");
    }
}
