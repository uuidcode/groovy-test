package com.github.uuidcode.groovy.test

def hello(Map m) {
    println m
}

hello [:]
hello name: 'hello'
hello name: 'hello', type: 1
hello (['a':'a'])