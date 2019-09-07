package ouyj.hyena.com.launchmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FourthActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Log.d(TAG, "Fourth onCreate！");
    }
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "Fourth onNewIntent！");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Fourth onStart！");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Fourth onResume！");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Fourth onRestart！");
    }
}
