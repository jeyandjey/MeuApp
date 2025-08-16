package br.com.etecia.myapp;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class DetalhesActivity extends AppCompatActivity{
    ImageView imgProduto;
    TextView txtTitulo;

  @Override
    protected void onCreate (Bundle savedIntanceState) {
    super.onCreate(savedIntanceState);
    setContentView(R.layout.activity_detalhes);
    imgProduto = findViewById(R.id.imgProdutosDetalhe);
    txtTitulo= findViewById(R.id.txtTituloDetalhe);

    Bundle bundle = getIntent().getExtras();
    if (bundle!=null){
        txtTitulo.setText(bundle.getString("Mainecoon"));
        imgProduto.setImageResource(R.drawable.mainecoon);
    }
    }
}
