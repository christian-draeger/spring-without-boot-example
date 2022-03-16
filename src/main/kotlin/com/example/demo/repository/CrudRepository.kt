package com.example.demo.repository

interface CrudRepository<T> {

    fun findAll(): List<T>

}