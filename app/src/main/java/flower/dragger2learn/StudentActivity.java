package flower.dragger2learn;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import flower.dragger2learn.databinding.ActivityStudentBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午5:56
 */

public class StudentActivity extends AppCompatActivity {
    @Inject
    Student student;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStudentBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_student);
        StudentComponent studentComponent = DaggerStudentComponent.builder().studentModule(new StudentModule()).build();
        studentComponent.inject(this);

        binding.setStudent(student);
    }
}
