package fave.josh.com.androidclass;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalculatorActivity extends AppCompatActivity {

    Button add, subtract, multiply, divide;
    EditText inputOne, inputTwo;
    TextView result;
    double a,b,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Giving value
        //Buttons
        add = (Button) findViewById(R.id.addition);
        subtract = (Button)findViewById(R.id.subtraction);
        multiply = (Button) findViewById(R.id.mult);
        divide = (Button) findViewById(R.id.div);

        //EditText
        inputOne = (EditText) findViewById(R.id.input_one);
        inputTwo = (EditText) findViewById(R.id.input_two);

        //TextView
        result = (TextView) findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput();
                r = addition(a,b);
                result.setText(String.valueOf(r));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput();
                r = subtraction(a,b);
                result.setText(String.valueOf(r));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput();
                r = multiplication(a,b);
                result.setText(String.valueOf(r));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput();
                r = division(a,b);
                result.setText(String.valueOf(r));
            }
        });
    }


    private void getInput(){
        a = Double.parseDouble(inputOne.getText().toString());
        b = Double.parseDouble(inputTwo.getText().toString());
    }

    private double addition(double a, double b){
        return a + b;
    }

    private double subtraction(double a, double b){
        return a - b;
    }

    private double multiplication(double a, double b){
        return a * b;
    }

    private double division(double a, double b){
        return a/b;
    }
}
