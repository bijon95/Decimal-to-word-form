package info.bijon.subujbangla;


import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;


public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    Button btn;
    EditText et;
    private  TextToSpeech toSpeech ;
    String fs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button1);
        et = (EditText) findViewById(R.id.editText);

        toSpeech =new TextToSpeech(this,this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s = et.getText().toString();

                toSpeech.speak(s,TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });

    }

    @Override
    public void onInit(int status) {
        Log.d("Speech", "OnInit - Status ["+status+"]");

        if (status == TextToSpeech.SUCCESS) {
            Log.d("Speech", "Success!");
            toSpeech.setLanguage(Locale.CANADA);
        }
    }
}

    /*
       Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
      sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
       sendIntent.setType("text/plain");

        startActivity(sendIntent);



        Intent i = new Intent();
        i.setAction(Intent.ACTION_CALL);
        i.setData(Uri.parse("tel:+8801742976896"));
        startActivity(i);


        Intent yt = new Intent();
        yt.setAction(Intent.ACTION_VIEW);
        yt.setData(Uri.parse("vnd.youtube//"+"hgE7G6MI6_g"));
        startActivity(yt);


        Intent map = new Intent();
        map.setAction(Intent.ACTION_VIEW);
        map.setData(Uri.parse("geo:24.900422, 91.853460"));
        map.setPackage("com.google.android.apps.maps");
        startActivity(map);

        */





