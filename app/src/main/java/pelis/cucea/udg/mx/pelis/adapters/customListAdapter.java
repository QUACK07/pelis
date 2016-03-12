package pelis.cucea.udg.mx.pelis.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import pelis.cucea.udg.mx.pelis.fragments.models.Car;
import pelis.cucea.udg.mx.pelis.R;


/**
 * Created by Titanium on 12/03/16.
 */

public class customListAdapter  extends ArrayAdapter<Car>{

    private Car[] carros;
    private Context context;

    public customListAdapter(Context context, Car[] objects) {
        super(context, R.layout.item_custom_list, objects);
        carros = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return carros.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.item_custom_list, null);


        ImageView imagenCarro = (ImageView)convertView.findViewById(R.id.image);
        imagenCarro.setImageResource(carros[position].getImagen());

        TextView nombreCarro = (TextView)convertView.findViewById(R.id.textUsername);
        nombreCarro.setText(carros[position].getNombre());

        TextView descriptionCarro =(TextView)convertView.findViewById(R.id.textDescription);
        descriptionCarro.setText(carros[position].getDescripcion());

        TextView rating = (TextView)convertView.findViewById(R.id.textRating);
        rating.setText(String.valueOf(carros[position].getRating()));

        return convertView;
    }
}
