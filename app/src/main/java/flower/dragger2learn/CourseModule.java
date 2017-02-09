package flower.dragger2learn;

import dagger.Module;
import dagger.Provides;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午3:19
 */
@Module
public class CourseModule {
    @Provides
    Course provideCourse() {
        return new Course("Chinese");
    }
}
