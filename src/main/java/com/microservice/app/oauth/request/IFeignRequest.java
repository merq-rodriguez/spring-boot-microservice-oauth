package com.microservice.app.oauth.request;

import com.common.lib.users.models.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="users")
public interface IFeignRequest {
  @GetMapping("find-username")
  public User findByUsername(@RequestParam String username);
}
