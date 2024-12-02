package com.codeWithProject.HotelServer.services.admin.rooms;

import com.codeWithProject.HotelServer.dto.RoomDto;
import com.codeWithProject.HotelServer.dto.RoomsResponseDto;

public interface RoomService {

    boolean postRoom(RoomDto roomDto);

    RoomsResponseDto getAllRooms(int pageNumber);
}
