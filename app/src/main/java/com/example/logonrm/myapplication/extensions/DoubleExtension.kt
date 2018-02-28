package com.example.logonrm.myapplication.extensions

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f",this)
