package com.example.quiz;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text;
     Question[] questions = new Question[5];
     int[] b1answers ;
     int[] b2answers;
     int[] b4answers;
     int[] b3answers;
     int trueanswers;
     int currentindex ;

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            text= findViewById(R.id.text);
            questions = new Question[]{
                    new Question(getString(R.string.question_Armenia), getString(R.string.answer_Armenia)),
                    new Question(getString(R.string.question_Japan), getString(R.string.answer_Japan)),
                    new Question(getString(R.string.question_Brazil), getString(R.string.answer_Brazil)),
                    new Question(getString(R.string.question_France), getString(R.string.answer_France)),
                    new Question(getString(R.string.question_India), getString(R.string.answer_India))
            };
            b1answers = new int[]{
                    R.string.wrong1Answer_Armenia,
                    R.string.answer_Japan,
                    R.string.wrong1Answer_Brazil,
                    R.string.answer_France,
                    R.string.wrong3Answer_India


            };
            b2answers = new int[]{
                    R.string.answer_Armenia,
                    R.string.wrong1Answer_Japan,
                    R.string.wrong3Answer_Brazil,
                    R.string.wrong2Answer_France,
                    R.string.wrong1Answer_India
            };
            b3answers = new int[]{
                    R.string.wrong2Answer_Armenia,
                    R.string.wrong2Answer_Japan,
                    R.string.answer_Brazil,
                    R.string.wrong3Answer_France,
                    R.string.wrong2Answer_India
            };
            b4answers = new int[]{
                    R.string.wrong3Answer_Armenia,
                    R.string.wrong3Answer_Japan,
                    R.string.wrong2Answer_Brazil,
                    R.string.wrong1Answer_France,
                    R.string.answer_India


            };
            currentindex =0;
            trueanswers  = 0;
            Button a1 = findViewById(R.id.b1);
            Button a2 = findViewById(R.id.b2);
            Button a3 = findViewById(R.id.b3);
            Button a4 = findViewById(R.id.b4);
            String question = questions[currentindex].getQuestion();
            text.setText(question);
            a1.setText(b1answers[currentindex]);
            a2.setText(b2answers[currentindex]);
            a3.setText(b3answers[currentindex]);
            a4.setText(b4answers[currentindex]);
            a1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a1.getText().equals(questions[currentindex].getAnswer())){
                        trueanswers+=1;
                        currentindex+=1;
                    }
                    else {
                        currentindex += 1;
                    }

                    if(currentindex == questions.length){

                        a1.setVisibility(a1.GONE);
                        a2.setVisibility(a2.GONE);
                        a3.setVisibility(a3.GONE);
                        a4.setVisibility(a4.GONE);
                        text.setText(trueanswers+"/5");
                    }
                    else{

                        Question question = questions[0];
                        text.setText(question.getQuestion());
                        updateQuestion();
                        a1.setText(b1answers[currentindex]);
                        a2.setText(b2answers[currentindex]);
                        a3.setText(b3answers[currentindex]);
                        a4.setText(b4answers[currentindex]);
                    }
                }
            });
            a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a2.getText().equals(questions[currentindex].getAnswer())){
                        trueanswers+=1;
                        currentindex+=1;
                    }
                    else {

                        currentindex += 1;
                    }

                    if(currentindex == questions.length){

                        a1.setVisibility(a1.GONE);
                        a2.setVisibility(a2.GONE);
                        a3.setVisibility(a3.GONE);
                        a4.setVisibility(a4.GONE);
                        text.setText(trueanswers+"/5");
                    }
                    else{
                        Question question = questions[0];
                        text.setText(question.getQuestion());
                        updateQuestion();
                        a1.setText(b1answers[currentindex]);
                        a2.setText(b2answers[currentindex]);
                        a3.setText(b3answers[currentindex]);
                        a4.setText(b4answers[currentindex]);
                    }
                }
            });
            a3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a3.getText().equals(questions[currentindex].getAnswer())){
                        trueanswers+=1;

                        currentindex+=1;
                    }
                    else {

                        currentindex += 1;
                    }
                    if(currentindex == questions.length){

                        a1.setVisibility(a1.GONE);
                        a2.setVisibility(a2.GONE);
                        a3.setVisibility(a3.GONE);
                        a4.setVisibility(a4.GONE);
                        text.setText(trueanswers+"/5");
                    }
                    else{
                        Question question = questions[0];
                        text.setText(question.getQuestion());
                        updateQuestion();
                        a1.setText(b1answers[currentindex]);
                        a2.setText(b2answers[currentindex]);
                        a3.setText(b3answers[currentindex]);
                        a4.setText(b4answers[currentindex]);
                    }
                }
            });
            a4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(a4.getText().equals(questions[currentindex].getAnswer())){
                        trueanswers+=1;

                        currentindex+=1;
                    }
                    else {

                        currentindex += 1;
                    }
                    if(currentindex == questions.length){
                        a1.setVisibility(a1.GONE);
                        a2.setVisibility(a2.GONE);
                        a3.setVisibility(a3.GONE);
                        a4.setVisibility(a4.GONE);
                        text.setText(trueanswers+"/5");
                    }
                    else{
                        Question question = questions[0];
                        text.setText(question.getQuestion());
                        updateQuestion();
                        a1.setText(b1answers[currentindex]);
                        a2.setText(b2answers[currentindex]);
                        a3.setText(b3answers[currentindex]);
                        a4.setText(b4answers[currentindex]);
                    }
                }
            });

            return insets;
        });
    }
    private void updateQuestion(){
            String question = questions[currentindex].getQuestion();
            text.setText(question);
    }
}