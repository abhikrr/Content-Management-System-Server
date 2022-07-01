package com.abhisu.contentManagemetSystem.repository;

import com.abhisu.contentManagemetSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
