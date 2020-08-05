package com.example.mvpsample.write

import com.example.mvpsample.datas.Todo

class WritePresenterImpl(val view : WriteView) : WritePresenter {

    private  val model = WriteModel()

    override fun save(todo: Todo) {
        var id: Int
        var content : String?
        var author : String?
        var createAt : Long?
    }

    override fun save(content : String?, author : String?) {

        if(content == null || content.isEmpty()){
            view.showErrorToast("CONTENT를 입력하세요")
            return
        }

        if(author == null || author.isEmpty()) {
            view.showErrorToast("CONTENT를 입력하세요")
            return
        }

        val result = model.save(Todo(0, content, author, System.currentTimeMillis())
        //성공
//        if (result){
//            view.quitSuccess()
//        }
//        //실패
//        else {
//            view.showErrorToast( " 저장에 실패했습니다.")
//        }
    }
}