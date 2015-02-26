package app.bebada.dhani.bebada;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class kuis extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.kuis1:
                startActivity(new Intent(this,kuis_jawa.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;

            case R.id.kuis2:
                startActivity(new Intent(this,kuis_sunda.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;

            case R.id.kuis3:
                startActivity(new Intent(this,kuis_bali.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;
        }
    }
}
