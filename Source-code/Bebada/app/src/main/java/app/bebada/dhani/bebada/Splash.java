package app.bebada.dhani.bebada;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;


public class Splash extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /*menjalankan splash screen dan menu menggunakan delayed thread*/
        new android.os.Handler().postDelayed(new Thread() {
            @Override
            public void run() {
                Intent mainMenu = new Intent(Splash.this,Home.class);
                Splash.this.startActivity(mainMenu);
                finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        }, 3000);
    }
}
