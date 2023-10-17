package com.example.escola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference minhaReferencia = FirebaseDatabase.getInstance().getReference("escola");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");



        minhaReferencia.child ("001").child("nome").setValue("Larissa Silva");
        minhaReferencia.child ("001").child("rm").setValue("001");
        minhaReferencia.child ("001").child("turma").setValue("1");
        minhaReferencia.child ("001").child("sala").setValue("10");
        minhaReferencia.child ("002").child("nome").setValue("Lucas Cancela");
        minhaReferencia.child ("002").child("rm").setValue("002");
        minhaReferencia.child ("002").child("turma").setValue("1");
        minhaReferencia.child ("002").child("sala").setValue("10");
        minhaReferencia.child ("003").child("nome").setValue("Bruno Gonçalves");
        minhaReferencia.child ("003").child("rm").setValue("003");
        minhaReferencia.child ("003").child("turma").setValue("1");
        minhaReferencia.child ("003").child("sala").setValue("10");
        minhaReferencia.child ("004").child("nome").setValue("Marcus Moreira");
        minhaReferencia.child ("004").child("rm").setValue("004");
        minhaReferencia.child ("004").child("turma").setValue("1");
        minhaReferencia.child ("004").child("sala").setValue("10");
        minhaReferencia.child ("005").child("nome").setValue("Tainara Cavalcante");
        minhaReferencia.child ("005").child("rm").setValue("005");
        minhaReferencia.child ("005").child("turma").setValue("1");
        minhaReferencia.child ("005").child("sala").setValue("10");



    }

}