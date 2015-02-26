package app.bebada.dhani.bebada;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Home extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickMenu(View v)
    {
        switch (v.getId())
        {
            case R.id.menu1:
                startActivity(new Intent(this,Membaca.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            break;

            case R.id.menu2:
                startActivity(new Intent(this,kuis.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            break;

            case R.id.menu3:
                startActivity(new Intent(this,About.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            break;
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder keluar=new AlertDialog.Builder(this);
        keluar.setMessage("Anda Yakin Ingin Keluar?");
        keluar.setCancelable(false);
        keluar.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Home.this.finish();
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
            }
        });
        keluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).show();
    }
}
