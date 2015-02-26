package app.bebada.dhani.bebada;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Hasil_kuis_jawa extends ActionBarActivity {

    TextView hasil;
    int nilaipost;
    Button ulang, beranda;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_kuis_jawa);

        Intent intent = getIntent();
        nilaipost = intent.getIntExtra("nilaidata", 0);
        hasil =(TextView)findViewById(R.id.hasiljawa);

        hasil.setText(String.valueOf(nilaipost));

        ulang = (Button)findViewById(R.id.btnmengulang);
        beranda = (Button)findViewById(R.id.btnkeluar);
        ulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hasil_kuis_jawa.this.finish();
                Intent show = new Intent(getApplicationContext(), kuis_jawa_1.class);
                startActivity(show);
            }
        });

        beranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent show = new Intent(getApplicationContext(), Home.class);
                startActivity(show);

                Hasil_kuis_jawa.this.finish();
            }
        });

        mediaPlayer = MediaPlayer.create(this, R.raw.applause);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

}
