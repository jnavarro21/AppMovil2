package com.example.alumno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("bichito",
                "La aplicacion acaba de abiri");
        btnGo=(Button)findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(MainActivity.this,Main2Activity.class);
                MainActivity.this.startActivity(x);
            }
        });
    }
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Log.v("bichito",
                "La aplicacion ya comenzo");
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"Gracias por usar",Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);

        Log.v("bichito",
                "La aplicacion acaba de ingresar a onResume");
    }
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main);
        Log.v("bichito",
                "La aplicacion acaba de ingresar a onPause");
    }
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main);
        Log.v("bichito",
                "La aplicacion acaba de ingresar a onStop");
    }
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Log.v("bichito",
                "La aplicacion acaba de ingresar a onDestroy");
    }
}
