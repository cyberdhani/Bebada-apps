package app.bebada.dhani.bebada;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class kuis_bali extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bali);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.kuisbali1:
                startActivity(new Intent(this,kuis_bali_1.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                break;
        }
    }
}
