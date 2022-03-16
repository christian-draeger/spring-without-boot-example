package com.example.demo.service

import com.example.demo.model.Course

class CourseService: CrudService<Course> {

    private val courses: MutableList<Course> = mutableListOf()

    init {
        val spring = Course(
            id = 1,
            title = "Getting Started with Spring 5",
            description = "Learn how to create applications with Spring 5",
            link = "https://github.com/christian-draeger/spring-without-boot-example"
        )
        courses.add(spring)
    }

    override fun list(): List<Course> {
        return courses
    }

    override fun create(t: Course): Course {
        TODO("Not yet implemented")
    }

    override fun get(id: Int): Course? {
        TODO("Not yet implemented")
    }

    override fun update(t: Course, id: Int) {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int) {
        TODO("Not yet implemented")
    }
}