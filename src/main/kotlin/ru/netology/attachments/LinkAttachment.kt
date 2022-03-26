package ru.netology.attachments

class LinkAttachment() : Attachments {
    override val typeOfAttachments: String
        get() = "Link"

    // Объект, описывающий прикреплённую ссылку в сообщении, комментарии или записи на стене, содержит следующие поля:
    val url: String = "" // URL ссылки.
    val title: String = "" // Заголовок ссылки.
    val caption: String? = null // Подпись ссылки (если имеется).
    val description: String = "" // Описание ссылки.
    val photo: PhotoAttachment // Изображение превью, объект фотографии (если имеется).
        get() {
            return photo
        }
    val product: Product  // Информация о продукте (если имеется). Поле возвращается для ссылок на магазины, например, AliExpress. Объект с единственным полем price (object), которое описано на отдельной странице.
        get() {
            return product
        }
    val button: Button? // Информация о кнопке для перехода (если имеется).
        get() {
            return button
        }

    val previewPage: String =
        "" // Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".

    val previewUrl: String = "" // URL страницы с контентом для предпросмотра содержимого страницы.


    class Button {
        val title: String = "" // Название кнопки.
        val action: Actions // Действие для кнопки. Объект, который содержит следующие поля:
            get() {
                return action
            }
        class Actions {
            val type: String = ""
            // тип действия. Возможные значения:
            //open_url — открыть адрес из поля url;
            // url (string) — URL для перехода.
        }
    }

    class Product {
        val price: Price
            get() {
                return price
            }
    }

    class Price {
        val amount: Int = 0 //Целочисленное значение цены, умноженное на 100.
        val currency: Currency      //Объект currency, описывающий информацию о валюте,
            get() {
                return currency
            }
        val text: String = "" // Строка с локализованной ценой и валютой.

        class Currency {
            val id: Int = 0 //идентификатор валюты.
            val name: String = "" //буквенное обозначение валюты.
        }
    }
}
