package com.example.user.picturematch;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class Youwin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youwin);
    }
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Youwin.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }
    public boolean onCreateOptionsMenu (Menu menu){
        return true;
    }
}
