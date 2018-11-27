package com.example.andew.notekeeper

class DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Android Async Programming and Services", courseId = "android_async")
        courses.set(course.courseId, course)

        course = CourseInfo(title = "Java Fundamentals: Java Language", courseId = "java_lang")
        courses.set(course.courseId, course)

        course = CourseInfo("java_core","Java Fundamentals: The Java Core Platform")
        courses.set(course.courseId, course)

    }
}