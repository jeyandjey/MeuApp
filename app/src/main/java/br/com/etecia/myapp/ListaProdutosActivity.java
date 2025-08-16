package br.com.etecia.myapp;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListaProdutosActivity extends AppCompatActivity {
    RecyclerView idListaProdutos;
    List<Produtos> ltsProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.lista_produtos_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //array que vai caregar lista de produtos
        //obj q pode fazer para os itens da lista serem diferentes
        ltsProdutos = new ArrayList<>();
        ltsProdutos.add(new Produtos("MaineCoon", R.drawable.mainecoon));
        ltsProdutos.add(new Produtos("Bengal", R.drawable.bengal));
        ltsProdutos.add(new Produtos("Fold", R.drawable.fold));
        ltsProdutos.add(new Produtos("Angora", R.drawable.angora));
        ltsProdutos.add(new Produtos("Persa", R.drawable.persa));
        ltsProdutos.add(new Produtos("Ragdoll", R.drawable.ragdoll));
        ltsProdutos.add(new Produtos("Siames", R.drawable.siames));
        ltsProdutos.add(new Produtos("Sphynx", R.drawable.sphynx));


        //java
        idListaProdutos = findViewById(R.id.idlistaprodutos); //xml

        // lista layout
        idListaProdutos.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        //instanciae o adaptador

        idListaProdutos.hasFixedSize();

        Adaptador adapter = new Adaptador(getApplicationContext(),ltsProdutos);
        idListaProdutos.setAdapter(adapter);


    }
}