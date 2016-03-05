package pelis.cucea.udg.mx.pelis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread mihilo = new Thread(){
            @Override
            public void run() {

                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    Intent pollito = new Intent(MainActivity.this,Login.class);
                    startActivity(pollito);
                    finish();
                }



            }

        };
        mihilo.start();
    }



}
