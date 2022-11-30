package nihar.amisha.rahul.srushati.loginretorofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class QuestionList extends AppCompatActivity {

    ListView listView;
    Animation animation;
    String[] subject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_list);


        listView=findViewById(R.id.quesListview);
        subject=getResources().getStringArray(R.array.subject);
        MainAdapter adapter=new MainAdapter(QuestionList.this,subject);
        animation= AnimationUtils.loadAnimation(this,R.anim.animation1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),""+subject[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}