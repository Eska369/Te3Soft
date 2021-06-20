package te3soft.com.przygotowaniedoegzaminwbyte3soft;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 = (Button) findViewById(R.id.button_arytmetyka);
        button_2 = (Button) findViewById(R.id.button_uklady);
        button_3 = (Button) findViewById(R.id.button_budowa);
        button_4 = (Button) findViewById(R.id.button_plyta);
        button_5 = (Button) findViewById(R.id.button_procesory);


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_arytmetyka();
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_uklady();
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_budowa();
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_plyta();
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_procesory();
            }
        });

    }
    public void open_arytmetyka(){
        Intent intent = new Intent(this, arytmetyka.class);
        startActivity(intent);
    }
    public void open_uklady(){
        Intent intent = new Intent(this, uklady.class);
        startActivity(intent);
    }
    public void open_budowa(){
        Intent intent = new Intent(this, budowa.class);
        startActivity(intent);
    }
    public void open_plyta(){
        Intent intent = new Intent(this, plyta.class);
        startActivity(intent);
    }
    public void open_procesory(){
        Intent intent = new Intent(this, procesory.class);
        startActivity(intent);
    }
}
