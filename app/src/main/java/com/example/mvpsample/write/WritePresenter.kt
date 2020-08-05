package com.example.mvpsample.write

import com.example.mvpsample.datas.Todo

interface WritePresenter {

    fun save(todo: Todo)
    fun save(content: String?, author: String?)
}