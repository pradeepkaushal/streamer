package com.stream.twitter.services.impl;

import com.stream.twitter.dao.TwitterDao;
import com.stream.twitter.modals.Tweet;
import com.stream.twitter.services.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by pradeep.kaushal on 19/06/17.
 */
@Service
public class TwitterServiceImpl implements TwitterService {
    @Autowired
    private TwitterDao twitterDao;

    public void saveTweet(Tweet tweet){
        twitterDao.save(tweet);
    }
}
