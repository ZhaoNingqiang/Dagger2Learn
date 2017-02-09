package flower.dragger2learn;

import dagger.Component;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午3:01
 */
@Component(dependencies = CourseComponent.class , modules = TeacherModule.class)
public interface TeacherComponent {
    void inject(MainActivity mainActivity);
}
