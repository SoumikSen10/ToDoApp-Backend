/*package com.projects.todoapp.todoapplication.jwt;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthenticationController {
    
    private final JwtTokenService tokenService;
    
    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationController(JwtTokenService tokenService, 
            AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/authenticate")
    public ResponseEntity<JwtTokenResponse> generateToken(
            @RequestBody JwtTokenRequest jwtTokenRequest) {
    	System.out.println("Request received");
        System.out.println(jwtTokenRequest.username());
        
        System.out.println(jwtTokenRequest.password());
 /*       var authenticationToken = 
                new UsernamePasswordAuthenticationToken(
                        jwtTokenRequest.username(), 
                        jwtTokenRequest.password());
         System.out.println("Authentication token "+authenticationToken);
        var authentication = 
                authenticationManager.authenticate(authenticationToken);
        System.out.println("Authentication "+authentication);
        var token = tokenService.generateToken(authentication);
        System.out.println("Token "+token);*/
        /*return ResponseEntity.ok(new JwtTokenResponse("token"));
       
    }
    
    @GetMapping("/hello")
     public void helloDisplay()
     {
    	System.out.println("Hello World");
     }
}*/


