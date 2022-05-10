package anthony.daniel.ermes.dataclasses

import java.util.*

data class User(
    var id: String,
    var username: String,
    var password: String,
    var email: String,
    var name: String,
    var surname: String,
    var birthDate: Date,
    var image: String,
    var status: Int,
    var description: String,
    var accentColor: String,
    var chats: String,
    var groups: String,
    var blockedUsers: String,
    var createdAt: Date,
    var updatedAt: Date,
)
