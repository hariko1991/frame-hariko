package com.frame.hariko.springboot.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.dashuf.merlin.springboot.web.controller")
public class SpringMvcAutoConfigure {


}