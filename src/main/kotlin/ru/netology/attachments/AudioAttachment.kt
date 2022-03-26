package ru.netology.attachments

class AudioAttachment() : Attachments {
    override val typeOfAttachments: String
        get() = "Audio"

    val id: Int = 0 // Идентификатор аудиозаписи.
    val ownerId: Int = 0 // Идентификатор владельца аудиозаписи.
    val artist: String = "" // Исполнитель.
    val title: String = "" // Название композиции.
    val duration: Int = 0 // Длительность аудиозаписи в секундах.
    val url: String = "" // Ссылка на mp3.
    val lyricsId: Int = 0 // Идентификатор текста аудиозаписи (если доступно).
    val albumId: Int = 0 // Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genreId: Int = 0 // Идентификатор жанра из списка аудио жанров.
    val date: Int = 0 // Дата добавления.
    val noSearch: Boolean = true // true, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val isHq: Boolean = false // true, если аудио в высоком качестве.


}

