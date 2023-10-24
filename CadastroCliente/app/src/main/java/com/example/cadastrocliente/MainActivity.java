package com.example.cadastrocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference MeuCadastro = FirebaseDatabase.getInstance().getReference("Clientes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        MeuCadastro.child ("001").child("nome").setValue("Larissa Silva");
        MeuCadastro.child ("001").child("email").setValue("larissa.silva@gmail.com");
        MeuCadastro.child ("001").child("celular").setValue("11 4002-8922");
        MeuCadastro.child ("001").child("endereco").setValue("Rua Filipe Camarão, 530");
        MeuCadastro.child ("001").child("complemento").setValue("apto 1004");
        MeuCadastro.child ("001").child("estado").setValue("São Paulo");
        MeuCadastro.child ("001").child("cidade").setValue("SP");
        MeuCadastro.child ("001").child("cep").setValue("03065-000");
        MeuCadastro.child ("001").child("status").setValue("Ativo");

        MeuCadastro.child ("002").child("nome").setValue("Vinicius Nascimento");
        MeuCadastro.child ("002").child("email").setValue("vinicius.nascimento@gmail.com");
        MeuCadastro.child ("002").child("celular").setValue("11 2245-8975");
        MeuCadastro.child ("002").child("endereco").setValue("Avenida Condessa Elizabeth de Robiano, 2118 ");
        MeuCadastro.child ("002").child("complemento").setValue("apto 156, bloco 3");
        MeuCadastro.child ("002").child("estado").setValue("São Paulo");
        MeuCadastro.child ("002").child("cidade").setValue("SP");
        MeuCadastro.child ("002").child("cep").setValue("03704-000");
        MeuCadastro.child ("002").child("status").setValue("Ativo");

        MeuCadastro.child ("003").child("nome").setValue("Vanessa Silva Cabral de Oliveira");
        MeuCadastro.child ("003").child("email").setValue("vanessa.silva@gmail.com");
        MeuCadastro.child ("003").child("celular").setValue("11 7896-5412");
        MeuCadastro.child ("003").child("endereco").setValue("Rua Filipe Camarão, 530");
        MeuCadastro.child ("003").child("complemento").setValue("apto 76");
        MeuCadastro.child ("003").child("estado").setValue("São Paulo");
        MeuCadastro.child ("003").child("cidade").setValue("SP");
        MeuCadastro.child ("003").child("cep").setValue("03065-000");
        MeuCadastro.child ("003").child("status").setValue("Ativo");

        MeuCadastro.child ("004").child("nome").setValue("Luis Albuquerque de Araujo");
        MeuCadastro.child ("004").child("email").setValue("luis.albuquerque@gmail.com");
        MeuCadastro.child ("004").child("celular").setValue("11 4569-1823");
        MeuCadastro.child ("004").child("endereco").setValue("Rua Filipe Camarão, 530");
        MeuCadastro.child ("004").child("complemento").setValue("apto 76");
        MeuCadastro.child ("004").child("estado").setValue("São Paulo");
        MeuCadastro.child ("004").child("cidade").setValue("SP");
        MeuCadastro.child ("004").child("cep").setValue("03065-000");
        MeuCadastro.child ("004").child("status").setValue("Ativo");

        MeuCadastro.child ("005").child("nome").setValue("Henrique Holanda");
        MeuCadastro.child ("005").child("email").setValue("henrique.holanda@gmail.com");
        MeuCadastro.child ("005").child("celular").setValue("11 7534-9516");
        MeuCadastro.child ("005").child("endereco").setValue("Rua Filipe Camarão, 530");
        MeuCadastro.child ("005").child("complemento").setValue("apto 76");
        MeuCadastro.child ("005").child("estado").setValue("São Paulo");
        MeuCadastro.child ("005").child("cidade").setValue("SP");
        MeuCadastro.child ("005").child("cep").setValue("03065-000");
        MeuCadastro.child ("005").child("status").setValue("Ativo");

        MeuCadastro.child ("006").child("nome").setValue("Amara Silvania da Silva de Oliveira");
        MeuCadastro.child ("006").child("email").setValue("amara.silvania@gmail.com");
        MeuCadastro.child ("006").child("celular").setValue("11 1478-5236");
        MeuCadastro.child ("006").child("endereco").setValue("Trevessa Terra Tombada, 768");
        MeuCadastro.child ("006").child("complemento").setValue("Casa 2");
        MeuCadastro.child ("006").child("estado").setValue("São Paulo");
        MeuCadastro.child ("006").child("cidade").setValue("SP");
        MeuCadastro.child ("006").child("cep").setValue("08344-600");
        MeuCadastro.child ("006").child("status").setValue("Ativo");

        MeuCadastro.child ("007").child("nome").setValue("Hildebrando Cabral de Oliveira");
        MeuCadastro.child ("007").child("email").setValue("hildebrando.cabral@gmail.com");
        MeuCadastro.child ("007").child("celular").setValue("11 2731-3183");
        MeuCadastro.child ("007").child("endereco").setValue("Trevessa Terra Tombada, 768");
        MeuCadastro.child ("007").child("complemento").setValue("Casa 2");
        MeuCadastro.child ("007").child("estado").setValue("São Paulo");
        MeuCadastro.child ("007").child("cidade").setValue("SP");
        MeuCadastro.child ("007").child("cep").setValue("08344-600");
        MeuCadastro.child ("007").child("status").setValue("Ativo");

        MeuCadastro.child ("008").child("nome").setValue("Walter Silva Cabral de Oliveira");
        MeuCadastro.child ("008").child("email").setValue("walter.cabral@gmail.com");
        MeuCadastro.child ("008").child("celular").setValue("11 5897-6234");
        MeuCadastro.child ("008").child("endereco").setValue("Trevessa Terra Tombada, 768");
        MeuCadastro.child ("008").child("complemento").setValue("Casa 2");
        MeuCadastro.child ("008").child("estado").setValue("São Paulo");
        MeuCadastro.child ("008").child("cidade").setValue("SP");
        MeuCadastro.child ("008").child("cep").setValue("08344-600");
        MeuCadastro.child ("008").child("status").setValue("Ativo");

        MeuCadastro.child ("009").child("nome").setValue("Fabiana Mendes Rodrigues");
        MeuCadastro.child ("009").child("email").setValue("fabiana.mendes@gmail.com");
        MeuCadastro.child ("009").child("celular").setValue("11 4475-2308");
        MeuCadastro.child ("009").child("endereco").setValue("Rua Nepal, 816");
        MeuCadastro.child ("009").child("complemento").setValue("Casa 1");
        MeuCadastro.child ("009").child("estado").setValue("São Paulo");
        MeuCadastro.child ("009").child("cidade").setValue("SP");
        MeuCadastro.child ("009").child("cep").setValue("09270-110");
        MeuCadastro.child ("009").child("status").setValue("Ativo");

        MeuCadastro.child ("010").child("nome").setValue("Gabriel Mendes Rodrigues");
        MeuCadastro.child ("010").child("email").setValue("gabriel.mendes@gmail.com");
        MeuCadastro.child ("010").child("celular").setValue("11 4475-2808");
        MeuCadastro.child ("010").child("endereco").setValue("Rua Nepal, 816");
        MeuCadastro.child ("010").child("complemento").setValue("Casa 1");
        MeuCadastro.child ("010").child("estado").setValue("São Paulo");
        MeuCadastro.child ("010").child("cidade").setValue("SP");
        MeuCadastro.child ("010").child("cep").setValue("09270-110");
        MeuCadastro.child ("010").child("status").setValue("Ativo");
    }

}