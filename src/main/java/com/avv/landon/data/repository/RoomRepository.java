package com.avv.landon.data.repository;

import com.avv.landon.data.entity.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    //Room findByNumber(String number);
}