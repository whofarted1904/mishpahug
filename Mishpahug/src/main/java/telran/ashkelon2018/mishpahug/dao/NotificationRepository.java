package telran.ashkelon2018.mishpahug.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.ashkelon2018.mishpahug.domain.UserNotifications;

public interface NotificationRepository extends MongoRepository<UserNotifications, String> {

}
