package GoogleTaskForce.BasicObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class EndPoint {
    List<Cache> cacheConnected;
    private List<Request> requests;
    int dataCenterLatency;

    public EndPoint(int dataCenterLatency) {
        cacheConnected = new ArrayList<>();
        this.dataCenterLatency = dataCenterLatency;
        requests = new ArrayList<>();
    }

    public void addCacheConnected(Cache cache){
        cacheConnected.add(cache);
    }

    public boolean isConnectedToCache(){
        return cacheConnected.isEmpty();
    }

    public List<Cache> getCacheConnected() {
        return cacheConnected;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public int getDataCenterLatency() {
        return dataCenterLatency;
    }

    public void addRequest(Request req){
        requests.add(req);
    }

    /**
     * Regarde si une vidéo peut être placée dans un cache
     * @return
     */
    public Optional<Video> operationPossible(){
        for(Request req : requests){
            if(isRequestSat(req)) continue;
            for(Cache cache : cacheConnected){
                if(cache.requestFit(req)) return Optional.of(req.getVideo());
            }
        }
        return Optional.empty();
    }

    public boolean isRequestSat(Request req){
        for(Cache cache : cacheConnected){
            if(cache.hasVideo(req.getVideo()))return true;
        }
        return false;
    }

    public Cache closestCache(Video video){
        List<Cache> fittingCache = fittingCache(video);
        //deal with latency later
        return fittingCache.get(0);
    }

    public List<Cache> fittingCache(Video video){
        List<Cache> caches = new ArrayList<>();
        for(Cache cache : this.cacheConnected){
            if(cache.videoFit(video)) caches.add(cache);
        }
        return caches;
    }






}
