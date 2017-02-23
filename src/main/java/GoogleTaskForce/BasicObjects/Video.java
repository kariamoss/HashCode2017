package GoogleTaskForce.BasicObjects;

import java.util.Map;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class Video {
    int size;
    int id;
    private Map<EndPoint,Integer> requests;

    public Video(int id, int size) {
        this.id = id;
        this.size = size;
    }
}
