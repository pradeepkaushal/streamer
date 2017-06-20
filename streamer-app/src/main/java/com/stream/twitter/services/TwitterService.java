package com.stream.twitter.services;

import com.stream.twitter.modals.Tweet;

/**
 * Created by pradeep.kaushal on 19/06/17.
 */
public interface TwitterService {
    void saveTweet(Tweet tweet);
}
