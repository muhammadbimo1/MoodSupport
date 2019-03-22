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

public class DASSTest extends AppCompatActivity {
    private TextSwitcher textSwitcher;
    private Button finishbutton;
    //private RadioGroup rg;
    TextView t ;
    private int count =0;
    private String[] textArray = {"I found it hard to wind down","I was aware of dryness of my mouth","I couldn’t seem to experience any positive feeling at all","I experienced breathing difficulty","I found it difficult to work up the initiative to do things","I tended to over-react to situations","I experienced trembling (e.g. in the hands)","I felt that I was using a lot of nervous energy","I was worried about situations in which I might panic and make a fool of myself.","I felt that I had nothing to look forward to","I found myself getting agitated","I found it difficult to relax ","I felt down-hearted and blue","I was intolerant of anything that kept me from getting on with what I was doing","I felt I was close to panic","I was unable to become enthusiastic about anything","I felt I wasn’t worth much as a person","I felt that I was rather touchy","I was aware of the action of my heart in the absence of physical exertion (e.g. sense of heart rate increase, heart missing a beat)","I felt scared without any good reason ","I felt that life was meaningless"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasstest);
        t= findViewById(R.id.counter);
        textSwitcher = (TextSwitcher) findViewById(R.id.textSwitcher);
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
        if(count<textArray.length){
            textSwitcher.setText(textArray[count]);
            t.setText(Integer.toString(count+1));
        }
        else{
            finishbutton.setVisibility(View.VISIBLE);
        }
    }
    public void endDassTest(View v) {
        Intent intent = new Intent(DASSTest.this, ContactNetwork.class);
        startActivity(intent);
        //todo : finished
    }
}
