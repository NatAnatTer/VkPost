package ru.netology.attachments

class LinkAttachment(
    val url: String, // URL ссылки.
    val title: String,  // Заголовок ссылки.
    val caption: String?, // Подпись ссылки (если имеется).
    val description: String,  // Описание ссылки.
    val photo: PhotoAttachment, // Изображение превью, объект фотографии (если имеется).
    val product: Product,  // Информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, AliExpress. Объект с единственным полем price (object), которое описано на отдельной странице.
    val button: Button?, // Информация о кнопке для перехода (если имеется).
    val previewPage: String,// Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val previewUrl: String // URL страницы с контентом для предпросмотра содержимого страницы.
) : Attachments {
    override val typeOfAttachments: String
        get() = "Link"

    // Объект, описывающий прикреплённую ссылку в сообщении, комментарии или записи на стене, содержит следующие поля:


    class Button(
        val title: String, // Название кнопки.
        val action: Actions
    )  // Действие для кнопки. )

    class Actions(
        val type: String
    ) {
// тип действия. Возможные значения:
//open_url — открыть адрес из поля url;
// url (string) — URL для перехода.
    }

    class Product(val price: Price)

    class Price(
        val amount: Int, //Целочисленное значение цены, умноженное на 100.
        val currency: Currency,      //Объект currency, описывающий информацию о валюте,) {
        val text: String
    ) // Строка с локализованной ценой и валютой.

    class Currency(
        val id: Int, //идентификатор валюты.
        val name: String
    ) //буквенное обозначение валюты.
}
