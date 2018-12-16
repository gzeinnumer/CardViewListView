package com.gzeinnumer.cardviewlistview;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CardViewListViewAdapter extends ArrayAdapter<String> {
    private Activity context;
    private int[] mImage;
    private String[] mTitle;

    public CardViewListViewAdapter(Activity context, int[] mImage, String[] mTitle) {
        super(context, R.layout.card_list_item,mTitle);
        this.context = context;
        this.mImage = mImage;
        this.mTitle = mTitle;
    }

    public View getView(int position, View converView, ViewGroup parent){
        View r = converView;
        ViewHolder viewHolder = null;
        if(r ==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.card_list_item,null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();
        }
        viewHolder.imageView.setImageResource(mImage[position]);
        viewHolder.textView.setText(mTitle[position]);
        return r;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
        ViewHolder(View v){
            imageView = v.findViewById(R.id.imageView);
            textView = v.findViewById(R.id.tvTitle);
        }
    }
}
