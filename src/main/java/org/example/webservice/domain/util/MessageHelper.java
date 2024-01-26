package org.example.webservice.domain.util;

import org.example.webservice.domain.User;

public abstract class MessageHelper {

    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }

}
