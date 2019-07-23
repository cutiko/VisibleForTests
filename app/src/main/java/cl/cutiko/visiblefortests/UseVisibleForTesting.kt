package cl.cutiko.visiblefortests

import androidx.annotation.VisibleForTesting

class UseVisibleForTesting {

    @VisibleForTesting(otherwise = VisibleForTesting.NONE)
    fun funUsingTheAnnotation() {
        println("this is visible for testing")
    }

}
