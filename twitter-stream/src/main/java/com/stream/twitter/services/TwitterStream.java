package com.stream.twitter.services;


import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Created by pradeep.kaushal on 14/06/17.
 */
public class TwitterStream {
    public static void main(String[] args) {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("9yUScAJ83ibPjrqh4MryxR5Ti");
        cb.setOAuthConsumerSecret("Q9iYclUXWiKdVzFbW27biD4Qa3fhTLVMm6fD4GkrkDpArGKv5P");
        cb.setOAuthAccessToken("56950206-hvnbZtglDkeS66f2hwdgHsrUgsEyDXpBH02y91c69");
        cb.setOAuthAccessTokenSecret("8tCOKbUTXfC5vRMzglaaYVeK9h0m1np7GU4FiA1SPBYUm");


        twitter4j.TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();


        StatusListener listener = new StatusListener() {
            @Override
            public void onStatus(Status status) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }

            @Override
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            @Override
            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
            }

            @Override
            public void onScrubGeo(long userId, long upToStatusId) {
                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            @Override
            public void onStallWarning(StallWarning warning) {
                System.out.println("Got stall warning:" + warning);
            }

            @Override
            public void onException(Exception ex) {
                ex.printStackTrace();
            }
        };

        twitterStream.addListener(listener);
        twitterStream.filter("karnataka");
        twitterStream.sample();

    }


}



