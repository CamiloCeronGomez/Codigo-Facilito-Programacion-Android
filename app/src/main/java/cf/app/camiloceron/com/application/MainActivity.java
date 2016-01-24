package cf.app.camiloceron.com.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
// declaro una variable de texto
    TextView campoN;
    TextView campoC;
    EditText Usr;
    EditText Pass;
    Button cambioUno;
    Button cambioDos;
// declaro una variable de iamgen
    ImageView Img;
    ImageView Img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // a la variable llamada campo le voy a colocar lo que este en txtView
         campoN = (TextView)findViewById(R.id.txtUsuario);
        campoC = (TextView)findViewById(R.id.txtContraseña);
        //Le voy a enviar a campo lo que esta esfrito en el parentesis Hola Camilo Ceron
        // campo.setText("Hola Camilo Ceron");
        Usr = (EditText)findViewById(R.id.edtUsuario);
        // Usr.setText("Colocar Usuario");
        Pass = (EditText)findViewById(R.id.edtContraseña);
       // Pass.setText("Colocar Contraseña");
        // Asigno la variable a la respectiva representacion grafica
        Img = (ImageView)findViewById(R.id.ImgUno);
        Img2 = (ImageView)findViewById(R.id.ImgUno);
        cambioUno = (Button)findViewById(R.id.btnUno);
        cambioDos = (Button)findViewById(R.id.btnDos);
// habilito los botones para que funcionen en el contexto this
        cambioUno.setOnClickListener(this);
        cambioDos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnUno:
                Toast.makeText(getApplicationContext(),"Mostrando Nombre y Contraseña",Toast.LENGTH_SHORT).show();
                String dato1 = Usr.getText().toString();
                campoN.setText(dato1);
                String dato2 = Pass.getText().toString();
                campoC.setText(dato2);
                break;
            case  R.id.btnDos:
              Img2.setImageResource(R.drawable.sinfoto);


        }
    }
}
