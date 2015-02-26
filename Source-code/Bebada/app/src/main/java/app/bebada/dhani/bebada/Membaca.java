package app.bebada.dhani.bebada;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Membaca extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca);
    }

    public void onClickMembaca(View v){
        switch (v.getId())
        {
            case R.id.membaca1:
                startActivity(new Intent(this,membaca_jawa_1.class));
                    overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;

            case R.id.membaca2:
                startActivity(new Intent(this,membaca_sunda_1.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;

            case R.id.membaca3:
                startActivity(new Intent(this,membaca_bali_1.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;
        }

    }
}
