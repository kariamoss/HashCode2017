package GoogleTaskForce.BasicObjects;

import java.util.Map;
import java.util.Objects;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class Video {
    int size;
    int id;

    public Video(int id, int size) {
        this.id = id;
        this.size = size;
    }

    public boolean equals(Object video){
        return video instanceof Video &&
                ((Video) video).size == this.size &&
                ((Video) video).id == this.id;
    }

    public int hashCode(){
        return size;
    }
}
