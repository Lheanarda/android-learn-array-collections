package com.example.arrandcollectioninjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> listwtotaltime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] myIntNumbers = {1,2,3,4,5,6,7,8,9,10};

        int lastArrayNum = myIntNumbers[myIntNumbers.length-1]; //Get Last Array Number

//        Log.i("TAG",lastArrayNum+"");
        Log.i("MYTAG",(myIntNumbers[myIntNumbers.length-1])+"");

        //ARRAY LIST START
        ArrayList myFavoriteAnimals = new ArrayList(); //Flexible Array
        myFavoriteAnimals.add("Lion");
        myFavoriteAnimals.add("Tiger");
        myFavoriteAnimals.add("Leopard");
        Log.i("test",myFavoriteAnimals.get(0)+"");

        myFavoriteAnimals.add("Fish");

        myFavoriteAnimals.remove(0); //remove by index
        myFavoriteAnimals.remove("Fish"); //remove by object
        Log.i("MYTAG",myFavoriteAnimals.get(0)+"");
        Log.i("ALL", myFavoriteAnimals.toString()); //Output all in ArrayList

        ArrayList myFavoriteSport = new ArrayList();
        myFavoriteSport.add("Taekwondo");
        myFavoriteSport.add("Karate");
        myFavoriteSport.add("BJJ");
        myFavoriteSport.add(2); //Karena ga dispesifikasi bebas
        Log.i("SPORT",""+myFavoriteSport.toString());
        myFavoriteSport.remove("Karate");
        Log.i("SPORT",myFavoriteSport.toString());


        ArrayList<String> mobileNames = new ArrayList<>(); //Specify ArrayList

        ArrayList test = new ArrayList();
        test.add("numb1");
        test.add("numb2");
        Log.i("test",test.get(1)+" jumlah : "+test.size());

        //ARRAY LIST END

        // START HASH MAP

        HashMap computer = new HashMap();
        computer.put(4,"iPhone 11 Pro Max"); //Pass the key, then value

        Log.i("HashTag",computer.get(4)+"");

        computer.put("laptop","lenovo");
        computer.put("smartphone","XiaoMi");
        computer.put ("sport","Taekwondo");

        Log.i("HashTag",computer.toString()); //Output all hash map

        computer.remove("smartphone");
        Log.i("HashTag",computer.toString()); //Output all hash map
        Log.i("HashTag",computer.size()+""); //output the size of hash map
        Log.i("HashTag",computer.get(10)+""); //output key yang ga terdaftar = null

        //END HASH MAP

        String[] phones = new String[5]; //Specify the size of regular array
        phones[0]="Vivo";
        phones[1]="iPhone";
        phones[2]="Oppo";
        phones[3]="XiaoMi";
        phones[4]="Samsung";
        Log.i("END",phones[phones.length-1]+"");

        listwtotaltime = new ArrayList<Integer>();
        test();
        Log.i("testlist",listwtotaltime.get(0)+"");
        ;
    }

    public void test(){
        listwtotaltime.add(12);
    }
}
