package pelis.cucea.udg.mx.pelis.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import pelis.cucea.udg.mx.pelis.ContainerEjemplos;
import pelis.cucea.udg.mx.pelis.MainActivity;
import pelis.cucea.udg.mx.pelis.R;

/**
 * Created by Titanium on 12/03/16.
 */
public class List extends Fragment{
   // private String[] opciones = new String[]{"opcion1", "opcion2", "opcion3", "opcion4", "opcion5","opcion1", "opcion2", "opcion3", "opcion4", "opcion5","opcion1", "opcion2", "opcion3", "opcion4", "opcion5","opcion1", "opcion2", "opcion3", "opcion4", "opcion5","opcion1", "opcion2", "opcion3", "opcion4", "opcion5"};
  //Inflar el striong con diccionario parte 1 con idiomas
   private String[] opciones;
    private ListView lista;
    private ArrayAdapter<String> adapter;
    @Nullable
    @Override
    //Inflater permite tomar todo el xml d layout y hacerlo objeto para manejarlo
    //viewgroup dice quien contiene esta vista
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      //  return super.onCreateView(inflater, container, savedInstanceState);





        View v = inflater.inflate(R.layout.fragment_list, container, false);

        //Inflar el striong del diccionario parte 2 con idiomas
        opciones = getResources().getStringArray(R.array.opciones);


        lista= (ListView)v.findViewById(R.id.listEjemplos);
        adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,opciones);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    //Primer ITEM
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getActivity(), ContainerEjemplos.class);
                    intent.putExtra("numeroEjemplo", position);
                    startActivity(intent);
                }
            }
        });


        return v;



    }
}
