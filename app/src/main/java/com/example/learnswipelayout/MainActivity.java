package com.example.learnswipelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.daimajia.swipe.SwipeLayout;

public class MainActivity extends AppCompatActivity {

    private SwipeLayout ornek1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ornek1 = findViewById(R.id.ornek1);

        ornek1.setShowMode(SwipeLayout.ShowMode.PullOut);
        ornek1.addDrag(SwipeLayout.DragEdge.Left, ornek1.findViewById(R.id.linear_sol));
        ornek1.addDrag(SwipeLayout.DragEdge.Right, ornek1.findViewById(R.id.linear_sag));

        ornek1.findViewById(R.id.searchImg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "Search", Toast.LENGTH_LONG).show();
            }
        });
        ornek1.findViewById(R.id.deleteImg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "Delete ", Toast.LENGTH_LONG).show();
            }
        });
        ornek1.findViewById(R.id.starImg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext() , "Star", Toast.LENGTH_LONG).show();
            }
        });
    }

}