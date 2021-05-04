package MMA.triviaquiz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import mehdi.sakout.fancybuttons.FancyButton;


public class PlayAgain extends Activity {

    FancyButton playAgain;
    TextView wrongAnsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_again);
        playAgain = (FancyButton) findViewById(R.id.playAgainButton);
        wrongAnsText = (TextView)findViewById(R.id.wrongAns);
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayAgain.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/lemon_milk.otf");
        wrongAnsText.setTypeface(typeface);
    }
    @Override
    public void onBackPressed() {
        finish();
    }
}
