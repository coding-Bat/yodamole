package yodamole.gcs_trainer_yodamole;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button toTraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toTraining = findViewById(R.id.btn_training);

        toTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(TrainingActivity.class);
            }
        });

    }


    private void openActivity(Class activity) {
        Intent act = new Intent(this, activity);

        startActivity(act);
    }
}