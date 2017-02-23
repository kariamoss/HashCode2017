package GoogleTaskForce;

import GoogleTaskForce.BasicObjects.EndPoint;
import GoogleTaskForce.BasicObjects.Latency;
import GoogleTaskForce.BasicObjects.Request;
import GoogleTaskForce.BasicObjects.Video;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * This class handle the context of the simulation
 */
public class Context {
    List<EndPoint> endPoints;
    List<Request> requests;
    List<Video> videos;
    List<Latency> latencies;


    public Context() {
        endPoints = new ArrayList<EndPoint>();
        requests = new ArrayList<Request>();
        videos = new ArrayList<Video>();
        latencies = new ArrayList<Latency>();
    }

    public void addEndPoint(EndPoint endPoint){
        endPoints.add(endPoint);
    }

    public void addReqest(Request request){
        requests.add(request);
    }

    public void addVideo(Video video){
        videos.add(video);
    }

    public void addLatency(Latency latency){
        latencies.add(latency);
    }
}