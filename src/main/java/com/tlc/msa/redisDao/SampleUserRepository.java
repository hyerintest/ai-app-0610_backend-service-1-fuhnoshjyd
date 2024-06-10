package com.tlc.msa.redisDao;

import com.tlc.msa.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface SampleUserRepository extends CrudRepository<User, String> {
}
