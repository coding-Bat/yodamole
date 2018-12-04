package yodamole.gcs_trainer_yodamole;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class TrainingActivity extends Activity {

    private Button toStatistic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);


        final Spinner dropdown = findViewById(R.id.punkte);
        String[] items = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        generateNewQuestion();

        toStatistic = findViewById(R.id.btn_check);

        toStatistic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Question q = generateNewQuestion();

                final String valueToCheck = (String)dropdown.getSelectedItem();
                final TextView testTextView = (TextView)findViewById(R.id.fallbeschreibung);

                if(valueToCheck.equals(q.returnGcsValue())){
                    testTextView.setText("true");
                }else{
                    testTextView.setText("false");
                }
            }
        });

    }

    public Question generateNewQuestion(){
        final Question q = new Question();
        final TextView fallbeschreibungTextView = (TextView)findViewById(R.id.training_text);
        fallbeschreibungTextView.setText(q.returnQuestion());
        return q;
    }
}
