package FitHits;

import FitHits.Artist;
import FitHits.EchoNestAPI;
import FitHits.EchoNestException;
import java.util.List;

public class SimilarArtists {

    public static void main(String[] args) throws EchoNestException {
        EchoNestAPI echoNest = new EchoNestAPI();
        echoNest.setTraceSends(true);
        List<Artist> artists = echoNest.searchArtists("Weezer");

        if (artists.size() > 0) {
            Artist weezer = artists.get(0);
            System.out.println("Similar artists for " + weezer.getName());
            for (Artist simArtist : weezer.getSimilar(10)) {
                System.out.println("   " + simArtist.getName());
            }
        }
    }
}	