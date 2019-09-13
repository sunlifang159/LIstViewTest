package com.lplinkpi.listviewtest;

/**
 * Created by SUN on 2019/09/13.
 */


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SUN on 2019/09/13.
 */
public class FruitAdaper extends ArrayAdapter<Fruit> {

    private int resourceId;

    public FruitAdaper(Context context, int textViewResourceId,
                       List<Fruit> objects){
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position); //获取当前项的Fruit实例
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        fruitImage.setImageResource(fruit.getImageId());

        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitName.setText(fruit.getName());
        return view;
    }
}