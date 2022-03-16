package com.example.demo.repository

import com.example.demo.model.Course

class CourseRepository: CrudRepository<Course> {

    override fun findAll(): List<Course> {
        val courses = mutableListOf<Course>()
        val spring = Course(
            id = 1,
            title = "Getting Started with Spring 5",
            description = "Learn how to create applications with Spring 5",
            link = "https://github.com/christian-draeger/spring-without-boot-example"
        )
        courses.add(spring)
        return courses
    }
}