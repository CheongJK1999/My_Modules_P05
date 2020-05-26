package sg.edu.rp.c346.id19043996.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvAP, tvIPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAP = findViewById(R.id.textViewAP);
        tvIPP = findViewById(R.id.textViewiPP);

        tvAP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module", "M1");
                startActivity(intent);
            }
        });

        tvIPP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity2.class);
                intent.putExtra("Module2", "M2");
                startActivity(intent);
            }
        });

    }
}
