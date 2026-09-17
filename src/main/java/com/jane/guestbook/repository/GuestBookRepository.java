package com.jane.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jane.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}