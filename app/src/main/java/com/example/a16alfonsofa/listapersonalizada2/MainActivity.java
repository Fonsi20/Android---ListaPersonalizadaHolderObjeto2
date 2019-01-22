package com.example.a16alfonsofa.listapersonalizada2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private  Animal[] anima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv_animales);

        String[] arrayAnimales = getResources().getStringArray(R.array.animales);
        String[] arrayDescrip = getResources().getStringArray(R.array.DescripAnimales);
        Integer[] idFotos = new Integer[]{R.drawable.aguila, R.drawable.ballena, R.drawable.caballo, R.drawable.canario, R.drawable.delfin, R.drawable.gato, R.drawable.libro, R.drawable.perro, R.drawable.vaca};
        anima = new Animal[arrayAnimales.length];

        for (int i = 0; i < arrayAnimales.length; i++) {
            Animal ani = new Animal(arrayAnimales[i], arrayDescrip[i], idFotos[i]);
            anima[i] = ani;
        }

        AdaptadorPersonalizado adaptador = new AdaptadorPersonalizado(this, anima);
        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Elección: " + anima[position].getNombre(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
