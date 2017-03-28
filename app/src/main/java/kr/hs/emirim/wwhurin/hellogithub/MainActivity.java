package kr.hs.emirim.wwhurin.hellogithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello= (Button) findViewById(R.id.ButtonHello);
        btnHello.setOnClickListener(this);
    }

    public void onClick(View view){
        Toast.makeText( this, "눌렀다", Toast.LENGTH_SHORT).show();
    }
}
