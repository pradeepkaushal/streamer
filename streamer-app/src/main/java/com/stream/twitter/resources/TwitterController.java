package com.stream.twitter.resources;

import com.stream.twitter.dao.TwitterDao;
import com.stream.twitter.modals.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pradeep.kaushal on 19/06/17.
 */
@RestController
@RequestMapping("/v0/tweet")
public class TwitterController {


    @Autowired
    private TwitterDao twitterDao;

    @PostMapping("/")
    public Tweet saveTweet(@RequestBody Tweet tweet) {
        return twitterDao.save(tweet);
    }
}
