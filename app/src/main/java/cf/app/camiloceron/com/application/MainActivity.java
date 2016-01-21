package cf.app.camiloceron.com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// declaro una variable de texto
    TextView campo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // a la variable llamada campo le voy a colocar lo que este en txtView
        campo = (TextView)findViewById(R.id.txtView);
        //Le voy a enviar a campo lo que esta esfrito en el parentesis Hola Camilo Ceron
        campo.setText("Hola Camilo Ceron");

    }
}
