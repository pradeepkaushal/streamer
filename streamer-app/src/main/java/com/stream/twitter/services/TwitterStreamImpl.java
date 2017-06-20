package com.stream.twitter.services;


import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by pradeep.kaushal on 14/06/17.
 */

public final class TwitterStreamImpl {


    private String O_AUTH_CONSUMER_KEY = "9yUScAJ83ibPjrqh4MryxR5Ti";
    private String O_AUTH_CONSUMER_SECRET = "Q9iYclUXWiKdVzFbW27biD4Qa3fhTLVMm6fD4GkrkDpArGKv5P";
    private String O_AUTH_ACCESS_TOKEN = "56950206-hvnbZtglDkeS66f2hwdgHsrUgsEyDXpBH02y91c69";
    private String O_AUTH_ACCESS_TOKEN_SECRET = "8tCOKbUTXfC5vRMzglaaYVeK9h0m1np7GU4FiA1SPBYUm";

    public TwitterStreamImpl(String oAuthConsumerKey, String oAuthConsumerSecret, String oAuthAccessToken, String oAuthAccessTokenSecret) {
        this.O_AUTH_CONSUMER_KEY = oAuthConsumerKey;
        this.O_AUTH_CONSUMER_SECRET = oAuthConsumerSecret;
        this.O_AUTH_ACCESS_TOKEN = oAuthAccessToken;
        this.O_AUTH_ACCESS_TOKEN_SECRET = oAuthAccessTokenSecret;
    }

    public TwitterStreamImpl() {

    }


    public void streamTweets() {

        ConfigurationBuilder cb = prepareConfigurationBuilder();

        twitter4j.TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();

        StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                //System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                //System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {
                //System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            @Override
            public void onStallWarning(StallWarning warning) {
                //System.out.println("Got stall warning:" + warning);
            }

            @Override
            public void onException(Exception ex) {
                ex.printStackTrace();
            }
        };

        twitterStream.addListener(listener);
        twitterStream.filter("karnataka");
        FilterQuery filterQuery = new FilterQuery();
        double[][] location = new double[2][];
        double[] location1 = {6.75, 35.99};
        double[] location2 = {68.17, 97.4};
        location[0] = location1;
        location[1] = location2;
        filterQuery.locations(location);
        twitterStream.sample();

    }

    ConfigurationBuilder prepareConfigurationBuilder() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey(O_AUTH_CONSUMER_KEY);
        cb.setOAuthConsumerSecret(O_AUTH_CONSUMER_SECRET);
        cb.setOAuthAccessToken(O_AUTH_ACCESS_TOKEN);
        cb.setOAuthAccessTokenSecret(O_AUTH_ACCESS_TOKEN_SECRET);
        return cb;
    }

    public static void main(String[] args) {
        new TwitterStreamImpl().streamTweets();
    }

}



