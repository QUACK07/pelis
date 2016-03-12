package pelis.cucea.udg.mx.pelis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Titanium on 05/03/16.
 */
public class Login extends AppCompatActivity {
    private EditText userName, password;
    private Button login;
    private String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Funcionalidad de xhtml con loggin se crean las variables en private y se les agrega con casteo porque eredan de view

        userName = (EditText)findViewById(R.id.textUsername);
        password = (EditText)findViewById(R.id.textPassword);
        login = (Button)findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass = password.getText().toString();
                user = userName.getText().toString();

                if(Validation()) {

                    if (user.equalsIgnoreCase("giovas") && pass.equalsIgnoreCase("admin")) {
                        Toast.makeText(Login.this, getString(R.string.login_successfuly), Toast.LENGTH_LONG).show();
                        //Se necesita un intent para correr una nueva view
                        Intent listIntent = new Intent(Login.this,List.class);
                        //Se llaman entre javas
                        startActivity(listIntent);

                    } else {
                        Toast.makeText(Login.this, getString(R.string.error_bad_credentials), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });


    }
    private boolean Validation(){
        boolean success = true;

        if(user.equalsIgnoreCase("")){
            userName.setError(getString(R.string.error_fieldrequired));
            userName.requestFocus();
            success = false;
        }
        if (pass.equalsIgnoreCase("")){
            password.setError(getString(R.string.error_fieldrequired));
            password.requestFocus();
            success = false;
        }
        return success;
    }

}
