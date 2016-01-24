package cf.app.camiloceron.com.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
        TextView imprimirTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imprimirTexto = (TextView)findViewById(R.id.txtImprimir);

        // resibo un intent
        Intent intent = getIntent();
        // el Intent trae los Extras y los guarda en el bundle llamdo extras
        Bundle extras = intent.getExtras();
        // Creo la condicion si extra puede venir vacio
        if(extras != null){
            //Creo una variable dato5 de tipo String a la cual le asigno el valor de DATO3 de activityMain
            String dato5 = extras.getString("DATO3");
            // Le asigno a imprimirTexto la cadena que se encuentre en dato5
            imprimirTexto.setText(dato5);


        }

    }
}
