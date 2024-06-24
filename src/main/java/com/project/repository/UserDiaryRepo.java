package com.project.repository;

import com.project.entity.user.UserDiary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDiaryRepo extends JpaRepository<UserDiary, Long> {
}
