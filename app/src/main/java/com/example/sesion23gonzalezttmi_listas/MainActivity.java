package com.example.sesion23gonzalezttmi_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View; //libreria que llama a la vista XML
import android.widget.AdapterView; //adaptador que integra los datos
import android.widget.ArrayAdapter; //adaptador que integra los datos
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //inicia clase
    private TextView tv1; //variable objeto para precio
    private ListView lv1; //variable objeto para lista de datos o productos


    //modelo de datos en arreglos unidimencionales tipo string(cadena de caracteres)
    private String productos [] = {"Café","Productos limpieza","alimento mascota","Television","pan"};
    private String precios [] = {"80","50","800","14000","20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) { //inicia metodo on Create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        lv1=findViewById(R.id.lv1);

        tv1.setText(""); //preparacion de etiqueta tv1 para imprimir precio

        //integracion de arreglos el lista mediante un Objeto Adapter Arreglo
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,productos);
        lv1.setAdapter(adapter);
           //EVENTO AL DAR CLICK EN UN ELEMNTO DE LA LISTA IMPRIME SU PRECIO
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //para mandar a imprimir precios
                tv1.setText("Precio :"+precios[position]);
            }
        });



    } //termina metodo onCreate
} //termina clase