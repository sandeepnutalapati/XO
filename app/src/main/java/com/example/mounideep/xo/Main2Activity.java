package com.example.mounideep.xo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    int counter = 0;
    int[] set = new int[9];
    char[] arrayRefVar = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
    char winner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);


        final ImageView one = (ImageView) findViewById(R.id.one);
        final ImageView two = (ImageView) findViewById(R.id.two);
        final ImageView three = (ImageView) findViewById(R.id.three);
        final ImageView four = (ImageView) findViewById(R.id.four);
        final ImageView five = (ImageView) findViewById(R.id.five);
        final ImageView six = (ImageView) findViewById(R.id.six);
        final ImageView seven = (ImageView) findViewById(R.id.seven);
        final ImageView eight = (ImageView) findViewById(R.id.eight);
        final ImageView nine = (ImageView) findViewById(R.id.nine);


        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (set[0] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[0] = 'x';
                        winner = 'X';
                        one.setImageResource(R.drawable.x);
                    } else {
                        one.setImageResource(R.drawable.o);
                        arrayRefVar[0] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[0]++;

                }
                check();
                Log.v("in one view", "" + arrayRefVar[0]+"counter"+counter);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[1] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[1] = 'x';
                        two.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        two.setImageResource(R.drawable.o);
                        arrayRefVar[1] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[1]++;
                }
                check();
                Log.v("in two view", "" + arrayRefVar[1]+"counter"+counter);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[2] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[2] = 'x';
                        three.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        three.setImageResource(R.drawable.o);
                        arrayRefVar[2] = 'o';
                        winner = 'O';

                        set[2]++;
                    }
                    counter++;
                    check();
                    Log.v("in three view", "" + arrayRefVar[2]+"counter"+counter);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[3] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[3] = 'x';
                        four.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        four.setImageResource(R.drawable.o);
                        arrayRefVar[3] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[3]++;
                }
                check();
                Log.v("in four view", "" + arrayRefVar[3]+"counter"+counter);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[4] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[4] = 'x';
                        five.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        five.setImageResource(R.drawable.o);
                        arrayRefVar[4] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[4]++;
                }
                check();
                Log.v("in five view", "" + arrayRefVar[4]+"counter"+counter);

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[5] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[5] = 'x';
                        six.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        six.setImageResource(R.drawable.o);
                        arrayRefVar[5] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[5]++;
                    Log.v("in six view", "" + arrayRefVar[5]+"counter"+counter);
                    check();
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[6] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[6] = 'x';
                        seven.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        seven.setImageResource(R.drawable.o);
                        arrayRefVar[6] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[6]++;
                    Log.v("in seven view", "" + arrayRefVar[6]+"counter"+counter);
                    check();
                }

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[7] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[7] = 'x';
                        eight.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        eight.setImageResource(R.drawable.o);
                        arrayRefVar[7] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[7]++;
                    Log.v("in eight view", "" + arrayRefVar[7]+"counter"+counter);
                    check();
                }

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (set[8] == 0) {
                    if (counter % 2 == 0) {
                        arrayRefVar[8] = 'x';
                        nine.setImageResource(R.drawable.x);
                        winner = 'X';
                    } else {
                        nine.setImageResource(R.drawable.o);
                        arrayRefVar[8] = 'o';
                        winner = 'O';
                    }
                    counter++;
                    set[8]++;
                    Log.v("in nine view", "" + arrayRefVar[8]+"counter"+counter);
                    check();
                }

            }
        });
    }


    void check() {
        if ((arrayRefVar[0] == arrayRefVar[1] && arrayRefVar[0] == arrayRefVar[2]) ||
                (arrayRefVar[3] == arrayRefVar[4] && arrayRefVar[3] == arrayRefVar[5]) ||
                (arrayRefVar[6] == arrayRefVar[7] && arrayRefVar[6] == arrayRefVar[8]) ||
                (arrayRefVar[0] == arrayRefVar[3] && arrayRefVar[0] == arrayRefVar[6]) ||
                (arrayRefVar[1] == arrayRefVar[4] && arrayRefVar[1] == arrayRefVar[7]) ||
                (arrayRefVar[2] == arrayRefVar[5] && arrayRefVar[2] == arrayRefVar[8]) ||
                (arrayRefVar[0] == arrayRefVar[4] && arrayRefVar[0] == arrayRefVar[8]) ||
                (arrayRefVar[2] == arrayRefVar[4] && arrayRefVar[2] == arrayRefVar[6])
                ) {
            Log.v("in if block", "hehe");

            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.custom_toast,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = (TextView) layout.findViewById(R.id.text);
            text.setText("Winner is " + winner);
            ImageView image = (ImageView) layout.findViewById(R.id.image);
            if (winner == 'X')
                image.setImageResource(R.drawable.x);
            else if (winner == 'O')
                image.setImageResource(R.drawable.o);
            else
                image.setVisibility(View.GONE);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();


            reset();

        }

        if (counter >= 9) {

            Toast.makeText(this,"DRAW",Toast.LENGTH_LONG).show();

            reset();

        }
    }

    void reset() {


        final ImageView one = (ImageView) findViewById(R.id.one);
        final ImageView two = (ImageView) findViewById(R.id.two);
        final ImageView three = (ImageView) findViewById(R.id.three);
        final ImageView four = (ImageView) findViewById(R.id.four);
        final ImageView five = (ImageView) findViewById(R.id.five);
        final ImageView six = (ImageView) findViewById(R.id.six);
        final ImageView seven = (ImageView) findViewById(R.id.seven);
        final ImageView eight = (ImageView) findViewById(R.id.eight);
        final ImageView nine = (ImageView) findViewById(R.id.nine);

        one.setImageResource(R.drawable.sample_0);
        two.setImageResource(R.drawable.sample_0);
        three.setImageResource(R.drawable.sample_0);
        four.setImageResource(R.drawable.sample_0);
        five.setImageResource(R.drawable.sample_0);
        six.setImageResource(R.drawable.sample_0);
        seven.setImageResource(R.drawable.sample_0);
        eight.setImageResource(R.drawable.sample_0);
        nine.setImageResource(R.drawable.sample_0);

        counter=0;
        set[0] = 0;
        set[1] = 0;
        set[2] = 0;
        set[3] = 0;
        set[4] = 0;
        set[5] = 0;
        set[6] = 0;
        set[7] = 0;
        set[8] = 0;

        arrayRefVar[0] = 'a';
        arrayRefVar[1] = 'b';
        arrayRefVar[2] = 'c';
        arrayRefVar[3] = 'd';
        arrayRefVar[4] = 'e';
        arrayRefVar[5] = 'f';
        arrayRefVar[6] = 'g';
        arrayRefVar[7] = 'h';
        arrayRefVar[8] = 'i';


    }

   
}      



