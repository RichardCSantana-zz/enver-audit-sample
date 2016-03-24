package com.richardcsantana.audit;

import com.richardcsantana.model.UserRevEntity;
import org.hibernate.envers.RevisionListener;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created by richardsantana on 24/03/16.
 */
public class UserRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revision) {
        UserRevEntity example = (UserRevEntity) revision;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null && authentication.isAuthenticated()) {
            example.setUsername(((User) authentication.getPrincipal()).getUsername());
        }

    }

}
