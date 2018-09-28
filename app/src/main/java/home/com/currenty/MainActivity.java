package home.com.currenty;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Double input = Double.parseDouble(editText.getText().toString());
                    DecimalFormat decimalFormat = new DecimalFormat(".00");
                    Double result = input/30.9;



                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Result")
                            .setMessage("USD is " + decimalFormat.format(result))
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).show();
                }catch (Exception e){
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Problem")
                            .setMessage("Please enter your NTD amount")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            }).show();
                }
            }
        });
    }
}
