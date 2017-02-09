package flower.dragger2learn;

import dagger.Component;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午5:53
 */

@Component(modules = StudentModule.class)
public interface StudentComponent {
    void inject(StudentActivity studentActivity);
}
