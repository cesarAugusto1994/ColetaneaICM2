package com.coletanea.coletaneaicm.coletaneaicm.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.coletanea.coletaneaicm.coletaneaicm.R;
import com.coletanea.coletaneaicm.coletaneaicm.model.Colecao;

import java.util.List;



public class ColecaoListAdapter extends ArrayAdapter {

    private final List<Colecao> colecoes;
    private final Context context;

    public ColecaoListAdapter(Context context, List<Colecao> colecoes) {
        super(context, 0, colecoes);
        this.context = context;
        this.colecoes = colecoes;
    }

    @Override
    public int getCount() {
        return colecoes.size();
    }

    @Override
    public Object getItem(int position) {
        return colecoes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return colecoes.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Colecao colecao = colecoes.get(position);

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.list_item, null);
        }

        TextView nome = (TextView) view.findViewById(R.id.item_nome);
        nome.setText(colecao.getId());

        TextView telefone = (TextView) view.findViewById(R.id.item_telefone);
        telefone.setText(colecao.getNome());

        return view;
    }
}
