package com.example.demo.config

import com.example.demo.repository.CourseRepository
import com.example.demo.service.CourseService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration // <--- say spring that this class declares Beans
class AppConfig {

    @Bean("courseRepository")
    fun getCourseRepository() = CourseRepository()

    @Bean("courseService") // optional name, default would be functions name
    fun getCourseService() = CourseService(getCourseRepository()) // if constructor signature would change we would only need to change it here

}
