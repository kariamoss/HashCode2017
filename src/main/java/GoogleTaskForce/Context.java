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
    List<Request> requests;
    List<Cache> caches;
    List<Latency> latencies;


    public Context() {
        endPoints = new ArrayList<EndPoint>();
        requests = new ArrayList<Request>();
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

    public void addEndPoint(EndPoint endPoint){
        endPoints.add(endPoint);
    }

    public void addReqest(Request request){
        requests.add(request);
    }

    public void addCache(Cache cache){
        caches.add(cache);
    }

    public void addLatency(Latency latency){
        latencies.add(latency);
    }
}