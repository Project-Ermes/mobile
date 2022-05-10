package anthony.daniel.ermes.api

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import anthony.daniel.ermes.dataclasses.User

interface UserController {

    @GET("user/id/{id}")
    suspend fun getUserById(
        @Path("id") id: String
    ): List<User>

    @GET("user/username/{username}")
    suspend fun findUserByUsername(
        @Path("username") username: String
    ): List<User>

    @GET("user/id/{id}")
    suspend fun findUserByEmail(
        @Path("email") email: String
    ): List<User>

    @GET("/")
    suspend fun getAllUsers() : Response<List<User>>

    @POST("/")
    suspend fun postUser(
        @Body user: User
    ) : Response<User>

    @PUT("/user/id/{id}")
    suspend fun putUser(
        @Body user: User
    ): Response<User>

    @DELETE("/user/id/{id}")
    suspend fun deleteUser(
        @Path("id") id: String
    ): Response<User>

    companion object {
        private var userController: UserController? = null

        fun getInstance() : UserController {
            if (userController == null) {
                userController = Retrofit.Builder()
                    .baseUrl("http://localhost:4000/api/users/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(UserController::class.java)
            }
            return userController!!
        }
    }
}