package sg.edu.rp.c346.id19043996.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity2 extends AppCompatActivity {

    TextView tvMC, tvMN, tvAY, tvSem, tvMCred, tvV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail2);

        tvMC = findViewById(R.id.textView7);
        tvMN = findViewById(R.id.textView8);
        tvAY = findViewById(R.id.textView9);
        tvSem = findViewById(R.id.textView10);
        tvMCred = findViewById(R.id.textView11);
        tvV = findViewById(R.id.textView12);

        Intent intentReceived = getIntent();
        String ModuleSelected = intentReceived.getStringExtra( "Module2");
        tvMC.setText("Module Code: C349");
        tvMN.setText("Module name: iPad Programming");
        tvAY.setText("Academic Year: 2020");
        tvSem.setText("Semester: 1");
        tvMCred.setText("Module Credit: 4");
        tvV.setText("Venue: W67E");
    }
}
