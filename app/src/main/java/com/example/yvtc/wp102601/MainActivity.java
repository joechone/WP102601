package com.example.yvtc.wp102601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
    TextView tv2 ;
    TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =(Spinner)findViewById(R.id.spinner);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            //
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                TextView t =(TextView)view;
                tv2.setText("下拉選的："+t.getText().toString()+"，第"+position+"個");
                String[] arr = getResources().getStringArray(R.array.fruits);
                tv3.setText("陣列取直："+arr[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void click1(View v)
    {
        EditText ed= (EditText)findViewById(R.id.editText);
        String str =ed.getText().toString();
        Log.d("editText",str);


        TextView t =(TextView)spinner.getSelectedView();
        tv2.setText("按鈕案的："+t.getText().toString()+"，第"+spinner.getSelectedItemPosition()+"個");
        String[] arr = getResources().getStringArray(R.array.fruits);
        tv3.setText("陣列取直："+arr[spinner.getSelectedItemPosition()]);
    }
}
