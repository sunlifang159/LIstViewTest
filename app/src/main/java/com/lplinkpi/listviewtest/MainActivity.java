package com.lplinkpi.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;




public class MainActivity extends AppCompatActivity {

    private String[] data ={"apple","banana","orange","pear","raspberry1","raspberry2",
            "raspberry3","raspberry4","raspberry5","raspberry6","raspberry7","raspberry8",
            "raspberry9","raspberry10","raspberry11","raspberry12","raspberry13","raspberry14"};

    private List<Fruit> fruitList = new ArrayList<>();

    private void initFruits(){
        for (int i = 0; i < 3 ;i++){  //三遍测试
            Fruit apple = new Fruit("apple",R.drawable.apple_pic);
            fruitList.add(apple);

            Fruit banana = new Fruit("banana",R.drawable.banana_pic);
            fruitList.add(banana);

            Fruit orange = new Fruit("orange",R.drawable.orange_pic);
            fruitList.add(orange);

            Fruit pear = new Fruit("pear",R.drawable.pear_pic);
            fruitList.add(pear);

            Fruit raspberry1 = new Fruit("raspberry1",R.drawable.raspberry_pic);
            fruitList.add(raspberry1);

            Fruit raspberry2 = new Fruit("raspberry2",R.drawable.raspberry_pic);
            fruitList.add(raspberry2);

            Fruit raspberry3 = new Fruit("raspberry3",R.drawable.raspberry_pic);
            fruitList.add(raspberry3);

            Fruit raspberry4 = new Fruit("raspberry4",R.drawable.raspberry_pic);
            fruitList.add(raspberry4);

            Fruit raspberry5 = new Fruit("raspberry5",R.drawable.raspberry_pic);
            fruitList.add(raspberry5);

            Fruit raspberry6 = new Fruit("raspberry6",R.drawable.raspberry_pic);
            fruitList.add(raspberry6);

            Fruit raspberry7 = new Fruit("raspberry7",R.drawable.raspberry_pic);
            fruitList.add(raspberry7);

            Fruit raspberry8 = new Fruit("raspberry8",R.drawable.raspberry_pic);
            fruitList.add(raspberry8);

            Fruit raspberry9 = new Fruit("raspberry9",R.drawable.raspberry_pic);
            fruitList.add(raspberry9);

            Fruit raspberry10 = new Fruit("raspberry10",R.drawable.raspberry_pic);
            fruitList.add(raspberry10);

            Fruit raspberry11 = new Fruit("raspberry11",R.drawable.raspberry_pic);
            fruitList.add(raspberry11);

            Fruit raspberry12 = new Fruit("raspberry12",R.drawable.raspberry_pic);
            fruitList.add(raspberry12);

            Fruit raspberry13 = new Fruit("raspberry13",R.drawable.raspberry_pic);
            fruitList.add(raspberry13);

            Fruit raspberry14 = new Fruit("raspberry14",R.drawable.raspberry_pic);
            fruitList.add(raspberry14);


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFruits();
        FruitAdaper adapter = new FruitAdaper(MainActivity.this,R.layout.fruit_item,fruitList);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        //        MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }


}
