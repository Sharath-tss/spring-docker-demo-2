//package com.datajpa.controller;
//
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@Controller
//@RestController
//public class HomeController {
//
//    @RequestMapping("/")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    public String index() {
//        return "index";
//    }
//
//    @RequestMapping("/home")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    public String home() {
//        return "home";
//    }
//
//    @RequestMapping("/about")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    public String about() {
//        return "about";
//    }
//
////    @RequestMapping("/error")
////    //@PreAuthorize("hasAuthority('ROLE_USER')")
////    public String error() {
////        return "error";
////    }
//
//}
