package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.data.entity.Person

interface PersonDao {
    fun insert(person: Person): Boolean
    fun update(person: Person)
    fun delete(id: Int): Person
    fun personList(): List<Person>
    fun getStudent(id: Int): Person
}