package com.example.demo.service

import com.example.demo.model.Course
import com.example.demo.repository.CourseRepository

class CourseService(
    private val courseRepository: CourseRepository
): CrudService<Course> {

    override fun list(): List<Course> {
        return courseRepository.findAll()
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