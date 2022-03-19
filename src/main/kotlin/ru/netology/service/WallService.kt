package ru.netology.service

import ru.netology.data.*

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }
    fun setId(posts: Post){

    }

    fun getLastIdPosts(posts: Array<Post>): Int{
        val id: Int
        id = if  (posts.lastIndex == -1) {
            0
        } else {
            posts.lastIndex + 1
        }
        return id
    }
//    println(emptyList<Any>().lastIndex) // -1
//    val list = listOf("a", "x", "y")
//    println(list.lastIndex) // 2
//    println(list[list.lastIndex]) // y

//    fun update(post: Post): Boolean {
//
//    }
//
//    fun removeById(id: Long): Boolean {
//        T
//    }

//    fun likeById(id: Int) {
//        for ((index, post) in posts.withIndex()) {
//            if (post.id == id) {
//                posts[index] = post.copy(likes = post.likes.count + 1)
//            }
//        }
//    }
}