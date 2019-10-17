package mx.edu.tesoem.isc.laraproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FRAME_ACTIVITY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame__activity);

    }

    public void pantalla3(View v) {
        Intent frm1 = new Intent(this, FRAME_ACTIVITY2.class);
        startActivity(frm1);
        finish();
    }

    public void pantalla4(View v) {
        Intent frm11 = new Intent(this, FRAME_ACTIVITY3.class);
        startActivity(frm11);
        finish();
    }

    public void pantalla5(View v) {
        Intent frm112 = new Intent(this, FRAME_ACTIVITY4.class);
        startActivity(frm112);
        finish();
    }

    public void pantalla6(View v) {
        Intent frm1123 = new Intent(this, FRAME_ACTIVITY5.class);
        startActivity(frm1123);
        finish();
    }

    public void pantalla7(View v) {
        Intent frm11234 = new Intent(this, FRAME_ACTIVITY6.class);
        startActivity(frm11234);
        finish();
    }

    public void pantalla8(View v) {
        Intent frm112345 = new Intent(this, FRAME_ACTIVITY7.class);
        startActivity(frm112345);
        finish();
    }

    public void salir(View v) {


        finish();
    }
}
