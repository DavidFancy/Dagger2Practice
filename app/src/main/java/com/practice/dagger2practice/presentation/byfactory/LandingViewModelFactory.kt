package com.practice.dagger2practice.presentation.byfactory

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.practice.dagger2practice.domain.Repository

class LandingViewModelFactory(private val repository: Repository, private val hostName: String): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LandingFactoryViewModel(SavedStateHandle(), repository, hostName) as T
    }
}