package com.wolfsoft.financeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

import adapter.WalletAdapter1;
import adapter.WalletAdapter2;
import model.WalletModel;
import model.WalletModel2;

public class My_Wallet_07 extends AppCompatActivity {

    private WalletAdapter1 walletAdapter1;
    private RecyclerView recyclerview;
    private ArrayList<WalletModel> walletModelArrayList;

    private WalletAdapter2 walletAdapter2;
    private RecyclerView recyclerview1;
    private ArrayList<WalletModel2> walletModel2ArrayList;


    Integer oval[] = {R.drawable.ic_group_108, R.drawable.ic_group_109, R.drawable.ic_group_110, R.drawable.ic_group_111, R.drawable.ic_group_112,
            R.drawable.ic_group_113};
    String txtshopping[] = {"E-Shopping", "Bill Payment", "Charity", "Send Gift", "Split Bills", "Cash Back"};

    Integer img1[] = {R.drawable.ic_group_117, R.drawable.ic_group_117, R.drawable.ic_group_117};
    String txtsavingacct[] = {"Saving Account", "Saving Account", "Saving Account"};
    String txtdiscount[] = {"Got up to 10% monthly interest!", "Got up to 10% monthly interest!", "Got up to 10% monthly interest!"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_07);



//        category recyclerview code is here:

        recyclerview = findViewById(R.id.recycler1);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(My_Wallet_07.this, 2);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        walletModelArrayList = new ArrayList<>();

        for (int i = 0; i < oval.length; i++) {
            WalletModel view = new WalletModel(oval[i], txtshopping[i]);
            walletModelArrayList.add(view);
        }
        walletAdapter1 = new WalletAdapter1(My_Wallet_07.this, walletModelArrayList);
        recyclerview.setAdapter(walletAdapter1);


        //        promo recyclerview code is here:

        recyclerview1 = findViewById(R.id.recycler2);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(My_Wallet_07.this);
        recyclerview1.setLayoutManager(layoutManager1);
        recyclerview1.setItemAnimator(new DefaultItemAnimator());
        recyclerview1.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        walletModel2ArrayList = new ArrayList<>();

        for (int i = 0; i < img1.length; i++) {
            WalletModel2 view1 = new WalletModel2(img1[i], txtsavingacct[i], txtdiscount[i]);
            walletModel2ArrayList.add(view1);
        }
        walletAdapter2 = new WalletAdapter2(My_Wallet_07.this, walletModel2ArrayList);
        recyclerview1.setAdapter(walletAdapter2);

    }
}
