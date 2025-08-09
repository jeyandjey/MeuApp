package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    private Context context;
    private List<Produtos> lstProdutos;

    public Adaptador(Context context, List<Produtos> lstProdutos) {
        this.context = context;
        this.lstProdutos = lstProdutos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater intflater = LayoutInflater.from(context);
        View view = intflater.inflate(R.layout.modelo_produtos, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstProdutos.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardProdutos;
        ImageView modImagemProduto;
        TextView modTituloProduto;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardProdutos = itemView.findViewById(R.id.cardProdutos);
            modImagemProduto = itemView.findViewById(R.id.modImagemProduto);
            modTituloProduto = itemView.findViewById(R.id.modTituloProduto);
        }
    }

}
