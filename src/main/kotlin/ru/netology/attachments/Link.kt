package ru.netology.attachments

data class Link(
    val url: String, // URL ссылки.
    val title: String,  // Заголовок ссылки.
    val caption: String?, // Подпись ссылки (если имеется).
    val description: String,  // Описание ссылки.
    val photo: PhotoAttachment?, // Изображение превью, объект фотографии (если имеется).
    val product: Product?,  // Информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, AliExpress. Объект с единственным полем price (object), которое описано на отдельной странице.
    val button: Button?, // Информация о кнопке для перехода (если имеется).
    val previewPage: String,// Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val previewUrl: String // URL страницы с контентом для предпросмотра содержимого страницы.
) {

    override fun toString(): String {
        return ("url = $url" + "\n" +
                "title = $title" + "\n" +
                "caption = $caption" + "\n" +
                "description = $description" + "\n" +
                "photo = $photo" + "\n" +
                "product = $product" + "\n" +
                "button = $button" + "\n" +
                "previewPage = $previewPage" + "\n" +
                "previewUrl = $previewUrl" + "\n"
                )
    }
    // Объект, описывающий прикреплённую ссылку в сообщении, комментарии или записи на стене, содержит следующие поля:


    data class Button(
        val title: String, // Название кнопки.
        val action: Actions
    )  // Действие для кнопки. )

    data class Actions(
        val type: String
    ) {
// тип действия. Возможные значения:
//open_url — открыть адрес из поля url;
// url (string) — URL для перехода.
    }

    data class Product(val price: Price)

    data class Price(
        val amount: Int, //Целочисленное значение цены, умноженное на 100.
        val currency: Currency,      //Объект currency, описывающий информацию о валюте,) {
        val text: String
    ) // Строка с локализованной ценой и валютой.

    data class Currency(
        val id: Int, //идентификатор валюты.
        val name: String
    ) //буквенное обозначение валюты.
}