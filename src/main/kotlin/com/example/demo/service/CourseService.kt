package com.example.demo.service

import com.example.demo.model.Course
import com.example.demo.repository.CourseRepository

class CourseService: CrudService<Course> {

    // again instantiating an object with constructor on our own :(
    private val repository: CourseRepository = CourseRepository()

    override fun list(): List<Course> {
        return repository.findAll()
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