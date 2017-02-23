package GoogleTaskForce;

import GoogleTaskForce.BasicObjects.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ContextReader {
    List<int[]> inputList;
    private BufferedReader br;
    private FileReader fr;
    private Context context;

    public ContextReader(String inputFile, Context context){
        inputList = new ArrayList<>();

        try {
            fr = new FileReader(inputFile);
            br = new BufferedReader(fr);
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                inputList.add(toIntArray(currentLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.context = context;
        launchInit();
    }

    private int[] toIntArray(String line) {
        return Arrays.stream(line.split(" ")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }

    private void launchInit(){
        int nbVideos = inputList.get(0)[0];
        int nbEndPoints = inputList.get(0)[1];
        int nbRequests = inputList.get(0)[2];
        for(int i = 0; i < inputList.get(0)[3]; i++){
            context.addCache(new Cache(inputList.get(0)[4]));
        }
        // Add videos
        for(int i = 0; i < nbVideos; i++){
            context.addVideo(new Video(i, inputList.get(1)[i]));
        }

        // Create each endpoint
        int nbLineToPass = 2;
        for(int i = 0; i < nbEndPoints; i++){
            EndPoint endPoint = new EndPoint(inputList.get(nbLineToPass)[0]);
            // Create latency for each cache connected to an endpoint
            int nbCache = inputList.get(nbLineToPass)[1];
            for(int j = 0; j < nbCache; j++){
                nbLineToPass++;
                int latency = inputList.get(nbLineToPass)[1];
                Cache cache = context.getCacheById(inputList.get(nbLineToPass)[0]);
                endPoint.addCacheConnected(cache);
                context.addLatency(new Latency(endPoint, cache, latency));
            }
            nbLineToPass++;
            context.addEndPoint(endPoint);
        }

        // Create each request
        for(int i = 0; i < nbRequests; i++){
            int nbRequest = inputList.get(nbLineToPass)[2];
            Video video = context.getVideoById(inputList.get(nbLineToPass)[0]);
            context.addRequest(new Request(nbRequest, video), inputList.get(nbLineToPass)[1]);
        }
    }
}
