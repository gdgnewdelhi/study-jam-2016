package com.example.sachin.scorecounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by SACHIN on 09-04-2016.
 */
public class TotalScore extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null)
            onRestoreInstanceState(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.totalscore);
      /*  Intent iin= getIntent();
        Bundle b = iin.getExtras();
        TextView score=(TextView)findViewById(R.id.textView5);
        TextView wkt=(TextView)findViewById(R.id.wk);
        TextView extra=(TextView)findViewById(R.id.extra);
        TextView over=(TextView)findViewById(R.id.textView6);
        if(b!=null)
        {
            String j =(String) b.get("wkt");
           /* String k =(String) b.get("wide");
            String l =(String) b.get("no");
            String m =(String) b.get("run");
            String o =(String) b.get("over");
            score.setText(""+m);

            extra.setText(""+l+k);
            over.setText(""+o);
            wkt.setText(""+j);

        }
        }
    public void button(View v)
    {
        finish();
    }*/
    }
}
