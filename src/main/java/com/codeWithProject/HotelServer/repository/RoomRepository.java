package com.codeWithProject.HotelServer.repository;

import com.codeWithProject.HotelServer.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository  extends JpaRepository<Room, Long> {
}
