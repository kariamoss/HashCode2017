package GoogleTaskForce;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class Request {
    int nbRequest;
    Video video;
    EndPoint endPoint;

    public Request(int nbRequest, Video video, EndPoint endPoint) {
        this.nbRequest = nbRequest;
        this.video = video;
        this.endPoint = endPoint;
    }
}
