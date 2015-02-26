package app.bebada.dhani.bebada;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class membaca_sunda_3 extends ActionBarActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca_sunda_3);
    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        } catch (Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch(Exception e){
            Log.e("error", "blablabla");
        }

        if (arg == 1){
            mediaPlayer = MediaPlayer.create(this, R.raw.sangu);
        }

        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    public void onClickbunyi(View v)
    {
        switch (v.getId())
        {
            case R.id.bunyisunda3:
                playSound(1);
                break;
        }
    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.prevsunda2:
                startActivity(new Intent(this,membaca_sunda_2.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                finish();
                break;

            case R.id.nextsunda4:
                startActivity(new Intent(this,membaca_sunda_4.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                finish();
                break;
        }

    }
}