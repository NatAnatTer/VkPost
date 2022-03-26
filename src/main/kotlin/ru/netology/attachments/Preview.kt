package ru.netology.attachments

interface Preview {
}

class PhotoSize : Preview { // изображения для предпросмотра.
    val sizes =
        emptyArray<Sizes>() //(array) — массив копий изображения в разных размерах.



}

class Graffiti : Preview {
    val src: String = "" // URL файла с граффити;
    val width: Int = 0 // ширина изображения в px;
    val height: Int = 0 // высота изображения в px.
}

class audioMessage : Preview { //данные об аудиосообщении
    val duration: Int = 0 // длительность аудиосообщения в секундах;
    val waveform = emptyArray<Int>() // массив значений (integer) для визуального отображения звука;
    val linkOgg: String = "" // URL .ogg-файла;
    val linkMp3: String = "" // URL .mp3-файла.
}
