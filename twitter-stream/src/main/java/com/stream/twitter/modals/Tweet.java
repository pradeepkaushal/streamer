package com.stream.twitter.modals;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by pradeep.kaushal on 17/06/17.
 */

@Data
@Document
public class Tweet implements Serializable {
    @Id
    private String id;
    private String text;
    private Date tweetDate;
    private Date createdDate;
}
