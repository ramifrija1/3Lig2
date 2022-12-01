package com.firstapp.rami;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.firstapp.rami.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    FirebaseAuth firebaseAuth;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Login Etudiant");

        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        firebaseAuth =FirebaseAuth.getInstance();
        progressDialog=new ProgressDialog(this);
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail=binding.mail2.getText().toString().trim();
                String pass=binding.motdepasse2.getText().toString().trim();
                progressDialog.show();
                firebaseAuth.signInWithEmailAndPassword(mail,pass)
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                progressDialog.cancel();
                                Toast.makeText(LoginActivity.this,"Login Succesfull",Toast.LENGTH_SHORT).show();
Intent intent=new Intent(LoginActivity.this,Acceuillll.class);
startActivity(intent);
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                progressDialog.cancel();
                                Toast.makeText(LoginActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });


            }
        });
        binding.oubliemotdepasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=binding.mail2.getText().toString();
                progressDialog.setTitle("Sending mail");

                progressDialog.show();

                firebaseAuth.sendPasswordResetEmail(email)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                progressDialog.cancel();
                                Toast.makeText(LoginActivity.this,"Email send",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                progressDialog.cancel();
                                Toast.makeText(LoginActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });
        binding.goTosignupactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}