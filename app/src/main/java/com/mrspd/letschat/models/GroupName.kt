package com.mrspd.letschat.models


data class GroupName(
    var name: String? = null,
    var imageurl: String? = null,
    var listOfmembers: List<String>? = null
//    var lastMessageDate: Map<String, Double>? = null,
//    var isLoggedUser: Boolean? = null,
//    var lastMessageType: Double? = null
)