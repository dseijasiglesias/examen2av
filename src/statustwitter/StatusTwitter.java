package statustwitter;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("ggMDRpQngjGJgUGNjnsR39PpPRyl")
                .setOAuthConsumerSecret("a1Uj5bKnisbjvnJN3OYUBH78BAYO9BN8A8Z4yMSj9MKsElkaN")
                .setOAuthAccessToken("154877482-XrH4VUE0GejsibosAF3Ra8942bWmdI0adyVD1hR5v")
                .setOAuthAccessTokenSecret("uL67zpwpMQ1MalbunabupbpOBGASObaovYUbaoygBBtaPbFhDMqQuSh");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        
        Query query = new Query("#Cangas");
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ": " + status.getText());
        }
    }
}
