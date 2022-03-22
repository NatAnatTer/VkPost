package ru.netology.service

import ru.netology.data.Post

internal object WallService {
    private var posts = emptyArray<Post>()
    private var uId = emptyArray<UInt>()

    internal fun add(post: Post): Post {
       // post.id = setId()
        posts += post
        return posts.last()
    }

    internal fun printPost() {
        for (post in posts) {
            println("----------------------------------------")
            println("ID POST: ${post.getId()}")
            println("Date = ${post.getCurrentDate()}")
            println(post)
        }
    }

     fun setId(): UInt {
        var maxRate = uId.maxOrNull()

        if (maxRate == null) {
            maxRate = 1U
        } else {
            maxRate += 1U
        }
        uId += maxRate
        return maxRate
    }

    internal fun updtate(updatingPost: Post): Boolean {


        for (post in posts) {
            if (post.getId() == updatingPost.getId()) {

               // posts += updatingPost.copy()
                return true
            }
        }
        return false
    }

//    fun copyPost(updatingPost: Post): Post {
//        val result = updatingPost // there's no 'new' keyword in Kotlin
//        result.id = address.name // accessors are called
//        result.street = address.street
//        // ...
//        return result
//    }
}