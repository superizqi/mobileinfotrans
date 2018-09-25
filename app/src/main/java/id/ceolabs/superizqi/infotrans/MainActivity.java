package id.ceolabs.superizqi.infotrans;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void to_daftar(View v){
        Intent i = new Intent(MainActivity.this,daftar.class);
        startActivity(i);
    }

    public void to_login(View v){
        Intent i = new Intent(MainActivity.this,login.class);
        startActivity(i);
    }
}
