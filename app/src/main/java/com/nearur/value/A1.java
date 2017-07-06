package com.nearur.value;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.TextView;

public class A1 extends AppCompatActivity {
    EditText t;
    TextView re;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1);
        t=(EditText)findViewById(R.id.editTextA);
        re=(TextView)findViewById(R.id.textViewResult);
    }

    public void cl(View v){
            String s=t.getText().toString().trim();
            String[] ar=s.split(",");
            int[] c=new int[ar.length];
            int j=0;
            for(String x: ar){
                c[j++]= Integer.parseInt(x);
            }
            int sum=0;
            for(int i=0;i<c.length;i++){
                sum+=min(c[i]);
            }

            StringBuffer seq=new StringBuffer();
            for(int i=0;i<c.length;i++){
                if(c[i]>0){
                    seq.append("-1,");
                }
                else{
                    seq.append("1,");
                }
            }

            seq.replace(seq.length()-1,seq.length(),"");

            re.setText("Min Value: "+sum+"\nSequence is: { "+seq+" }");




    }

    public int min(int x){
        return ((x<0)?x:-x);
    }
}
