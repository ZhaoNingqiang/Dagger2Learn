package flower.dragger2learn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Teacher teacher;

    @Inject
    Course course;

    //@Inject 不能 注入来
    //Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CourseComponent courseComponent = DaggerCourseComponent.builder().courseModule(new CourseModule()).build();
        TeacherComponent teacherComponent = DaggerTeacherComponent.builder().courseComponent(courseComponent).teacherModule(new TeacherModule()).build();
        teacherComponent.inject(this);

        TextView teacher_name = ((TextView)findViewById(R.id.teacher_name));
        teacher_name.setText(teacher.getName());
        TextView course_name = ((TextView)findViewById(R.id.course_name));
        course_name.setText(course.getName());

    }

    public void startStudent(View view){
        startActivity(new Intent(this,StudentActivity.class));
    }
}
