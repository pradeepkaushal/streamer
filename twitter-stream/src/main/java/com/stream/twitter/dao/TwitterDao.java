package com.stream.twitter.dao;

import com.stream.twitter.modals.Tweet;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by pradeep.kaushal on 19/06/17.
 */
public interface TwitterDao extends MongoRepository<Tweet,String>{
}
