package nihar.amisha.rahul.srushati.loginretorofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class student_dashboard extends AppCompatActivity implements View.OnClickListener {

    public CardView javacard,ccard,pythoncard,cplusplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);

        javacard = (CardView) findViewById(R.id.javacardview);
        ccard = (CardView) findViewById(R.id.ccardview);
        pythoncard = (CardView) findViewById(R.id.pythoncardview);
        cplusplus = (CardView) findViewById(R.id.cpluspluscardview);

        javacard.setOnClickListener(this);
        ccard.setOnClickListener(this);
        pythoncard.setOnClickListener(this);
        cplusplus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i,j,k,l;

        switch (v.getId()) {
            case R.id.javacardview:
                i= new Intent(this,QuestionList.class);
                startActivity(i);
                Toast.makeText(this, "java", Toast.LENGTH_SHORT).show();
                break;

            case R.id.ccardview:
                j = new Intent(this,QuestionList.class);
                startActivity(j);
                Toast.makeText(this, "C Programming", Toast.LENGTH_SHORT).show();
                break;

            case R.id.pythoncardview:
                k = new Intent(this,QuestionList.class);
                startActivity(k);
                Toast.makeText(this, "Python", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cpluspluscardview:
                l = new Intent(this,QuestionList.class);
                Toast.makeText(this, "C++ Language", Toast.LENGTH_SHORT).show();
                startActivity(l);
                break;
        }

    }
}