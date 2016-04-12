package winston.excercise_weekendgrade;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    EditText editGrade;
    Button btnG;
    Button btnPF;
    Button btn5;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btnG.setOnClickListener(this);
       btnPF.setOnClickListener(this);
       btn5.setOnClickListener(this);

       textView = (TextView) findViewById(R.id.textView);
       editGrade = (EditText) findViewById(R.id.editGrade);

       btnG = (Button)findViewById(R.id.btnGrade);
       btnPF = (Button)findViewById(R.id.btnPassFail);
       btn5 = (Button)findViewById(R.id.btn5Times);
    }



        //View.OnClickListener displayGrade = new View.OnClickListener() {
           // @Override
            public void onClick(View v) {
                float grade;

                grade = Float.parseFloat(textView.getText().toString()); //overheard parse was the way to go. need to research more.
                //Toast.makeText(MainActivity.this, "You clicked Grade!", Toast.LENGTH_SHORT).show();
                //textView.setText(editGrade.getText());
                //textView.setTextColor(Color.BLACK);

                //String gradeOut = "";

                //Scanner in = new Scanner(System.in); //attempted to take userInput, turns out already built-in function?
                //gradeIn = in.nextInt();
                if(grade > 100 || grade < 0) {
                    Toast.makeText(MainActivity.this, "Invalid Number.", Toast.LENGTH_SHORT).show();
                } else {
                    switch (v.getId()) {                                //becoming fed up with my code. With Aaron's help tried to setup like his...
                        case R.id.btnGrade:
                                textView.setText(GradeInput(grade));
                                break;
                            case R.id.btnPassFail:
                                textView.setText(passFailed(grade));
                                break;
                            case R.id.btn5Times:
                                textView.setText(xFive(grade));

                        }

                //textView = (TextView) findViewById(R.id.textView);
                public static String GradeInput (float grade) {
                    switch ((grade +1) / 100) {
                        case 10:
                            textView.setText("A");
                            textView.setTextColor(Color.GREEN);
                            break;
                        case 9:
                            textView.setText("B");
                            textView.setTextColor(Color.GREEN);
                            break;
                        case 8:
                            textView.setText("C");
                            textView.setTextColor(Color.GREEN);
                            break;
                        case 7:
                            textView.setText("D");
                            textView.setTextColor(Color.GREEN);
                            break;
                        case 6: case 5:
                        case 4: case 3:
                        case 2: case 1:
                            textView.setText("F");
                            textView.setTextColor(Color.RED);
                            break;
                        default:
                            if(grade > 100 || grade < 0){
                                Toast.makeText(MainActivity.this,"Invalid Number.",Toast.LENGTH_SHORT).show();
                            }
                            //public static void main(String[]args){ //uncommenting this line clears up all following errors. WHY? ~W
                            //if(gradeIn>100||gradeIn<0)
                            //Toast.makeText(MainActivity.this,"Invalid Number.",Toast.LENGTH_SHORT).show();
                            //else
                            //return gradeIn; //= ("Input new grade.");
                            break;
                    }
                //System.out.println("Please input a valid grade 0-100.");
                //return GradeInput; //attempted to call back to start of method, fail.
            }

        }
                public static String passFailed(float grade){           //becoming fed up with my code. With Aaron's help tried to setup like his...
                    if(grade>=65){
                        return "Pass";
                    }
                    else
                        return "Fail";
                }

                public static String xfive(float grade){                //guess my switch GradeInput isn't compatible with his code...
                    String c ="";
                    int typeGrade = (int)grade;

                    for(int i = 0; i < 5; i++){
                        c+="   "+Integer.toString(typeGrade);
                    }
                    return c;
                }

            };

 /*
(1) EDITTEXT for input
(1) TEXTVIEW for output,
Three buttons:
    (1) BUTTON that shows a letter grade in the output TEXTVIEW:
            JAVA; A > 90, B > 80, C > 70, D > 60, F < 60.

    (1) BUTTON that shows "Pass" or "Fail" in the output TEXTVIEW.
            JAVA: Passing is at least 65.

    (1) BUTTON that prints the given number 5 times in the output TEXTVIEW.
        Example: If the given input is 43, the expected output is 43 43 43 43 43.
(1) TOAST:
    If "gradeIn > 100 || gradeIn < 0"; "Invalid" in the output TEXTVIEW.

Bonus
For all of the buttons, make it so the color of the output TextView is green or red,
    depending on if the given score if passing or failing, respectively.

Starter Code
In the main FunctionActivity, it includes a method called convertToInteger. It works as follows:
```java int number = convertToInteger("40"); // number now equals 40 ```
  */