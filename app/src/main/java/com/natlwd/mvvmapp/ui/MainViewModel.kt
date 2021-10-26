package com.natlwd.mvvmapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.natlwd.mvvmapp.data.repository.UserRepository
import com.natlwd.mvvmapp.model.UserResponse

class MainViewModel : ViewModel() {

    private val repository = UserRepository.instance

    fun getUsers(userId: String): LiveData<UserResponse?> {
        return repository.getUser(userId)
    }
}