package com.mysn.sweater.repos;

import com.mysn.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;



public interface MessageRepo extends CrudRepository<Message, Long> {
}
