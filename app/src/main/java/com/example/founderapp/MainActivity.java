package com.example.founderapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv_list);
        Listdata[] mylistdata = new Listdata[]{
                new Listdata(R.drawable.elon_musk_png_photo_image,getString(R.string.elon_musk),getString(R.string.elon_musk_desc),getString(R.string.elon_musk_company)),
                new Listdata(R.drawable.bill_gates,getString(R.string.bill_gates),getString(R.string.bill_gates_desc),getString(R.string.bill_gates_company)),
                new Listdata(R.drawable.deepindar_goyal,getString(R.string.zomato_founder),getString(R.string.zomato_desc),getString(R.string.zomato)),
                new Listdata(R.drawable.sriharsha_majety,getString(R.string.swiggy_founder),getString(R.string.swiggy_desc),getString(R.string.swiggy)),
                new Listdata(R.drawable.n_r_narayana_murthy,getString(R.string.infosys_founder),getString(R.string.infosys_desc),getString(R.string.infosys)),
                new Listdata(R.drawable.mark_zuckerberg,getString(R.string.facebook_founder),getString(R.string.facebook_description),getString(R.string.facebook)),
                new Listdata(R.drawable.faqir_chand_kohli,getString(R.string.tcs_founder),getString(R.string.tcs_description),getString(R.string.tcs)),
                new Listdata(R.drawable.azim_premji,getString(R.string.wipro_founder),getString(R.string.wipro_description),getString(R.string.wipro)),

        };
        recyclerviewAdapter adapter= new recyclerviewAdapter(mylistdata,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}