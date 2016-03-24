package com.richardcsantana.model;

import com.richardcsantana.audit.UserRevisionListener;
import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;

/**
 * Created by richardsantana on 24/03/16.
 */
@Entity
@RevisionEntity(UserRevisionListener.class)
@Data
public class UserRevEntity extends DefaultRevisionEntity {

    private String username;

}
