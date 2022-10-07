package appbolota.rede.ulbra.projetoimagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaFotos extends AppCompatActivity {
    ImageView imgfoto;
    Button btfoto1, btfoto2;
    TextView txtinformacao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_fotos);

        imgfoto = (ImageView) findViewById(R.id.imgfoto);
        btfoto1 = (Button) findViewById(R.id.bt1);
        btfoto2 = (Button) findViewById(R.id.bt2);
        txtinformacao = (TextView) findViewById(R.id.txtinformacao);

        btfoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.elefante);
                txtinformacao.setText(" Foto 1: Elefante ");
            }
        });
        btfoto2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                imgfoto.setImageResource(R.drawable.dinossauro);
                txtinformacao.setText(" Foto 2: Dinossauro ");

            }
        });
    }
}