package com.example.mvpsample

import com.example.mvpsample.write.WritePresenter
import com.example.mvpsample.write.WritePresenterImpl
import com.example.mvpsample.write.WriteView
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import java.lang.AssertionError


class WriteUnitTest {

    var writeView : WriteView? = null
    var writePresenter : WritePresenter? = null

    @Before
    fun setup() {
        writeView = Mockito.mock(WriteView::class.java)
        //mock 임의의 클래스  Mockito라이브러리가 mock이라는 객체를 만들어준다
        // test할 것은 presenter code, 클래스말고 인터페이스로하면 mock이라는 가짜 객체를 만들어준다

        writePresenter = WritePresenterImpl(writeView!!)
        //
    }

    @Test
    fun writeSuccessTest() {

        //검증하고자 하는 로직
        writePresenter!!.save("My content", "kcj3054")

        // 제대로 실행된 결과
        Mockito.verify(writeView!!).quitSuccess()

        Assert.assertTrue(MyDatabase.todo!!.author.equals("kcj3054"))
        Assert.assertTrue(MyDatabase.todo!!.author.equals("My content"))
    }

    @Test
    fun writeWithoutAuthor() {

        //검증하고자 하는 로직
        writePresenter!!.save("My content", "kcj3054")

        // 제대로 실행된 결과
        Mockito.verify(writeView!!).showErrorToast("author를 실행하시오")

    }


}