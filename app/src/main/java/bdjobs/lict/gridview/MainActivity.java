package bdjobs.lict.gridview;

import android.graphics.Color;
import android.hardware.camera2.params.BlackLevelPattern;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import bdjobs.lict.gridview.adapter.CustomAdapter;
import bdjobs.lict.gridview.model.Friends;

public class MainActivity extends AppCompatActivity {

    GridView grid_view;
    ArrayList<Friends> arrayList;
    CoordinatorLayout coordinatorLayout;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid_view=findViewById(R.id.grid_view);
        arrayList=new ArrayList<>();
        coordinatorLayout=findViewById(R.id.coordinatorLayout);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this, arrayList);
        grid_view.setAdapter(adapter);
        
        setData();
        grid_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int Position, long l) {
                snackbar=Snackbar.make(coordinatorLayout, arrayList.get(Position).getName(),Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        snackbar.dismiss();
                    }
                });
                snackbar.setActionTextColor(Color.LTGRAY);
                View sbView = snackbar.getView();
                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.WHITE);
                snackbar.show();
            }
        });
        
    }

    private void setData() {
        Friends Shovon = new Friends(R.drawable.shovon,"Shovon");
        Friends Bappi = new Friends(R.drawable.rsz_bappi," Bappi");
        Friends Jahan = new Friends(R.drawable.rsz_jahan," Jahan");
        Friends Komol = new Friends(R.drawable.rsz_komol,"Komol");
        Friends Majed = new Friends(R.drawable.rsz_majed,"Majed");
        Friends Mithu = new Friends(R.drawable.rsz_mithu,"Mithu");
        Friends Omi = new Friends(R.drawable.rsz_omi,"Omi");
        Friends Saddam = new Friends(R.drawable.rsz_saddam,"Saddam");
        Friends Sawon = new Friends(R.drawable.rsz_sawon,"Sawon");
        Friends Sole = new Friends(R.drawable.rsz_sole,"Soleman");

        arrayList.add(Shovon);
        arrayList.add(Bappi);
        arrayList.add(Jahan);
        arrayList.add(Komol);
        arrayList.add(Majed);
        arrayList.add(Mithu);
        arrayList.add(Omi);
        arrayList.add(Saddam);
        arrayList.add(Sawon);
        arrayList.add(Sole);
    }
}
