package flower.dragger2learn;

import dagger.Component;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午3:22
 */
@Component(modules = CourseModule.class)
public interface CourseComponent {
     Course course();
}
