package ru.netology.attachments

data class Audio(
    val id: Int, // Идентификатор аудиозаписи.
    private val ownerId: Int, // Идентификатор владельца аудиозаписи.
    private val artist: String, // Исполнитель.
    private val title: String, // Название композиции.
    private val duration: Int, // Длительность аудиозаписи в секундах.
    private val url: String, // Ссылка на mp3.
    private val lyricsId: Int?, // Идентификатор текста аудиозаписи (если доступно).
    private val albumId: Int?, // Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    private val genreId: Int, // Идентификатор жанра из списка аудио жанров.
    private val date: Int, // Дата добавления.
    private val noSearch: Boolean, // true, если включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    private val isHq: Boolean, // true, если аудио в высоком качестве.
) {
    override fun toString(): String {
        return ("id = $id" + "\n" +
                "ownerId = $ownerId" + "\n" +
                "artist = $artist" + "\n" +
                "title = $title" + "\n" +
                "duration = $duration" + "\n" +
                "url = $url" + "\n" +
                "lyricsId = $lyricsId" + "\n" +
                "album = $albumId" + "\n" +
                "genreId = $genreId" + "\n" +
                "date = $date" + "\n" +
                "noSearch = $noSearch" + "\n" +
                "isHq = $isHq" + "\n"
                )
    }
}
