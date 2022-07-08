package kg.example.testtest

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math: Math? = null


    @Before
    fun install(){
        math = Math()
    }
    @Test
    fun simpleAdd(){
        assertEquals("4", math?.add( "2","2"))
    }
    @Test
    fun minusAdd(){
        assertEquals("отрицательные вводить нельзя", math?.add( "2","----2"))
    }
    @Test
    fun pusAdd(){
        assertEquals("4", math?.add( "2","  2 "))
    }
    @Test
    fun simpleDivide(){
        assertEquals("3", math?.divide( "6","  2 "))
    }
    @Test
    fun simpleZero(){
        assertEquals("на ноль делить нельзя", math?.divide( "6","0"))
    }




//HomeWork
//    @Test
//    fun Floatadd(){
//        assertEquals("4.5", math?.add( "2","2.5f"))
//    }
//    @Test
//    fun add(){
//        assertEquals("символы вводить нельзя", math?.add( "2","llllllllll"))
//    }

    @After
    fun detach(){
        math = null
    }

}