package com.Sultanov_Zhadaev.studentplanner.Data

data class Subject(
    val id: String, // Уникальный идентификатор
    val name: String, // Название дисциплины
    val professor: String, // Имя преподавателя
    val credits: Int, // Количество баллов
    val currentGrade: String, // Текущая оценка
    val description: String // Описание курса


)
val sampleSubjects = listOf(
    Subject(
        id = "1",
        name = "Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 91,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    Subject(
        id = "2",
        name = "2Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 81,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    Subject(
        id = "3",
        name = "3Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 71,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    Subject(
        id = "4",
        name = "4Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 61,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    Subject(
        id = "5",
        name = "5Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 51,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    Subject(
        id = "6",
        name = "6Разработка мобильных приложений",
        professor = "Леонтьев Д.А.",
        credits = 41,
        currentGrade = "отлично",
        description = "Разработка нативных Android-приложений с использованием Kotlin и современных компонентов Jetpack Compose. Изучение архитектурных паттернов MVVM, работы с локальными базами данных и сетевыми API."),
    )
