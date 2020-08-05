package com.example.mvpsample.write

import com.example.mvpsample.MyDatabase
import com.example.mvpsample.datas.Todo

class WriteModel {


    fun save(todo: Todo, author: String) : Boolean {
        MyDatabase.todo = todo
        return true
    }
}