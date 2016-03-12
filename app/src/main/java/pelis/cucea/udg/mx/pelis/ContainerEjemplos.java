package pelis.cucea.udg.mx.pelis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Titanium on 12/03/16.
 */
public class ContainerEjemplos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        //si no se envia truena porque esta esperando
        int pos = getIntent().getExtras().getInt("numeroEjemplo");
       //si no lo encuentras no importa porque asignas uno por default
        int pos2 = getIntent().getIntExtra("numeroEjemplo",0);
        Log.d("Container Ejemplos","Position: "+pos);
        Log.d("Container EJemplos con default Extra","Position: "+pos2);

    }
}
