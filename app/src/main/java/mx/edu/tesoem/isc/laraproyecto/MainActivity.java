package mx.edu.tesoem.isc.laraproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pantalla2(View v){
        Intent frm = new Intent(this, FRAME_ACTIVITY.class);
        startActivity(frm);
        finish();
    }
}
