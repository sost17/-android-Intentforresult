package com.col.commo.intent2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by commo on 2017/3/21.
 */

public class SecondActivity extends Activity {

    private EditText editText;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        editText = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView3);
        button = (Button) findViewById(R.id.button2);

        Intent getintent = getIntent();
//        Bundle bundle = getintent.getExtras();
        Bundle bundle = getintent.getBundleExtra("bundle");

        String mess = bundle.getString("mess");
        String mes_t = bundle.getString("mes_t");


        textView.setText(mess);
        editText.setText(mes_t);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =  new Intent();
                String message = editText.getText().toString();
                intent.putExtra("mes",message);
                setResult(10,intent);
                finish();
            }
        });
    }
}
