package data

import com.google.gson.annotations.SerializedName

data class Dog( @SerializedName("message" ) var message : String? = null,
                @SerializedName("status"  ) var status  : String? = null)
