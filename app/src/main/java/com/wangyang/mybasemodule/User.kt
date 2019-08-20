package com.wangyang.mybasemodule

import android.os.Parcel
import android.os.Parcelable
import javax.inject.Inject

class User @Inject constructor() : Parcelable {

    var userName: String? = null
    var age: String? = null
    var sex: String? = null

    constructor(parcel: Parcel) : this() {
        userName = parcel.readString()
        age = parcel.readString()
        sex = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(userName)
        parcel.writeString(age)
        parcel.writeString(sex)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }


}