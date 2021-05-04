package MMA.triviaquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import info.hoang8f.widget.FButton;
import mehdi.sakout.fancybuttons.FancyButton;

public class Time_Up extends AppCompatActivity {
    FancyButton playAgainButton;
    TextView timeUpText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time__up);

        playAgainButton = (FancyButton )findViewById(R.id.playAgainButton);
        timeUpText = (TextView)findViewById(R.id.timeUpText);

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Time_Up.this,HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/lemon_milk.otf");
        timeUpText.setTypeface(typeface);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
