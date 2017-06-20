package com.stream.twitter.services;

import org.junit.Test;

/**
 * Created by pradeep.kaushal on 15/06/17.
 */
public class TwitterStreamImplTest {
    @Test
    public void streamTweets() throws Exception {
        TwitterStreamImpl twitterStream = new TwitterStreamImpl();
        twitterStream.streamTweets();
    }

}