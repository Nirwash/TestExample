package com.nirwashh.android.testexample

fun String.toValidName(): String? {
    val names: List<String> = split("/").map { it.trimEnd().trimStart() }
    if (names.size > 2 || names.isEmpty() || names.any { it == ""}) return null
    return "${names.first()} ${names.last().uppercase()}"
}