package info.bijon.subujbangla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    Button btn1,btn2;
    TextView tv;
    ImageView img;

    String[] letter ={"A","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int i=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        tv = (TextView) findViewById(R.id.textView);
        img=(ImageView) findViewById(R.id.imageView);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(i==26){
                    i=0;
                }
               tv.setText(letter[i]+i+"");
                i=i+1;
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=i-1;
                if(i==0){

                    tv.setText(letter[i]+i+"");
                    i=26;
                }
                tv.setText(letter[i]+i+"");

            }
        });

    }

}
