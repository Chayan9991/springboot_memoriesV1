package com.project.service;

import com.project.entity.user.Posts;
import com.project.entity.user.User;
import com.project.entity.user.UserDiary;
import com.project.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User createUser(User user);
    public Posts createPost(Long diaryId, Posts post);
}
