package com.example.formador.compartirfoto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * COMPARTIR FOTO
         */

        Intent shareIntent = new Intent ();
        shareIntent.setAction(Intent.ACTION_SEND);

        //TODO, sería preceder a esto la selección de la galería
        Uri uri = Uri.fromFile(new File("/storage/emulated/0/Pictures/VALE_PIC_20170206_190626.jpg"));

        shareIntent.putExtra(Intent.EXTRA_STREAM, uri);
        shareIntent.setType("image/jpeg");

        //"chooser""


        startActivity(Intent.createChooser(shareIntent, "ENVIAR FOTO POR ..."));
        /**
         * COMPARTIR TEXTO X WHATSAPP

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
        */

        /**
         * PARA CONMARTIR UNA LISTA DE FOTOS
         *
        /
        ArrayList<Uri> array_uris = new ArrayList<Uri>();
        Uri uri1 = Uri.fromFile(new File ("rutafoto1"));
        array_uris.add(uri1);

        Uri uri2 = Uri.fromFile(new File ("rutafoto1"));
        array_uris.add(uri2);

        Uri uri3 = Uri.fromFile(new File ("rutafoto1"));
        array_uris.add(uri3);

        Intent sharemultiple = new Intent();
        sharemultiple.setAction(Intent.ACTION_SEND_MULTIPLE);

        sharemultiple.putParcelableArrayListExtra(Intent.EXTRA_STREAM, array_uris)
        sharemultiple.setType("image/*");

        startActivity(sharemultiple);
         */










    }
}
