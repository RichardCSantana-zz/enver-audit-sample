package com.richardcsantana.model;

import com.richardcsantana.audit.UserRevisionListener;
import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by richardsantana on 24/03/16.
 */
@Entity
@RevisionEntity(UserRevisionListener.class)
@Data
public class UserRevEntity {

    @Id
    @GeneratedValue
    @RevisionNumber
    private Long id;

    private String username;
    
    @RevisionTimestamp
    private Date date;

}
