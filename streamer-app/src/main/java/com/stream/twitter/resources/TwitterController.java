package com.stream.twitter.resources;

import com.stream.twitter.modals.Tweet;
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

    @PostMapping("/")
    public Tweet saveTweet(@RequestBody Tweet tweet) {
        System.out.println("IN twitter");
        return new Tweet();

    }
}
