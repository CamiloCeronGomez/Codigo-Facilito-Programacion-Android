package cf.app.camiloceron.com.application;

import android.content.Intent;
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
    Button cambioTres;
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
        cambioTres = (Button)findViewById(R.id.btnTres);
      // habilito los botones para que funcionen en el contexto this
        cambioUno.setOnClickListener(this);
        cambioDos.setOnClickListener(this);
        cambioTres.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnUno:
                //creo un toast en el contexto getApplicationContext, de duracion LENGTH_SHORT y le doy .show para garantizar que se muestre
                Toast.makeText(getApplicationContext(),"Mostrando Nombre y Contraseña",Toast.LENGTH_SHORT).show();
                String dato1 = Usr.getText().toString();
                campoN.setText(dato1);
                String dato2 = Pass.getText().toString();
                campoC.setText(dato2);
                break;
            case  R.id.btnDos:
              Img2.setImageResource(R.drawable.sinfoto);
               break;
            case  R.id.btnTres:
                String dato3 = Usr.getText().toString();
                campoN.setText(dato3);
                String dato4 = Pass.getText().toString();
                campoC.setText(dato4);
                //Declaro una nueva variable de tipo Intent en MainActivity y la envio a el segundo Activity
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                // Paso del valor dato3 que le he dado el nombre de DATO3 a el segundo activity
                intent.putExtra("DATO3",dato3);
                intent.putExtra("DATO4",dato4);
                startActivity(intent);
                break;


        }
    }
}
