package cf.app.camiloceron.com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// declaro una variable de texto
    TextView campo;
    EditText Usr;
    EditText Pass;
// declaro una variable de iamgen
    ImageView Img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // a la variable llamada campo le voy a colocar lo que este en txtView
        // campo = (TextView)findViewById(R.id.txtView);
        //Le voy a enviar a campo lo que esta esfrito en el parentesis Hola Camilo Ceron
        // campo.setText("Hola Camilo Ceron");
        Usr = (EditText)findViewById(R.id.edtUsuario);
        Usr.setText("Colocar Usuario");
        Pass = (EditText)findViewById(R.id.edtContraseña);
        Pass.setText("Colocar Contraseña");
        // Asigno la variable a la respectiva representacion grafica
        Img = (ImageView)findViewById(R.id.ImgUno);


    }
}
