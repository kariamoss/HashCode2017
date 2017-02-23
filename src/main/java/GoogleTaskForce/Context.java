package GoogleTaskForce;

import GoogleTaskForce.BasicObjects.*;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * This class handle the context of the simulation
 */
public class Context {
    List<EndPoint> endPoints;
    List<Cache> caches;
    List<Latency> latencies;


    public Context() {
        endPoints = new ArrayList<EndPoint>();
        caches = new ArrayList<Cache>();
        latencies = new ArrayList<Latency>();
    }

    public int nbCacheNotEmpty(){
        int i = 0;
        for (Cache cache : caches){
            if (cache.isEmpty()) {
                i++;
            }
        }
        return i;
    }

    public Cache getCacheById(int id){
        return caches.get(id);
    }

    public void addEndPoint(EndPoint endPoint){
        endPoints.add(endPoint);
    }

    public void addReqest(Request request,int endPointid){
        endPoints.get(endPointid).addRequest(request);
    }

    public void addCache(Cache cache){
        caches.add(cache);
    }

    public void addLatency(Latency latency){
        latencies.add(latency);
    }

    public Optional<EndPoint> getEndPoint(){
        for(EndPoint point : endPoints){
            if(point.operationPossible().isPresent())return Optional.of(point);
        }
        return Optional.empty();
    }


}