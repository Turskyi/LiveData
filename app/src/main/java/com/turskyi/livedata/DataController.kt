package com.turskyi.livedata

import androidx.lifecycle.MutableLiveData

class DataController {

    companion object {
        private var INSTANCE: DataController? = null

        fun getInstance(): DataController {
            INSTANCE?: run {
                INSTANCE = DataController()
            }
            return INSTANCE!!
        }
    }

    fun getData(): MutableLiveData<String> {
        val value = "magic"
       return MutableLiveData(value)
    }
}