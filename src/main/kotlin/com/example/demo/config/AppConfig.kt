package com.example.demo.config

import com.example.demo.service.CourseService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration // <--- say spring that this class declares Beans
class AppConfig {

    @Bean("courseService") // optional name, default would be functions name
    fun getCourseService() = CourseService() // if constructor signature would change we would only need to change it here

}
