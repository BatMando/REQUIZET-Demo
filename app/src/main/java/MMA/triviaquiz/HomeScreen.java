package MMA.triviaquiz;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    protected TextView desc;
    protected TextView desc2;
    protected TextView coloredDesc;
    ImageButton playGame2, playGame3;
    Button quit;
    ImageButton playGame;
    TextView tQ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_home_screen);

        initView();


        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainGameActivity.class);
                intent.putExtra("key", "nrg");
                startActivity(intent);
                finish();
            }
        });

        playGame2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainGameActivity.class);
                intent.putExtra("key", "health");
                startActivity(intent);
                finish();
            }
        });

        playGame3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MainGameActivity.class);
                intent.putExtra("key", "edu");
                startActivity(intent);
                finish();
            }
        });


        //Quit button - This will quit the game
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        initView();
    }

    private void initView() {

        playGame = (ImageButton) findViewById(R.id.playGame);
        playGame2 = (ImageButton) findViewById(R.id.playGame2);
        playGame3 = (ImageButton) findViewById(R.id.playGame3);
        quit = (Button) findViewById(R.id.quit);
        tQ = (TextView) findViewById(R.id.tQ);
        desc = (TextView) findViewById(R.id.desc);
        desc2 = (TextView) findViewById(R.id.desc2);
        coloredDesc = (TextView) findViewById(R.id.coloredDesc);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/lemon_milk.otf");
        Typeface typeface2 = Typeface.createFromAsset(getAssets(), "fonts/raleway_light.ttf");
        tQ.setTypeface(typeface);
        desc.setTypeface(typeface2);
        desc2.setTypeface(typeface2);
        coloredDesc.setTypeface(typeface2);


    }


}
