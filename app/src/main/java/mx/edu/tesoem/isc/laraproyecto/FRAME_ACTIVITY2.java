package mx.edu.tesoem.isc.laraproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FRAME_ACTIVITY2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__activity2);
    }

    public void menu(View v) {
        Intent frm = new Intent(this, FRAME_ACTIVITY.class);
        startActivity(frm);
        finish();
    }
}