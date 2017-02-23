package GoogleTaskForce.algo;

import GoogleTaskForce.BasicObjects.Cache;
import GoogleTaskForce.BasicObjects.EndPoint;
import GoogleTaskForce.BasicObjects.Video;
import GoogleTaskForce.Context;

import java.util.Optional;

public class basicStrat implements Strat {


    public void execute(Context context){
        Optional<EndPoint> point = context.getEndPoint();
        while(point.isPresent()){
            Optional<Video> vid = context.getVideoToPlace(point.get());
            while(vid.isPresent()){
                Cache cache = point.get().closestCache(vid.get());
                cache.putVideo(vid.get());
                vid = context.getVideoToPlace(point.get());
            }
            point = context.getEndPoint();
        }
    }
}
