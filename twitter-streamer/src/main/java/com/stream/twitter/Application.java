package com.stream.twitter;

import com.stream.twitter.services.TwitterStreamImpl;

public class Application {

    public static void main(String[] args) {
new TwitterStreamImpl().streamTweets();
    }

}
