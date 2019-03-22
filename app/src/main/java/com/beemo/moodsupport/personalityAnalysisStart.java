package com.beemo.moodsupport;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class personalityAnalysisStart extends AppCompatActivity {
    private TextSwitcher textSwitcher;
    private Button finishbutton;
    //private RadioGroup rg;
    private int count =0;
    TextView t ;
    private String[] textArray = {"I see myself as extraverted, enthusiastic.","I see myself as critical, quarrelsome."
            ,"I see myself as dependable, self-disciplined.","I see myself as anxious, easily upset."
            ,"I see myself as open to new experiences, complex.","I see myself as reserved, quiet."
            ," I see myself as sympathetic, warm.","I see myself as disorganized, careless."
            ,"I see myself as calm, emotionally stable.","I see myself as conventional, uncreative.","a",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_analysis_start);
        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
        t= findViewById(R.id.counter2);
        //RadioGroup rg=(RadioGroup)findViewById(R.id.selectionRG);
        //RadioGroup = (RadioGroup) layout.findViewById(R.id.selectionRG);
        //.clearCheck();
        finishbutton = (Button) findViewById(R.id.Finish);
        finishbutton.setVisibility(View.GONE);
        textSwitcher.setCurrentText(textArray[count]);

        Animation textAnimationIn =  AnimationUtils.
                loadAnimation(this,   android.R.anim.slide_in_left);
        textAnimationIn.setDuration(800);

        Animation textAnimationOut =  AnimationUtils.
                loadAnimation(this,   android.R.anim.slide_out_right);
        textAnimationOut.setDuration(800);

        textSwitcher.setInAnimation(textAnimationIn);

        textSwitcher.setOutAnimation(textAnimationOut);
    }

    public void showNextText(View view){
        count++;
        if(count<10){
                textSwitcher.setText(textArray[count]);
                t.setText(Integer.toString(count+1));
        }else{
            finishbutton.setVisibility(View.VISIBLE);
        }
    }
    public void endpersonalitytest(View v) {
        Intent intent = new Intent(personalityAnalysisStart.this, PersonalityAnalysisEnd.class);
        startActivity(intent);
        //todo : finished
    }
}
