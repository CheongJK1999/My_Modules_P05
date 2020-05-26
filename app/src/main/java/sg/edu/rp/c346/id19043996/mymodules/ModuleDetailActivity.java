package sg.edu.rp.c346.id19043996.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvMC, tvMN, tvAY, tvSem, tvMCred, tvV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvMC = findViewById(R.id.textView);
        tvMN = findViewById(R.id.textView2);
        tvAY = findViewById(R.id.textView3);
        tvSem = findViewById(R.id.textView4);
        tvMCred = findViewById(R.id.textView5);
        tvV = findViewById(R.id.textView6);

        Intent intentReceived = getIntent();
        String ModuleSelected = intentReceived.getStringExtra( "Module");
        tvMC.setText("Module Code: C346");
        tvMN.setText("Module name: Android Programming");
        tvAY.setText("Academic YEar: 2020");
        tvSem.setText("Semester: 1");
        tvMCred.setText("Module Credit: 4");
        tvV.setText("Venue: W66M");
    }
}
