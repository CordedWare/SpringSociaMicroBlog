package org.example.webservice.service;

import org.example.webservice.domain.User;
import org.example.webservice.domain.dto.MessageDto;
import org.example.webservice.repo.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class MessageService {

    @Autowired
    private MessageRepo messageRepo;

    public Page<MessageDto> messageList(
            Pageable pageable,
            String filter,
            User user
    ) {
        if (!StringUtils.isEmpty(filter)) {
            return messageRepo.findByTag(filter, pageable, user);
        } else {
            return messageRepo.findAll(pageable, user);
        }
    }



    public Page<MessageDto> messageListForUser(
            Pageable pageable,
            User currentUser,
            User author
    ) {
        return messageRepo.findByUser(pageable, author, currentUser);
    }
}
