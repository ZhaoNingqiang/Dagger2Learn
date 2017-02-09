package flower.dragger2learn;

import javax.inject.Inject;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/9/下午3:03
 */

public class Teacher {
    private String name;


    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

