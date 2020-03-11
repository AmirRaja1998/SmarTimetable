package com.crissalex.smarttimetable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText editTextName, editTextCourse;
    Button buttonAdd ;
    DatabaseReference databaseTeachers;
    DatabaseReference databaseCourses;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseTeachers = FirebaseDatabase.getInstance().getReference("teachers");
        databaseTeachers = FirebaseDatabase.getInstance().getReference("courses");

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonAdd= (Button) findViewById(R.id.buttonAddTeachers);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTeachers();

            }
        });

        buttonAdd= (Button) findViewById(R.id.buttonAddCourses);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();

            }
        });

    }
    private void addTeachers(){
        String name = editTextName.getText().toString().trim();
        if(!TextUtils.isEmpty(name)){

           String id =  databaseTeachers.push().getKey();
           Teacher teacher = new Teacher(id , name);
           databaseTeachers.child(id).setValue(teacher);
           Toast.makeText(this , "Teacher added", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "You Should enter a name" , Toast.LENGTH_LONG).show();
        }
    }
}
//For Courses //

}
    private void addCourses(){
        String name = editTextName.getText().toString().trim();
        if(!TextUtils.isEmpty(name)){

            String id =  databaseCourses.push().getKey();
            Courses courses = new Courses(id , name);
            databaseCourses.child(id).setValue(courses);
            Toast.makeText(this , "Courses added", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "You Should enter a name" , Toast.LENGTH_LONG).show();
        }
    }
}