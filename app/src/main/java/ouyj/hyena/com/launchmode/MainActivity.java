package ouyj.hyena.com.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnTest=findViewById(R.id.btn_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,
                        FirstActivity.class
                );
                startActivity(intent);
            }
        });

        /*
        ActivityManager am = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> infoList = am.getRunningTasks(10);
        for (ActivityManager.RunningTaskInfo info : infoList) {
            Log.d(TAG, info.id);
            log("id: " + runningTaskInfo.id);
            log("description: " + runningTaskInfo.description);
            log("number of activities: " + runningTaskInfo.numActivities);
            log("topActivity: " + runningTaskInfo.topActivity);
            log("baseActivity: " + runningTaskInfo.baseActivity.toString());
        }
        */
    }
}
