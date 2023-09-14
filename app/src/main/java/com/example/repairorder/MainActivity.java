package com.example.repairorder;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener submitListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            orderTypeStr = orderType.getText().toString();
            technicianFlt = Float.valueOf(technician.getText().toString());
            inspectionFlt = Float.valueOf(inspection.getText().toString());
            paintFlt = Float.valueOf(paint.getText().toString());
            partsFlt = Float.valueOf(parts.getText().toString());
            laborFlt = Float.valueOf(labor.getText().toString());
            double sub = technicianFlt + inspectionFlt + paintFlt + partsFlt + laborFlt;
            double taxval = sub * 0.07;
            double tot = sub + taxval;
            subtotal.setText("$" + String.valueOf(sub));
            tax.setText("$" + String.valueOf(taxval));
            total.setText("$" + String.valueOf(tot));

        }
    };

    Button submitButton;
    EditText orderType;
    EditText technician;
    EditText inspection;
    EditText paint;
    EditText parts;
    EditText labor;
    TextView subtotal;
    TextView tax;
    TextView total;

    String orderTypeStr;
    Float technicianFlt;
    Float inspectionFlt;
    Float paintFlt;
    Float partsFlt;
    Float laborFlt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.submitbutton);
        orderType = findViewById(R.id.ordertypetext);
        technician = findViewById(R.id.techniciantext);
        inspection = findViewById(R.id.inspectiontext);
        paint = findViewById(R.id.painttext);
        parts = findViewById(R.id.partstext);
        labor = findViewById(R.id.labortext);
        subtotal = findViewById(R.id.subtotaltext);
        tax = findViewById(R.id.taxtext);
        total = findViewById(R.id.totaltext);

        submitButton.setOnClickListener(submitListener);
    }
}