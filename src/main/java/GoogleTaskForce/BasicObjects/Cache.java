package GoogleTaskForce.BasicObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jehan on 23/02/2017, 19:09.
 */
public class Cache {
    int size;
    List<Video> videos;

    public Cache(int size) {
        this.size = size;
        videos = new ArrayList<Video>();
    }

    public void addVideo(Video video){
        videos.add(video);
    }

    public boolean isEmpty(){
        return videos.isEmpty();
    }

    @Override
    public String toString(){
        String res = "";
        for(Video video : videos){
            res += " " + video.id ;
        }
        return res;
    }

    public int spaceLeft(){
        int actSize = size;
        for(Video vid :videos){
            actSize -= vid.size;
        }
        return actSize;
    }

    public boolean requestFit(Request request){
        int size = request.getVideoSize();
        return spaceLeft()>size;
    }
}
