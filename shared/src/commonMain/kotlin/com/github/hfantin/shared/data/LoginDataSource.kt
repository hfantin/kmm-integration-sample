package com.github.hfantin.shared.data

import com.github.hfantin.shared.data.model.LoggedInUser
import com.github.hfantin.shared.randomUUID

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        return try {
            val fakeUser = LoggedInUser(randomUUID(), "$username")
            Result.Success(fakeUser)
        } catch (e: Throwable) {
            Result.Error(RuntimeException("Error logging in", e))
        }
    }

    fun logout() {
        // TODO: revoke authentication
    }
}