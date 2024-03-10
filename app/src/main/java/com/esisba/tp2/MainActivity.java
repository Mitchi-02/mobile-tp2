package com.esisba.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    MaterialCardView card1, card2, card3, card4, card5, reset;
    HorizontalScrollView scrol1, scrol2, scrol3, scrol4, scrol5;
    Boolean bool1, bool2, bool3, bool4, bool5;
    int rak3at1, rak3at2, rak3at3, rak3at4, rak3at5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialisation();
        onClicks();
    }

    private void initialisation() {
        reset = findViewById(R.id.reset);
        card1 = findViewById(R.id.subh);
        card2 = findViewById(R.id.duhr);
        card3 = findViewById(R.id.asr);
        card4 = findViewById(R.id.maghreb);
        card5 = findViewById(R.id.ichaa);
        scrol1 = findViewById(R.id.scrol1);
        scrol2 = findViewById(R.id.scrol2);
        scrol3 = findViewById(R.id.scrol3);
        scrol4 = findViewById(R.id.scrol4);
        scrol5 = findViewById(R.id.scrol5);
        bool1 = false;
        bool2 = false;
        bool3 = false;
        bool4 = false;
        bool5 = false;
        rak3at1 = 2;
        rak3at2 = 4;
        rak3at3 = 4;
        rak3at4 = 3;
        rak3at5 = 4;
    }

    private void onClicks() {
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bool1 = false;
                bool2 = false;
                bool3 = false;
                bool4 = false;
                bool5 = false;
                SetVisibility();
            }
        });
        card1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bool1 = true;
                SetVisibility();
                return true;
            }
        });
        card2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bool2 = true;
                SetVisibility();
                return true;
            }
        });
        card3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bool3 = true;
                SetVisibility();
                return true;
            }
        });
        card4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bool4 = true;
                SetVisibility();
                return true;
            }
        });
        card5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                bool5 = true;
                SetVisibility();
                return true;
            }
        });

        // Add a click listener to the to each card that shows a toast of the number of rak3at
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Subh: " + rak3at1, Toast.LENGTH_SHORT).show();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Duhr: " + rak3at2, Toast.LENGTH_SHORT).show();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Asr: " + rak3at3, Toast.LENGTH_SHORT).show();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Maghreb: " + rak3at4, Toast.LENGTH_SHORT).show();
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ichaa: " + rak3at5, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void SetVisibility() {
        if (bool1) {
            card1.setVisibility(View.GONE);
            scrol1.setVisibility(View.VISIBLE);
        } else {
            card1.setVisibility(View.VISIBLE);
            scrol1.setVisibility(View.GONE);
        }
        if (bool2) {
            card2.setVisibility(View.GONE);
            scrol2.setVisibility(View.VISIBLE);
        } else {
            card2.setVisibility(View.VISIBLE);
            scrol2.setVisibility(View.GONE);
        }
        if (bool3) {
            card3.setVisibility(View.GONE);
            scrol3.setVisibility(View.VISIBLE);
        } else {
            card3.setVisibility(View.VISIBLE);
            scrol3.setVisibility(View.GONE);
        }
        if (bool4) {
            card4.setVisibility(View.GONE);
            scrol4.setVisibility(View.VISIBLE);
        } else {
            card4.setVisibility(View.VISIBLE);
            scrol4.setVisibility(View.GONE);
        }
        if (bool5) {
            card5.setVisibility(View.GONE);
            scrol5.setVisibility(View.VISIBLE);
        } else {
            card5.setVisibility(View.VISIBLE);
            scrol5.setVisibility(View.GONE);
        }
    }
}