package app.bebada.dhani.bebada;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class membaca_jawa_5 extends ActionBarActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membaca_jawa_5);
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
            mediaPlayer = MediaPlayer.create(this, R.raw.mobil);
        }

        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    public void onClickbunyi(View v)
    {
        switch (v.getId())
        {
            case R.id.bunyijawa5:
                playSound(1);
                break;
        }
    }

    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.prevjawa4:
                startActivity(new Intent(this,membaca_jawa_4.class));
                overridePendingTransition(R.layout.fadein,R.layout.fadeout);
                finish();
                break;
        }

    }
}
