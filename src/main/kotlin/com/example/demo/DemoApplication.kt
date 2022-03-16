package com.example.demo

import com.example.demo.service.CourseService

fun main(args: Array<String>) {
    val service = CourseService() // if constructor changes we would need to fix it everywhere where it is used
    println(service.list())
}
