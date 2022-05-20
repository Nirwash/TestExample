package com.nirwashh.android.testexample

fun String.toValidName(): String {
    val names: List<String> = split("/").map { it.trimEnd().trimStart() }
    return "${names.first()} ${names.last().uppercase()}"
}