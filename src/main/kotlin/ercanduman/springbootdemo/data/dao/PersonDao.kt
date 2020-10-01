package ercanduman.springbootdemo.data.dao

import ercanduman.springbootdemo.data.entity.Person

interface PersonDao {
    fun personList(): List<Person>
    fun getPerson(id: Int): Person?
    fun insert(person: Person): Int
    fun delete(id: Int): Int
    fun update(person: Person): Int
}