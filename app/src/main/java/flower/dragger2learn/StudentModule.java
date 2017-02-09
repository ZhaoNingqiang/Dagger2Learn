package flower.dragger2learn;

import dagger.Module;
import dagger.Provides;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午5:51
 */
@Module
public class StudentModule {
    @Provides
    public Student providerStudent(){
       return new Student("LiMing","123");
    }
}
