package MMA.triviaquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameWon extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_won);
    }


    public void PlayAgain(View view) {
        Intent intent = new Intent(GameWon.this, HomeScreen.class);
        startActivity(intent);
        finish();
    }
}
