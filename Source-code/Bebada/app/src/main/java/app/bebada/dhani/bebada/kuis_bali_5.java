package app.bebada.dhani.bebada;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class kuis_bali_5 extends ActionBarActivity implements View.OnClickListener{

    int nilaipost, nilai, hasil;
    Button jawab1;
    private MediaPlayer mediaPlayer;
    EditText ejawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_bali_5);

        Intent intent = getIntent();
        nilaipost = intent.getIntExtra("nilaidata", 0);
        ejawab = (EditText)findViewById(R.id.ejawab);
        jawab1 = (Button)findViewById(R.id.btnjawabbali5);
        jawab1.setOnClickListener(this);
    }

    public void OnPause(){
        try{
            super.onPause();
            mediaPlayer.pause();
        }catch (Exception e){

        }
    }

    private void playSound(int arg){
        try{
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        }catch(Exception e){
            Log.e("error", "blablabla");
        }
        if (arg == 0){

            mediaPlayer = MediaPlayer.create(this, R.raw.menang);
        }

        else if(arg == 1){
            mediaPlayer = MediaPlayer.create(this, R.raw.salah);
        }
        mediaPlayer.setLooping(false); // Set looping
        mediaPlayer.start();
    }

    @Override
    public void onClick(View view) {
        // TODO Auto-generated method stub
        switch (view.getId()) {
            case R.id.btnjawabbali5:

                String data = ejawab.getText().toString();
                if (data.equals("")) {
                    Toast.makeText(getApplicationContext(), "Isi jawaban", Toast.LENGTH_SHORT).show();
                }

                else {
                    if(data.equals("MOTOR"))
                    {
                        nilai = 20;
                        hasil = nilaipost + nilai;
                        Toast.makeText(getApplicationContext(), "Benar", Toast.LENGTH_SHORT).show();
                        playSound(0);
                        Intent intent = new Intent(getApplicationContext(), Hasil_kuis_bali.class);
                        intent.putExtra("nilaidata", hasil);
                        startActivity(intent);
                        finish();
                        overridePendingTransition  (R.layout.fadein,R.layout.fadeout);
                    }
                    else
                    {
                        nilai = 0;
                        Toast.makeText(getApplicationContext(), "Salah", Toast.LENGTH_SHORT).show();
                        playSound(1);
                        Intent intent = new Intent(getApplicationContext(), Hasil_kuis_bali.class);
                        intent.putExtra("nilaidata", nilaipost);
                        startActivity(intent);
                        finish();
                        overridePendingTransition  (R.layout.fadein,R.layout.fadeout);
                    }
                }
                break;


            default:
                break;
        }
    }
}
