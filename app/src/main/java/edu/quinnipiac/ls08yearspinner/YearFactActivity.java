package edu.quinnipiac.ls08yearspinner;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class YearFactActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_year_fact);

    String fact = (String) getIntent().getExtras().get("yearFact");
        System.out.println("YearFactActivity " + fact);
    TextView textView = (TextView) findViewById(R.id.textView);
    textView.setText(fact);

    setSupportActionBar(findViewById(R.id.toolbar2));
    ActionBar ab = getSupportActionBar();
    if(ab != null)
        ab.setDisplayHomeAsUpEnabled(true);
}
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
