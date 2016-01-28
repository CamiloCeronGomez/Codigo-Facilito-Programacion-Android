package cf.app.camiloceron.com.application;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements SensorEventListener{
        TextView imprimirTexto;
    //Declaro una variable de tipo LinearLayout
    LinearLayout Second;
    // Declaro una varialbe sn de tipo SensorManager que se utiliza para administar los sensores
    SensorManager sm;
    Sensor sensor;
    TextView value;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imprimirTexto = (TextView)findViewById(R.id.txtImprimir);
        Second = (LinearLayout)findViewById(R.id.ActivitySecond);
        value = (TextView)findViewById(R.id.txtValor);

        sm =(SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        sm.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);


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

    @Override
    public void onSensorChanged(SensorEvent event) {
        //event es un arreglo de datos y tiene un valor en la posivion 0
        // meto el valor de value 0 en un cadena (String )para poder meterlo en txtvalor
        String txtvalor = String.valueOf(event.values[0]);
        value.setText(txtvalor);
        float valor = Float.parseFloat(txtvalor);
        //Cuando el valor sea 0 el fondo de pantalla del celular va a cambir a color verde de lo contrario sera azul
        if(valor == 0){
            Second.setBackgroundColor(Color.GREEN);

        }else {
            Second.setBackgroundColor(Color.BLUE);
        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
