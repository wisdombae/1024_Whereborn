package com.bjh.www.a1024_whereborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWidget(View view) {
        int id = view.getId();
        String text = ((Button)view).getText().toString();
        TextView textView = (TextView)findViewById(R.id.birthplace);

        switch (id) {
            case R.id.button1:
                textView.setText(text);
                break;
            case R.id.button2:
                textView.setText(text);
                break;
            case R.id.button3:
                textView.setText(text);
                break;
            case R.id.button4:
                textView.setText(text);
                break;
            case R.id.button5:
                textView.setText(text);
                break;
            case R.id.button6:
                textView.setText(text);
                break;
             default:
        }
    }
}
