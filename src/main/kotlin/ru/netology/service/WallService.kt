package ru.netology.service

import ru.netology.data.Post

object WallService {
    var posts = emptyArray<Post>()

    internal fun add(post: Post): Post {
        val newId = (posts.lastOrNull()?.id ?: 0U) + 1U
        val postAdding = post.copy(
            id = newId
        )
        posts += postAdding
        return posts.last()
    }

//    fun printPost() {
//        for (post in posts) {
//            println("----------------------------------------")
//            println(post)
//        }
//    }


    fun update(post: Post): Boolean {
        for ((index) in posts.withIndex()) {
            if (posts[index].id == post.id) {
                posts[index] = post.copy(
                    ownerId = posts[index].ownerId,
                    date = posts[index].date
                )
                return true
            }

        }
        return false
    }


}




