package br.com.etecia.myapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
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
