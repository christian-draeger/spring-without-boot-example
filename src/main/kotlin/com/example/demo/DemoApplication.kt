package com.example.demo

import com.example.demo.config.AppConfig
import com.example.demo.service.CourseService
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    // ApplicationContext = general interface to provide configuration for an application
    // AnnotationConfigApplicationContext = served implementation of ApplicationContext
    val applicationContext: ApplicationContext = AnnotationConfigApplicationContext(AppConfig::class.java)
    val service: CourseService = applicationContext.getBean("courseService", CourseService::class.java)
    println(service.list())
}
