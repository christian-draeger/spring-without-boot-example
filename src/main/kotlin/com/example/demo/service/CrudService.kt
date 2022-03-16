package com.example.demo.service

interface CrudService<T> {
    fun list(): List<T>

    fun create(t: T): T

    fun get(id: Int): T?

    fun update(t: T, id: Int)

    fun delete(id: Int)
}
