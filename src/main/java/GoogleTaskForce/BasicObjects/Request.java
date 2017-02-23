package GoogleTaskForce.BasicObjects;

/**
 * Created by Jehan on 23/02/2017, 19:08.
 */
public class Request {
    int nbRequest;
    Video video;

    public Request(int nbRequest, Video video) {
        this.nbRequest = nbRequest;
        this.video = video;
    }

    public int getVideoSize(){
        return video.size;
    }

    public int getNbRequest(){ return nbRequest; }

    public Video getVideo(){
        return video;
    }
}
