package com.example.orchestra.controllers;


/*@RestController
public class HelloResource {

    @Autowired
    private AuthenticationManager authenticationManager;

//    @Autowired
//    private MyUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtTokenUtil;

//    @PreAuthorize("hasRole('Admin')")
    @GetMapping("/hello")
    public String hello(){
        System.out.print("lalala");
        return "Hello world";
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws  Exception
    {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e){
//            throw new Exception("Incorrect username and password");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}*/
