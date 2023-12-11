package kr.bb.apigateway.common.security;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

@Component
public interface RefreshTokenStrategy {
  public void createRefreshToken(String id, HttpServletResponse response);
  public void invalidateRefreshToken(String id, HttpServletResponse response);
}